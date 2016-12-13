/**
 * 
 */
package org.xgdbench.generator;

import x10.util.StringBuilder;

import org.apache.log4j.Logger;
import org.xgdbench.util.Conts;

import com.yahoo.ycsb.generator.Generator;

/**
 * @author miyuru
 *
 */
public class MAGGenerator extends Generator {
	private var _lastvalue:String;
	private var res:MAGResult;
	private var vertexA:Int;
	private var vertexB:Int;
	private var curVertexID:Int;
	private var nVertices:Int;
	private var nEdges:Int;
	private var randomSeed:Int;
	private var attribLen:Int;
	private var vertexCounter:Int;
	private var entityCount:Long;
	private var unitOperation:Int;
	private var gotNextEdge:Boolean = true;
	private var threadCount:Int;
	private var threadCntr:Int;
	
	public def this(){
		vertexCounter = 0;
		nVertices = 1000;
		randomSeed = 100;
		var nAttributes:Int = 4;
		var attribThreshold:Int = 40;
		var pThreshold:Float = 0.1f;
		var theta:Array[Float] = [0.99f, 0.53f, 0.53f, 0.13f];
		var mg:MAG = new MAG(nVertices, nAttributes, attribThreshold, pThreshold, theta, threadCount);
		res = mg.run(randomSeed);
		attribLen = nAttributes;//res.nodesAttribs(0).size;
		entityCount = mg.getEntityCount();
		unitOperation = ((entityCount / nVertices) as Int) + 1;
		nEdges= (entityCount - nVertices) as Int;
	}
	
	public def this(var nAttributes:Int, var nVertices:Int, var theta:Array[Float], var pThreshold:Float, var randomSeed:Int, var threadCount:Int){
		this.nVertices = nVertices;
		var attribThreshold:Int = 40;
		//float pThreshold = 0.1f;
		//float[] theta = new float[]{0.99f, 0.53f, 0.53f, 0.13f};
		var mg:MAG = new MAG(nVertices, nAttributes, attribThreshold, pThreshold, theta, threadCount);
		res = mg.run(randomSeed);
		attribLen = nAttributes;//res.nodesAttribs(0).length;
		entityCount = mg.getEntityCount();
		unitOperation = ((entityCount / nVertices) as Int) + 1;
		nEdges = (entityCount - nVertices) as Int;
		this.threadCount = threadCount;
		//System.out.println("Total entity count : " + entityCount);
		Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("Total entity count : " + entityCount);
		Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("unitOperation : " + unitOperation);
		Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("nVertices count : " + nVertices);
		Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("nEdges count : " + nEdges);
	}
	
	public def getEntityCount():Long{
		return entityCount;
	}
	

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.generator.Generator#nextString()
	 */
	//@Override
	public def nextString():String {
		var nextStr:StringBuilder = new StringBuilder();
		var attribLenOneBefore:Int = attribLen - 1;
		var k:Int = 0;
		//boolean flipFlopFlag = false;
	
		//for(int m = 0; m < unitOperation; m++){
			//if(flipFlopFlag){
			if(vertexCounter < nVertices){
					nextStr.add("<");
					nextStr.add("V-");
					nextStr.add(vertexCounter);
					
					nextStr.add(":");
					for(k2 in 0..(attribLenOneBefore-1)){
						nextStr.add(res.nodesAttribs(vertexCounter,k2));
						nextStr.add(",");
					}
					
					nextStr.add(res.nodesAttribs(vertexCounter,k));
					
					vertexCounter++;
					
				//}
				//flipFlopFlag = false;
			}
//			else{
//				
//				// Output format E|A:<attribs> B:<attribs>
//				boolean foudResult = false;
//				
//				for(i = vertexA; ((i < nVertices)&&(!foudResult)); i++){
//					for(j = vertexB; ((j < nVertices)&&(!foudResult)); j++){
//						if(res.edges[i][j] == 1){					
//							//Vertex A
//							nextStr.append("<");
//							nextStr.append("E-");
//							nextStr.append(i);
//							nextStr.append(":");
//							for(k = 0; k < attribLenOneBefore; k++){
//								nextStr.append(res.nodesAttribs[i][k]);
//								nextStr.append(",");
//							}
//							
//							nextStr.append(res.nodesAttribs[i][k]);
//							nextStr.append(" ");
//							
//							//Vertex B
//							nextStr.append(j);
//							nextStr.append(":");
//							for(k = 0; k < attribLenOneBefore; k++){
//								nextStr.append(res.nodesAttribs[j][k]);
//								nextStr.append(",");
//							}
//							
//							nextStr.append(res.nodesAttribs[j][k]);
//							foudResult = true;
//						}
//					}
//				}
//				
//				vertexA = i - 1;
//				vertexB = j;
//				
//				if(vertexB >= nVertices){
//					vertexB = 0;
//					i++;
//					vertexA = i;
//				}
//				
//				//flipFlopFlag = true;
//			}
//		}
		_lastvalue = nextStr.toString();
		
		return _lastvalue;
	}
	
