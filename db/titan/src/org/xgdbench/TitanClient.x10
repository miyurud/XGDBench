package org.xgdbench;

import x10.compiler.Native;
import x10.util.HashMap;
import x10.util.ArrayList;
import x10.util.StringBuilder;
import x10.util.Set;
import x10.util.Map;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;


import java.util.Properties;

//import java.util.Map;
//import java.util.TreeSet;


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
public class TitanClient extends DB {
	
	private var SERVER_ROOT_URI:String;
	private var transactInsert:Boolean;
	private var inOutNeighbourCount:HashMap[Int, Int];
	private var vertexAttribs:HashMap[Int, Array[Int]];
	private var newVertexQueue:ArrayList[Vertex];
	//private TreeSet<Int> degrees;
	//private var degrees:TreeSet[Int];
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
	public static val INSERT_PROPORTION_PROPERTY:String="insertproportion";
	public static val INSERT_PROPORTION_PROPERTY_DEFAULT:String="0.0";
	public static val TOTAL_OP_COUNT_PROPERTY_DEFAULT:String = "1000";
	public static val TOTAL_OP_COUNT_PROPERTY:String = "operationcount";
	public static val THREAD_COUNT_PROPERTY:String = "genthread";
	public static val THREAD_COUNT_PROPERTY_DEFAULT:String = "4";
	
	var thetaThreshold:Float = 0.1f;
	private var attribCount:Int = 0;
	private var threadCount:Int = 0;
	private var insertProportion:Float;
	private var indexName:String = "vindex";//This is the name of the vertex index.
	
	public def this() {
		// TODO Auto-generated constructor stub
	}

	//public def init():void throws DBException{
	public def init():void {
		Console.OUT.println("Creating a single MAG GRAPH. This should be the only graph to be loaded.");
		var props:Properties = getProperties();
		transactInsert = Boolean.parseBoolean(props.getProperty("transactioninsert"));
		SERVER_ROOT_URI = props.getProperty("uri");
		if(!isServerRunning()){
			Console.OUT.println("Rexster server is not running...");
			return;
		}
		
		if(transactInsert){
			loadVertexAttribs();
			loadAffinityMatrix();
			mag = new MAGIncremental(affMatrix, vertexAttribs, thetaThreshold, attribCount);
			newVertexQueue = new ArrayList[Vertex]();
			constructInsertData();
		}
		
		//Here we create the index. If the index already exists (most probable reason to get false) it will return false.
		if(!createVertexIndex(indexName)){
			Console.OUT.println("Index was not created. Probably it exists.");
		}else{
			Console.OUT.println("Index created successfully.");
		}
		Console.OUT.println("------7");
	}
	
	private def loadAffinityMatrix():void{
		var props:Properties = getProperties();
		var aff:String = props.getProperty(AFFINITY_MATRIX, AFFINITY_MATRIX_DEFAULT);
		//[0.99f, 0.53f, 0.53f, 0.13f]
		aff = aff.substring(1, (aff.length() - 1));
		var iterm:Array[String] = aff.split(","); 
		//affMatrix = new float[iterm.length];
		affMatrix = new Array[Float](iterm.size);
		
		for(i in 0..(iterm.size-1)){
			affMatrix(i) = Float.parseFloat(iterm(i).trim());
		}
		
		var thetaThreash:String = props.getProperty(THETA_THRESHOLD, THETA_THRESHOLD_DEFAULT);
		thetaThreshold = Float.parseFloat(thetaThreash);
		
		attribCount=Int.parseInt(props.getProperty(RECORD_COUNT_PROPERTY, RECORD_COUNT_PROPERTY_DEFAULT));
		
		insertProportion=Float.parseFloat(props.getProperty(INSERT_PROPORTION_PROPERTY, INSERT_PROPORTION_PROPERTY_DEFAULT));
		totalOpCount=Long.parseLong(props.getProperty(TOTAL_OP_COUNT_PROPERTY, TOTAL_OP_COUNT_PROPERTY_DEFAULT));
		threadCount = Int.parseInt(props.getProperty(THREAD_COUNT_PROPERTY, THREAD_COUNT_PROPERTY_DEFAULT));
		
		transactInsertOpCount = ((insertProportion*Math.round(totalOpCount/threadCount)) + 10) as Long;
		
		Console.OUT.println("transactInsertOpCount : " + transactInsertOpCount);
	}
	
