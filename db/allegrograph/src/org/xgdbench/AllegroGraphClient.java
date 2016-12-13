/**
 * 
 */
package org.xgdbench;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;
import java.util.List;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Vector;

import java.sql.Timestamp;

import javax.ws.rs.core.MediaType;

import org.openrdf.model.Resource;
import com.franz.agraph.repository.AGCatalog;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;
import com.franz.agraph.repository.AGServer;
import com.franz.agraph.repository.AGValueFactory;
import com.franz.agraph.http.exception.AGHttpException;
import org.openrdf.query.QueryEvaluationException;

import org.openrdf.query.BindingSet;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.query.QueryLanguage;
import com.franz.agraph.repository.AGTupleQuery;
import org.openrdf.model.Value;
import org.openrdf.model.Statement;
import org.openrdf.repository.RepositoryResult;
import org.openrdf.model.Literal;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.repository.RepositoryException;
import org.openrdf.model.URI;

import org.xgdbench.generator.MAGIncremental;
import org.xgdbench.generator.Vertex;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;

/**
 * @author miyuru
 *
 */
public class AllegroGraphClient extends DB {
	
	private String SERVER_ROOT_URI;
    public static String USERNAME = "admin";
    public static String PASSWORD = "admin";
	private AGRepositoryConnection conn;
	private boolean transactInsert;
	private HashMap<Int, Int> inOutNeighbourCount;
	private HashMap<Int, Int[]> vertexAttribs;
	private LinkedList<Vertex> newVertexQueue;
	private TreeSet<Int> degrees;
	private Long sumDegree;
	private Long largestVert; //The default graph's largest vertex
	private Long largestNewVert;//This the the largest vertex after building the transact insert data
	private Long totalOpCount;
	private Long transactInsertOpCount;
	private float[] affMatrix;
	private MAGIncremental mag;
	public static final String AFFINITY_MATRIX_DEFAULT = "[0.99f, 0.53f, 0.53f, 0.13f]";
	public static final String AFFINITY_MATRIX = "affinitymatrix";
	public static final String THETA_THRESHOLD_DEFAULT = "0.1";
	public static final String THETA_THRESHOLD = "pthreshold";
	public static final String RECORD_COUNT_PROPERTY_DEFAULT = "4";
	public static final String RECORD_COUNT_PROPERTY = "fieldcount";
	public static final String INSERT_PROPORTION_PROPERTY="insertproportion";
	public static final String INSERT_PROPORTION_PROPERTY_DEFAULT="0.0";
	public static final String TOTAL_OP_COUNT_PROPERTY_DEFAULT = "1000";
	public static final String TOTAL_OP_COUNT_PROPERTY = "operationcount";
	
	float thetaThreshold = 0.1f;
	private Int attribCount = 0;
	private float insertProportion;
	
	private String ycsbReposPath;

	/**
	 * 
	 */
	public AllegroGraphClient() {
		// TODO Auto-generated constructor stub
	}

	public void init() throws DBException{
		Properties props = getProperties();
		SERVER_ROOT_URI = props.getProperty("uri");
		USERNAME = props.getProperty("username");
		PASSWORD = props.getProperty("password");
		ycsbReposPath = SERVER_ROOT_URI + "/ycsb/";
		transactInsert = Boolean.parseBoolean(props.getProperty("transactioninsert"));
		
		try{
	        //Console.OUT.println("\nStarting example1().");
	        AGServer server = new AGServer(SERVER_ROOT_URI, USERNAME, PASSWORD);
	//        Console.OUT.println("Server version: " + server.getVersion());
	//        Console.OUT.println("Server build date: " + server.getBuildDate());
	//        Console.OUT.println("Server revision: " + server.getRevision());
	//        Console.OUT.println("Available catalogs: " + server.listCatalogs());
	        AGCatalog catalog = server.getCatalog("/"); //Just open the root catalog
	                
	//        Console.OUT.println("Available repositories in catalog " + 
	//                (catalog.getCatalogName()));
	//        Console.OUT.println("Available repositories in catalog " + 
	//                (catalog.getCatalogName()) + ": " + 
	//                catalog.listRepositories());
	        
	        AGRepository ycsbGraphRepository = catalog.createRepository("ycsbgraph");
	        ycsbGraphRepository.initialize();
	        conn = ycsbGraphRepository.getConnection();
		}catch(AGHttpException ec){
			ec.printStackTrace();
		}catch(RepositoryException ec){
			ec.printStackTrace();
		}
		
		if(transactInsert){
			//getInOutNeighborCountPerVertex();
			loadVertexAttribs();
			loadAffinityMatrix();
			mag = new MAGIncremental(affMatrix, vertexAttribs, thetaThreshold, attribCount);
			newVertexQueue = new LinkedList<Vertex>();
			constructInsertData();
		}
		
	}

