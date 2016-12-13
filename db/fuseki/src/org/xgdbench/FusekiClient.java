/**
 * 
 */
package org.xgdbench;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import javax.ws.rs.core.MultivaluedMap;

import org.xgdbench.generator.MAGIncremental;
import org.xgdbench.generator.Vertex;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;

/**
 * @author miyuru
 *
 */
public class FusekiClient extends DB {
	
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
	
	//private String ycsbReposPath;
	
	/**
	 * 
	 */
	public FusekiClient() {
		// TODO Auto-generated constructor stub
	}

	public void init() throws DBException{
		Properties props = getProperties();
		SERVER_ROOT_URI = props.getProperty("uri");
		//ycsbReposPath = SERVER_ROOT_URI + "sparql";
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
		
		Client client = Client.create();
		WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/query");
		MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		m.add("query", "PREFIX ycsb: <"+SERVER_ROOT_URI+"> SELECT * WHERE {ycsb:person"+key+" ?p ?o.}");
		
		ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);

		String strResp = response.getEntity(String.class);
		String[] b = strResp.split("ycsb/personattrib");
		String[] a,c = null;
		
		//Console.OUT.println("------------>");
		for(Int i = 1; i < b.length; i++){
			a = b[i].split("</uri>");
			c = a[1].split("Int\">");
			c = c[1].split("</literal>");
			
			result.put("attrib" + a[0], c[0]);
		}
		//Console.OUT.println("------------|");
		
		if(response.getStatus() != 200){
			Console.OUT.println("response status : " + response.getStatus());
		}
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#scan(java.lang.String, java.lang.String, Int, java.util.Set, java.util.Vector)
	 */
	@Override
	public Int scan(String table, String startkey, Int recordcount,
			Set<String> fields, Vector<HashMap<String, String>> result) {
		Client client = Client.create();
		WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/query");
		MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		String qr = "PREFIX ycsb: <"+SERVER_ROOT_URI+"> SELECT * WHERE {ycsb:person"+startkey+" <"+SERVER_ROOT_URI+"ycsb/personaffiliatedTo> ?o.}";
		
		m.add("query", qr);
		m.add("output","csv");
		ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);

		String strResp = response.getEntity(String.class);
		
		if(response.getStatus() != 200){
			Console.OUT.println("response status : " + response.getStatus());
		}
		
		String[] w = strResp.split("\n");
		for(Int y = 0; y < w.length; y++){
			if(!(w[y].equals("") || w[y].equals("o"))){
				HashMap<String, String> hMap = new HashMap<String, String>();
				client = Client.create();
				webResource = client.resource(""+SERVER_ROOT_URI+"/query");
				m = new MultivaluedMapImpl();
				m.add("query", "PREFIX ycsb: <"+SERVER_ROOT_URI+"ycsb/person> SELECT * WHERE {ycsb:person"+w[y]+" ?p ?o.}");
				
				response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
				
				if(response.getStatus() != 200){
					Console.OUT.println("Error. response status : " + response.getStatus());
				}
				
				strResp = response.getEntity(String.class);
				String[] b = strResp.split("ycsb/personattrib");
				String[] a,c = null;
				
				for(Int i = 1; i < b.length; i++){
					a = b[i].split("</uri>");
					c = a[1].split("Int\">");
					c = c[1].split("</literal>");
					
					hMap.put("attrib" + a[0], c[0]);
				}
				
				 result.add(hMap);
			}
		}


		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#update(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int update(String table, String key, HashMap<String, String> values) {
        String selectedKey = null;
        Console.OUT.println("Update operation");
        //Set<String> keyList = values.keySet();
                
		String[] valArr = null;
		String res = null;
		String name = null;
		HashMap<String, String> Intermvals = new HashMap<String, String>();
		Int attribCount = 0;
		
		if(!vertexExists(key)){
			Console.OUT.println("No Vertex : " + key);
        	return -1;
        }
        
		Client client = Client.create();
		WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/query");
		MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		m.add("query", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/person> SELECT * WHERE {ycsb:person"+key+" ?p ?o.}");
		
		ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);

		String strResp = response.getEntity(String.class);
		String[] b = strResp.split("ycsb/attrib");
		String[] a,c = null;
		
