/**
 * 
 */
package org.xgdbench;

import java.io.FileInputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Literal;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.model.vocabulary.RDF;
import org.xgdbench.generator.MAGIncremental;
import org.xgdbench.generator.Vertex;

import com.bigdata.rdf.sail.BigdataSail;
import com.bigdata.rdf.sail.BigdataSailRepository;
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
public class BigDataClient extends DB {
	
//	private String PROP_FILE;
//	private Repository repo;
//	private RepositoryConnection cxn;

	
	private String SERVER_ROOT_URI;
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
	public BigDataClient() {
		// TODO Auto-generated constructor stub
	}

	public void init() throws DBException{
		Properties props = getProperties();
		SERVER_ROOT_URI = props.getProperty("uri");
		ycsbReposPath = SERVER_ROOT_URI + "ycsbgraph";
		transactInsert = Boolean.parseBoolean(props.getProperty("transactioninsert"));
		
		if(transactInsert){
			//getInOutNeighborCountPerVertex();
			loadVertexAttribs();
			loadAffinityMatrix();
			mag = new MAGIncremental(affMatrix, vertexAttribs, thetaThreshold, attribCount);
			newVertexQueue = new LinkedList<Vertex>();
			constructInsertData();
		}
	}
	
	private Properties loadProperties(String resource) throws Exception {
		Properties p = new Properties();

		p.load(new FileInputStream(resource));
		return p;
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
	
	/**
	 * This method adds new vertex during transaction phase
	 * @param vertID
	 * @param listOfvertices
	 */
	private void addVertexAndConnectWithExisting(Vertex c){
		Int[] listOfvertices = c.neighbours;
		Int[] attribs = c.attribs;
		
		
	}
	
	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#read(java.lang.String, java.lang.String, java.util.Set, java.util.HashMap)
	 */
	@Override
	public Int read(String table, String key, Set<String> fields,
			HashMap<String, String> result) {
		// TODO Auto-generated method stub
		Console.OUT.println("Reading");
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#scan(java.lang.String, java.lang.String, Int, java.util.Set, java.util.Vector)
	 */
	@Override
	public Int scan(String table, String startkey, Int recordcount,
			Set<String> fields, Vector<HashMap<String, String>> result) {
		// TODO Auto-generated method stub
		Console.OUT.println("Scanning");
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#update(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int update(String table, String key, HashMap<String, String> values) {
		// TODO Auto-generated method stub
		Console.OUT.println("Updating");
		return 0;
	}

	/* This method inserts a single relationship to the GraphDB. If from and to vertices do not exist
	 * those will be assed to the Graph prior to adding the relationship.
	 * @see com.yahoo.ycsb.DB#insert(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int insert(String table, String key, HashMap<String, String> values) {

//        Console.OUT.println("Value --> " + table);
//        //if(!table.equals("")){
//        String[] res = table.split(" ");
//        
//        String[] vert1 = res[0].split(",");
//        String[] vert2 = res[1].split(",");
//        
//		String[] vert3 = vert1[0].split(":");
//		String[] vert4 = vert2[0].split(":");

//		Resource s = new URIImpl("http://localhost/rdf#PersonA");
//		URI p = new URIImpl("http://localhost/rdf#affiliatedTo");
//		Value o = new URIImpl("http://localhost/rdf#PersonB");
//		
//		Statement stmt = new StatementImpl(s, p, o);
//
//		cxn.add(stmt);
//		cxn.commit();
		
//		try{
//			cxn = repo.getConnection();
//			cxn.setAutoCommit(false);
//			
//	        ValueFactory vf = repo.getValueFactory();
//	        URI firstPersonURI = vf.createURI("http://localhost/people/" + vert3[0] );
//	        URI secondPersonURI = vf.createURI("http://localhost/people/" + vert4[0]);
//	        
//	        URI attrib1URI = vf.createURI("http://localhost/ontology/attrib1");
//	        URI attrib2URI = vf.createURI("http://localhost/ontology/attrib2");
//	        URI attrib3URI = vf.createURI("http://localhost/ontology/attrib3");
//	        URI attrib4URI = vf.createURI("http://localhost/ontology/attrib4");
//	        
//	        URI person = vf.createURI("http://localhost/ontology/Person");
//	        URI affiliated = vf.createURI("http://localhost/ontology/affiliated");
//			
//	        Literal per1_attrib1 = vf.createLiteral(vert3[1]);
//	        Literal per1_attrib2 = vf.createLiteral(vert1[1]);
//	        Literal per1_attrib3 = vf.createLiteral(vert1[2]);
//	        Literal per1_attrib4 = vf.createLiteral(vert1[3]);
//	        
//	        Literal per2_attrib1 = vf.createLiteral(vert4[1]);
//	        Literal per2_attrib2 = vf.createLiteral(vert2[1]);
//	        Literal per2_attrib3 = vf.createLiteral(vert2[2]);
//	        Literal per2_attrib4 = vf.createLiteral(vert2[3]);
//	        
//	        cxn.add(firstPersonURI, attrib1URI, per1_attrib1);
//	        cxn.add(firstPersonURI, attrib2URI, per1_attrib2);
//	        cxn.add(firstPersonURI, RDF.TYPE, person);
//	        cxn.add(firstPersonURI, attrib3URI, per1_attrib3);
//	        cxn.add(firstPersonURI, attrib4URI, per1_attrib4);
//	        cxn.add(firstPersonURI, RDF.TYPE, person);
//	        
//	        cxn.add(secondPersonURI, attrib1URI, per2_attrib1);
//	        cxn.add(secondPersonURI, attrib2URI, per2_attrib2);
//	        cxn.add(secondPersonURI, attrib3URI, per2_attrib3);
//	        cxn.add(secondPersonURI, attrib4URI, per2_attrib4);
//	        cxn.add(secondPersonURI, RDF.TYPE, person);
//	        
//	        cxn.add(firstPersonURI, affiliated, secondPersonURI);
//	        cxn.add(affiliated, RDF.TYPE, affiliated);
//			
//	        cxn.commit();
//	        cxn.close();
//		} catch (RepositoryException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
		boolean firstVertExist = false;
		boolean secondVertExist = false;
        URI attrib1URI = null;
        URI attrib2URI = null;
        URI attrib3URI = null;
        URI attrib4URI = null;
        
        URI person = null;
        URI affiliated = null;
		
        Literal per1_attrib1 = null;
        Literal per1_attrib2 = null;
        Literal per1_attrib3 = null;
        Literal per1_attrib4 = null;
        
        Literal per2_attrib1 = null;
        Literal per2_attrib2 = null;
        Literal per2_attrib3 = null;
        Literal per2_attrib4 = null;
        
		if(table.equals("transact-insert")){		
			Vertex c = newVertexQueue.removeFirst();
			addVertexAndConnectWithExisting(c);	
		}else{
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
		    				
		    				
		    				//WebResource resource = Client.create().resource(ycsbReposPath + "/?uri=" + ycsbReposPath + "/" + vert3[0]);
		    				WebResource resource = Client.create().resource(SERVER_ROOT_URI + "?uri=" + SERVER_ROOT_URI + vert3[0]);
		    				ClientResponse response = resource.post(ClientResponse.class);
		    				
		    				Console.OUT.println(String.format("POST on [%s], status code [%d]", SERVER_ROOT_URI + "?uri=" + SERVER_ROOT_URI + vert3[0], response.getStatus()));
		    				response.close();
		    				
		    				
//		    				WebResource resource = Client.create().resource(SERVER_ROOT_URI + "status");
//		    				ClientResponse response = resource.get(ClientResponse.class);
//		    				Console.OUT.println(response.getEntity(String.class));
//		    				
//		    				Console.OUT.println(String.format("POST on [%s], status code [%d]", SERVER_ROOT_URI + "status", response.getStatus()));
//		    				response.close();
        
							/*try{
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
						        
						        if(!firstVertExist){
							        per1_attrib1 = vf.createLiteral(vert3[1]);
							        per1_attrib2 = vf.createLiteral(vert1[1]);
							        per1_attrib3 = vf.createLiteral(vert1[2]);
							        per1_attrib4 = vf.createLiteral(vert1[3]);
							        
							        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
							        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
							        //conn.add(firstPersonURI, RDF.TYPE, person);
							        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
							        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
							        conn.add(firstPersonURI, RDF.TYPE, person);
						        }
						        
						        if(!secondVertExist){
							        per2_attrib1 = vf.createLiteral(vert4[1]);
							        per2_attrib2 = vf.createLiteral(vert2[1]);
							        per2_attrib3 = vf.createLiteral(vert2[2]);
							        per2_attrib4 = vf.createLiteral(vert2[3]);
							        
							        conn.add(secondPersonURI, attrib1URI, per2_attrib1);
							        conn.add(secondPersonURI, attrib2URI, per2_attrib2);
							        conn.add(secondPersonURI, attrib3URI, per2_attrib3);
							        conn.add(secondPersonURI, attrib4URI, per2_attrib4);
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
							        					        
							        conn.add(firstPersonURI, attrib1URI, per1_attrib1);
							        conn.add(firstPersonURI, attrib2URI, per1_attrib2);
	//						        conn.add(firstPersonURI, RDF.TYPE, person);
							        conn.add(firstPersonURI, attrib3URI, per1_attrib3);
							        conn.add(firstPersonURI, attrib4URI, per1_attrib4);
							        conn.add(firstPersonURI, RDF.TYPE, person);
						        }
						        
							}catch(RepositoryException ex){
								ex.printStackTrace();
							}
		            	} 
		            	*/ 
		    				

	            	}
	            }
	        }
		}
		
		}
		
		return 0;
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
                    	BigDataClient client = new BigDataClient();                   	
                    	
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
}
