/**
 * 
 */
package org.xgdbench;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;

import org.xgdbench.generator.MAGIncremental;
import org.xgdbench.generator.Vertex;

/**
 * @author miyuru
 *
 */
public class Neo4jClient extends DB {
	private var SERVER_ROOT_URI:String;
	private var transactInsert:Boolean;
	private var inOutNeighbourCount:HashMap[Int, Int];
	private var vertexAttribs;HashMap[Int, Array[Int]];
	private var newVertexQueue:LinkedList[Vertex];
	//private TreeSet<Int> degrees;
	private var sumDegree:Long;
	private var largestVert:Long; //The default graph's largest vertex
	private var largestNewVert:Long;//This the the largest vertex after building the transact insert data
	private var totalOpCount:Long;
	private var transactInsertOpCount:Long;
	private var affMatrix:Array[Float];
	private var mag:MAGIncremental;
	public static val AFFINITY_MATRIX_DEFAULT:String = "[0.99f, 0.53f, 0.53f, 0.13f]";
	public static val AFFINITY_MATRIX:String = "affinitymatrix";
	public static val THETA_THRESHOLD_DEFAULT:String = "0.1";
	public static val THETA_THRESHOLD:String = "pthreshold";
	public static val RECORD_COUNT_PROPERTY_DEFAULT:String = "4";
	public static val RECORD_COUNT_PROPERTY:String = "fieldcount";
	public static val INSERT_PROPORTION_PROPERTY:String ="insertproportion";
	public static val INSERT_PROPORTION_PROPERTY_DEFAULT:String ="0.0";
	public static val TOTAL_OP_COUNT_PROPERTY_DEFAULT:String = "1000";
	public static val TOTAL_OP_COUNT_PROPERTY:String = "operationcount";
	
	var thetaThreshold:Float = 0.1f;
	private var attribCount:Int = 0;
	private var insertProportion:Float;
	
	/**
	 * 
	 */
	public Neo4jClient() {
		// TODO Auto-generated constructor stub
	}

	public def init():void throws DBException{
		var props:Properties = getProperties();
		transactInsert = Boolean.parseBoolean(props.getProperty("transactioninsert"));
		SERVER_ROOT_URI = props.getProperty("uri");
		if(!checkDBIsRunning()){
			throw new DBException("Neo4j server is not running...");
		}
		
		if(transactInsert){
			loadVertexAttribs();
			loadAffinityMatrix();
			mag = new MAGIncremental(affMatrix, vertexAttribs, thetaThreshold, attribCount);
			newVertexQueue = new LinkedList[Vertex]();
			constructInsertData();
		}
	}
	
	private def loadAffinityMatrix():void{
		var props:Properties = getProperties();
		var aff:String = props.getProperty(AFFINITY_MATRIX, AFFINITY_MATRIX_DEFAULT);
		//[0.99f, 0.53f, 0.53f, 0.13f]
		aff = aff.substring(1, (aff.length() - 1));
		var iterm:Array[String] = aff.split(","); 
		affMatrix = new Array[Float][iterm.length];
		
		for(i in 0..(iterm.size - 1)){
			affMatrix(i) = Float.parseFloat(iterm(i).trim());
		}
		
		var thetaThreash:String = props.getProperty(THETA_THRESHOLD, THETA_THRESHOLD_DEFAULT);
		thetaThreshold = Float.parseFloat(thetaThreash);
		
		attribCount=Int.parseInt(props.getProperty(RECORD_COUNT_PROPERTY, RECORD_COUNT_PROPERTY_DEFAULT));
		
		insertProportion=Float.parseFloat(props.getProperty(INSERT_PROPORTION_PROPERTY, INSERT_PROPORTION_PROPERTY_DEFAULT));
		totalOpCount=Long.parseLong(props.getProperty(TOTAL_OP_COUNT_PROPERTY, TOTAL_OP_COUNT_PROPERTY_DEFAULT));
		
		transactInsertOpCount = (Long)(insertProportion*totalOpCount) + 10;
		
		Console.OUT.println("transactInsertOpCount : " + transactInsertOpCount);
	}
	