	/**
	 * This method loads all the vertices
	 */
	public def loadVertexAttribs():void{
		vertexAttribs = new HashMap[Int, Array[Int]]();
		
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/vertices";
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
				
		//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		var resp:ClientResponse = null;
		
		var entityStream:InputStream = resp.getEntityInputStream();
		
		var reader:BufferedReader = new BufferedReader(new InputStreamReader(entityStream));
		var builder:StringBuilder = new StringBuilder();
		var line:String = null;
				
		var ch:Int = -1;
		var appendFlag:Boolean = false;
		var withinEntityFlag:Boolean = false;
		
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
					var entity:String = builder.toString();
					
					var kvs:Array[String]=entity.split(",");
					var counter:Int = 0;
					var len:Int = kvs.size;
					var perName:Int = -1;
					var attribArrayList:ArrayList[Int] = new ArrayList[Int]();
					
					for (counter2 in 0..(len - 1)){						
						if (kvs(counter2).indexOf("name") != -1){
							var strArr:Array[String] = kvs(counter2).split(":"); 
							perName = Int.parseInt(removeQuotes(strArr(1)));
						}
						
						if (kvs(counter2).indexOf("attrib") != -1){
								if (kvs(counter2).indexOf("attrib") != -1){
									var value:String = kvs(counter2);
									var strArr:Array[String] = value.split(":");
									var r:Int = Int.parseInt(removeQuotes(strArr(0).split("attrib")(1)));
									attribArrayList.add(Int.parseInt(removeQuotes(strArr(1))));
								}
						}
					}
					
					if (perName != -1){				
						var v:Array[Int] = new Array[Int](attribArrayList.size());
						
						var itr:Iterator[Int] = attribArrayList.iterator() as Iterator[Int];
						var cntr:Int = 0;
						while(itr.hasNext()){
							v(cntr) = itr.next() as Int;
							cntr++;
						}
						
						vertexAttribs.put(perName, v);
						
						if (perName > largestVert){
							largestVert = perName;
						}
					}
				}
				
