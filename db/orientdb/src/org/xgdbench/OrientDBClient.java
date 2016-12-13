/**
 * 
 */
package org.xgdbench;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.xgdbench.generator.MAGIncremental;
import org.xgdbench.generator.Vertex;

import com.orientechnologies.orient.core.db.graph.OGraphDatabase;
import com.orientechnologies.orient.core.db.graph.OGraphVertex;
import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;
import com.orientechnologies.orient.core.record.impl.ODocument;


import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;

/**
 * @author miyuru
 *
 */
public class OrientDBClient extends DB{
	
	private String SERVER_ROOT_URI;
	private OGraphDatabase database;
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
	
	/**
	 * 
	 */
	public OrientDBClient() {

	}

	public void init() throws DBException{
		Properties props = getProperties();
		SERVER_ROOT_URI = props.getProperty("uri");
		
		transactInsert = Boolean.parseBoolean(props.getProperty("transactioninsert"));
		
		database = new OGraphDatabase(SERVER_ROOT_URI);
		
		try{
			database.open("admin", "admin");
			
			if(!database.getMetadata().getSchema().existsClass("Person")){
				database.getMetadata().getSchema().createClass("Person", database.getMetadata().getSchema().getClass("OGraphVertex"));
				Console.OUT.println("Newly created the Person class");
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new DBException("OrientDB server is not running...");
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
		Int perName = -1;
		Int t = null;
		
		try{
			List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person"));

			if(verts.size() > 0){
				Int len = verts.size(); 
				for(Int j = 0; j < len; j++){
					ODocument qrRes = verts.get(j);
	
					String[] results = qrRes.fieldNames();
					Int len2 = results.length;
					
					ArrayList<Int> attrVals = new ArrayList<Int>(); 
					
					//HashMap<String, String> hMap = new HashMap<String, String>();
					
				    for(Int i = 0; i < len2; i++){
				    	if(!(results[i].equals("pername")||(results[i].equals("in"))||(results[i].equals("out")))){
				    		String val = qrRes.field(results[i]).toString();//Take the first item only

				    		t = new Int(val);
				    		
							if((t == 0)||(t==1)){								
								attrVals.add(t);
							}
				    	}else if(results[i].equals("pername")){
				    		perName = Int.parseInt(qrRes.field(results[i]).toString());
							if(perName > largestVert){
								largestVert = perName;
							}
				    	}
						//hMap.put(results[i], val);
					}
				    
					Int[] vvals = new Int[attrVals.size()];
					
					for(Int p = 0; p < vvals.length; p++){
						vvals[p] = attrVals.get(p);
					}
					
					vertexAttribs.put(perName, vvals);
				    
				    //result.add(hMap);
				}
				
				largestNewVert = largestVert;				
			}
        }catch(Exception ec){
        	ec.printStackTrace();
        }
	}
	
	/*
	private void loadVertexAttribs(){
		vertexAttribs = new HashMap<Int, Int[]>();
		
		WebResource resource = Client.create().resource(SERVER_ROOT_URI + "ext/GremlinPlugin/graphdb/execute_script");
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"script\" : \"g.V.id\"}").get(ClientResponse.class);
		//Console.OUT.println(String.format("GET on [%s], status code [%d]", SERVER_ROOT_URI, response.getStatus()));
		String entity = response.getEntity(String.class);
		response.close();
		
		Int beginBrack = entity.indexOf("[");
		Int endBrack = entity.indexOf("]");
		Int strl = endBrack - beginBrack;
		Int w = -1;
		entity = entity.substring(beginBrack + 2, strl).trim();
		//Console.OUT.println("Entity : " + entity);
		String entityArr[] = entity.split(",");
		boolean flag = true;
		Int t = null;
		String keyItm = null;
		Int perName = -1;
		
		for(Int i = 0; i < entityArr.length; i++){
			entityArr[i] = entityArr[i].trim();
			//entityArr[i] = entityArr[i].substring(1, entityArr[i].length() -1);
			//Console.OUT.println("entityArr[i] : " + entityArr[i]);

			if(!entityArr[i].equals("null")){
				//Next ger the vertex attributes
				WebResource resource2 = Client.create().resource(SERVER_ROOT_URI + "node/" + entityArr[i] + "/properties");
				ClientResponse response2 = resource2.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
				String entity2 = null;
				
				if(response2.getStatus() == 204){
					Console.OUT.println("Node : " + entityArr[i] + " does not have attributes...");
					flag = false;
				}else{
					entity2 = response2.getEntity(String.class);
				}
				
				response2.close();
				
				if(flag){				
					Int firstIndex = entity2.indexOf("{") + 1;
					
					entity2 = entity2.substring(firstIndex).trim();
					Int lastIndex = entity2.indexOf("}");
					entity2 = entity2.substring(0, lastIndex).trim();
					String[] res3 = null, res4 = null;
					//HashMap<String, String> res5 = new HashMap<String, String>();
					ArrayList<Int> attrVals = new ArrayList<Int>(); 
					res3 = entity2.split(",");
					//HashMap<String, String> hMap = new HashMap<String, String>();
					

					
					for(Int u = 0; u < res3.length; u++){
						if(!res3[u].trim().equals("")){
							res4 = res3[u].split(":");
							
							for(Int v = 0; v < res4.length; v+=2){
								//Console.OUT.println(res4[v].trim() + "-->" + res4[v+1].trim());
								//res5.put(res4[v].trim(), res4[v+1].trim());
								res4[v] = res4[v].trim();
								if(!res4[v].equals("\"pername\"")){
									keyItm = res4[v+1].trim();
									keyItm = keyItm.substring(1, keyItm.length() -1);
									t = Int.parseInt(keyItm);
									
									if((t == 0)||(t==1)){								
										attrVals.add(t);
									}
								}else{
									String b = res4[v+1].trim();
									b = b.substring(1, (b.length() -1));
									perName = Int.parseInt(b);
									
									if(perName > largestVert){
										largestVert = perName;
									}
								}
							}
						}
					}
										
					Int[] vvals = new Int[attrVals.size()];
					
					for(Int p = 0; p < vvals.length; p++){
						vvals[p] = attrVals.get(p);
					}
					
					vertexAttribs.put(perName, vvals);
				}else{
					flag = true;
				}
			}
		}
		
		largestNewVert = largestVert;
	}
	*/
	
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
	public Int read(String table, String key, Set<String> fields, HashMap<String, String> result) {				
	try{
			List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + key + "\'"));

			if(verts.size() > 0){
				ODocument qrRes = verts.get(0);
				
				Iterator<String> itr = fields.iterator();
				while(itr.hasNext()){
					String fieldToRead = itr.next();
	
					String val = qrRes.field(fieldToRead).toString();//Take the first item only
					result.put(fieldToRead, val);
				}
			}
        }catch(Exception ec){
        	ec.printStackTrace();
        }
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#scan(java.lang.String, java.lang.String, Int, java.util.Set, java.util.Vector)
	 */
	@Override
	public Int scan(String table, String key, Int recordcount,
			Set<String> fields, Vector<HashMap<String, String>> result) {
		
		try{
			List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("traverse V.out, E.in from (select from Person where pername = " + key + ")"));

			if(verts.size() > 0){
				Int len = verts.size(); 
				for(Int j = 0; j < len; j++){
					ODocument qrRes = verts.get(j);
	
					String[] results = qrRes.fieldNames();
					Int len2 = results.length;
					HashMap<String, String> hMap = new HashMap<String, String>();
					
				    for(Int i = 0; i < len2; i++){
						String val = qrRes.field(results[i]).toString();//Take the first item only
						hMap.put(results[i], val);
					}
				    
				    result.add(hMap);
				}
			}
        }catch(Exception ec){
        	ec.printStackTrace();
        }
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#update(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int update(String table, String key, HashMap<String, String> values) {		
		try{
		List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + key + "\'"));