	/**
	 * This method returns the edges. The edges are released after the laoding completes.
	 * @return
	 */
	public def nextEdgeString():String {
		var nextStr:StringBuilder = new StringBuilder();
		var attribLenOneBefore:Int = attribLen - 1;
		var i:Int = 0, j:Int = 0, k:Int = 0;
		
		/*
		boolean foudResult = false;
		StringBuilder nextStr = new StringBuilder();
		int i = 0, j = 0, k = 0;
		int attribLenOneBefore = attribLen - 1;
				
		for(i = vertexA; ((i < nVertices)&&(!foudResult)); i++){
			for(j = vertexB; ((j < nVertices)&&(!foudResult)); j++){
				if(res.edges[i][j] == 1){	
					//Vertex A
					nextStr.append("<");
					nextStr.append("E-");
					nextStr.append(i);
					nextStr.append(":");
					for(k = 0; k < attribLenOneBefore; k++){
						nextStr.append(res.nodesAttribs[i][k]);
						nextStr.append(",");
					}
					
					nextStr.append(res.nodesAttribs[i][k]);
					nextStr.append(" ");
					
					//Vertex B
					nextStr.append(j);
					nextStr.append(":");
					for(k = 0; k < attribLenOneBefore; k++){
						nextStr.append(res.nodesAttribs[j][k]);
						nextStr.append(",");
					}
					
					nextStr.append(res.nodesAttribs[j][k]);
					foudResult = true;
				}
			}
			vertexB = 0;// because we are going to the next line.
		}
		
		if(foudResult){
			vertexA = i - 1;
		}else{
			vertexA = i - 2;
		}
		vertexB = j;
				
		if((vertexB + 1) >= nVertices){
			vertexB = 0;
			i++;
			vertexA = i;
		}
		
		if(((vertexA + 1) > nVertices)&&((vertexB + 1) > nVertices)){
			gotNextEdge = false;
		}
		
		*/
		
		//Get the vertex first
		if (res.edges(threadCntr).hasNextEdge()){
			var vertArr:Array[Int] = res.edges(threadCntr).nextEdge();
			i = vertArr(0);
			j = vertArr(1);
			//Vertex A
			nextStr.add("<");
			nextStr.add("E-");
			nextStr.add(i);
			nextStr.add(":");
			for(k2 in 0..(attribLenOneBefore-1)){
				nextStr.add(res.nodesAttribs(i,k2));
				nextStr.add(",");
			}
			
			nextStr.add(res.nodesAttribs(i,k));
			nextStr.add(" ");
			
			//Vertex B
			nextStr.add(j);
			nextStr.add(":");
			for(k2 in 0..(attribLenOneBefore-1)){
				nextStr.add(res.nodesAttribs(j,k2));
				nextStr.add(",");
			}
			
			nextStr.add(res.nodesAttribs(j,k));
		}else{
			if(threadCount < threadCntr){
				threadCntr++;
				
				if (res.edges(threadCntr).hasNextEdge()){
					var vertArr:Array[Int] = res.edges(threadCntr).nextEdge();
					i = vertArr(0);
					j = vertArr(1);
					//Vertex A
					nextStr.add("<");
					nextStr.add("E-");
					nextStr.add(i);
					nextStr.add(":");
					for(k2 in 0..(attribLenOneBefore-1)){
						nextStr.add(res.nodesAttribs(i,k2));
						nextStr.add(",");
					}
					
					nextStr.add(res.nodesAttribs(i,k));
					nextStr.add(" ");
					
					//Vertex B
					nextStr.add(j);
					nextStr.add(":");
					for(k2 in 0..(attribLenOneBefore-1)){
						nextStr.add(res.nodesAttribs(j,k2));
						nextStr.add(",");
					}
					
					nextStr.add(res.nodesAttribs(j,k));				
				}
			}
			
		}
		return nextStr.toString();
	}
	
	/**
	 * This method indicates whethere there is another edge
	 * @return
	 */
	public def gotNextEdge():Boolean{
		return gotNextEdge;
	}
	
	
	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.generator.Generator#lastString()
	 */
	//@Override
	public def lastString() :String {
		if (_lastvalue==null)
		{
			_lastvalue=nextString();
		}
		return _lastvalue;
	}

	public def getEdgeCount() :Int {
		return nEdges;
	}

}