	private def loadVertexAttribs():void{
		vertexAttribs = new HashMap[Int, Array[Int]]();
		
		var resource:WebResource = Client.create().resource(SERVER_ROOT_URI + "ext/GremlinPlugin/graphdb/execute_script");
		var response:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"script\" : \"g.V.id\"}").get(ClientResponse.class);

		var entity:String = response.getEntity(String.class);
		response.close();
		
		var beginBrack:Int = entity.indexOf("[");
		var endBrack:Int = entity.indexOf("]");
		var strl:Int = endBrack - beginBrack;
		var w:Int = -1;
		entity = entity.substring(beginBrack + 2, strl).trim();
		var entityArr:Array[String] = entity.split(",");
		var flag:Boolean = true;
		var t:Int = null;
		var keyItm:String = null;
		var perName:Int = -1;
		
		for(i in 0..(entityArr.length - 1)){
			entityArr(i) = entityArr(i).trim();

			if(!entityArr(i).equals("null")){
				//Next get the vertex attributes
				var resource2:WebResource = Client.create().resource(SERVER_ROOT_URI + "node/" + entityArr[i] + "/properties");
				var response2:ClientResponse = resource2.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
				var entity2:String = null;
				
				if(response2.getStatus() == 204){
					Console.OUT.println("Node : " + entityArr(i) + " does not have attributes...");
					flag = false;
				}else{
					entity2 = response2.getEntity(String.class);
				}
				
				response2.close();
				
				if(flag){				
					var firstIndex:Int = entity2.indexOf("{") + 1;
					
					entity2 = entity2.substring(firstIndex).trim();
					var lastIndex:Int = entity2.indexOf("}");
					entity2 = entity2.substring(0, lastIndex).trim();
					var res3:Array[String] = null, res4 = null;
					var attrVals:ArrayList[Int] = new ArrayList[Int](); 
					res3 = entity2.split(",");
					
					for(u in 0..(res3.length - 1)){
						if(!res3(u).trim().equals("")){
							res4 = res3(u).split(":");
							
							for(v in 0..(res4.length-1)){
								res4(v) = res4(v).trim();
								if(!res4(v).equals("\"pername\"")){
									keyItm = res4(v+1).trim();
									keyItm = keyItm.substring(1, keyItm.length() -1);
									t = Int.parseInt(keyItm);
									
									if((t == 0)||(t==1)){								
										attrVals.add(t);
									}
								}else{
									var b:String = res4[v+1].trim();
									b = b.substring(1, (b.length() -1));
									perName = Int.parseInt(b);
									
									if(perName > largestVert){
										largestVert = perName;
									}
								}
							}
						}
					}
										
					var vvals:Int = new Array[Int][attrVals.size()];
					
					for(p in 0..(vvals.length - 1)){
						vvals(p) = attrVals.get(p);
					}
					
					vertexAttribs.put(perName, vvals);
				}else{
					flag = true;
				}
			}
		}
		