		for(Int i = 1; i < b.length; i++){
			a = b[i].split("</uri>");
			c = a[1].split("Int\">");
			c = c[1].split("</literal>");
			
			Intermvals.put("attrib" + a[0], c[0]);
			Console.OUT.println("attrib" + a[0] + " " + c[0]);
			attribCount++;
		}
		
		if(response.getStatus() != 200){
			Console.OUT.println("response status : " + response.getStatus());
		}
			        
		//Iterator<String> itr = keyList.iterator();
		Int counter = 0;
		String kkey = null;
		String kVal = null;
		StringBuilder updateStr = new StringBuilder("PREFIX ycsb: <"+SERVER_ROOT_URI+"/person>");
		
		//Here we delete the existing vertex attribute and create new vertex attribute instead.
//		while(itr.hasNext()){
//			kkey = itr.next();
//		  	kVal = Intermvals.get(kkey);
//		  	updateStr.append(" DELETE DATA { ycsb:person"+key+" ycsb:"+kkey+" "+kVal+". } INSERT DATA { ycsb:person"+key+" ycsb:"+kkey+" "+values.get(kkey)+". } ");
//		
//		  	counter++;
//		}
		
		updateStr.append(" DELETE DATA { ycsb:person"+key+" ycsb:LastLogin "+Intermvals.get("LastLogin")+". } INSERT DATA { ycsb:person"+key+" ycsb:"+kkey+" "+values.get(kkey)+". } ");
		
		client = Client.create();
		webResource = client.resource(""+SERVER_ROOT_URI+"/update");
		m = new MultivaluedMapImpl();
		
		m.add("update", updateStr.toString());
		
		response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
		
		if(response.getStatus() != 200){
			Console.OUT.println("Error. Response status : " + response.getStatus());
		} 