				if (appendFlag && withinEntityFlag){
					builder.add(ch as Char);
				}
				
			}
		}catch(var e:IOException){
			e.printStackTrace();
		}finally{
			try{
				entityStream.close();
			}catch(var ec:IOException){
				ec.printStackTrace();
			}
		}
		
		largestNewVert = largestVert;
	}
	
	private def constructInsertData():void{
		for(i in 0..(transactInsertOpCount-1)){
			largestNewVert++;
			var c:Vertex = mag.getListOfVerticesToConnectWith(largestNewVert);
			newVertexQueue.add(c);
			vertexAttribs.put(largestNewVert as Int, c.attribs);
			mag.setVerticesAndAttributes(vertexAttribs);
		}
	}
	
	/**
	 * This method indicates whether the Rexster server is running or not.
	 * @return
	 */
	public def isServerRunning():Boolean{
		var result:Boolean = false;
		
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs";
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
		try{
			//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			var resp:ClientResponse = null;
			result = true;
		}catch(var e:Exception){
			result = false;
		}
		
		return result;
	}
	
	
	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#read(java.lang.String, java.lang.String, java.util.Set, java.util.HashMap)
	 */
	//@Override
	public def read(var table:String, var key:String, var fields:Set[String], var result:HashMap[String,String]):Int {
		
//		final String nodeEntryPoIntUri = SERVER_ROOT_URI + "/graphs/graph/vertices?key=pername&value=" + key;
//		WebResource resource = Client.create().resource(nodeEntryPoIntUri);
//		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
				
		//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{\"params\":{\"idxname\":\"" + indexName + "\",\"pname\":\"" + key + "\"},\"script\":\"g.idx(idxname)[[pername:pname]]\"}").post(ClientResponse.class);
		var resp:ClientResponse = null;
		
		//var entity:String = resp.getEntity(java.lang.String.class);
		var entity:String = null;
		var firstIndex:Int = entity.lastIndexOf("{") + 1;
		
		entity = entity.substring(firstIndex).trim();
		var lastIndex:Int = entity.indexOf("}");
		entity = entity.substring(0, lastIndex).trim();
		
		var kvs:Array[String]=entity.split(",");
		var counter:Int = 0;
		var len:Int = kvs.size;
		var startInd:Int = -1;
		
		for (counter2 in 0..(len-1)){						
			if (kvs(counter2).indexOf("name") != -1){
				val value:String = kvs(counter2);
				startInd = value.indexOf(":") + 1;
				result.put("name", removeQuotes(value.substring(startInd)));
			}
			
			if (kvs(counter2).indexOf("attrib") != -1){
				var value:String = kvs(counter2);
				var strArr:Array[String] = value.split(":");
				result.put(strArr(0), strArr(1));
			}
			
			if (kvs(counter2).indexOf("LastLogin") != -1){
				var value:String = kvs(counter2);
				var strArr:Array[String] = value.split(":");
				result.put(strArr(0), strArr(1));
			}
		}
				
		val location:URI = resp.getLocation();
		
		if(resp.getStatus() == 500){
			Console.OUT.println("Error : " + "POST on " + nodeEntryPoIntUri + ", status code " + resp.getStatus() + ", location header " + location.toString() + "");
		}
		
		resp.close();
		
		return 0;
	}

	/* This method loads all the friends of a vertex. All the attribute names and their values of each friend are put in to a HashMap object which
	 * in trun gets stored in a Vector. The attributes that get stored on the HashMap includes the name of the person and the attrib<n> attributes.
	 * @see com.yahoo.ycsb.DB#scan(java.lang.String, java.lang.String, Int, java.util.Set, java.util.Vector)
	 */
	//@Override
	public def scan(var table:String, var startkey:String, var recordcount:Int, var fields:Set[String], var result:ArrayList[HashMap[String, String]]):Int {		
		//var fromVertID:String = getVertexID(startkey).replaceAll("^\"|\"$", ""); //Get the exact vertex ID of the starting (i.e., from) vertex
		var fromVertID:String = getVertexID(startkey); //Get the exact vertex ID of the starting (i.e., from) vertex
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/vertices/" + fromVertID + "/bothE";
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
				
		//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		var resp:ClientResponse = null;
		
		var entityStream:InputStream = resp.getEntityInputStream();
		
		var reader:BufferedReader = new BufferedReader(new InputStreamReader(entityStream));
		var builder:StringBuilder = new StringBuilder();
		var line:String = null;
				
		var ch:Int = -1;
		var appendFlag:Boolean = false;
		var withinEntityFlag:Boolean = false;
		var foundFriends:ArrayList[String] = new ArrayList[String]();
		
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
					var entity:String = builder.toString();
					
					var kvs:Array[String]=entity.split(",");
					var counter:Int = 0;
					var len:Int = kvs.size;
					
					var hMap:HashMap[String, String] = new HashMap[String, String]();
					
					for (counter2 in 0..(len-1)){						
						if (kvs(counter2).indexOf("_inV") != -1){
							var value:String = kvs(counter2);
							var strArr:Array[String] = value.split(":");	
							if (!(foundFriends.indexOf(strArr(1)) != -1)){
								hMap = getVertexPropertiesByExactID(strArr(1));
								hMap.put(strArr(0), strArr(1));
								foundFriends.add(strArr(1));
							}
						}
					}
					
					result.add(hMap);
					
				}
				
				if (appendFlag && withinEntityFlag){
					builder.add(ch as Char);
				}
			}
		}catch(var e:IOException){
			e.printStackTrace();
		}finally{
			try{
				entityStream.close();
			}catch(var ec:IOException){
				ec.printStackTrace();
			}
		}		
						
		val location:URI = resp.getLocation();
		
		if(resp.getStatus() == 500){
			Console.OUT.println("Error : " + "POST on " + nodeEntryPoIntUri + ", status code " + resp.getStatus() + ", location header " + location.toString() + "");
		}
		
		resp.close();
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.DB#update(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	//@Override
	public def update(var table:String, var key:String, var values:HashMap[String, String]):Int {
		var sideEffectString:String = "";
		var itr:Iterator[String] = values.keySet().iterator() as Iterator[String];
		var k:String = null, v:String = null;
		
//		while(itr.hasNext()){
//			k = itr.next().toString();
//			v = values.get(k).toString();
//			sideEffectString += "it." + k + "=%22" + v + "%22;";
//		}
		
		try{
			//We just need to update the last login time.
			sideEffectString += "it.LastLogin=%22" + URLEncoder.encode(new java.sql.Timestamp(new java.util.Date().getTime()).toString(), "utf-8") + "%22;";
		}catch(var ex:java.io.UnsupportedEncodingException){
			ex.printStackTrace();
		}catch(var ec:Exception){
			ec.printStackTrace();
		}
		//Note that in the below string the URL characters are encoded to avoid errors that were encountered during tests.
		//The character codes are as follows,
		// %22 - "
		// %7C - {
		// %7D - }
		// %2C - ,
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin?script=g.V(%22pername%22%2C%22"+key+"%22).sideEffect%7B" + sideEffectString + "%7D";
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);		
		//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		var resp:ClientResponse = null;
		
		//var entity:String = resp.getEntity(String.class);
		val location:URI = resp.getLocation();

		resp.close();
		
		return 0;
	}
	
	/* This method inserts a single relationship to the GraphDB. If from and to vertices do not exist
	 * those will be added to the Graph prior to adding the relationship. Furthermore each insert operation does not necessarily need
	 * to insert an edge to the graph. Some times an insert operation might insert only a vertex.
	 * @see com.yahoo.ycsb.DB#insert(java.lang.String, java.lang.String, java.util.HashMap)
	 */
	//@Override
	public def insert(var table:String, var key:String, var values:HashMap[String, String]):Int {
		Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX");
		if(table.equals("transact-insert")){	
			var c:Vertex = null;
			try{
				c = newVertexQueue.removeFirst();
			}catch(var e:java.util.NoSuchElementException){
				return -1;
			}
			addVertexAndConnectWithExisting(c);			
		}else{
	        if(!table.equals("")){  
	            var IntermArr:Array[String] = table.split("<");
	            Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX2");
	            for(u in 0..(IntermArr.size - 1)){
	            	
	            	if(!IntermArr(u).trim().equals("")){
		            	var inputArr:Array[String] = IntermArr(u).split("-");
		            	
		            	if(inputArr(0).equals("E")){
		            		var firstVertexName:String = null;
		            		var secondVertexName:String = null;
		    		        var res:Array[String] = inputArr(1).split(" ");
		    		        
		    		        var vert1:Array[String] = res(0).split(",");
		    		        var vert2:Array[String] = res(1).split(",");    
		    	
		    				var vert3:Array[String] = vert1(0).split(":");
		    						    				
		    				var res1:String = getVertexID(vert3(0)); //Here what we really do is checking whether the vertex exists or not.
		    				
		    				if(res1.equals("-1")){	    					
		    					var vertAttribs:HashMap[String, String] = new HashMap[String, String](); 
		    					vertAttribs.put("attrib1", vert3(1).toString());
		    					vertAttribs.put("attrib2", vert1(1).toString());
		    					vertAttribs.put("attrib3", vert1(2).toString());
		    					vertAttribs.put("attrib4", vert1(3).toString());
		    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
		    					
		    					createVertexWithProperties(vert3(0), vertAttribs);
		    					firstVertexName = vert3(0);
		    				}
		    				
		    				Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX3");
		    				
		    				vert3 = vert2(0).split(":");      
		    				var secondNode:URI = null;
		    				
		    				res1 = getVertexID(vert3(0));
		    				
		    				if(res1.equals("-1")){	    					
		    					var vertAttribs:HashMap[String,String] = new HashMap[String,String](); 
		    					vertAttribs.put("attrib1", vert3(1).toString());
		    					vertAttribs.put("attrib2", vert1(1).toString());
		    					vertAttribs.put("attrib3", vert1(2).toString());
		    					vertAttribs.put("attrib4", vert1(3).toString());
		    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
		    					
		    					createVertexWithProperties(vert3(0), vertAttribs);
		    					secondVertexName = vert3(0);
		    				}
		    				Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX4");
		    				try{
		    				  	addRelationship( firstVertexName, secondVertexName, "affiliated");
		    				}catch(var e:Exception){
		    				  	e.printStackTrace();
		    				}
		            	}else{
		            		Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX5");
		            		//In this case we need to add only the first vertex to the graph. There is no insertion of a edge
		            		//happen at this poInt.
		            		Console.OUT.println("inputArr(1) : " + inputArr(1));
		    		        var vert1:Array[String] = inputArr(1).split(",");
		    		        Console.OUT.println("vert1(0) : " + vert1(0));
		    				var vert3:Array[String] = vert1(0).split(":");
		    				var res:String = getVertexID(vert3(0));
		    				Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX5--1");
		    				Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX res : " + res);
		    				if(res.equals("-1")){	    					
		    					var vertAttribs:HashMap[String, String] = new HashMap[String, String](); 
		    					vertAttribs.put("attrib1", vert3(1).toString());
		    					vertAttribs.put("attrib2", vert1(1).toString());
		    					vertAttribs.put("attrib3", vert1(2).toString());
		    					vertAttribs.put("attrib4", vert1(3).toString());
		    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
		    					Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX===5===1");
		    					if(createVertexWithProperties(vert3(0), vertAttribs).equals("-1")){
		    						return -1;
		    					}
		    					Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX99");
		    				}
		    				
		    				Console.OUT.println("ZZZZZZZZZZZZZZZZZZZZZZZZX6");
		            	}            	
	            	}
	            }
	        }
		}

		Console.OUT.println("Returned from here");
		
		return 0;
	}	

	/* Note : this method is not implemented in Titan
	 * @see com.yahoo.ycsb.DB#delete(java.lang.String, java.lang.String)
	 */
	//@Override
	public def delete(var table:String, var key:String):Int {
		// TODO Auto-generated method stub
		Console.OUT.println("Error : Deletion operation has not been implemented on Titan 0.1.0.");
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
		var firstVertex:String = "" + c.pername;
		var secondVertex:String = null;
		
		var res:String = getVertexID(firstVertex);
		
		if(res.equals("-1")){			
			var vertAttribs:HashMap[String, String] = new HashMap[String, String](); 
			vertAttribs.put("attrib1", attribs(0).toString());
			vertAttribs.put("attrib2", attribs(1).toString());
			vertAttribs.put("attrib3", attribs(2).toString());
			vertAttribs.put("attrib4", attribs(3).toString());
			vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
			
			createVertexWithProperties(firstVertex, vertAttribs);
			
		}else{
			Console.OUT.println("Error : The new vertex exists in the Graph!! Vert ID : " + firstVertex);
		}
		
		for(i in 0..(listOfvertices.size - 1)){	
			secondVertex = "" + listOfvertices(i);

			res = getVertexID(secondVertex);
			
			if(res.equals("-1")){
				Console.OUT.println("Error : It says that the vertex " + secondVertex + "does not exist.");
				continue;
			}
			
		  	addRelationship( firstVertex, secondVertex, "affiliated");
		}
	}
		
	/**
	 * This method creates an edge between two vertices on the Titan Graph
	 * @param fromVertex
	 * @param toVertex
	 * @return
	 */
	
	public def addRelationship(var fromVertex:String, var toVertex:String, var relationshipName:String):String{
		var result:String = "-1";		
		// val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		// 
		// var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
		// 	
		// //Check and confirm whether the two vertices exist
		// //var idFrom:String = getVertexID(fromVertex).replaceAll("^\"|\"$", "");
		// //var idTo:String = getVertexID(toVertex).replaceAll("^\"|\"$", "");
		// 
		// var idFrom:String = getVertexID(fromVertex);
		// var idTo:String = getVertexID(toVertex);
		// 
		// //Console.OUT.println("JSON text is : " + "{ \"params\" : {\"etype\" : \"" + relationshipName + "\"}, \"script\" : \"v1=g.v('" + idFrom + "');v2=g.v('" + idTo + "');e=g.addEdge(v1,v2,etype);\" }");
		// 
		// //var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"params\" : {\"etype\" : \"" + relationshipName + "\"}, \"script\" : \"v1=g.v('" + idFrom + "');v2=g.v('" + idTo + "');e=g.addEdge(v1,v2,etype);\" }").post(ClientResponse.class);
		// var resp:ClientResponse = null;
		// 
		// val location:URI = resp.getLocation();
		// 
		// //Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("response of edge insert : " + resp.getStatus());
		// 
		// if((resp != null) && (location != null) && (resp.getStatus() == 500)){
		// 	Console.OUT.println("Error : " + " POST on " + nodeEntryPoIntUri + ", status code " + resp.getStatus() + " , location header " + location.toString() + "");
		// 	return "-1";
		// }
		// 
		// resp.close();
		// 		
		// result = "0";
		
		result = call_addRelationship(SERVER_ROOT_URI, indexName, fromVertex, toVertex, relationshipName);
		
		return result;
	}	
	
	/**
	 * This method creates a vertex index.
	 * @param indexname
	 * @return
	 */
	public def createVertexIndex(var indexName:String):Boolean{
		Console.OUT.println("AAAAAA");
		var result:Boolean = false;		
		// val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		// Console.OUT.println("AAAAA2A");
		// var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
		// Console.OUT.println("AAAAA3A");
		// //var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"params\" : {\"name\" : \"" + indexName + "\"}, \"script\" : \"g.createIndex(name, Vertex.class)\" }").post(ClientResponse.class);
		// var resp:ClientResponse = null;
		// Console.OUT.println("AAAAAA4");
		// val location:URI = resp.getLocation();
		// Console.OUT.println("AAAAAA5");
		// if(resp.getStatus()==200){
		// 	result = true;
		// }
		// Console.OUT.println("AAAAAA6");
		// resp.close();
		
		result=call_createVertexIndex(SERVER_ROOT_URI, indexName);
		
		Console.OUT.println("AAAAAA7");
		return result;
	}	
	
	/**
	 * This method adds a vertex to a given vertex index. If the adding did not complete successfully, it returns false.
	 * @param indexName - Name of the index
	 * @param vetexID - The unique vertex id assigned by the Titan server
	 * @param vertexName - The vertex id (i.e., pername) provided by XGDBench graph generator
	 * @return true if success. false otherwise.
	 */
	public def addVertexToIndex(var indexName:String, var vertexID:String, var vertexName:String):Boolean{
		var result:Boolean = false;
		
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
				
		//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ \"params\" : {\"idxname\" : \"" + indexName + "\",\"par1\" : \"pername\", \"par2\" : \"" + vertexName + "\",\"par3\" : " + vertexID + "}, \"script\" : \"g.idx(idxname).put(par1, par2, g.v(par3))\" }").post(ClientResponse.class);
		var resp:ClientResponse = null;
		
		val location:URI = resp.getLocation();
				
		if(resp.getStatus()==200){
			result = true;
		}
		
		resp.close();
		
//		String str = getVertexID(vertexName);
//		
//		Console.OUT.println("vertexID : " + vertexID + " vertexName : " + vertexName + " _id : " + str);
		
		return result;		
	}
	
	
	/**
	 * This method creates a vertex with a set of predefined properties
	 * @param vertexName
	 * @param values
	 * @return
	 */
	private def createVertexWithProperties(var vertexName:String, var values:HashMap[String, String]):String{
		var result:String = "-1";
		
// 		//First we create the vertex
// 		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/vertices";
// 		
// 		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
// 		
// 		var entityString:String = "\"pername\" : \"" + vertexName + "\"";
// 		
// 		var it:Iterator[Map.Entry[String, String]] = values.entries().iterator() as Iterator[Map.Entry[String, String]];
// 		
// 		while(it.hasNext()){
// 			var pairs:Map.Entry[String, String] = it.next() as Map.Entry[String, String];
// 			entityString += ",\"" + pairs.getKey() + "\" : \"" + pairs.getValue() + "\"";
// 		}
// 		
// 		entityString += ",\"LastLogin\" : \"" + new java.sql.Timestamp(new java.util.Date().getTime()).toString() + "\"";
// 		
// 		//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{ " + entityString + " }").post(ClientResponse.class);
// 		var resp:ClientResponse = null;
// 		val location:URI = resp.getLocation();
// 
// 		//Once we create the vertex we get the created vertex content as output. We parse the content to get the vertex id.
// 		//var entity:String = resp.getEntity(String.class);
// 		var entity:String = null;
// 		
// 		var vid:String = null;
// 		
// 		var firstIndex:Int = entity.lastIndexOf("{") + 1;
// 		
// 		entity = entity.substring(firstIndex).trim();
// 		var lastIndex:Int = entity.indexOf("}");
// 		entity = entity.substring(0, lastIndex).trim();
// 		
// 		var kvs:Array[String]=entity.split(",");
// 		var counter:Int = 0;
// 		var len:Int = kvs.size;
// 		
// 		for (counter2 in 0..(len-1)){
// 			if (kvs(counter2).indexOf("_id") != -1){
// 				var value:String = kvs(counter2);
// 				var startInd:Int = value.indexOf(":") + 1;
// 				//vid = value.substring(startInd).replaceAll("^\"|\"$", "");//We remove the two double quotes from the vertex id.
// 				vid = value.substring(startInd);//We remove the two double quotes from the vertex id.
// 				
// 				break;
// 			}
// 		}
// 		
// 		//Next we add the vertex to the vertex index.
// 		
// 		if(!addVertexToIndex(indexName, vid, vertexName)){
// 			Console.OUT.println("Could not add the vertex to index.");
// 		}
// 		
// 		result = "0"; //The operation is successful.
// 				
// 		//if((location != null) && (resp.getStatus() == 500)){
// 		if(resp.getStatus() != 200){
// 			//Console.OUT.println("Error : " + String.format("POST on [%s], status code [%d], location header [%s]", nodeEntryPoIntUri, resp.getStatus(), location.toString()));
// 			result = "-1"; 
// 		}
// 
// 		resp.close();
// 		
// 		//Console.OUT.println("Done vertex : " + vertexName + " response is : " + result);
		
		//call_createVertexWithProperties(SERVER_ROOT_URI, indexName, vertexName, values);
		
		val hmap_sa_string:String = convertHmapToString(values);
		
		result = call_createVertexWithProperties(SERVER_ROOT_URI, indexName, vertexName, hmap_sa_string);
			
		return result;
	}
	
	
	private def convertHmapToString(var values:HashMap[String, String]):String{
		var result:String = "";
		for (item in values.keySet()){
			result += item + ":" + values.get(item)+"-";
		}
		
		return result;
	}
	
	/**
	 * This method returns the vertex ID of a vertex on the Titan Graph
	 * @param vertexName
	 * @return
	 */
	
	private def getVertexID(var vertexName:String):String{
		var result:String = "-1";
		// var entity:String = null;
		// Console.OUT.println("111");
		// 
		// try{
		// 	val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin";
		// 	
		// 	Console.OUT.println("nodeEntryPoIntUri : " + nodeEntryPoIntUri);
		// 	
		// 	var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
		// 	Console.OUT.println("222");
		// 	//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).entity("{\"params\":{\"idxname\":\"" + indexName + "\",\"pname\":\"" + vertexName + "\"},\"script\":\"g.idx(idxname)[[pername:pname]]\"}").post(ClientResponse.class);
		// 	var resp:ClientResponse = null;
		// 	
		// 	//entity = resp.getEntity(String.class);
		// 	
		// 	var firstIndex:Int = entity.lastIndexOf("{") + 1;
		// 	
		// 	entity = entity.substring(firstIndex).trim();
		// 	var lastIndex:Int = entity.indexOf("}");
		// 	
		// 	if((firstIndex==-1)||(lastIndex==-1)){ //Probably there is an error thrown from the server.
		// 		Console.OUT.println("Cannot find the { and/or }");
		// 		Console.OUT.println("The output was : |" + entity + "|");
		// 		return result;
		// 	}
		// 	
		// 	entity = entity.substring(0, lastIndex).trim();
		// 	
		// 	var kvs:Array[String]=entity.split(",");
		// 	var counter:Int = 0;
		// 	var len:Int = kvs.size;
		// 	
		// 	for (counter2 in 0..(len-1)){
		// 		if (kvs(counter2).indexOf("_id") != -1){
		// 			var value:String = kvs(counter2);
		// 			var startInd:Int = value.indexOf(":") + 1;
		// 			result = value.substring(startInd);
		// 			
		// 			break;
		// 		}
		// 	}
		// 	
		// 	val location:URI = resp.getLocation();
		// 	
		// 	if(resp.getStatus() == 500){
		// 		Console.OUT.println("Error : " + "POST on " + nodeEntryPoIntUri + ", status code " + resp.getStatus() + ", location header " + location.toString() + "");
		// 	}
		// 	
		// 	resp.close();
		// }catch(var ec:StringIndexOutOfBoundsException){
		// 	ec.printStackTrace();
		// 	Console.OUT.println("response from db : |" + entity + "|");
		// }
		
		result = call_getVertexID(SERVER_ROOT_URI, indexName, vertexName);
		
		return result;
	}
	
	/**
	 * This method returns the vertex property names and values. The properties include all the properties of the vertex including its name and the "attrib" fields.
	 * @param vertexName
	 * @return
	 */
	public def getVertexPropertiesByExactID(var vertexID:String):HashMap[String, String]{
		var result:HashMap[String, String] = new HashMap[String, String]();
		//Note that here we do not need to use gremlin beased technique because we get the vertex information directly
		//val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/vertices/" + vertexID.replaceAll("^\"|\"$", "");
		val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/vertices/" + vertexID;
		
		var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);
				
