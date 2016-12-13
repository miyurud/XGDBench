/**                                                                                                                                                                                
 * Copyright (c) 2010 Yahoo! Inc. All rights reserved.                                                                                                                             
 *                                                                                                                                                                                 
 * Licensed under the Apache License, Version 2.0 (the "License"); you                                                                                                             
 * may not use this file except in compliance with the License. You                                                                                                                
 * may obtain a copy of the License at                                                                                                                                             
 *                                                                                                                                                                                 
 * http://www.apache.org/licenses/LICENSE-2.0                                                                                                                                      
 *                                                                                                                                                                                 
 * Unless required by applicable law or agreed to in writing, software                                                                                                             
 * distributed under the License is distributed on an "AS IS" BASIS,                                                                                                               
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or                                                                                                                 
 * implied. See the License for the specific language governing                                                                                                                    
 * permissions and limitations under the License. See accompanying                                                                                                                 
 * LICENSE file.                                                                                                                                                                   
 */

package com.yahoo.ycsb.generator;

/**
 * Generate a popularity distribution of items, skewed to favor recent items significantly more than older items.
 */
public class SkewedLatestGenerator extends IntegerGenerator
{
	var _basis:CounterGenerator;
	var _zipfian:ZipfianGenerator;

	public def this(var basis:CounterGenerator)
	{
		_basis=basis;
		_zipfian=new ZipfianGenerator(Int.parseInt(_basis.lastString()));
		//+Miyuru:The following line is comemnted for the moment
		//nextInt();
	}

	/**
	 * Generate the next string in the distribution, skewed Zipfian favoring the items most recently returned by the basis generator.
	 */
	public def nextInt():Int
	{
		var max:Int=Int.parseInt(_basis.lastString());
		var nextInt:Int=max-_zipfian.nextInt(max);
		setLastInt(nextInt);
		return nextInt;
	}

	public static def main(var args:Array[String]):void
	{
		var gen:SkewedLatestGenerator=new SkewedLatestGenerator(new CounterGenerator(1000));
		val len = Int.parseInt(args(0));
		for (i in 0..(len-1))
		{
			Console.OUT.println(gen.nextString());
		}

	}
	
	public def gotNextEdge():Boolean{
		return false;
	}

}