		return 0;
	}

	/* This method inserts a single relationship to the GraphDB. If from and to vertices do not exist
	 * those will be assed to the Graph prior to adding the relationship.
	 * @see com.yahoo.ycsb.DB#insert(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int insert(String table, String key, HashMap<String, String> values) {

        //Console.OUT.println("Value --> " + table);
        
		if(table.equals("transact-insert")){		
			Vertex c = newVertexQueue.removeFirst();
			addVertexAndConnectWithExisting(c);	
		}else{
	        if(!table.equals("")){  
	            String[] IntermArr = table.split("<");
	            
	            for(Int u = 0; u < IntermArr.length; u++){
	            	
	            	if(!IntermArr[u].trim().equals("")){
		            	String[] inputArr = IntermArr[u].split("-");
		            	
		            	if(inputArr[0].equals("E")){					//Here we add an edge
		    		        String[] res = inputArr[1].split(" ");
		    		        
		    		        String[] vert1 = res[0].split(",");
		    		        String[] vert2 = res[1].split(",");    
		    	
		    				String[] vert3 = vert1[0].split(":");
		    				String[] vert4 = vert2[0].split(":");
		    				
		    				//If first vertex does not exist create it
		    				if(!vertexExists(vert3[0])){
			    				//create a person record on default db with friend
			    				Client client = Client.create();
			    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
			    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
			    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert3[0]+" ycsb:name \"person" + vert3[0] + "\". ycsb:person" + vert3[0] + " ycsb:id " + vert3[0] + ". ycsb:person" + vert3[0] + " ycsb:attrib1 " + vert3[1] + ". ycsb:person" + vert3[0] + " ycsb:attrib2 "+vert1[1]+". ycsb:person" + vert3[0] + " ycsb:attrib3 "+vert1[2]+". ycsb:person" + vert3[0] + " ycsb:attrib4 "+vert1[3]+". ycsb:person" + vert3[0] + " ycsb:LastLogin "+new java.sql.Timestamp(new java.util.Date().getTime()).toString()+".}");
			    				
			    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
			    					
			    				if(response.getStatus() != 200){
			    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
			    				}
		    				}
		    				
		    				//If second vertex doesn ot exist create it too.
		    				if(!vertexExists(vert4[0])){
			    				//create a person record on default db with friend
			    				Client client = Client.create();
			    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
			    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
			    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert4[0]+" ycsb:name \"person" + vert4[0] + "\". ycsb:person" + vert4[0] + " ycsb:id " + vert4[0] + ". ycsb:person" + vert4[0] + " ycsb:attrib1 " + vert4[1] + ". ycsb:person" + vert4[0] + " ycsb:attrib2 "+vert2[1]+". ycsb:person" + vert4[0] + " ycsb:attrib3 "+vert2[2]+". ycsb:person" + vert4[0] + " ycsb:attrib4 "+vert2[3]+" ycsb:LastLogin "+new java.sql.Timestamp(new java.util.Date().getTime()).toString()+".}");
			    				
			    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
			    					
			    				if(response.getStatus() != 200){
			    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
			    				}
		    				}
		    				
		    				//Next create the link between the vertices
		    				//create a person record on default db with friend
		    				Client client = Client.create();
		    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
		    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert3[0]+" ycsb:affiliatedTo "+vert4[0]+".}");
		    				
		    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
		    					
		    				if(response.getStatus() != 200){
		    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
		    				}
		    				
		            	}else{
		            		//This time its only single vertex
		            		
		    		        String[] vert1 = inputArr[1].split(",");
		    				String[] vert3 = vert1[0].split(":");
		    						    				
		    				//If first vertex does not exist create it
		    				if(!vertexExists(vert3[0])){
		    					//create a person record on default db with friend
			    				Client client = Client.create();
			    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
			    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
			    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert3[0]+" ycsb:name \"person" + vert3[0] + "\". ycsb:person" + vert3[0] + " ycsb:id " + vert3[0] + ". ycsb:person" + vert3[0] + " ycsb:attrib1 " + vert3[1] + ". ycsb:person" + vert3[0] + " ycsb:attrib2 "+vert1[1]+". ycsb:person" + vert3[0] + " ycsb:attrib3 "+vert1[2]+". ycsb:person" + vert3[0] + " ycsb:attrib4 "+vert1[3]+" ycsb:LastLogin "+new java.sql.Timestamp(new java.util.Date().getTime()).toString()+".}");
			    				
			    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
			    					
			    				if(response.getStatus() != 200){
			    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
			    				}
		    				}
		    				
		            	} //End E/V check   			
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
		
	private boolean vertexExists(String vertID){
		Client client = Client.create();
		WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/query");
		MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		m.add("query", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> SELECT * WHERE {?s ycsb:id ?o. FILTER(?o="+vertID+").}");
		//webResource = webResource.queryParam("graph", "default");
		
		ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
		
		
		if(response.getStatus() != 200){
			Console.OUT.println("Error. Response status : " + response.getStatus());
		}
		
		if(response.getEntity(String.class).toString().contains("person"+vertID)){
			return true;
		}else{
			return false;
		}
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
                    	//BigDataClient client = new BigDataClient();                   	
                    	
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
	public Int traverse(String startkey, Int levels, Vector<String> result){
		ArrayList<String> unDiscoveredVertices = new ArrayList<String>();
		ArrayList<String> discoveredVertices = new ArrayList<String>();
		
		unDiscoveredVertices.add(startkey); //We start traversal from the first vertex given.
		
		for(Int i = 0; i < levels; i++){
			Iterator itr = unDiscoveredVertices.iterator();
			
			while(itr.hasNext()){
				String k = itr.next().toString();
							
				Client client = Client.create();
				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/query");
				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
				String qr = "PREFIX ycsb: <" + SERVER_ROOT_URI + "/person> SELECT * WHERE {<" + SERVER_ROOT_URI + "/person" + k + "> <" + SERVER_ROOT_URI + "/affiliatedTo> ?o.}";
				//String qr = "PREFIX ycsb: <http://192.168.112.201:3030/ycsb/person> SELECT * WHERE {<http://192.168.112.201:3030/ycsb/person39> ?v ?o.}";
				
				m.add("query", qr);
				m.add("output","csv");
				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);

				String strResp = response.getEntity(String.class);
				
				String[] w = strResp.split("\n");
				String v = null;
				for(Int y = 0; y < w.length; y++){
					v = w[y].trim();
					if(!( v.equals("")|| v.equals("o"))){
						discoveredVertices.add(v);
					}
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
		
//		Console.OUT.println("Size of the processed vertices : " + result.size());
//		Iterator it = processedVertices.iterator();
//		
//		while(it.hasNext()){
//			String k = it.next().toString();
//			
//			Console.OUT.println(k);
//		}
		return -1;
	}
	
	@Override
	public Int insertEdge(String table, String key, HashMap<String, String> values) {
        if(!table.equals("")){  
        	Console.OUT.println("edge: " + table);
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
	    				
	    				//If first vertex does not exist create it
	    				if(!vertexExists(vert3[0])){
		    				//create a person record on default db with friend
		    				Client client = Client.create();
		    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
		    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert3[0]+" ycsb:name \"person" + vert3[0] + "\". ycsb:person" + vert3[0] + " ycsb:id " + vert3[0] + ". ycsb:person" + vert3[0] + " ycsb:attrib1 " + vert3[1] + ". ycsb:person" + vert3[0] + " ycsb:attrib2 "+vert1[1]+". ycsb:person" + vert3[0] + " ycsb:attrib3 "+vert1[2]+". ycsb:person" + vert3[0] + " ycsb:attrib4 "+vert1[3]+ " ycsb:LastLogin " + new java.sql.Timestamp(new java.util.Date().getTime()).toString() + ".}");
		    				
		    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
		    					
		    				if(response.getStatus() != 200){
		    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
		    					return -1;
		    				}
	    				}
	    				
	    				//If second vertex doesn ot exist create it too.
	    				if(!vertexExists(vert4[0])){
		    				//create a person record on default db with friend
		    				Client client = Client.create();
		    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
		    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert4[0]+" ycsb:name \"person" + vert4[0] + "\". ycsb:person" + vert4[0] + " ycsb:id " + vert4[0] + ". ycsb:person" + vert4[0] + " ycsb:attrib1 " + vert4[1] + ". ycsb:person" + vert4[0] + " ycsb:attrib2 "+vert2[1]+". ycsb:person" + vert4[0] + " ycsb:attrib3 "+vert2[2]+". ycsb:person" + vert4[0] + " ycsb:attrib4 "+vert2[3]+" ycsb:LastLogin " + new java.sql.Timestamp(new java.util.Date().getTime()).toString() + ".}");
		    				
		    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
		    					
		    				if(response.getStatus() != 200){
		    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
		    					return -1;
		    				}
	    				}
	    				
	    				//Next create the link between the vertices
	    				//create a person record on default db with friend
	    				Client client = Client.create();
	    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
	    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
	    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert3[0]+" ycsb:affiliatedTo "+vert4[0]+".}");
	    				
	    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
	    					
	    				if(response.getStatus() != 200){
	    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
	    					return -1;
	    				}
	    				
	            	}else{
	            		//This time its only single vertex
	            		
	    		        String[] vert1 = inputArr[1].split(",");
	    				String[] vert3 = vert1[0].split(":");
	    				
	    				//If first vertex does not exist create it
	    				if(!vertexExists(vert3[0])){
		    				//create a person record on default db with friend
		    				Client client = Client.create();
		    				WebResource webResource = client.resource(""+SERVER_ROOT_URI+"/update");
		    				MultivaluedMap<String, String> m = new MultivaluedMapImpl();
		    				m.add("update", "PREFIX ycsb: <"+SERVER_ROOT_URI+"/> INSERT DATA { ycsb:person"+vert3[0]+" ycsb:name \"person" + vert3[0] + "\". ycsb:person" + vert3[0] + " ycsb:id " + vert3[0] + ". ycsb:person" + vert3[0] + " ycsb:attrib1 " + vert3[1] + ". ycsb:person" + vert3[0] + " ycsb:attrib2 "+vert1[1]+". ycsb:person" + vert3[0] + " ycsb:attrib3 "+vert1[2]+". ycsb:person" + vert3[0] + " ycsb:attrib4 "+vert1[3]+" ycsb:LastLogin " + new java.sql.Timestamp(new java.util.Date().getTime()).toString() + ".}");
		    				
		    				ClientResponse response = webResource.accept("application/rdf+xml").post(ClientResponse.class, m);
		    					
		    				if(response.getStatus() != 200){
		    					Console.OUT.println("Error in update. Response status : " + response.getStatus());
		    					return -1;
		    				}
	    				}
	    				
	            	} //End E/V check   			
            	}
            }
        }
        
        return 0;
	}
}