	private void loadAffinityMatrix(){
		Properties props = getProperties();
		String aff = props.getProperty(AFFINITY_MATRIX, AFFINITY_MATRIX_DEFAULT);
		//[0.99f, 0.53f, 0.53f, 0.13f]
		aff = aff.substring(1, (aff.length() - 1));
		String[] iterm = aff.split(","); 
		affMatrix = new float[iterm.length];
		
		for(Int i = 0; i < iterm.length; i++){
			affMatrix[i] = Float.parseFloat(iterm[i].trim());
		}
		
		String thetaThreash = props.getProperty(THETA_THRESHOLD, THETA_THRESHOLD_DEFAULT);
		thetaThreshold = Float.parseFloat(thetaThreash);
		
		attribCount=Int.parseInt(props.getProperty(RECORD_COUNT_PROPERTY, RECORD_COUNT_PROPERTY_DEFAULT));
		
		insertProportion=Float.parseFloat(props.getProperty(INSERT_PROPORTION_PROPERTY, INSERT_PROPORTION_PROPERTY_DEFAULT));
		totalOpCount=Long.parseLong(props.getProperty(TOTAL_OP_COUNT_PROPERTY, TOTAL_OP_COUNT_PROPERTY_DEFAULT));
		
		transactInsertOpCount = (Long)(insertProportion*totalOpCount) + 10;
		
		Console.OUT.println("transactInsertOpCount : " + transactInsertOpCount);
	}
	
	private void loadVertexAttribs(){
		vertexAttribs = new HashMap<Int, Int[]>();
		
		String vid = null;
		String res = null;
		String[] valArr = null;
		Int perName = -1;
		
		ArrayList<Int> attrVals = new ArrayList<Int>(); 
		
		try{
	        AGTupleQuery tupleQuery = conn.prepareTupleQuery(QueryLanguage.SPARQL, "select ?s ?o where {?s rdf:type ?o}");
	        TupleQueryResult result = tupleQuery.evaluate();
	        
	        while(result.hasNext()){
	        	BindingSet bindingSet = result.next();
	        	String s = bindingSet.getValue("s").toString();
	        	String o = bindingSet.getValue("o").toString();
	        		        		        	
	        	if(o.substring(o.lastIndexOf("/") + 1).equals("Person")){
	        		vid = s.substring(s.lastIndexOf("/") + 1);
	        		
	        		try{
		        		AGValueFactory vf = conn.getRepository().getValueFactory();
				        URI personURI = vf.createURI(ycsbReposPath + "people/" + vid );
		        		
				        RepositoryResult<Statement> statements = conn.getStatements(personURI, null, null, false);
				        
				        //Console.OUT.println(vid);
				        
						perName = Int.parseInt(vid);
						
						if(perName > largestVert){
							largestVert = perName;
						}
				        
				        attrVals = new ArrayList<Int>(); 
				        
				        while(statements.hasNext()){
				        	res = statements.next().toString();
				        	if(res.contains("attrib")){
				        		valArr = res.split(" ");
				        		valArr = valArr[2].split("\"");
				        		attrVals.add(Int.parseInt(valArr[1]));
				        	}
				        }
				        
						Int[] vvals = new Int[attrVals.size()];
						
						for(Int p = 0; p < vvals.length; p++){
							vvals[p] = attrVals.get(p);
						}
						
						vertexAttribs.put(perName, vvals);
				        
				    }catch(RepositoryException ex){
						ex.printStackTrace();
					}
	        	}
	        }
	        
		}catch(QueryEvaluationException ex){
			ex.printStackTrace();
		}
	}
	
