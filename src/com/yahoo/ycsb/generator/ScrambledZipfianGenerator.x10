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

import com.yahoo.ycsb.Utils;

/**
 * A generator of a zipfian distribution. It produces a sequence of items, such that some items are more popular than others, according
 * to a zipfian distribution. When you construct an instance of this class, you specify the number of items in the set to draw from, either
 * by specifying an itemcount (so that the sequence is of items from 0 to itemcount-1) or by specifying a min and a max (so that the sequence is of 
 * items from min to max inclusive). After you construct the instance, you can change the number of items by calling nextInt(itemcount) or nextLong(itemcount).
 * 
 * Unlike @ZipfianGenerator, this class scatters the "popular" items across the itemspace. Use this, instead of @ZipfianGenerator, if you
 * don't want the head of the distribution (the popular items) clustered together.
 */
public class ScrambledZipfianGenerator extends IntegerGenerator 
{
	public static val ZETAN:Double=52.93805640344461;
	public static val ITEM_COUNT:Long=10000000000L;
	
	var gen:ZipfianGenerator;
	var _min:Long,_max:Long,_itemcount:Long;
	
	/******************************* Constructors **************************************/

	/**
	 * Create a zipfian generator for the specified number of items.
	 * @param _items The number of items in the distribution.
	 */
	public def this(var _items:Long)
	{
		this(0l,_items-1);
	}

	/**
	 * Create a zipfian generator for items between min and max.
	 * @param _min The smallest Int to generate in the sequence.
	 * @param _max The largest Int to generate in the sequence.
	 */
	public def this(var _min:Long, var _max:Long)
	{
		this(_min,_max,ZipfianGenerator.ZIPFIAN_CONSTANT);
	}

	/**
	 * Create a zipfian generator for the specified number of items using the specified zipfian constant.
	 * 
	 * @param _items The number of items in the distribution.
	 * @param _zipfianconstant The zipfian constant to use.
	 */
	/*
// not supported, as the value of zeta depends on the zipfian constant, and we have only precomputed zeta for one zipfian constant
	public ScrambledZipfianGenerator(Long _items, double _zipfianconstant)
	{
		this(0,_items-1,_zipfianconstant);
	}
*/
	
	/**
	 * Create a zipfian generator for items between min and max (inclusive) for the specified zipfian constant.
	 * @param min The smallest Int to generate in the sequence.
	 * @param max The largest Int to generate in the sequence.
	 * @param _zipfianconstant The zipfian constant to use.
	 */
	def this(var min:Long, var max:Long, var _zipfianconstant:Double)
	{
		//not public as we only support one value of zipfianconstant for which we have precomputed zeta
		_min=min;
		_max=max;
		_itemcount=_max-_min+1;
		gen=new ZipfianGenerator(0,ITEM_COUNT,_zipfianconstant,ZETAN);
	}
	
	/**************************************************************************************************/
	
	/**
	 * Return the next Int in the sequence.
	 */
	//@Override
	public def nextInt():Int {
		return nextLong() as Int;
	}

	/**
	 * Return the next Long in the sequence.
	 */
	public def nextLong():Long
	{
		var ret:Long=gen.nextLong();
		ret=_min+Utils.FNVhash64(ret)%_itemcount;
		setLastInt(ret as Int);
		return ret;
	}
	
	public def gotNextEdge():Boolean{
		return false;
	}
	
	public static def main(var args:Array[String]):void
	{
		var gen:ScrambledZipfianGenerator=new ScrambledZipfianGenerator(10000);
		
		for (i in 0..(1000000 - 1))
		{
			Console.OUT.println(""+gen.nextInt());
		}
	}
}