		if(verts.size() > 0){
			ODocument firstNode = null;
			//Iterator itr = values.keySet().iterator();
			firstNode = verts.get(0);
			
//			//Just overwrite the attributes and save the vertex
//			while(itr.hasNext()){
//				String kkey = "" + itr.next();
//				firstNode.field(kkey, values.get(kkey));
//				firstNode.save();
//			}
			
			//We just need to update the last login time.
			firstNode.field("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
			firstNode.save();
		}
		
		database.commit();
        }catch(Exception ec){
        	database.rollback();
        }
		
		return 0;
	}

	/* This method inserts a single relationship to the GraphDB. If from and to vertices do not exist
	 * those will be assed to the Graph prior to adding the relationship.
	 * @see com.yahoo.ycsb.DB#insert(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public Int insert(String table, String key, HashMap<String, String> values) {	
		
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
		            		//Console.OUT.println("tb:"+table);
		            		String[] res = inputArr[1].split(" ");
		        
		            		String[] vert1 = res[0].split(",");
		            		String[] vert2 = res[1].split(",");
		
		            		String[] vert3 = vert1[0].split(":");
		
							try{
								List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + vert3[0] + "\'"));
								Int existants = verts.size();
							
								ODocument firstNode = null;
								
								if(existants == 0){
									firstNode = database.createVertex("Person");
									firstNode.field("pername", vert3[0]);
									firstNode.field("attrib1", Int.parseInt(vert3[1]));
									firstNode.field("attrib2", Int.parseInt(vert1[1]));
									firstNode.field("attrib3", Int.parseInt(vert1[2]));
									firstNode.field("attrib4", Int.parseInt(vert1[3]));
									firstNode.field("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
									firstNode.save();
								}else{
									firstNode = verts.get(0);
								}
							
								vert3 = vert2[0].split(":"); 
								verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + vert3[0] + "\'"));
							
								existants = verts.size();
								ODocument secondNode = null;
							
								if(existants == 0){
									secondNode = database.createVertex("Person");
									secondNode.field("pername", vert3[0]);
									secondNode.field("attrib1", Int.parseInt(vert3[1]));
									secondNode.field("attrib2", Int.parseInt(vert2[1]));
									secondNode.field("attrib3", Int.parseInt(vert2[2]));
									secondNode.field("attrib4", Int.parseInt(vert2[3]));
									secondNode.field("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
									secondNode.save();
								}else{
									secondNode = verts.get(0);
								}
							
								ODocument edge = database.createEdge(firstNode, secondNode);
								edge.save();
								database.commit();
					        }catch(Exception ec){
					        	database.rollback();
					        }
							
		            	}else{
		    		        String[] vert1 = inputArr[1].split(",");
		    				String[] vert3 = vert1[0].split(":");
		    				
							List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + vert3[0] + "\'"));
							Int existants = verts.size();
						
							ODocument firstNode = null;
							
							if(existants == 0){
								firstNode = database.createVertex("Person");
								firstNode.field("pername", vert3[0]);
								firstNode.field("attrib1", Int.parseInt(vert3[1]));
								firstNode.field("attrib2", Int.parseInt(vert1[1]));
								firstNode.field("attrib3", Int.parseInt(vert1[2]));
								firstNode.field("attrib4", Int.parseInt(vert1[3]));
								firstNode.field("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
								firstNode.save();
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
		//URI firstNode = null;
		String firstVertex = "" + c.pername;
		String secondVertex = null;
		
		try{
			List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + firstVertex + "\'"));
			Int existants = verts.size();
		
			ODocument firstNode = null;
			
			if(existants == 0){
				firstNode = database.createVertex("Person");
				firstNode.field("pername", c.pername);
				firstNode.field("attrib1", attribs[0]);
				firstNode.field("attrib2", attribs[1]);
				firstNode.field("attrib3", attribs[2]);
				firstNode.field("attrib4", attribs[3]);
				firstNode.field("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
				firstNode.save();
			}else{
				firstNode = verts.get(0);
			}
		
			for(Int i = 0; i < listOfvertices.length; i++ ){
				secondVertex = "" + listOfvertices[i];
				verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + secondVertex + "\'"));
			
				existants = verts.size();
				ODocument secondNode = null;
			
				if(existants == 0){
					Console.OUT.println("Cant make edge from Node : " + firstNode + " to Node : " + secondNode);
					Console.OUT.println("To Node does not exist");
				}else{
					secondNode = verts.get(0);
				}
			
				ODocument edge = database.createEdge(firstNode, secondNode);
				edge.save();
			}
			database.commit();
        }catch(Exception ec){
        	database.rollback();
        }
		
	}
	
	private String makeTimeStamp(){
		return "" + System.currentTimeMillis();
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
		try{
			database.close();
		}catch(Exception e){
			throw new DBException("OrientDB server connection could not be closed...");
		}
	}
	
	/**
	 * This method inserts an edge
	 * @param table
	 * @param key
	 * @param values
	 * @return
	 */
	@Override
	public Int insertEdge(String table, String key, HashMap<String, String> values) {	
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
	
						try{
							List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + vert3[0] + "\'"));
							Int existants = verts.size();
						
							ODocument firstNode = null;
							
							if(existants == 0){
								firstNode = database.createVertex("Person");
								firstNode.field("pername", vert3[0]);
								firstNode.field("attrib1", Int.parseInt(vert3[1]));
								firstNode.field("attrib2", Int.parseInt(vert1[1]));
								firstNode.field("attrib3", Int.parseInt(vert1[2]));
								firstNode.field("attrib4", Int.parseInt(vert1[3]));
								firstNode.field("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
								firstNode.save();
							}else{
								firstNode = verts.get(0);
							}
						
							vert3 = vert2[0].split(":"); 
							verts = database.query(new OSQLSynchQuery<OGraphVertex>("select from Person where pername LIKE \'" + vert3[0] + "\'"));
						
							existants = verts.size();
							ODocument secondNode = null;
						
							if(existants == 0){
								secondNode = database.createVertex("Person");
								secondNode.field("pername", vert3[0]);
								secondNode.field("attrib1", Int.parseInt(vert3[1]));
								secondNode.field("attrib2", Int.parseInt(vert2[1]));
								secondNode.field("attrib3", Int.parseInt(vert2[2]));
								secondNode.field("attrib4", Int.parseInt(vert2[3]));
								secondNode.field("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
								secondNode.save();
							}else{
								secondNode = verts.get(0);
							}
						
							ODocument edge = database.createEdge(firstNode, secondNode);
							edge.save();
							database.commit();
				        }catch(Exception ec){
				        	database.rollback();
				        }						
	            	} 
            	}
            }
        }
		return 0;
	}
	
		@Override
	public Int traverse(String startkey, Int levels, Vector<String> result) {	
			ArrayList<String> unDiscoveredVertices = new ArrayList<String>();
			ArrayList<String> discoveredVertices = new ArrayList<String>();
			//ArrayList processedVertices = new ArrayList();
			
			unDiscoveredVertices.add(startkey); //We start traversal from the first vertex given.
			
			for(Int i = 0; i < levels; i++){
				Iterator itr = unDiscoveredVertices.iterator();
				
				while(itr.hasNext()){
					String k = itr.next().toString();
					try{
						List<ODocument> verts = database.query(new OSQLSynchQuery<OGraphVertex>("traverse V.out, E.in from (select from Person where pername = " + k + ") where $depth <= 2"));
			
						if(verts.size() > 0){
							Int len = verts.size(); 
							for(Int j = 0; j < len; j++){
								
								try{
									Object ob = verts.get(j);
									
									if (ob instanceof com.orientechnologies.orient.core.db.graph.OGraphVertex){
										OGraphVertex vert = (OGraphVertex)ob;
										//Console.OUT.println("vert : " + vert.get("pername"));
										if(!vert.get("pername").equals(k)){
											discoveredVertices.add(vert.get("pername").toString());
										}
									}
								}catch(ClassCastException e){
									e.printStackTrace();
								}
							}
						}
			        }catch(Exception ec){
			        	ec.printStackTrace();
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
			
//			Console.OUT.println("Size of the processed vertices : " + processedVertices.size());
//			Iterator it = processedVertices.iterator();
//			
//			while(it.hasNext()){
//				String k = it.next().toString();
//				
//				Console.OUT.println(k);
//			}
		
		return 0;
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
                    	OrientDBClient client = new OrientDBClient();                   	
                    	
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
