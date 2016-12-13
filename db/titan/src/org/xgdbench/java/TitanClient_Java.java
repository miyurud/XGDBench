/**
 * 
 */
package org.xgdbench.java;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

//import Neo4jClient.OrgID;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;

import org.apache.log4j.Logger;
import org.xgdbench.generator.MAGIncremental;
import org.xgdbench.generator.Vertex;
import org.xgdbench.util.Conts;

/**
 * @author miyuru
 *
 */
public class TitanClient_Java {
	
//	private String SERVER_ROOT_URI;
//	private boolean transactInsert;
//	private HashMap<Integer, Integer> inOutNeighbourCount;
//	private HashMap<Integer, Integer[]> vertexAttribs;
//	private LinkedList<Vertex> newVertexQueue;
//	private TreeSet<Integer> degrees;
//	private long sumDegree;
//	private long largestVert; //The default graph's largest vertex
//	private long largestNewVert;//This the the largest vertex after building the transact insert data
//	private long totalOpCount;
//	private long transactInsertOpCount;
//	private float[] affMatrix;
//	private MAGIncremental mag;
//	public static final String AFFINITY_MATRIX_DEFAULT = "[0.99f, 0.53f, 0.53f, 0.13f]";
//	public static final String AFFINITY_MATRIX = "affinitymatrix";
//	public static final String THETA_THRESHOLD_DEFAULT = "0.1";
//	public static final String THETA_THRESHOLD = "pthreshold";
//	public static final String RECORD_COUNT_PROPERTY_DEFAULT = "4";
//	public static final String RECORD_COUNT_PROPERTY = "fieldcount";
//	public static final String INSERT_PROPORTION_PROPERTY="insertproportion";
//	public static final String INSERT_PROPORTION_PROPERTY_DEFAULT="0.0";
//	public static final String TOTAL_OP_COUNT_PROPERTY_DEFAULT = "1000";
//	public static final String TOTAL_OP_COUNT_PROPERTY = "operationcount";
//	public static final String THREAD_COUNT_PROPERTY = "genthread";
//	public static final String THREAD_COUNT_PROPERTY_DEFAULT = "4";
//	
//	float thetaThreshold = 0.1f;
//	private int attribCount = 0;
//	private int threadCount = 0;
//	private float insertProportion;
	//private String indexName = "vindex";//This is the name of the vertex index.
	
	/**
	 * 
	 */
//	public TitanClient() {
//		// TODO Auto-generated constructor stub
//	}

	/**
	 * Initialize the connection.
	 */
	public void init() throws DBException{
//		System.out.println("Creating a single MAG GRAPH. This should be the only graph to be loaded.");
//		Properties props = getProperties();
//		transactInsert = Boolean.parseBoolean(props.getProperty("transactioninsert"));
//		SERVER_ROOT_URI = props.getProperty("uri");
//		if(!isServerRunning()){
//			throw new DBException("Rexster server is not running...");
//		}
//		
//		if(transactInsert){
//			loadVertexAttribs();
//			loadAffinityMatrix();
//			mag = new MAGIncremental(affMatrix, vertexAttribs, thetaThreshold, attribCount);
//			newVertexQueue = new LinkedList<Vertex>();
//			constructInsertData();
//		}
//		
//		//Here we create the index. If the index already exists (most probable reason to get false) it will return false.
//		if(!createVertexIndex(indexName)){
//			System.out.println("Index was not created. Probably it exists.");
//		}else{
//			System.out.println("Index created successfully.");
//		}
	}
	
	private void loadAffinityMatrix(){
//		Properties props = getProperties();
//		String aff = props.getProperty(AFFINITY_MATRIX, AFFINITY_MATRIX_DEFAULT);
//		//[0.99f, 0.53f, 0.53f, 0.13f]
//		aff = aff.substring(1, (aff.length() - 1));
//		String[] iterm = aff.split(","); 
//		affMatrix = new float[iterm.length];
//		
//		for(int i = 0; i < iterm.length; i++){
//			affMatrix[i] = Float.parseFloat(iterm[i].trim());
//		}
//		
//		String thetaThreash = props.getProperty(THETA_THRESHOLD, THETA_THRESHOLD_DEFAULT);
//		thetaThreshold = Float.parseFloat(thetaThreash);
//		
//		attribCount=Integer.parseInt(props.getProperty(RECORD_COUNT_PROPERTY, RECORD_COUNT_PROPERTY_DEFAULT));
//		
//		insertProportion=Float.parseFloat(props.getProperty(INSERT_PROPORTION_PROPERTY, INSERT_PROPORTION_PROPERTY_DEFAULT));
//		totalOpCount=Long.parseLong(props.getProperty(TOTAL_OP_COUNT_PROPERTY, TOTAL_OP_COUNT_PROPERTY_DEFAULT));
//		threadCount = Integer.parseInt(props.getProperty(THREAD_COUNT_PROPERTY, THREAD_COUNT_PROPERTY_DEFAULT));
//		
//		transactInsertOpCount = (long)(insertProportion*Math.round(totalOpCount/threadCount)) + 10;
//		
//		System.out.println("transactInsertOpCount : " + transactInsertOpCount);
	}
	