//		var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		var resp:ClientResponse = null;
		
		//var entity:String = resp.getEntity(String.class);
		var entity:String = null;
		
		var firstIndex:Int = entity.lastIndexOf("{") + 1;
		
		entity = entity.substring(firstIndex).trim();
		var lastIndex:Int = entity.indexOf("}");
		entity = entity.substring(0, lastIndex).trim();
		
		var kvs:Array[String]=entity.split(",");
		//var counter:Int = 0;
		var len:Int = kvs.size;
		
		for (counter2 in 0..(len-1)){
			//The assumption here is that there are other attributes other than what is listed here. SO we need to use if statements to filter.
			if (kvs(counter2).indexOf("name") != -1){
				var value:String = kvs(counter2);
				var strArr:Array[String] = value.split(":");
				result.put(strArr(0), strArr(1));
			}
			
			if (kvs(counter2).indexOf("attrib") != -1){
				var value:String = kvs(counter2);
				var strArr:Array[String] = value.split(":");
				result.put(strArr(0), strArr(1));
			}
			
			if (kvs(counter2).indexOf("LastLogin") != -1){
				var value:String = kvs(counter2);
				var strArr:Array[String] = value.split(":");
				result.put(strArr(0), strArr(1));
			}
		}
		
		val location:URI = resp.getLocation();
		
		if(resp.getStatus() == 500){
			Console.OUT.println("Error : " + "POST on " + nodeEntryPoIntUri + ", status code " + resp.getStatus() + ", location header " + location.toString() + "");
		}
		
		resp.close();
		
		return result;
	}
	   
	public def removeQuotes(var input:String):String{
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
	
	public static def main(args:Array[String]):Int{
        if (args.size!=1)
        {
            Console.OUT.println("Please specify a threadcount");
            return -1;
        }
        
        val threadcount:Int=Int.parseInt(args(0));
        
        /*
        Vector<Thread> allthreads=new Vector<Thread>();
        
        for (Int i=0; i<threadcount; i++)
        {
            Thread t=new Thread() 
            {
                public void run()
                {
                    try
                    {
                    	TitanClient client = new TitanClient();                   	
                    	
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
         * */
        //Long en=System.currentTimeMillis();

        //Console.OUT.println("Throughput: "+((1000.0)*(((double)(opcount*threadcount))/((double)(en-st))))+" ops/sec");
        return 0;
	}
	
	//@Override
	public def traverse(var startkey:String, var levels:Int, var result:ArrayList[String]):Int {
		var unDiscoveredVertices:ArrayList[String] = new ArrayList[String]();
		var discoveredVertices:ArrayList[String] = new ArrayList[String]();
		//ArrayList<String> processedVertices = new ArrayList<String>();
		
		unDiscoveredVertices.add(startkey); //We start traversal from the first vertex given.
		
		for(i in 0..(levels-1)){
			var itr:Iterator[String] = unDiscoveredVertices.iterator() as Iterator[String];
			
			while(itr.hasNext()){
				var k:String = itr.next().toString();
				val nodeEntryPoIntUri:String = SERVER_ROOT_URI + "/graphs/graph/tp/gremlin?script=g.V('pername','" + k + "').outE.gather.scatter.inV";
				
				var resource:WebResource = Client.create().resource(nodeEntryPoIntUri);		
				//var resp:ClientResponse = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
				var resp:ClientResponse = null;
								
				var entityStream:InputStream = resp.getEntityInputStream();
				
				var reader:BufferedReader = new BufferedReader(new InputStreamReader(entityStream));
				var builder:StringBuilder = new StringBuilder();
				var line:String = null;
						
				var ch:Int = -1;
				var appendFlag:Boolean = false;
				var withinEntityFlag:Boolean = false;
				
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
							var entity:String = builder.toString();
							
							var kvs:Array[String]=entity.split(",");
							//var counter:Int = 0;
							var len:Int = kvs.size;
							
							for (counter in 0..(len -1)){						
								if (kvs(counter).indexOf("pername") != -1){
									var value:String = kvs(counter);
									var startInd:Int = value.indexOf(":") + 1;
									var inV:String = removeQuotes(value.substring(startInd));
									
									discoveredVertices.add(inV);
								}
							}
							
						}
						
						if (appendFlag && withinEntityFlag){
							builder.add(ch as Char);
						}
					}
				}catch(var e:IOException){
					e.printStackTrace();
				}finally{
					try{
						entityStream.close();
					}catch(var ec:IOException){
						ec.printStackTrace();
					}
				}		
		
				resp.close();
			}//end of while
			
			//Next we need to filter out already processed vertex IDs from the discovered vertex list.
			var itr2:Iterator[String] = discoveredVertices.iterator() as Iterator[String];
			var k2:String = null;
			var newUndiscoveredVertices:ArrayList[String] = new ArrayList[String]();
			
			while(itr2.hasNext()){
				k2 = itr2.next().toString();
				
				if(!result.contains(k2)){
					result.add(k2);
					newUndiscoveredVertices.add(k2);
				}
			}
			
			//The vertices that were discovered but not in the processed vertex list are the genuine undiscovered vertices. These vertices need to be discovered.
			unDiscoveredVertices = newUndiscoveredVertices;
			discoveredVertices = new ArrayList[String]();
		}//end of for
		
		//Console.OUT.println("Size of the processed vertices : " + result.size());
		
		return -1;
	}
	
	//@Override
	public def insertEdge(var table:String, var key:String, var values:HashMap[String, String]):Int{
        if(!table.equals("")){  
            var IntermArr:Array[String] = table.split("<");
            
            for(u in 0..(IntermArr.size-1)){
            	
            	if(!IntermArr(u).trim().equals("")){
	            	var inputArr:Array[String] = IntermArr(u).split("-");
	            	
	            	if(inputArr(0).equals("E")){
	            		var firstVertexName:String = null;
	            		var secondVertexName:String = null;
	    		        var res:Array[String] = inputArr(1).split(" ");
	    		        
	    		        var vert1:Array[String] = res(0).split(",");
	    		        var vert2:Array[String] = res(1).split(",");    
	    	
	    				var vert3:Array[String] = vert1(0).split(":");
	    						    				
	    				var res1:String = getVertexID(vert3(0)); //Here what we really do is checking whether the vertex exists or not.
	    				
	    				if(res1.equals("-1")){	    					
	    					var vertAttribs:HashMap[String, String] = new HashMap[String, String](); 
	    					vertAttribs.put("attrib1", vert3(1).toString());
	    					vertAttribs.put("attrib2", vert1(1).toString());
	    					vertAttribs.put("attrib3", vert1(2).toString());
	    					vertAttribs.put("attrib4", vert1(3).toString());
	    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
	    					
	    					createVertexWithProperties(vert3(0), vertAttribs);
	    				}
	    				
	    				firstVertexName = vert3(0);
	    				
	    				vert3 = vert2(0).split(":");      
	    				var secondNode:URI = null;
	    				
	    				res1 = getVertexID(vert3(0));
	    				
	    				if(res1.equals("-1")){	    					
	    					var vertAttribs:HashMap[String, String] = new HashMap[String, String](); 
	    					vertAttribs.put("attrib1", vert3(1).toString());
	    					vertAttribs.put("attrib2", vert1(1).toString());
	    					vertAttribs.put("attrib3", vert1(2).toString());
	    					vertAttribs.put("attrib4", vert1(3).toString());
	    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
	    					
	    					createVertexWithProperties(vert3(0), vertAttribs);
	    				}
	    				
    					secondVertexName = vert3(0);
	    				
	    				try{
	    					
	    					//Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("Adding relationship first->second : " + firstVertexName + " " + secondVertexName);
	    					
	    				  	addRelationship( firstVertexName, secondVertexName, "affiliated");
	    				}catch(var e:Exception){
	    				  	e.printStackTrace();
	    				  	return -1;
	    				}
	            	}else{
	            		//In this case we need to add only the first vertex to the graph. There is no insertion of a edge
	            		//happen at this poInt.
	    		        var vert1:Array[String] = inputArr(1).split(",");
	    				var vert3:Array[String] = vert1(0).split(":");
	    				var res:String = getVertexID(vert3(0));
	    				
	    				if(res.equals("-1")){	    					
	    					var vertAttribs:HashMap[String, String] = new HashMap[String, String](); 
	    					vertAttribs.put("attrib1", vert3(1).toString());
	    					vertAttribs.put("attrib2", vert1(1).toString());
	    					vertAttribs.put("attrib3", vert1(2).toString());
	    					vertAttribs.put("attrib4", vert1(3).toString());
	    					vertAttribs.put("LastLogin", new java.sql.Timestamp(new java.util.Date().getTime()).toString());
	    					
	    					createVertexWithProperties(vert3(0), vertAttribs);
	    				}
	            	}            	
            	}
            }
        }
		return 0;
	}
	
	@Native("java", "org.xgdbench.java.TitanClient_Java.createVertexIndex(#1, #2)")
	static native def call_createVertexIndex(String, String):Boolean;
	
	@Native("java", "org.xgdbench.java.TitanClient_Java.getVertexID(#1, #2, #3)")
	static native def call_getVertexID(String, String, String):String;
	
	@Native("java", "org.xgdbench.java.TitanClient_Java.createVertexWithProperties(#1, #2, #3, #4)")
	//static native def call_createVertexWithProperties(String, String, String, HashMap[String, String]):String;
	static native def call_createVertexWithProperties(String, String, String, String):String;
	
	@Native("java", "org.xgdbench.java.TitanClient_Java.addRelationship(#1, #2, #3, #4, #5)")
	static native def call_addRelationship(String, String, String, String, String):String;
}

//class OrgID{
//	public URI path;
//	public boolean status;
//}