package org.xgdbench.generator;

import x10.util.Stack;

public class MAGThread extends java.lang.Thread{
	private var nVertices:Int;
	private var nAttributes:Int;
	private var nodesAttribs:Array[Byte];
	private var result:Float;
	private var theta:Array[Float];
	private var pThreshold:Float;
	public var stkEdges:Stack[Array[Int]];
	private var nEdges:Int;
	private var startI:Int;
	private var endI:Int;
	
	public def this(var nVertices:Int, var nAttributes:Int, var nodesAttribs:Array[Byte], var theta:Array[Float], var pThreshold:Float, var startI:Int, var endI:Int){
		this.nVertices = nVertices;
		this.nAttributes = nAttributes;
		this.nodesAttribs = nodesAttribs;
		this.theta = theta;
		this.pThreshold = pThreshold;
		this.startI = startI;
		this.endI = endI;
		stkEdges= new Stack[Array[Int]]();
		
//		for(int j = 0; j < nVertices; j++){
//			for(int k = 0; k < nAttributes; k++){
//				System.out.print("" + nodesAttribs[j][k] + ",");
//			}
//			System.out.println();
//		}	
	}
	
	public def getNEdges():Int{
		return nEdges;
	}
	
	public def hasNextEdge():Boolean{
		if(stkEdges.size() > 0){
			return true;
		}else{
			return false;
		}
	}
	
	public def nextEdge():Array[Int]{
		return stkEdges.pop();
	}
	
	public def run():void{
		for(i in startI..(endI-1)){
			for( j in 0..(nVertices-1)){
				result = 1.0f;
				for( k in 0..(nAttributes-1)){
					if(nodesAttribs(i,k) == nodesAttribs(j,k)){
						if(nodesAttribs(i,k) as Int == 0){
							result = result * theta(0); 
						}else{
							result = result * theta(3); 
						}
					}else{
						if((nodesAttribs(i,k) as Int == 0)&&(nodesAttribs(j,k) as Int == 1)){
							result = result * theta(1); 
						}else if((nodesAttribs(i,k) as Int == 1)&&(nodesAttribs(j,k) as Int == 0)){
							result = result * theta(2); 
						}
					}
				}
				
				//From this point onwards we move on to a different pair of vertices. Therefore we should be able to determine whether there is an edge
				//between the current pair of vertices.
				if(result >  pThreshold){
					// var arr:Array[Int] = new Array[Int](2);
					// arr(0) = i;
					// arr(1) = j;
					// stkEdges.push(arr);
					
					var arr:Array[Int](1) = [i,j]; 
					stkEdges.push(arr);
					
					nEdges++;
				}
			}
		}
	}
}
