package org.xgdbench.generator;

import x10.util.HashMap;
import x10.util.ArrayList;
import x10.util.Set;

import java.util.Random;




public class MAGIncremental {
	private var pThreshold:Float;
	private var affinityMatrix:Array[Float] = null;
	private var vertexAttribs:HashMap[Int,Array[Int]];
	private var attribCount:Int;
	var attribThreshold:Int = 40;
	
	public def this(var aff:Array[Float], var vertexAttribs:HashMap[Int,Array[Int]], var pThreshold:Float, var attribCount:Int){
		affinityMatrix = aff;
		this.vertexAttribs = vertexAttribs;
		this.pThreshold = pThreshold;
		this.attribCount = attribCount;
	}
	
	public def setVerticesAndAttributes(var vertexAttribs:HashMap[Int,Array[Int]]):void{
		this.vertexAttribs = vertexAttribs;
	}
	
	public def getListOfVerticesToConnectWith(var vertID:Long):Vertex{
		var out:Vertex = new Vertex();
		var values:Array[Int] = getRandomUserOptions();
				
		var result:ArrayList[Int] = new ArrayList[Int]();
		var items:Set[Int] = vertexAttribs.keySet();
		var itr:Iterator[Int] = items.iterator();
		var key:Int = -1;
		var p:Float = 1;
		var params:Array[Int] = null;
		
		while(itr.hasNext()){
			key = itr.next();
			params = vertexAttribs.get(key).value as Array[Int];
						
			for(i in 0..(params.size-1)){
				if((params(i) == values(i))&&(params(i) == 0)){
					p = p * affinityMatrix(0);
				}
				
				if((params(i) != values(i))){
					p = p * affinityMatrix(1);
				}
				
				if((params(i) == values(i))&&(params(i) == 1)){
					p = p * affinityMatrix(3);
				}
			}
						
			if(p > pThreshold){
				result.add(key);
			}
			
			p = 1;//reset p
		}
		
		var itr2:Iterator[Int] = result.iterator();
		var endRes:Array[Int] = new Array[Int](result.size());
		var counter:Int = 0;
		
		while(itr2.hasNext()){
			endRes(counter) = itr2.next();
			counter++;
		}
		
		out.attribs = values;
		out.neighbours = endRes;
		out.pername = vertID;
		
		return out;
	}
	
	public def getRandomUserOptions():Array[Int]{
		var result:Array[Int] = new Array[Int](attribCount);
		
		var rnd:Random = new Random(System.currentTimeMillis());
		
		for(i in 0..(attribCount -1)){
			result(i) = rnd.nextInt(100) > attribThreshold ? 1:0;
		}
		
		return result;
	}
	
}