	/**
	 * This method loads all the vertices
	 */
	public void loadVertexAttribs(){
//		vertexAttribs = new HashMap<Integer, Integer[]>();
//		
//		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/vertices";
//		
//		WebResource resource = Client.create().resource(nodeEntryPointUri);
//				
//		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
//		
//		InputStream entityStream = resp.getEntityInputStream();
//		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(entityStream));
//		StringBuilder builder = new StringBuilder();
//		String line = null;
//				
//		int ch = -1;
//		boolean appendFlag = false;
//		boolean withinEntityFlag = false;
//		
//		try{
//			while ((ch = reader.read()) != -1){
//				if (ch == 91){ //91 corresponds to [
//					appendFlag = true;
//					continue;
//				}
//				
//				if (ch == 93){ //93 corresponds to ]
//					appendFlag = false;
//				}
//				
//				if (appendFlag && (ch == 123)){ //123 corresponds to {
//					withinEntityFlag = true;
//					builder = new StringBuilder();
//					continue;
//				}
//				
//				if (appendFlag && (ch == 125)){ //125 corresponds to }
//					withinEntityFlag = false;
//					String entity = builder.toString();
//					
//					String[] kvs=entity.split(",");
//					int counter = 0;
//					int len = kvs.length;
//					int perName = -1;
//					ArrayList<Integer> attribArrayList = new ArrayList<Integer>();
//					
//					for (counter = 0; counter < len; counter++){						
//						if (kvs[counter].contains("name")){
//							String[] strArr = kvs[counter].split(":"); 
//							perName = Integer.parseInt(removeQuotes(strArr[1]));
//						}
//						
//						if (kvs[counter].contains("attrib")){
//								if (kvs[counter].contains("attrib")){
//									String val = kvs[counter];
//									String[] strArr = val.split(":");
//									int r = Integer.parseInt(removeQuotes(strArr[0].split("attrib")[1]));
//									attribArrayList.add(Integer.parseInt(removeQuotes(strArr[1])));
//								}
//						}
//					}
//					
//					if (perName != -1){				
//						Integer[] v = new Integer[attribArrayList.size()];
//						
//						Iterator itr = attribArrayList.iterator();
//						int cntr = 0;
//						while(itr.hasNext()){
//							v[cntr] = (Integer)itr.next();
//							cntr++;
//						}
//						
//						vertexAttribs.put(perName, v);
//						
//						if (perName > largestVert){
//							largestVert = perName;
//						}
//					}
//				}
//				
//				if (appendFlag && withinEntityFlag){
//					builder.append((char)ch);
//				}
//				
//			}
//		}catch(IOException e){
//			e.printStackTrace();
//		}finally{
//			try{
//				entityStream.close();
//			}catch(IOException ec){
//				ec.printStackTrace();
//			}
//		}
//		
//		largestNewVert = largestVert;
	}
	
	private void constructInsertData(){
//		for(int i = 0; i < transactInsertOpCount; i++){
//			largestNewVert++;
//			Vertex c = mag.getListOfVerticesToConnectWith(largestNewVert);
//			newVertexQueue.add(c);
//			vertexAttribs.put((int)largestNewVert, c.attribs);
//			mag.setVerticesAndAttributes(vertexAttribs);
//		}
	}
	
	/**
	 * This method indicates whether the Rexster server is running or not.
	 * @return
	 */
	public boolean isServerRunning(String SERVER_ROOT_URI){
		boolean result = false;
		
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs";
		
		WebResource resource = Client.create().resource(nodeEntryPointUri);
		try{
			ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);	
			result = true;
		}catch(Exception e){
			result = false;
		}
		
