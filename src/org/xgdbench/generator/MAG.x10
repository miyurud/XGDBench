package org.xgdbench.generator;

import x10.util.ArrayList;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class MAG {
	private var nVertices:Int;
	private var nEdges:Int;
	private var nAttributes:Int;
	private var attribThreshold:Int;
	private var pThreshold:Float;
	private var theta:Array[Float];
	private var result:Float;
	//private Stack<int[]> stkEdges;
	private var threadCount:Int;
	private var threadArr:Array[MAGThread];
	
	public def this(var nVertices:Int, var nAttributes:Int, var attribThreshold:Int, var pThreshold:Float, var theta:Array[Float], var threadCount:Int) {
		this.nVertices = nVertices;
		this.nAttributes = nAttributes;
		this.attribThreshold = attribThreshold;
		this.pThreshold = pThreshold;
		this.theta = theta;
		this.threadCount = threadCount;
		threadArr = new Array[MAGThread](threadCount);
	}
	
	public def run(var randomSeed:Int):MAGResult{
		var result1:MAGResult = new MAGResult();
		val region = (0..nVertices)*(0..nAttributes);
		var nodesAttribs:Array[Byte] = new Array[Byte](region, (p:Point(2))=> 1 as Byte);
		
			//new Array[Array[Byte]](nVertices)(nAttributes);
		//stkEdges = new Stack<int[]>();
		//float[][] result = new float[nVertices][nVertices];
		var ran:Random = new Random(randomSeed);	//We can provide a particular random seed value at the begining of the execution so that we can maintain the same level of repeatability across the experiments.
				
		for(i in 0..(nVertices-1)){
			for(j in 0..(nAttributes-1)){
				nodesAttribs(i,j) = (ran.nextInt(100) > attribThreshold ? 1 : 0) as Byte;
				
				//System.out.println("nodesAttribs[" + i + "][" + j + "] : " + nodesAttribs[i][j]);
			}
			
//			for(int k = 0; k < nVertices; k++){
//				result[i][k] = 1;
//			}
		}
		
		var factor:Double =  Math.round(nVertices/threadCount);
		var start:Int = 0;
		var end:Int = factor as Int;
		for(i in 0..(threadCount-1)){
			threadArr(i) = new MAGThread(nVertices, nAttributes, nodesAttribs, theta, pThreshold, start, end);
			threadArr(i).start();
			start = end;
			end += factor;
		}
		
		for(i in 0..(threadCount-1)){
			try {
				threadArr(i).join();
			} catch (var e:java.lang.InterruptedException) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(i in 0..(threadCount-1)){
			nEdges += threadArr(i).getNEdges();
		}
		
		/*
		for(int i = 0; i < nVertices; i++){
			for(int j = 0; j < nVertices; j++){
				result = 1.0f;
				for(int k = 0; k < nAttributes; k++){
					if(nodesAttribs[i][k] == nodesAttribs[j][k]){
						if(nodesAttribs[i][k] == 0){
							result = result * theta[0]; 
						}else{
							result = result * theta[3]; 
						}
					}else{
						if((nodesAttribs[i][k] == 0)&&(nodesAttribs[j][k] == 1)){
							result = result * theta[1]; 
						}else if((nodesAttribs[i][k] == 1)&&(nodesAttribs[j][k] == 0)){
							result = result * theta[2]; 
						}
					}
				}
				
				//From this point onwards we move on to a different pair of vertices. Therefore we should be able to determine whether there is an edge
				//between the current pair of vertices.
				if(result >  pThreshold){
					//result = 1;
					
					stkEdges.push(new int[]{i,j});
					
					nEdges++;
				}
//				}else{
//					result = 0;
//				}
			}
		}
		*/
		
		result1.nodesAttribs = nodesAttribs;
		result1.edges = threadArr;
		
		return result1;
	}
	
	public def getEntityCount():Long{
		return (nVertices + nEdges) as Long;
	}
}