		largestNewVert = largestVert;
	}
	
	private def constructInsertData():void{
		for(i in 0..(transactInsertOpCount-1)){
			largestNewVert++;
			Vertex c = mag.getListOfVerticesToConnectWith(largestNewVert);
			newVertexQueue.add(c);
			vertexAttribs.put((Int)largestNewVert, c.attribs);
			mag.setVerticesAndAttributes(vertexAttribs);
		}
	}
	
	/**
	 * Check whether the DB is running
	 * 
	 */
	private def checkDBIsRunning():Boolean{
		var resource:WebResource = Client.create().resource(SERVER_ROOT_URI);
		var response:ClientResponse = resource.get(ClientResponse.class);
		Console.OUT.println(String.format("GET on [%s], status code [%d]", SERVER_ROOT_URI, response.getStatus()));
		return response.getStatus() == 200 ? true:false;
	}
	
	
	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#read(java.lang.String, java.lang.String, java.util.Set, java.util.HashMap)
	 */
	@Override
	public def read(var table:String, var key:String, var fields:Set[String], var result:HashMap[String, String]):Int {
		// TODO Auto-generated method stub
		//Console.OUT.println("Reading : " + key);
		
		try{
			var resource:WebResource = Client.create().resource(SERVER_ROOT_URI + "node/" + key + "/properties");
			var response:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			
			var entity:String = response.getEntity(String.class);
			if((response.getStatus() != 204)&&(!entity.contains("Cannot find node with id"))){
							
				response.close();
				firstIndex:Int = entity.indexOf("{") + 1;
				
				entity = entity.substring(firstIndex).trim();
				var lastIndex:Int = entity.indexOf("}");
				entity = entity.substring(0, lastIndex).trim();
				var res3:Array[String] = null, res4 = null; 
				res3 = entity.split(",");
				
				for(u in 0..(res3.length-1)){
					if(!res3(u).trim().equals("")){
						res4 = res3(u).split(":");
						
						for(v in 0..(res4.length - 1)){
							result.put(res4(v).trim(), res4(v+1).trim());
						}
					}
				}
			}else{
				response.close();
				return -1;
			}
		}catch(com.sun.jersey.api.client.UniformInterfaceException e){
			Console.OUT.println(e.getMessage());
		}
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#scan(java.lang.String, java.lang.String, Int, java.util.Set, java.util.Vector)
	 */
	@Override
	public def scan(var table:String, var startkey:String, var recordcount:Int, var fields:Set[String], var result:Vector[HashMap[String, String]]):Int {	
		var resource:WebResource = Client.create().resource(SERVER_ROOT_URI + "cypher");
		var response:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"query\" : \"start n = node(" + startkey + ") match (n)-->(x) return x\"}").get(ClientResponse.class);
		
		var entity:String = response.getEntity(String.class);
		response.close();

		var p:Pattern = Pattern.compile("\"data\" : \\{[\"[a-zA-Z0-9-.{}]+\"[ \\t\\r\\n]*:[ \\t\\r\\n]*\"[a-zA-Z0-9-.{}]+\",[ \\t\\r\\n]*]+[ \\t\\r\\n]*\\}");

		var m:Matcher = p.matcher(entity);
		var result2:OrgID = new OrgID();
		var cntr:Int = 0;
		var firstIndex:Int = 0;
		var lastIndex:Int = 0;
		var item2:String = null;
		var res3:Array[String] = null;
		var res4:Array[String] = null; 
		
		while(m.find()){
			item2 = m.group(0);
			firstIndex = item2.indexOf("{") + 1;
			
			item2 = item2.substring(firstIndex).trim();
			lastIndex = item2.indexOf("}");
			item2 = item2.substring(0, lastIndex).trim();
			
			res3 = item2.split(",");
			var hMap:HashMap[String, String] = new HashMap[String, String]();
			
			for(u in 0..(res3.length-1)){
				if(!res3(u).trim().equals("")){
					res4 = res3(u).split(":");
					
					for(v in 0..(res4.length - 1)){
						hMap.put(res4[v].trim(), res4[v+1].trim());
					}
				}
			}
			
			result.add(hMap);
			
			cntr++;
		}
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#update(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public def update(var table:String, var key:String, var values:HashMap[String, String]):Int {
		try{
			var newAttribsStr:String = "";
			var Interm:HashMap[String, String] = new HashMap[String, String]();
			
			var resource:WebResource = Client.create().resource(SERVER_ROOT_URI + "node/" + key + "/properties");
			var response:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	
			var entity:String = response.getEntity(String.class);
			
			if((response.getStatus() != 204)&&(!entity.contains("Cannot find node with id"))){
				response.close();
				
				var firstIndex:Int = entity.indexOf("{") + 1;
				
				entity = entity.substring(firstIndex).trim();
				var lastIndex:Int = entity.indexOf("}");
				entity = entity.substring(0, lastIndex).trim();
				var res3:Array[String] = null, res4 = null;
				var keyStr:String = null, valStr = null;
				res3 = entity.split(",");
				
				for(u in 0..(res3.length-1)){
					if(!res3(u).trim().equals("")){
						res4 = res3(u).split(":");
						
						for(v in 0..(res4.length-1)){
							keyStr = res4(v).trim();
							keyStr = keyStr.substring(1, keyStr.length() - 1);
							
							valStr = res4(v+1).trim();
							valStr = valStr.substring(1, valStr.length() - 1);
							
							Interm.put(keyStr, valStr);
						}
					}
				}
				
				var keys:Set[String] = Interm.keySet();
				
				var itr:Iterator[String] = keys.iterator();
				var k:String = null;
				
				while(itr.hasNext()){
					k = itr.next();
								
					if(values.keySet().contains(k)){
						newAttribsStr += "\""+ k + "\" : \"" + values.get(k) + "\","; 	
					}
					else{
						newAttribsStr += "\""+ k + "\" : \"" + Interm.get(k) + "\",";
					}
				}
				
				//Here we add the lats login attribute
				newAttribsStr += "\"LastLogin\" : \"" + new java.sql.Timestamp(new java.util.Date().getTime()).toString() + "\",";
				
				newAttribsStr = newAttribsStr.substring(0, newAttribsStr.length() - 1);
				
				var resource2:WebResource = Client.create().resource(SERVER_ROOT_URI + "node/" + key + "/properties");
				var response2:ClientResponse = resource2.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{"+newAttribsStr+"}").put(ClientResponse.class);
				
				//The default response should be 204: No Content
				if(response2.getStatus() != 204){
					Console.OUT.println("Error in updating the properties of the vertex : " + key);
				}
				
				response2.close();
			}else{
				response.close();
				return -1;
			}
		}catch(com.sun.jersey.api.client.UniformInterfaceException e){
			Console.OUT.println(e.getMessage());
		}
		
		return 0;
	}
	
	/* This method inserts a single relationship to the GraphDB. If from and to vertices do not exist
	 * those will be assed to the Graph prior to adding the relationship.
	 * @see com.yahoo.ycsb.DB#insert(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	@Override
	public def insert(var table:String, var key:String, var values:HashMap[String, String]):Int {
        
		if(table.equals("transact-insert")){		
			var c:Vertex = newVertexQueue.removeFirst();
			addVertexAndConnectWithExisting(c);			
		}else{
	        if(!table.equals("")){  
	            var IntermArr:Array[String] = table.split("<");
	            
	            for(u in 0..(IntermArr.length-1)){
	            	
	            	if(!IntermArr(u).trim().equals("")){
		            	var inputArr:Array[String] = IntermArr(u).split("-");
		            	
		            	if(inputArr(0).equals("E")){
		    		        var res:Array[String] = inputArr(1).split(" ");
		    		        
		    		        var vert1:Array[String] = res(0).split(",");
		    		        var vert2:Array[String] = res(1).split(",");    
		    	
		    				var vert3:Array[String] = vert1(0).split(":");
		    				
		    				var firstNode:URI = null;
		    				
		    				var fN:OrgID = nodeExistsInGraph(vert3(0));
		    				
		    				if(!fN.status){
		    					firstNode = createNode();
		    		
		    					addDBProperty( firstNode, "pername", vert3(0) );
		    					addDBProperty( firstNode, "attrib1", vert3(1) );
		    					addDBProperty( firstNode, "attrib2", vert1(1) );
		    					addDBProperty( firstNode, "attrib3", vert1(2) );
		    					addDBProperty( firstNode, "attrib4", vert1(3) );
		    					addDBProperty( firstNode, "LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString() );
		    					
		    					addNodeToIndexNode(vert3[0], firstNode.toString());
		    				}else{
		    					firstNode = fN.path;
		    				}
		    				
		    				vert3 = vert2(0).split(":");      
		    				URI secondNode = null;
		    				
		    				OrgID sN = nodeExistsInGraph(vert3(0));
		    				
		    				if(!sN.status){
		    					secondNode = createNode();
		    		
		    					addDBProperty( secondNode, "pername", vert3(0) );
		    					addDBProperty( secondNode, "attrib1", vert3(1) );
		    					addDBProperty( secondNode, "attrib2", vert2(1) );
		    					addDBProperty( secondNode, "attrib3", vert2(2) );      
		    					addDBProperty( secondNode, "attrib4", vert2(3) );
		    					addDBProperty( secondNode, "LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString() );
		    					  
		    					addNodeToIndexNode(vert3(0), secondNode.toString());
		    				}else{
		    					secondNode = sN.path;
		    				}
		    				
		    				try{
		    				  	addRelationship( firstNode, secondNode, "affiliated",null);
		    				}catch(var e:Exception){
		    				  	e.printStackTrace();
		    				  	return -1;
		    				}
		            	}else{
		    		        var vert1:Array[String] = inputArr(1).split(",");
		    				var vert3:Array[String] = vert1(0).split(":");
		    				
		    				var firstNode:URI = null;
		    				
		    				var fN:OrgID = nodeExistsInGraph(vert3(0));
		    				
		    				if(!fN.status){
		    					firstNode = createNode();
		    		
		    					addDBProperty( firstNode, "pername", vert3(0) );
		    					addDBProperty( firstNode, "attrib1", vert3(1) );
		    					addDBProperty( firstNode, "attrib2", vert1(1) );
		    					addDBProperty( firstNode, "attrib3", vert1(2) );
		    					addDBProperty( firstNode, "attrib4", vert1(3) );
		    					addDBProperty( firstNode, "LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString() );
		    					
		    					addNodeToIndexNode(vert3(0), firstNode.toString());
		    				}
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
	public def delete(var table:String, var key:String):Int {
		// TODO Auto-generated method stub
		Console.OUT.println("Deleting");
		return 0;
	}
	
	/**
	 * This method adds new vertex during transaction phase
	 * @param vertID
	 * @param listOfvertices
	 */
	private def addVertexAndConnectWithExisting(var c:Vertex):void{
		var listOfvertices:Array[Int] = c.neighbours;
		var attribs:Array[Int] = c.attribs;
		var firstNode:URI = null;
		var firstVertex:String = "" + c.pername;
		var secondVertex:String = null;
		
		var fN:OrgID = nodeExistsInGraph(firstVertex);
		
		if(!fN.status){
			firstNode = createNode();

			addDBProperty( firstNode, "pername", firstVertex );
			addDBProperty( firstNode, "attrib1", attribs(0).toString() );
			addDBProperty( firstNode, "attrib2", attribs(1).toString() );
			addDBProperty( firstNode, "attrib3", attribs(2).toString() );
			addDBProperty( firstNode, "attrib4", attribs(3).toString() );
			addDBProperty( firstNode, "LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString() );
			
			addNodeToIndexNode(firstVertex, firstNode.toString());
		}else{
			Console.OUT.println("Error : The new vertex exists in the Graph!! Vert ID : " + firstVertex);
		}
		
		for(i in 0..(listOfvertices.length-1)){	
			var secondNode:URI = null;
			secondVertex = "" + listOfvertices(i);
						
			var sN:OrgID = nodeExistsInGraph(secondVertex);
			
			if(!sN.status){
				Console.OUT.println("Error : It says that the vertex " + secondVertex);
			}else{
				secondNode = sN.path;
			}
			
			try{
			  	addRelationship( firstNode, secondNode, "affiliated",null);
			}catch(var e:Exception){
			  	e.printStackTrace();
			}			
		}
	}

	private def nodeExistsInGraph(var name:String):OrgID{
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "index/node/persons/pername/" + name;
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
		var response:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		var entity:String = response.getEntity(String.class);
		var p:Pattern = Pattern.compile("\"indexed\" : \"http://[[a-zA-Z0-9-.{}]+:[a-zA-Z0-9-.{}]+/]+\"");

		var m:Matcher = p.matcher(entity);
		var result:OrgID = new OrgID();
		
		if(m.find()){
			var InterArr:Array[String] = m.group(0).split("/");
			var orgID:String = InterArr[InterArr.length - 1];
			orgID = orgID.substring(0, orgID.length() - 1);
			
			try{
				result.path = new URI(SERVER_ROOT_URI + "node/" + orgID);
			}catch(var e:URISyntaxException)
			{
				e.printStackTrace();
			}
		}	

		//If the vertex is already in the database then it retuarns 200
		if(response.getLength() > 3){
			result.status = true;
		}else{
			result.status = false;
		}
		
		response.close();		
		
		return result;
	}
	
	
	/*
	 * This method creates a node in the graph
	 */
	private def addNodeToIndexNode(var name:String, var uri:String):URI{
		var resource:WebResource = Client.create().resource(SERVER_ROOT_URI);
		var response:ClientResponse = resource.get(ClientResponse.class);
		response.close();

		//Create a node
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "index/node/persons";
		
		resource = Client.create().resource(nodeEntryPoIntUri);
		var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"value\" : \"" + name + "\", \"uri\" : \"" + uri +  "\", \"key\" : \"pername\" }").post(ClientResponse.class);

		val location:URI = resp.getLocation();

		if(resp.getStatus() == 500){
			Console.OUT.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPoIntUri, resp.getStatus(), location.toString()));
		}

		resp.close();

		return location;
	}	
	
	/*
	 * This method creates a node in the graph
	 */
	private def createNode():URI{	
		var resource:WebResource = Client.create().resource(SERVER_ROOT_URI);
		var response:ClientResponse = resource.get(ClientResponse.class);
		
		response.close();
		
		//Create a node
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "node";
		
		resource = Client.create().resource(nodeEntryPoIntUri);
		
		val resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{}").post(ClientResponse.class);

		val location:URI = resp.getLocation();
		
		if(resp.getStatus() == 500){
			Console.OUT.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPoIntUri, resp.getStatus(), location.toString()));
		}
		
		response.close();
		
		return location;
	}
	
    private def addDBProperty( var nodeUri:URI, var propertyName:String, var propertyValue;String ):void
    {
        // START SNIPPET: addProp
        var propertyUri:String = nodeUri.toString() + "/properties/" + propertyName;

        var resource:WebResource = Client.create()
                .resource( propertyUri );
        var response:ClientResponse = resource.accept( MediaType.APPLICATION_JSON )
                .type( MediaType.APPLICATION_JSON )
                .entity( "\"" + propertyValue + "\"" )
                .put( ClientResponse.class );
        
		if(response.getStatus() == 500){
			Console.OUT.println("Error : " + String.format( "PUT to [%s], status code [%d]", propertyUri, response.getStatus() ));
		}
        
        response.close();
        // END SNIPPET: addProp
    }
	
    private def addRelationship( var startNode:URI, var endNode:URI, var relationshipType:String, var jsonAttributes:String ):URI
            throws URISyntaxException
    {
    	if((startNode == null)||(endNode == null)){
    		return null;
    	}
    	
        var fromUri:URI = new URI( startNode.toString() + "/relationships" );
        var relationshipJson:String = generateJsonRelationship( endNode, relationshipType, jsonAttributes );

        var resource:WebResource = Client.create().resource( fromUri );
        // POST JSON to the relationships URI
        ClientResponse response = resource.accept( MediaType.APPLICATION_JSON ).type( MediaType.APPLICATION_JSON ).entity( relationshipJson ).post( ClientResponse.class );

        final URI location = response.getLocation();

		if(response.getStatus() == 500){
			Console.OUT.println("Error : " + String.format( "POST to [%s], status code [%d], location header [%s]", fromUri, response.getStatus(), location.toString() ));
		}
        
        response.close();
        return location;
    }
    
    private def generateJsonRelationship( var endNode:URI, var relationshipType:String, var jsonAttributes:Array[String] ):String
    {
        var sb:StringBuilder = new StringBuilder();
        sb.append( "{ \"to\" : \"" );
        sb.append( endNode.toString() );
        sb.append( "\", " );

        sb.append( "\"type\" : \"" );
        sb.append( relationshipType );
        if ( jsonAttributes == null || jsonAttributes.length < 1 )
        {
            sb.append( "\"" );
        }
        else
        {
            sb.append( "\", \"data\" : " );
            for ( i in 0..(jsonAttributes.length-1) )
            {
                sb.append( jsonAttributes(i) );
                if ( i < jsonAttributes.length - 1 )
                { // Miss off the final comma
                    sb.append( ", " );
                }
            }
        }

        sb.append( " }" );
        return sb.toString();
    }
        
	public def static main(var args:Array[String]):void{
        if (args.size!=1)
        {
            Console.OUT.println("Please specify a threadcount");
            System.exit(0);
        }
        
        val threadcount:Int=Int.parseInt(args(0));
        
        /*
        var allthreads:Vector[Thread]=new Vector<Thread>();
        
        for (Int i=0; i<threadcount; i++)
        {
            Thread t=new Thread() 
            {
                public void run()
                {
                    try
                    {
                    	Neo4jClient client = new Neo4jClient();                   	
                    	
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
         * /
        Long en=System.currentTimeMillis();

        //Console.OUT.println("Throughput: "+((1000.0)*(((double)(opcount*threadcount))/((double)(en-st))))+" ops/sec");
        
	}

	@Override
	public def traverse(var startkey:String, var levels:Int, var result:Vector[String]):Int{
		var unDiscoveredVertices:ArrayList[String] = new ArrayList[String]();
		var discoveredVertices:ArrayList[String] = new ArrayList[String]();
		
		unDiscoveredVertices.add(startkey); //We start traversal from the first vertex given.
		
		for(i in 0..(levels-1)){
			var itr:Iterator = unDiscoveredVertices.iterator();
			
			while(itr.hasNext()){
				var k:String = itr.next().toString();
				var resource:WebResource = Client.create().resource(SERVER_ROOT_URI + "cypher");
				var response:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"query\" : \"start n = node(" + k + ") match (n)-->(x) return x\"}").get(ClientResponse.class);
				
				var entity:String = response.getEntity(String.class);
				response.close();
		
				var p:Pattern = Pattern.compile("\"data\" : \\{[\"[a-zA-Z0-9-.{}]+\"[ \\t\\r\\n]*:[ \\t\\r\\n]*\"[a-zA-Z0-9-.{}]+\",[ \\t\\r\\n]*]+[ \\t\\r\\n]*\\}");
		
				var m:Matcher = p.matcher(entity);
				var firstIndex:Int = 0, lastIndex:Int = 0;
				var item2;String = null;
				var res3:Array[String] = null, res4:Array[String] = null; 
				
				while(m.find()){
					item2 = m.group(0);
					firstIndex = item2.indexOf("{") + 1;
					
					item2 = item2.substring(firstIndex).trim();
					lastIndex = item2.indexOf("}");
					item2 = item2.substring(0, lastIndex).trim();
					
					res3 = item2.split(",");
					
					for(u in 0..(res3.length-1)){
						if(!res3(u).trim().equals("")){
							res4 = res3(u).split(":");
							
							for(v in 0..(res4.length-1)){
								var k1:String = removeQuotes(res4(v).trim());
								var v1:String = removeQuotes(res4(v+1).trim());
								
								if(k1.equals("pername")){
									discoveredVertices.add(v1);
								}
							}
						}
					}
				}
			}
			
			//Next we need to filter out already processed vertex IDs from the discovered vertex list.
			var itr2:Iterator = discoveredVertices.iterator();
			var k2:String = null;
			var newUndiscoveredVertices:ArrayList[String] = new ArrayList[String]();
			
			while(itr2.hasNext()){
				k2 = itr2.next().toString();
				
				if(!result.contains(k2)){
					result.add(k2);
					newUndiscoveredVertices.add(k2);
				}
			}
			
			//The vertices that were discovered but not in the processed vertev list are the genuine undiscovered vertices. These vertices need to be discovered.
			unDiscoveredVertices = newUndiscoveredVertices;
			discoveredVertices = new ArrayList[String]();
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
	public def insertEdge(var table:String, var key:String, var values:HashMap[String, String]):Int {	
        if(!table.equals("")){
            var IntermArr:Array[String] = table.split("<");
            
            for(u in 0..(IntermArr.length-1)){
            	
            	if(!IntermArr(u).trim().equals("")){
	            	var inputArr:Array[String] = IntermArr(u).split("-");
	            	
	            	if(inputArr(0).equals("E")){
				        var res:Array[String] = inputArr(1).split(" ");
				        
				        var vert1:Array[String] = res(0).split(",");
				        var vert2:Array[String] = res(1).split(",");    
				
						var vert3:Array[String] = vert1(0).split(":");
						
						var firstNode:URI = null;
						
						var fN:OrgID = nodeExistsInGraph(vert3(0));
						
						if(!fN.status){
							firstNode = createNode();
				
							addDBProperty( firstNode, "pername", vert3(0) );
							addDBProperty( firstNode, "attrib1", vert3(1) );
							addDBProperty( firstNode, "attrib2", vert1(1) );
							addDBProperty( firstNode, "attrib3", vert1(2) );
							addDBProperty( firstNode, "attrib4", vert1(3) );
							addDBProperty( firstNode, "LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString() );
							
							addNodeToIndexNode(vert3(0), firstNode.toString());
						}else{
							firstNode = fN.path;
						}
						
						vert3 = vert2(0).split(":");      
						var secondNode:URI = null;
						
						var sN:OrgID = nodeExistsInGraph(vert3[0]);
						
						if(!sN.status){
							secondNode = createNode();
				
							addDBProperty( secondNode, "pername", vert3(0) );
							addDBProperty( secondNode, "attrib1", vert3(1) );
							addDBProperty( secondNode, "attrib2", vert2(1) );
							addDBProperty( secondNode, "attrib3", vert2(2) );      
							addDBProperty( secondNode, "attrib4", vert2(3) );
							addDBProperty( secondNode, "LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString() );
							  
							addNodeToIndexNode(vert3(0), secondNode.toString());
						}else{
							secondNode = sN.path;
						}
						
						try{
						  	addRelationship( firstNode, secondNode, "affiliated",null);
						}catch(var e:Exception){
						  	e.printStackTrace();
						}
	            	}
            	}
            }
        }
		return 0;
	}
	
	private def removeQuotes(var input:String):String{
		input = input.trim();
		var result:String = null;
		
		var startInd:Int = input.indexOf("\"");
		var endInd:Int = input.lastIndexOf("\"");
				
		if((startInd >= 0)&&(endInd > 0)&&(input.length() > 2)){
			result = input.substring(startInd + 1, (endInd - startInd));
		}else if(startInd == endInd){
			result = input.substring(0, endInd);
		}
		
		return result;
	}
	
}

class OrgID{
	public var path:URI;
	public var status:Boolean;
}