		return result;
	}
	
	
	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#read(java.lang.String, java.lang.String, java.util.Set, java.util.HashMap)
	 */
	//@Override
	public int read(String table, String key, Set<String> fields, HashMap<String, String> result) {
		
//		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/vertices?key=pername&value=" + key;
//		WebResource resource = Client.create().resource(nodeEntryPointUri);
//		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
//		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
//		
//		WebResource resource = Client.create().resource(nodeEntryPointUri);
//				
//		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{\"params\":{\"idxname\":\"" + indexName + "\",\"pname\":\"" + key + "\"},\"script\":\"g.idx(idxname)[[pername:pname]]\"}").post(ClientResponse.class);	
//		
//		String entity = resp.getEntity(String.class);
//		int firstIndex = entity.lastIndexOf("{") + 1;
//		
//		entity = entity.substring(firstIndex).trim();
//		int lastIndex = entity.indexOf("}");
//		entity = entity.substring(0, lastIndex).trim();
//		
//		String[] kvs=entity.split(",");
//		int counter = 0;
//		int len = kvs.length;
//		int startInd = -1;
//		
//		for (counter = 0; counter < len; counter++){						
//			if (kvs[counter].contains("name")){
//				String val = kvs[counter];
//				startInd = val.indexOf(":") + 1;
//				result.put("name", removeQuotes(val.substring(startInd)));
//			}
//			
//			if (kvs[counter].contains("attrib")){
//				String val = kvs[counter];
//				String[] strArr = val.split(":");
//				result.put(strArr[0], strArr[1]);
//			}
//			
//			if (kvs[counter].contains("LastLogin")){
//				String val = kvs[counter];
//				String[] strArr = val.split(":");
//				result.put(strArr[0], strArr[1]);
//			}
//		}
//				
//		final URI location = resp.getLocation();
//		
//		if(resp.getStatus() == 500){
//			System.out.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPointUri, resp.getStatus(), location.toString()));
//		}
//		
//		resp.close();
		
		return 0;
	}

	/* This method loads all the friends of a vertex. All the attribute names and their values of each friend are put in to a HashMap object which
	 * in trun gets stored in a Vector. The attributes that get stored on the HashMap includes the name of the person and the attrib<n> attributes.
	 * @see com.yahoo.ycsb.DB#scan(java.lang.String, java.lang.String, int, java.util.Set, java.util.Vector)
	 */
	//@Override
	public int scan(String table, String startkey, int recordcount, Set<String> fields, Vector<HashMap<String, String>> result) {		
//		String fromVertID = getVertexID(startkey).replaceAll("^\"|\"$", ""); //Get the exact vertex ID of the starting (i.e., from) vertex
//		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/vertices/" + fromVertID + "/bothE";
//		
//		WebResource resource = Client.create().resource(nodeEntryPointUri);
//				
//		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
//		
//		InputStream entityStream = resp.getEntityInputStream();
//		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(entityStream));
//		StringBuilder builder = new StringBuilder();
//		String line = null;
//				
//		int ch = -1;
//		boolean appendFlag = false;
//		boolean withinEntityFlag = false;
//		Vector<String> foundFriends = new Vector<String>();
//		
//		try{
//			while ((ch = reader.read()) != -1){
//				if (ch == 91){ //91 corresponds to [
//					appendFlag = true;
//					continue;
//				}
//				
//				if (ch == 93){ //93 corresponds to ]
//					appendFlag = false;
//				}
//				
//				if (appendFlag && (ch == 123)){ //123 corresponds to {
//					withinEntityFlag = true;
//					builder = new StringBuilder();
//					continue;
//				}
//				
//				if (appendFlag && (ch == 125)){ //125 corresponds to }
//					withinEntityFlag = false;
//					String entity = builder.toString();
//					
//					String[] kvs=entity.split(",");
//					int counter = 0;
//					int len = kvs.length;
//					
//					HashMap<String, String> hMap = new HashMap<String, String>();
//					
//					for (counter = 0; counter < len; counter++){						
//						if (kvs[counter].contains("_inV")){
//							String val = kvs[counter];
//							String[] strArr = val.split(":");	
//							if (!foundFriends.contains(strArr[1])){
//								hMap = getVertexPropertiesByExactID(strArr[1]);
//								hMap.put(strArr[0], strArr[1]);
//								foundFriends.add(strArr[1]);
//							}
//						}
//					}
//					
//					result.add(hMap);
//					
//				}
//				
//				if (appendFlag && withinEntityFlag){
//					builder.append((char)ch);
//				}
//			}
//		}catch(IOException e){
//			e.printStackTrace();
//		}finally{
//			try{
//				entityStream.close();
//			}catch(IOException ec){
//				ec.printStackTrace();
//			}
//		}		
//						
//		final URI location = resp.getLocation();
//		
//		if(resp.getStatus() == 500){
//			System.out.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPointUri, resp.getStatus(), location.toString()));
//		}
//		
//		resp.close();
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#update(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	//@Override
	public int update(String table, String key, HashMap<String, String> values) {
//		String sideEffectString = "";
//		Iterator itr = values.keySet().iterator();
//		String k = null, v = null;
//		
////		while(itr.hasNext()){
////			k = itr.next().toString();
////			v = values.get(k).toString();
////			sideEffectString += "it." + k + "=%22" + v + "%22;";
////		}
//		
//		try{
//			//We just need to update the last login time.
//			sideEffectString += "it.LastLogin=%22" + URLEncoder.encode(new java.sql.Timestamp(new java.util.Date().getTime()).toString(), "utf-8") + "%22;";
//		}catch(Exception ec){
//			ec.printStackTrace();
//		}
//		//Note that in the below string the URL characters are encoded to avoid errors that were encountered during tests.
//		//The character codes are as follows,
//		// %22 - "
//		// %7C - {
//		// %7D - }
//		// %2C - ,
//		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin?script=g.V(%22pername%22%2C%22"+key+"%22).sideEffect%7B" + sideEffectString + "%7D";
//		
//		WebResource resource = Client.create().resource(nodeEntryPointUri);		
//		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
//		
//		String entity = resp.getEntity(String.class);
//		final URI location = resp.getLocation();
//
//		resp.close();
		
		return 0;
	}
	
	/* This method inserts a single relationship to the GraphDB. If from and to vertices do not exist
	 * those will be added to the Graph prior to adding the relationship. Furthermore each insert operation does not necessarily need
	 * to insert an edge to the graph. Some times an insert operation might insert only a vertex.
	 * @see com.yahoo.ycsb.DB#insert(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	//@Override
	public int insert(String table, String key, HashMap<String, String> values) {
//		if(table.equals("transact-insert")){	
//			Vertex c = null;
//			try{
//				c = newVertexQueue.removeFirst();
//			}catch(java.util.NoSuchElementException e){
//				return -1;
//			}
//			addVertexAndConnectWithExisting(c);			
//		}else{
//	        if(!table.equals("")){  
//	            String[] intermArr = table.split("<");
//	            
//	            for(int u = 0; u < intermArr.length; u++){
//	            	
//	            	if(!intermArr[u].trim().equals("")){
//		            	String[] inputArr = intermArr[u].split("-");
//		            	
//		            	if(inputArr[0].equals("E")){
//		            		String firstVertexName = null;
//		            		String secondVertexName = null;
//		    		        String[] res = inputArr[1].split(" ");
//		    		        
//		    		        String[] vert1 = res[0].split(",");
//		    		        String[] vert2 = res[1].split(",");    
//		    	
//		    				String[] vert3 = vert1[0].split(":");
//		    						    				
//		    				String res1 = getVertexID(vert3[0]); //Here what we really do is checking whether the vertex exists or not.
//		    				
//		    				if(res1.equals("-1")){	    					
//		    					HashMap<String, String> vertAttribs = new HashMap<String, String>(); 
//		    					vertAttribs.put("attrib1", vert3[1].toString());
//		    					vertAttribs.put("attrib2", vert1[1].toString());
//		    					vertAttribs.put("attrib3", vert1[2].toString());
//		    					vertAttribs.put("attrib4", vert1[3].toString());
//		    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
//		    					
//		    					createVertexWithProperties(vert3[0], vertAttribs);
//		    					firstVertexName = vert3[0];
//		    				}
//		    				
//		    				vert3 = vert2[0].split(":");      
//		    				URI secondNode = null;
//		    				
//		    				res1 = getVertexID(vert3[0]);
//		    				
//		    				if(res1.equals("-1")){	    					
//		    					HashMap<String, String> vertAttribs = new HashMap<String, String>(); 
//		    					vertAttribs.put("attrib1", vert3[1].toString());
//		    					vertAttribs.put("attrib2", vert1[1].toString());
//		    					vertAttribs.put("attrib3", vert1[2].toString());
//		    					vertAttribs.put("attrib4", vert1[3].toString());
//		    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
//		    					
//		    					createVertexWithProperties(vert3[0], vertAttribs);
//		    					secondVertexName = vert3[0];
//		    				}
//		    				
//		    				try{
//		    				  	addRelationship( firstVertexName, secondVertexName, "affiliated");
//		    				}catch(Exception e){
//		    				  	e.printStackTrace();
//		    				}
//		            	}else{
//		            		//In this case we need to add only the first vertex to the graph. There is no insertion of a edge
//		            		//happen at this point.
//		    		        String[] vert1 = inputArr[1].split(",");
//		    				String[] vert3 = vert1[0].split(":");
//		    				String res = getVertexID(vert3[0]);
//		    				
//		    				if(res.equals("-1")){	    					
//		    					HashMap<String, String> vertAttribs = new HashMap<String, String>(); 
//		    					vertAttribs.put("attrib1", vert3[1].toString());
//		    					vertAttribs.put("attrib2", vert1[1].toString());
//		    					vertAttribs.put("attrib3", vert1[2].toString());
//		    					vertAttribs.put("attrib4", vert1[3].toString());
//		    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
//		    					
//		    					if(createVertexWithProperties(vert3[0], vertAttribs).equals("-1")){
//		    						return -1;
//		    					}
//		    				}
//		            	}            	
//	            	}
//	            }
//	        }
//		}

		return 0;
	}	

	/* Note : this method is not implemented in Titan
	 * @see com.yahoo.ycsb.DB#delete(java.lang.String, java.lang.String)
	 */
	//@Override
	public int delete(String table, String key) {
		// TODO Auto-generated method stub
		System.out.println("Error : Deletion operation has not been implemented on Titan 0.1.0.");
		return 0;
	}
	
	/**
	 * This method adds new vertex during transaction phase
	 * @param vertID
	 * @param listOfvertices
	 */
	private void addVertexAndConnectWithExisting(Vertex c){
//		int[] listOfvertices = c.neighbours;
//		Integer[] attribs = c.attribs;
//		String firstVertex = "" + c.pername;
//		String secondVertex = null;
//		
//		String res = getVertexID(firstVertex);
//		
//		if(res.equals("-1")){			
//			HashMap<String, String> vertAttribs = new HashMap<String, String>(); 
//			vertAttribs.put("attrib1", attribs[0].toString());
//			vertAttribs.put("attrib2", attribs[1].toString());
//			vertAttribs.put("attrib3", attribs[2].toString());
//			vertAttribs.put("attrib4", attribs[3].toString());
//			vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
//			
//			createVertexWithProperties(firstVertex, vertAttribs);
//			
//		}else{
//			System.out.println("Error : The new vertex exists in the Graph!! Vert ID : " + firstVertex);
//		}
//		
//		for(int i = 0; i < listOfvertices.length; i++ ){	
//			secondVertex = "" + listOfvertices[i];
//						
//			res = getVertexID(secondVertex);
//			
//			if(res.equals("-1")){
//				System.out.println("Error : It says that the vertex " + secondVertex + "does not exist.");
//				continue;
//			}
//			
//		  	addRelationship( firstVertex, secondVertex, "affiliated");
//		}
	}
		
	/**
	 * This method creates an edge between two vertices on the Titan Graph
	 * @param fromVertex
	 * @param toVertex
	 * @return
	 */
	
	public static String addRelationship(String SERVER_ROOT_URI, String indexName, String fromVertex, String toVertex, String relationshipName){
		String result = "-1";		
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		
		WebResource resource = Client.create().resource(nodeEntryPointUri);
			
		//Check and confirm whether the two vertices exist
		String idFrom = getVertexID(SERVER_ROOT_URI, indexName, fromVertex).replaceAll("^\"|\"$", "");
		String idTo = getVertexID(SERVER_ROOT_URI, indexName, toVertex).replaceAll("^\"|\"$", "");
		//System.out.println("JSON text is : " + "{ \"params\" : {\"etype\" : \"" + relationshipName + "\"}, \"script\" : \"v1=g.v('" + idFrom + "');v2=g.v('" + idTo + "');e=g.addEdge(v1,v2,etype);\" }");
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"params\" : {\"etype\" : \"" + relationshipName + "\"}, \"script\" : \"v1=g.v('" + idFrom + "');v2=g.v('" + idTo + "');e=g.addEdge(v1,v2,etype);\" }").post(ClientResponse.class);
		
		final URI location = resp.getLocation();
		
		//Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("response of edge insert : " + resp.getStatus());
		
		if((resp != null) && (location != null) && (resp.getStatus() == 500)){
			System.out.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPointUri, resp.getStatus(), location.toString()));
			return "-1";
		}
		
		resp.close();
				
		result = "0";
		
		return result;
	}	
	
	/**
	 * This method creates a vertex index.
	 * @param indexname
	 * @return
	 */
	public static boolean createVertexIndex(String SERVER_ROOT_URI, String indexName){
		boolean result = false;		
		System.out.println("Miyuru:creating vertex index");
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		
		WebResource resource = Client.create().resource(nodeEntryPointUri);
			
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"params\" : {\"name\" : \"" + indexName + "\"}, \"script\" : \"g.createIndex(name, Vertex.class)\" }").post(ClientResponse.class);
		
		final URI location = resp.getLocation();
		
		if(resp.getStatus()==200){
			result = true;
		}
		
		resp.close();
		
		return result;
	}	
	
	/**
	 * This method adds a vertex to a given vertex index. If the adding did not complete successfully, it returns false.
	 * @param indexName - Name of the index
	 * @param vetexID - The unique vertex id assigned by the Titan server
	 * @param vertexName - The vertex id (i.e., pername) provided by XGDBench graph generator
	 * @return true if success. false otherwise.
	 */
	public static boolean addVertexToIndex(String SERVER_ROOT_URI, String indexName, String vertexID, String vertexName){
		boolean result = false;
		
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		
		WebResource resource = Client.create().resource(nodeEntryPointUri);
				
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"params\" : {\"idxname\" : \"" + indexName + "\",\"par1\" : \"pername\", \"par2\" : \"" + vertexName + "\",\"par3\" : " + vertexID + "}, \"script\" : \"g.idx(idxname).put(par1, par2, g.v(par3))\" }").post(ClientResponse.class);
		
		final URI location = resp.getLocation();
				
		if(resp.getStatus()==200){
			result = true;
		}
		
		resp.close();
		