	private void constructInsertData(){
		for(Int i = 0; i < transactInsertOpCount; i++){
			largestNewVert++;
			Vertex c = mag.getListOfVerticesToConnectWith(largestNewVert);
			newVertexQueue.add(c);
			vertexAttribs.put((Int)largestNewVert, c.attribs);
			mag.setVerticesAndAttributes(vertexAttribs);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#read(java.lang.String, java.lang.String, java.util.Set, java.util.HashMap)
	 */
	@Override
	public Int read(String table, String key, Set<String> fields,
			HashMap<String, String> result) {
		// TODO Auto-generated method stub
		String[] valArr = null;
		String res = null;
		String name = null;
		//ArrayList<Int> attrVals = new ArrayList<Int>(); 
		
		try{
	        AGValueFactory vf = conn.getRepository().getValueFactory();
	        URI personURI = vf.createURI(ycsbReposPath + "people/" + key );
	        	        						        
	        RepositoryResult<Statement> statements = conn.getStatements(personURI, null, null, false);
	        			
	        while(statements.hasNext()){
	        	res = statements.next().toString();
	        	
	        	//Console.OUT.println(res);
	        	
	        	if(res.contains("attrib")){
	        		valArr = res.split(" ");
	        		name = valArr[1].substring(valArr[1].lastIndexOf("/") + 1);
	        		valArr = valArr[2].split("\"");

	        		//attrVals.add(Int.parseInt(valArr[1]));
	        		
	        		//Console.OUT.println("name : " + name + " value : " + valArr[1]);
	        		
	        		result.put(name, valArr[1]);
	        	}
	        }
	        
		}catch(RepositoryException ex){
			ex.printStackTrace();
		}
		
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#scan(java.lang.String, java.lang.String, Int, java.util.Set, java.util.Vector)
	 * Represents friend list loading scenario. Load all the details of friends of this person
	 */
	@Override
	public Int scan(String table, String startkey, Int recordcount,
			Set<String> fields, Vector<HashMap<String, String>> result) {
		// TODO Auto-generated method stub
		String res = null;
		String[] valArr = null;
		String firstPerson = null, secondPerson = null;
		LinkedList<String> friendList = new LinkedList<String>();
		
		try{
	        AGValueFactory vf = conn.getRepository().getValueFactory();
	        URI personURI = vf.createURI(ycsbReposPath + "ontology/affiliated");
	        	        						        
	        RepositoryResult<Statement> statements = conn.getStatements(null, personURI, null, false);
	        			
	        if(!statements.hasNext()){
	        	return -1;
	        }
	        
	        while(statements.hasNext()){
	        	res = statements.next().toString();
	        	
	        	//Console.OUT.println(res);
	        	
	        	valArr = res.split(" ");
	        	firstPerson = valArr[0].substring(valArr[0].lastIndexOf("/") + 1);
	        	firstPerson = firstPerson.substring(0, firstPerson.length() - 1);
	        	
	        	if(!firstPerson.equals(startkey)){
	        		continue;
	        	}
	        	
	        	secondPerson = valArr[2].substring(valArr[2].lastIndexOf("/") + 1);
	        	secondPerson = secondPerson.substring(0, secondPerson.length() - 1);
	        	
	        	if(!friendList.contains(secondPerson)){
	        		friendList.add(secondPerson);
	        	}
	        	
	        	
//	        	if(res.contains("attrib")){
//	        		valArr = res.split(" ");
//	        		name = valArr[1].substring(valArr[1].lastIndexOf("/") + 1);
//	        		name = name.substring(0, name.length() - 1);
//	        		valArr = valArr[2].split("\"");
//
//	        		//attrVals.add(Int.parseInt(valArr[1]));
//	        		
//	        		//Console.OUT.println("name : " + name + " value : " + valArr[1]);
//	        		
//	        		Intermvals.put(name, valArr[1]);
//	        	}
	        }
	        
	        if(!friendList.isEmpty()){
		        Iterator<String> itr = friendList.iterator();
		        
		        //Console.OUT.println("Friends of " + startkey + " are : ");
		        
		        while(itr.hasNext()){
		        	//System.out.prInt(itr.next() + ",");
		        	String key = itr.next();
		    		String[] valArr2 = null;
		    		String res2 = null;
		    		String name2 = null;
		    		//ArrayList<Int> attrVals = new ArrayList<Int>(); 
		    		HashMap<String, String> hMap = new HashMap<String, String>();
		    		try{
		    	        AGValueFactory vf2 = conn.getRepository().getValueFactory();
		    	        URI personURI2 = vf2.createURI(ycsbReposPath + "people/" + key );
		    	        	        						        
		    	        RepositoryResult<Statement> statements2 = conn.getStatements(personURI2, null, null, false);
		    	        			
		    	        while(statements2.hasNext()){
		    	        	res2 = statements2.next().toString();
		    	        	
		    	        	//Console.OUT.println(res);
		    	        	
		    	        	if(res.contains("attrib")){
		    	        		valArr2 = res.split(" ");
		    	        		name2 = valArr2[1].substring(valArr2[1].lastIndexOf("/") + 1);
		    	        		valArr2 = valArr2[2].split("\"");

		    	        		//attrVals.add(Int.parseInt(valArr[1]));
		    	        		
		    	        		//Console.OUT.println("name : " + name + " value : " + valArr[1]);
		    	        		
		    	        		hMap.put(name2, valArr2[1]);
		    	        	}
		    	        }
		    	        
		    	        result.add(hMap);
		    	        
		    		}catch(RepositoryException ex){
		    			ex.printStackTrace();
		    		}
		        	
		        	
		        	
		        	
		        }
	        }
	        
	        
		}catch(RepositoryException ex){
			ex.printStackTrace();
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#update(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int update(String table, String key, HashMap<String, String> values) {
        URI attrib1URI = null;
        URI attrib2URI = null;
        URI attrib3URI = null;
        URI attrib4URI = null;
        URI lastLoginURI = null;	//This is the URI showing the last login time
        
        URI person = null;
        URI affiliated = null;
		
        Literal per1_attrib1 = null;
        Literal per1_attrib2 = null;
        Literal per1_attrib3 = null;
        Literal per1_attrib4 = null;
	Literal per1_lastLogIntime = null;        
        //+Todo
        //We should investigate what will happen when the vertex is deleted and re created. Sometimes the edges that were connected the previous
        //vertex might not continue connecting to the same vetex.       
        
//        Literal per2_attrib1 = null;
//        Literal per2_attrib2 = null;
//        Literal per2_attrib3 = null;
//        Literal per2_attrib4 = null;
		
        String selectedKey = null;
        Set<String> keyList = values.keySet();
        
		String[] valArr = null;
		String res = null;
		String name = null;
		HashMap<String, String> Intermvals = new HashMap<String, String>();
		
		try{
	        AGValueFactory vf = conn.getRepository().getValueFactory();
	        URI personURI = vf.createURI(ycsbReposPath + "people/" + key );
	        	        						        
	        RepositoryResult<Statement> statements = conn.getStatements(personURI, null, null, false);
	        			
	        if(!statements.hasNext()){
	        	return -1;
	        }
	        
	        while(statements.hasNext()){
	        	res = statements.next().toString();
	        	
	        	if(res.contains("attrib")||res.contains("LastLogin")){
	        		valArr = res.split(" ");
	        		name = valArr[1].substring(valArr[1].lastIndexOf("/") + 1);
	        		name = name.substring(0, name.length() - 1);
	        		valArr = valArr[2].split("\"");
	        		
	        		Intermvals.put(name, valArr[1]);
	        	}
	        }
	        
		}catch(RepositoryException ex){
			ex.printStackTrace();
		}
        
      Iterator<String> itr = keyList.iterator();
      String kkey = null;

      //In this case only the LastLogin time will be updated. Because we have only that value in the values HashMap.
//      while(itr.hasNext()){
//      	kkey = itr.next();
//      	Intermvals.put(kkey, values.get(kkey));
//      }
            
	//Here we are deleting the existing Person recored from the database
		try{
	        AGValueFactory vf = conn.getRepository().getValueFactory();
	        URI firstPersonURI = vf.createURI(ycsbReposPath + "people/" + key );
	        						        
	        RepositoryResult<Statement> statements = conn.getStatements(firstPersonURI, null, null, false);
	        						        
	        if(statements.hasNext()){
	        	conn.remove(statements, new Resource[]{});
	        	
	        }else{
	        	return -1;
	        }
	        	
	        //Next we create the deletedrecord (with updated attribute values).
	        person = vf.createURI(ycsbReposPath + "ontology/Person");
	        
	        attrib1URI = vf.createURI(ycsbReposPath + "ontology/attrib1");
	        attrib2URI = vf.createURI(ycsbReposPath + "ontology/attrib2");
	        attrib3URI = vf.createURI(ycsbReposPath + "ontology/attrib3");
	        attrib4URI = vf.createURI(ycsbReposPath + "ontology/attrib4");
	        lastLoginURI = vf.createURI(ycsbReposPath + "ontology/LastLogin");
	        	        
	        per1_attrib1 = vf.createLiteral(Intermvals.get("attrib1"));
	        per1_attrib2 = vf.createLiteral(Intermvals.get("attrib2"));
	        per1_attrib3 = vf.createLiteral(Intermvals.get("attrib3"));
	        per1_attrib4 = vf.createLiteral(Intermvals.get("attrib4"));
	        per1_lastLogIntime = vf.createLiteral(new java.sql.Timestamp(new java.util.Date().getTime()).toString()); //Instead of getting the time stamp from the HashMap we update the latest value.
	        					        
	        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
	        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
	        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
	        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
	        conn.add(firstPersonURI, lastLoginURI, per1_lastLogIntime);
	        conn.add(firstPersonURI, RDF.TYPE, person);
		}catch(RepositoryException ex){
			ex.printStackTrace();
		}
		
		
		return 0;
	}

	/* This method inserts a single relationship to the GraphDB. If from and to vertices do not exist
	 * those will be assed to the Graph prior to adding the relationship.
	 * @see com.yahoo.ycsb.DB#insert(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int insert(String table, String key, HashMap<String, String> values) {
		boolean firstVertExist = false;
		boolean secondVertExist = false;
        URI attrib1URI = null;
        URI attrib2URI = null;
        URI attrib3URI = null;
        URI attrib4URI = null;
        URI lastLoginURI = null;	//This is the URI showing the last login time
        
        URI person = null;
        URI affiliated = null;
		
        Literal per1_attrib1 = null;
        Literal per1_attrib2 = null;
        Literal per1_attrib3 = null;
        Literal per1_attrib4 = null;
        Literal per1_lastLogIntime = null;
        
        Literal per2_attrib1 = null;
        Literal per2_attrib2 = null;
        Literal per2_attrib3 = null;
        Literal per2_attrib4 = null;
        Literal per2_lastLogIntime = null;
        
		if(table.equals("transact-insert")){		
			Vertex c = newVertexQueue.removeFirst();
			addVertexAndConnectWithExisting(c);	
		}else{
	        if(!table.equals("")){  
	            String[] IntermArr = table.split("<");
	            
	            for(Int u = 0; u < IntermArr.length; u++){
	            	
	            	if(!IntermArr[u].trim().equals("")){
		            	String[] inputArr = IntermArr[u].split("-");
		            	
		            	if(inputArr[0].equals("E")){//This is an edge record.
		    		        String[] res = inputArr[1].split(" ");
		    		        
		    		        String[] vert1 = res[0].split(",");
		    		        String[] vert2 = res[1].split(",");    
		    	
		    				String[] vert3 = vert1[0].split(":");
		    				String[] vert4 = vert2[0].split(":");
        
							try{
						        AGValueFactory vf = conn.getRepository().getValueFactory();
						        URI firstPersonURI = vf.createURI(ycsbReposPath + "people/" + vert3[0] );
						        URI secondPersonURI = vf.createURI(ycsbReposPath + "people/" + vert4[0]);
						        						        
						        RepositoryResult<Statement> statements = conn.getStatements(firstPersonURI, null, null, false);
						        						        
						        if(statements.hasNext()){
						        	firstVertExist = true;
						        }
						        						        
						        statements = conn.getStatements(secondPersonURI, null, null, false);
						        					        
						        if(statements.hasNext()){
						        	secondVertExist = true;
						        }
						        
						        if((!firstVertExist) || (!secondVertExist)){
							        attrib1URI = vf.createURI(ycsbReposPath + "ontology/attrib1");
							        attrib2URI = vf.createURI(ycsbReposPath + "ontology/attrib2");
							        attrib3URI = vf.createURI(ycsbReposPath + "ontology/attrib3");
							        attrib4URI = vf.createURI(ycsbReposPath + "ontology/attrib4");
						        }
						        
						        person = vf.createURI(ycsbReposPath + "ontology/Person");
						        lastLoginURI = vf.createURI(ycsbReposPath + "ontology/LastLogin");
						        affiliated = vf.createURI(ycsbReposPath + "ontology/affiliated");
						        
						        if(!firstVertExist){
							        per1_attrib1 = vf.createLiteral(vert3[1]);
							        per1_attrib2 = vf.createLiteral(vert1[1]);
							        per1_attrib3 = vf.createLiteral(vert1[2]);
							        per1_attrib4 = vf.createLiteral(vert1[3]);
							        per1_lastLogIntime = vf.createLiteral(new java.sql.Timestamp(new java.util.Date().getTime()).toString());
							        
							        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
							        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
							        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
							        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
							        conn.add(firstPersonURI, lastLoginURI, per1_lastLogIntime);
							        conn.add(firstPersonURI, RDF.TYPE, person);
						        }
						        
						        if(!secondVertExist){
							        per2_attrib1 = vf.createLiteral(vert4[1]);
							        per2_attrib2 = vf.createLiteral(vert2[1]);
							        per2_attrib3 = vf.createLiteral(vert2[2]);
							        per2_attrib4 = vf.createLiteral(vert2[3]);
							        per2_lastLogIntime = vf.createLiteral(new Timestamp(new java.util.Date().getTime()).toString());
							        
							        conn.add(secondPersonURI, attrib1URI, per2_attrib1);
							        conn.add(secondPersonURI, attrib2URI, per2_attrib2);
							        conn.add(secondPersonURI, attrib3URI, per2_attrib3);
							        conn.add(secondPersonURI, attrib4URI, per2_attrib4);
							        conn.add(secondPersonURI, lastLoginURI, per2_lastLogIntime);
							        conn.add(secondPersonURI, RDF.TYPE, person);
						        }
						        
						        conn.add(affiliated, RDF.TYPE, affiliated);
						        conn.add(firstPersonURI, affiliated, secondPersonURI);
						        
						        firstVertExist = false;
						        secondVertExist = false;
						        
							}catch(RepositoryException ex){
								ex.printStackTrace();
							}
		            	}else{//This is just a vertex
		    		        String[] vert1 = inputArr[1].split(",");
		    				String[] vert3 = vert1[0].split(":");
		    				
							try{
						        AGValueFactory vf = conn.getRepository().getValueFactory();
						        URI firstPersonURI = vf.createURI(ycsbReposPath + "people/" + vert3[0] );
						        						        
						        RepositoryResult<Statement> statements = conn.getStatements(firstPersonURI, null, null, false);
						        						        
						        if(!statements.hasNext()){						        
							        attrib1URI = vf.createURI(ycsbReposPath + "ontology/attrib1");
							        attrib2URI = vf.createURI(ycsbReposPath + "ontology/attrib2");
							        attrib3URI = vf.createURI(ycsbReposPath + "ontology/attrib3");
							        attrib4URI = vf.createURI(ycsbReposPath + "ontology/attrib4");
							        
							        person = vf.createURI(ycsbReposPath + "ontology/Person");
							        affiliated = vf.createURI(ycsbReposPath + "ontology/affiliated");
							        lastLoginURI = vf.createURI(ycsbReposPath + "ontology/LastLogin");
							        
							        per1_attrib1 = vf.createLiteral(vert3[1]);
							        per1_attrib2 = vf.createLiteral(vert1[1]);
							        per1_attrib3 = vf.createLiteral(vert1[2]);
							        per1_attrib4 = vf.createLiteral(vert1[3]);
							        per1_lastLogIntime = vf.createLiteral(new Timestamp(new java.util.Date().getTime()).toString());
							        					        
							        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
							        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
							        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
							        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
							        conn.add(firstPersonURI, lastLoginURI, per1_lastLogIntime);
							        conn.add(firstPersonURI, RDF.TYPE, person);
						        }
						        
							}catch(RepositoryException ex){
								ex.printStackTrace();
							}
		            	}  
	            	}
	            }
	        }
		}
		
		return 0;
	}	
	
	/**
	 * This method adds new vertex during transaction phase
	 * @param vertID
	 * @param listOfvertices
	 */
	private void addVertexAndConnectWithExisting(Vertex c){
		Int[] listOfvertices = c.neighbours;
		Int[] attribs = c.attribs;
		URI firstNode = null;
		URI firstPersonURI = null;
		URI secondPersonURI = null;
        URI lastLoginURI = null;	//This is the URI showing the last login time
		String firstVertex = "" + c.pername;
		String secondVertex = null;
		URI affiliated = null;
        URI attrib1URI = null;
        URI attrib2URI = null;
        URI attrib3URI = null;
        URI attrib4URI = null;
        
        URI person = null;
		
        Literal per1_attrib1 = null;
        Literal per1_attrib2 = null;
        Literal per1_attrib3 = null;
        Literal per1_attrib4 = null;
        Literal per1_lastLogIntime = null;
        Literal per2_lastLogIntime = null;
		
		try{
	        AGValueFactory vf = conn.getRepository().getValueFactory();
	        firstPersonURI = vf.createURI(ycsbReposPath + "people/" + firstVertex );
			affiliated = vf.createURI(ycsbReposPath + "ontology/affiliated");
	        
	        RepositoryResult<Statement> statements = conn.getStatements(firstPersonURI, null, null, false);
	        	        
	        if(!statements.hasNext()){						        
		        attrib1URI = vf.createURI(ycsbReposPath + "ontology/attrib1");
		        attrib2URI = vf.createURI(ycsbReposPath + "ontology/attrib2");
		        attrib3URI = vf.createURI(ycsbReposPath + "ontology/attrib3");
		        attrib4URI = vf.createURI(ycsbReposPath + "ontology/attrib4");
		        lastLoginURI = vf.createURI(ycsbReposPath + "ontology/LastLogin");
		        
		        person = vf.createURI(ycsbReposPath + "ontology/Person");
		        affiliated = vf.createURI(ycsbReposPath + "ontology/affiliated");
				
		        per1_attrib1 = vf.createLiteral(attribs[0]);
		        per1_attrib2 = vf.createLiteral(attribs[1]);
		        per1_attrib3 = vf.createLiteral(attribs[2]);
		        per1_attrib4 = vf.createLiteral(attribs[3]);
		        per1_lastLogIntime = vf.createLiteral(new Timestamp(new java.util.Date().getTime()).toString());
		        					        
		        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
		        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
		        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
		        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
		        conn.add(firstPersonURI, lastLoginURI, per1_lastLogIntime);
		        conn.add(firstPersonURI, RDF.TYPE, person);
	        }
	        
		}catch(RepositoryException ex){
			ex.printStackTrace();
		}
		
		for(Int i = 0; i < listOfvertices.length; i++ ){	
			URI secondNode = null;
			secondVertex = "" + listOfvertices[i];
						
			
			try{
		        AGValueFactory vf2 = conn.getRepository().getValueFactory();
		        secondPersonURI = vf2.createURI(ycsbReposPath + "people/" + secondVertex );
		        		        
		        RepositoryResult<Statement> statements = conn.getStatements(secondPersonURI, null, null, false);
		        
		        if(!statements.hasNext()){						        
		        	continue; //Just ignore this vertex id since it does not exist in the graph db
		        }
		        
			}catch(RepositoryException ex){
				ex.printStackTrace();
			}
			
			
			try{	        
		        conn.add(firstPersonURI, affiliated, secondPersonURI);		        
			}catch(RepositoryException ex){
				ex.printStackTrace();
			}		
		}
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#delete(java.lang.String, java.lang.String)
	 */
	@Override
	public Int delete(String table, String key) {
		// TODO Auto-generated method stub
		Console.OUT.println("Deleting");
		return 0;
	}
   
	@Override
	public void cleanup() throws DBException{
//		try{
//			database.close();
//		}catch(Exception e){
//			throw new DBException("OrientDB server connection could not be closed...");
//		}
	}
	
	public static void main(String[] args){
        if (args.length!=1)
        {
            Console.OUT.println("Please specify a threadcount");
            System.exit(0);
        }
        
        final Int threadcount=Int.parseInt(args[0]);
        
        Vector<Thread> allthreads=new Vector<Thread>();
        
        for (Int i=0; i<threadcount; i++)
        {
            Thread t=new Thread() 
            {
                public void run()
                {
                    try
                    {
                    	AllegroGraphClient client = new AllegroGraphClient();                   	
                    	
                    }catch(Exception ec){
                    	
                    }
                }
            };
            
           // allthreads.ad(t);
        }
        
        Long st=System.currentTimeMillis();
        for (Thread t: allthreads)
        {
            t.start();
        }

        for (Thread t: allthreads)
        {
            try
            {
                t.join();
            }
            catch (InterruptedException e)
            {
            }
        }
        Long en=System.currentTimeMillis();
        
        //Console.OUT.println("Throughput: "+((1000.0)*(((double)(opcount*threadcount))/((double)(en-st))))+" ops/sec");
        
	}
	
	@Override
	public Int traverse(String startkey, Int levels, Vector<String> result) {
		ArrayList<String> unDiscoveredVertices = new ArrayList<String>();
		ArrayList<String> discoveredVertices = new ArrayList<String>();
		
		String res = null;
		String[] valArr = null;
		String firstPerson = null, secondPerson = null;
		LinkedList<String> friendList = new LinkedList<String>();
		
		unDiscoveredVertices.add(startkey); //We start traversal from the first vertex given.
		
		for(Int i = 0; i < levels; i++){
			Iterator itr = unDiscoveredVertices.iterator();
			
			while(itr.hasNext()){
				String k = itr.next().toString();
							
				try{
			        AGValueFactory vf = conn.getRepository().getValueFactory();
			        URI personURI = vf.createURI(ycsbReposPath + "ontology/affiliated");
			        	        						        
			        RepositoryResult<Statement> statements = conn.getStatements(null, personURI, null, false);
			        			
			        if(!statements.hasNext()){
			        	continue;
			        }
			        
			        while(statements.hasNext()){
			        	res = statements.next().toString();
			        	
			        	valArr = res.split(" ");
			        	firstPerson = valArr[0].substring(valArr[0].lastIndexOf("/") + 1);
			        	firstPerson = firstPerson.substring(0, firstPerson.length() - 1);
			        	
			        	if(!firstPerson.equals(k)){
			        		continue;
			        	}
			        	
			        	secondPerson = valArr[2].substring(valArr[2].lastIndexOf("/") + 1);
			        	secondPerson = secondPerson.substring(0, secondPerson.length() - 1);
			        	
			        	discoveredVertices.add(secondPerson);
			        }			        
				}catch(RepositoryException ex){
					ex.printStackTrace();
				}
			}
			
			//Next we need to filter out already processed vertex IDs from the discovered vertex list.
			Iterator itr2 = discoveredVertices.iterator();
			String k2 = null;
			ArrayList<String> newUndiscoveredVertices = new ArrayList<String>();
			
			while(itr2.hasNext()){
				k2 = itr2.next().toString();
				
				if(!result.contains(k2)){
					result.add(k2);
					newUndiscoveredVertices.add(k2);
				}
			}
			
			//The vertices that were discovered but not in the processed vertev list are the genuine undiscovered vertices. These vertices need to be discovered.
			unDiscoveredVertices = newUndiscoveredVertices;
			discoveredVertices = new ArrayList<String>();
		}
		
		//Console.OUT.println("Size of the processed vertices : " + result.size());
//		Iterator it = processedVertices.iterator();
//		
//		while(it.hasNext()){
//			String k = it.next().toString();
//			
//			Console.OUT.println(k);
//		}
		
		return 0;
	}
	
	@Override
	public Int insertEdge(String table, String key, HashMap<String, String> values) {
		boolean firstVertExist = false;
		boolean secondVertExist = false;
        URI attrib1URI = null;
        URI attrib2URI = null;
        URI attrib3URI = null;
        URI attrib4URI = null;
        URI lastLoginURI = null;
        
        URI person = null;
        URI affiliated = null;
		
        Literal per1_attrib1 = null;
        Literal per1_attrib2 = null;
        Literal per1_attrib3 = null;
        Literal per1_attrib4 = null;
        Literal per1_lastLogIntime = null;
        
        Literal per2_attrib1 = null;
        Literal per2_attrib2 = null;
        Literal per2_attrib3 = null;
        Literal per2_attrib4 = null;
        Literal per2_lastLogIntime = null;
        
        if(!table.equals("")){  
            String[] IntermArr = table.split("<");
            
            for(Int u = 0; u < IntermArr.length; u++){
            	
            	if(!IntermArr[u].trim().equals("")){
	            	String[] inputArr = IntermArr[u].split("-");
	            	
	            	if(inputArr[0].equals("E")){
	    		        String[] res = inputArr[1].split(" ");
	    		        
	    		        String[] vert1 = res[0].split(",");
	    		        String[] vert2 = res[1].split(",");    
	    	
	    				String[] vert3 = vert1[0].split(":");
	    				String[] vert4 = vert2[0].split(":");
    
						try{
					        AGValueFactory vf = conn.getRepository().getValueFactory();
					        URI firstPersonURI = vf.createURI(ycsbReposPath + "people/" + vert3[0] );
					        URI secondPersonURI = vf.createURI(ycsbReposPath + "people/" + vert4[0]);
					        						        
					        RepositoryResult<Statement> statements = conn.getStatements(firstPersonURI, null, null, false);
					        						        
					        if(statements.hasNext()){
					        	firstVertExist = true;
					        }
					        						        
					        statements = conn.getStatements(secondPersonURI, null, null, false);
					        					        
					        if(statements.hasNext()){
					        	secondVertExist = true;
					        }
					        
					        if((!firstVertExist) || (!secondVertExist)){
						        attrib1URI = vf.createURI(ycsbReposPath + "ontology/attrib1");
						        attrib2URI = vf.createURI(ycsbReposPath + "ontology/attrib2");
						        attrib3URI = vf.createURI(ycsbReposPath + "ontology/attrib3");
						        attrib4URI = vf.createURI(ycsbReposPath + "ontology/attrib4");
					        }
					        
					        person = vf.createURI(ycsbReposPath + "ontology/Person");
					        affiliated = vf.createURI(ycsbReposPath + "ontology/affiliated");
					        lastLoginURI = vf.createURI(ycsbReposPath + "ontology/LastLogin");
					        
					        if(!firstVertExist){
						        per1_attrib1 = vf.createLiteral(vert3[1]);
						        per1_attrib2 = vf.createLiteral(vert1[1]);
						        per1_attrib3 = vf.createLiteral(vert1[2]);
						        per1_attrib4 = vf.createLiteral(vert1[3]);
						        per1_lastLogIntime = vf.createLiteral(new java.sql.Timestamp(new java.util.Date().getTime()).toString());
						        
						        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
						        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
						        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
						        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
						        conn.add(firstPersonURI, lastLoginURI, per1_lastLogIntime);
						        conn.add(firstPersonURI, RDF.TYPE, person);
					        }
					        
					        if(!secondVertExist){
						        per2_attrib1 = vf.createLiteral(vert4[1]);
						        per2_attrib2 = vf.createLiteral(vert2[1]);
						        per2_attrib3 = vf.createLiteral(vert2[2]);
						        per2_attrib4 = vf.createLiteral(vert2[3]);
						        per2_lastLogIntime = vf.createLiteral(new java.sql.Timestamp(new java.util.Date().getTime()).toString());
						        
						        conn.add(secondPersonURI, attrib1URI, per2_attrib1);
						        conn.add(secondPersonURI, attrib2URI, per2_attrib2);
						        conn.add(secondPersonURI, attrib3URI, per2_attrib3);
						        conn.add(secondPersonURI, attrib4URI, per2_attrib4);
						        conn.add(secondPersonURI, lastLoginURI, per2_lastLogIntime);
						        conn.add(secondPersonURI, RDF.TYPE, person);
					        }
					        
					        conn.add(affiliated, RDF.TYPE, affiliated);
					        conn.add(firstPersonURI, affiliated, secondPersonURI);
					        
					        firstVertExist = false;
					        secondVertExist = false;
					        
						}catch(RepositoryException ex){
							ex.printStackTrace();
						}
	            	}else{
	    		        String[] vert1 = inputArr[1].split(",");
	    				String[] vert3 = vert1[0].split(":");
	    				
						try{
					        AGValueFactory vf = conn.getRepository().getValueFactory();
					        URI firstPersonURI = vf.createURI(ycsbReposPath + "people/" + vert3[0] );
					        						        
					        RepositoryResult<Statement> statements = conn.getStatements(firstPersonURI, null, null, false);
					        						        
					        if(!statements.hasNext()){						        
						        attrib1URI = vf.createURI(ycsbReposPath + "ontology/attrib1");
						        attrib2URI = vf.createURI(ycsbReposPath + "ontology/attrib2");
						        attrib3URI = vf.createURI(ycsbReposPath + "ontology/attrib3");
						        attrib4URI = vf.createURI(ycsbReposPath + "ontology/attrib4");
						        
						        person = vf.createURI(ycsbReposPath + "ontology/Person");
						        affiliated = vf.createURI(ycsbReposPath + "ontology/affiliated");
								
						        per1_attrib1 = vf.createLiteral(vert3[1]);
						        per1_attrib2 = vf.createLiteral(vert1[1]);
						        per1_attrib3 = vf.createLiteral(vert1[2]);
						        per1_attrib4 = vf.createLiteral(vert1[3]);
						        per1_lastLogIntime = vf.createLiteral(new java.sql.Timestamp(new java.util.Date().getTime()).toString());
						        					        
						        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
						        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
						        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
						        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
						        conn.add(firstPersonURI, lastLoginURI, per1_lastLogIntime);
						        conn.add(firstPersonURI, RDF.TYPE, person);
					        }
					        
						}catch(RepositoryException ex){
							ex.printStackTrace();
						}
	            	}  
            	}
            }
        }
		
		return 0;
	}
	
}