//		String str = getVertexID(vertexName);
//		
//		System.out.println("vertexID : " + vertexID + " vertexName : " + vertexName + " _id : " + str);
		
		return result;		
	}
	
	
	/**
	 * This method creates a vertex with a set of predefined properties
	 * @param vertexName
	 * @param values
	 * @return
	 */
	
	public static String createVertexWithProperties(String SERVER_ROOT_URI, String indexName, String vertexName, String a){
		String result = "-1";
		HashMap<String, String> values = convertStringToHmap(a);
		
		//First we create the vertex
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/vertices";
		
		WebResource resource = Client.create().resource(nodeEntryPointUri);
		
		String entityString = "\"pername\" : \"" + vertexName + "\"";
		
		Iterator it = values.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();
			entityString += ",\"" + pairs.getKey() + "\" : \"" + pairs.getValue() + "\"";
		}
		
		entityString += ",\"LastLogin\" : \"" + new java.sql.Timestamp(new java.util.Date().getTime()).toString() + "\"";
		
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ " + entityString + " }").post(ClientResponse.class);
		final URI location = resp.getLocation();

		//Once we create the vertex we get the created vertex content as output. We parse the content to get the vertex id.
		String entity = resp.getEntity(String.class);
		
		String vid = null;
		
		int firstIndex = entity.lastIndexOf("{") + 1;
		
		entity = entity.substring(firstIndex).trim();
		int lastIndex = entity.indexOf("}");
		entity = entity.substring(0, lastIndex).trim();
		
		String[] kvs=entity.split(",");
		int counter = 0;
		int len = kvs.length;
		
		for (counter = 0; counter < len; counter++){
			if (kvs[counter].contains("_id")){
				String val = kvs[counter];
				int startInd = val.indexOf(":") + 1;
				vid = val.substring(startInd).replaceAll("^\"|\"$", "");//We remove the two double quotes from the vertex id.
				
				break;
			}
		}
		
		//Next we add the vertex to the vertex index.
		
		if(!TitanClient_Java.addVertexToIndex(SERVER_ROOT_URI, indexName, vid, vertexName)){
			System.out.println("Could not add the vertex to index.");
		}
		
		result = "0"; //The operation is successful.
				
		//if((location != null) && (resp.getStatus() == 500)){
		if(resp.getStatus() != 200){
			//System.out.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPointUri, resp.getStatus(), location.toString()));
			result = "-1"; 
		}

		resp.close();
		
		//System.out.println("Done vertex : " + vertexName + " response is : " + result);
		
		return result;
	}
	
	private static HashMap<String, String> convertStringToHmap(String a){
		HashMap<String, String> result = new HashMap<String, String>();
		
		String[] arr = a.split("-");
        
        for(int u = 0; u < arr.length; u++){
        	if(arr[u].contains(":")){
        		String[] data = arr[u].split(":");
        		result.put(data[0], data[1]);
        	}
        }
        
        return result;
	}
	
	public static String createVertexWithProperties(String SERVER_ROOT_URI, String indexName, String vertexName, HashMap<String, String> values){
		String result = "-1";
		
		//First we create the vertex
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/vertices";
		
		WebResource resource = Client.create().resource(nodeEntryPointUri);
		
		String entityString = "\"pername\" : \"" + vertexName + "\"";
		
		Iterator it = values.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();
			entityString += ",\"" + pairs.getKey() + "\" : \"" + pairs.getValue() + "\"";
		}
		
		entityString += ",\"LastLogin\" : \"" + new java.sql.Timestamp(new java.util.Date().getTime()).toString() + "\"";
		
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ " + entityString + " }").post(ClientResponse.class);
		final URI location = resp.getLocation();

		//Once we create the vertex we get the created vertex content as output. We parse the content to get the vertex id.
		String entity = resp.getEntity(String.class);
		
		String vid = null;
		
		int firstIndex = entity.lastIndexOf("{") + 1;
		
		entity = entity.substring(firstIndex).trim();
		int lastIndex = entity.indexOf("}");
		entity = entity.substring(0, lastIndex).trim();
		
		String[] kvs=entity.split(",");
		int counter = 0;
		int len = kvs.length;
		
		for (counter = 0; counter < len; counter++){
			if (kvs[counter].contains("_id")){
				String val = kvs[counter];
				int startInd = val.indexOf(":") + 1;
				vid = val.substring(startInd).replaceAll("^\"|\"$", "");//We remove the two double quotes from the vertex id.
				
				break;
			}
		}
		
		//Next we add the vertex to the vertex index.
		
		if(!TitanClient_Java.addVertexToIndex(SERVER_ROOT_URI, indexName, vid, vertexName)){
			System.out.println("Could not add the vertex to index.");
		}
		
		result = "0"; //The operation is successful.
				
		//if((location != null) && (resp.getStatus() == 500)){
		if(resp.getStatus() != 200){
			//System.out.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPointUri, resp.getStatus(), location.toString()));
			result = "-1"; 
		}

		resp.close();
		
		//System.out.println("Done vertex : " + vertexName + " response is : " + result);
		
		return result;
	}
	
	
	/**
	 * This method returns the vertex ID of a vertex on the Titan Graph
	 * @param vertexName
	 * @return
	 */
	
	public static String getVertexID(String SERVER_ROOT_URI, String indexName, String vertexName){
		String result = "-1";
		String entity = null;
		try{
			final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
			
			WebResource resource = Client.create().resource(nodeEntryPointUri);
					
			ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{\"params\":{\"idxname\":\"" + indexName + "\",\"pname\":\"" + vertexName + "\"},\"script\":\"g.idx(idxname)[[pername:pname]]\"}").post(ClientResponse.class);
			
			entity = resp.getEntity(String.class);
			
			int firstIndex = entity.lastIndexOf("{") + 1;
			
			entity = entity.substring(firstIndex).trim();
			int lastIndex = entity.indexOf("}");
			
			if((firstIndex==-1)||(lastIndex==-1)){ //Probably there is an error thrown from the server.
				System.out.println("Cannot find the { and/or }");
				System.out.println("The output was : |" + entity + "|");
				return result;
			}
			
			entity = entity.substring(0, lastIndex).trim();
			
			String[] kvs=entity.split(",");
			int counter = 0;
			int len = kvs.length;
			
			for (counter = 0; counter < len; counter++){
				if (kvs[counter].contains("_id")){
					String val = kvs[counter];
					int startInd = val.indexOf(":") + 1;
					result = val.substring(startInd);
					
					break;
				}
			}
			
			final URI location = resp.getLocation();
			
			if(resp.getStatus() == 500){
				System.out.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPointUri, resp.getStatus(), location.toString()));
			}
			
			resp.close();
		}catch(StringIndexOutOfBoundsException ec){
			ec.printStackTrace();
			System.out.println("response from db : |" + entity + "|");
		}
		
		return result;
	}
	
	/**
	 * This method returns the vertex property names and values. The properties include all the properties of the vertex including its name and the "attrib" fields.
	 * @param vertexName
	 * @return
	 */
	public HashMap<String, String> getVertexPropertiesByExactID(String SERVER_ROOT_URI, String vertexID){
		HashMap<String, String> result = new HashMap<String, String>();
		//Note that here we do not need to use gremlin beased technique because we get the vertex information directly
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/vertices/" + vertexID.replaceAll("^\"|\"$", "");
		
		WebResource resource = Client.create().resource(nodeEntryPointUri);
				
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		String entity = resp.getEntity(String.class);
		
		int firstIndex = entity.lastIndexOf("{") + 1;
		
		entity = entity.substring(firstIndex).trim();
		int lastIndex = entity.indexOf("}");
		entity = entity.substring(0, lastIndex).trim();
		
		String[] kvs=entity.split(",");
		int counter = 0;
		int len = kvs.length;
		
		for (counter = 0; counter < len; counter++){
			//The assumption here is that there are other attributes other than what is listed here. SO we need to use if statements to filter.
			if (kvs[counter].contains("name")){
				String val = kvs[counter];
				String[] strArr = val.split(":");
				result.put(strArr[0], strArr[1]);
			}
			
			if (kvs[counter].contains("attrib")){
				String val = kvs[counter];
				String[] strArr = val.split(":");
				result.put(strArr[0], strArr[1]);
			}
			
			if (kvs[counter].contains("LastLogin")){
				String val = kvs[counter];
				String[] strArr = val.split(":");
				result.put(strArr[0], strArr[1]);
			}
		}
		
		final URI location = resp.getLocation();
		
		if(resp.getStatus() == 500){
			System.out.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPointUri, resp.getStatus(), location.toString()));
		}
		
		resp.close();
		
		return result;
	}
	   
	public String removeQuotes(String input){
		input = input.trim();
		String result = null;
		
		int startInd = input.indexOf("\"");
		int endInd = input.lastIndexOf("\"");
				
		if((startInd >= 0)&&(endInd > 0)&&(input.length() > 2)){
			result = input.substring(startInd + 1, (endInd - startInd));
		}else if(startInd == endInd){
			result = input.substring(0, endInd);
		}
		
		return result;
	}
	
	public static void main(String[] args){
//        if (args.length!=1)
//        {
//            System.out.println("Please specify a threadcount");
//            System.exit(0);
//        }
//        
//        final int threadcount=Integer.parseInt(args[0]);
//        
//        Vector<Thread> allthreads=new Vector<Thread>();
//        
//        for (int i=0; i<threadcount; i++)
//        {
//            Thread t=new Thread() 
//            {
//                public void run()
//                {
//                    try
//                    {
//                    	TitanClient client = new TitanClient();                   	
//                    	
//                    }catch(Exception ec){
//                    	
//                    }
//                }
//            };
//            
//           // allthreads.ad(t);
//        }
//        
//        long st=System.currentTimeMillis();
//        for (Thread t: allthreads)
//        {
//            t.start();
//        }
//
//        for (Thread t: allthreads)
//        {
//            try
//            {
//                t.join();
//            }
//            catch (InterruptedException e)
//            {
//            }
//        }
//        long en=System.currentTimeMillis();
//
//        //System.out.println("Throughput: "+((1000.0)*(((double)(opcount*threadcount))/((double)(en-st))))+" ops/sec");
        
	}
	
	//@Override
	public int traverse(String SERVER_ROOT_URI, String startkey, int levels, Vector<String> result) {
		ArrayList<String> unDiscoveredVertices = new ArrayList<String>();
		ArrayList<String> discoveredVertices = new ArrayList<String>();
		//ArrayList<String> processedVertices = new ArrayList<String>();
		
		unDiscoveredVertices.add(startkey); //We start traversal from the first vertex given.
		
		for(int i = 0; i < levels; i++){
			
			Iterator itr = unDiscoveredVertices.iterator();
			
			while(itr.hasNext()){
				String k = itr.next().toString();
				final String nodeEntryPointUri = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin?script=g.V('pername','" + k + "').outE.gather.scatter.inV";
				
				WebResource resource = Client.create().resource(nodeEntryPointUri);		
				ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
								
				InputStream entityStream = resp.getEntityInputStream();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(entityStream));
				StringBuilder builder = new StringBuilder();
				String line = null;
						
				int ch = -1;
				boolean appendFlag = false;
				boolean withinEntityFlag = false;
				
				try{
					while ((ch = reader.read()) != -1){
						if (ch == 91){ //91 corresponds to [
							appendFlag = true;
							continue;
						}
						
						if (ch == 93){ //93 corresponds to ]
							appendFlag = false;
						}
						
						if (appendFlag && (ch == 123)){ //123 corresponds to {
							withinEntityFlag = true;
							builder = new StringBuilder();
							continue;
						}
						
						if (appendFlag && (ch == 125)){ //125 corresponds to }
							withinEntityFlag = false;
							String entity = builder.toString();
							
							String[] kvs=entity.split(",");
							int counter = 0;
							int len = kvs.length;
							
							for (counter = 0; counter < len; counter++){						
								if (kvs[counter].contains("pername")){
									String val = kvs[counter];
									int startInd = val.indexOf(":") + 1;
									String inV = removeQuotes(val.substring(startInd));
									
									discoveredVertices.add(inV);
								}
							}
							
						}
						
						if (appendFlag && withinEntityFlag){
							builder.append((char)ch);
						}
					}
				}catch(IOException e){
					e.printStackTrace();
				}finally{
					try{
						entityStream.close();
					}catch(IOException ec){
						ec.printStackTrace();
					}
				}		
		
				resp.close();
			}//end of while
			
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
			
			//The vertices that were discovered but not in the processed vertex list are the genuine undiscovered vertices. These vertices need to be discovered.
			unDiscoveredVertices = newUndiscoveredVertices;
			discoveredVertices = new ArrayList<String>();
		}//end of for
		
		//System.out.println("Size of the processed vertices : " + result.size());
		
		return -1;
	}
	
	//@Override
	public static int insertEdge(String SERVER_ROOT_URI, String indexName, String table, String key, HashMap<String, String> values) {
        if(!table.equals("")){  
            String[] intermArr = table.split("<");
            
            for(int u = 0; u < intermArr.length; u++){
            	
            	if(!intermArr[u].trim().equals("")){
	            	String[] inputArr = intermArr[u].split("-");
	            	
	            	if(inputArr[0].equals("E")){
	            		String firstVertexName = null;
	            		String secondVertexName = null;
	    		        String[] res = inputArr[1].split(" ");
	    		        
	    		        String[] vert1 = res[0].split(",");
	    		        String[] vert2 = res[1].split(",");    
	    	
	    				String[] vert3 = vert1[0].split(":");
	    						    				
	    				String res1 = getVertexID(SERVER_ROOT_URI, indexName, vert3[0]); //Here what we really do is checking whether the vertex exists or not.
	    				
	    				if(res1.equals("-1")){	    					
	    					HashMap<String, String> vertAttribs = new HashMap<String, String>(); 
	    					vertAttribs.put("attrib1", vert3[1].toString());
	    					vertAttribs.put("attrib2", vert1[1].toString());
	    					vertAttribs.put("attrib3", vert1[2].toString());
	    					vertAttribs.put("attrib4", vert1[3].toString());
	    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
	    					
	    					createVertexWithProperties(SERVER_ROOT_URI, indexName, vert3[0], vertAttribs);
	    				}
	    				
	    				firstVertexName = vert3[0];
	    				
	    				vert3 = vert2[0].split(":");      
	    				URI secondNode = null;
	    				
	    				res1 = getVertexID(SERVER_ROOT_URI, indexName, vert3[0]);
	    				
	    				if(res1.equals("-1")){	    					
	    					HashMap<String, String> vertAttribs = new HashMap<String, String>(); 
	    					vertAttribs.put("attrib1", vert3[1].toString());
	    					vertAttribs.put("attrib2", vert1[1].toString());
	    					vertAttribs.put("attrib3", vert1[2].toString());
	    					vertAttribs.put("attrib4", vert1[3].toString());
	    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
	    					
	    					createVertexWithProperties(SERVER_ROOT_URI, indexName, vert3[0], vertAttribs);
	    				}
	    				
    					secondVertexName = vert3[0];
	    				
	    				try{
	    					
	    					//Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("Adding relationship first->second : " + firstVertexName + " " + secondVertexName);
	    					
	    				  	addRelationship( SERVER_ROOT_URI, indexName, firstVertexName, secondVertexName, "affiliated");
	    				}catch(Exception e){
	    				  	e.printStackTrace();
	    				  	return -1;
	    				}
	            	}else{
	            		//In this case we need to add only the first vertex to the graph. There is no insertion of a edge
	            		//happen at this point.
	    		        String[] vert1 = inputArr[1].split(",");
	    				String[] vert3 = vert1[0].split(":");
	    				String res = getVertexID(SERVER_ROOT_URI, indexName, vert3[0]);
	    				
	    				if(res.equals("-1")){	    					
	    					HashMap<String, String> vertAttribs = new HashMap<String, String>(); 
	    					vertAttribs.put("attrib1", vert3[1].toString());
	    					vertAttribs.put("attrib2", vert1[1].toString());
	    					vertAttribs.put("attrib3", vert1[2].toString());
	    					vertAttribs.put("attrib4", vert1[3].toString());
	    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
	    					
	    					createVertexWithProperties(SERVER_ROOT_URI, indexName, vert3[0], vertAttribs);
	    				}
	            	}            	
            	}
            }
        }
		return 0;
	}
}

//class OrgID{
//	public URI path;
//	public boolean status;
//}