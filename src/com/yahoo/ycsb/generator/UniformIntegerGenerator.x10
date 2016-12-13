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

import x10.util.Random;

/**
 * Generates Ints randomly uniform from an Interval.
 */
public class UniformIntegerGenerator extends IntegerGenerator 
{
	var _random:Random;
	var _lb:Int,_ub:Int,_Interval:Int;
	
	/**
	 * Creates a generator that will return Ints uniformly randomly from the Interval [lb,ub] inclusive (that is, lb and ub are possible values)
	 *
	 * @param lb the lower bound (inclusive) of generated values
	 * @param ub the upper bound (inclusive) of generated values
	 */
	public def this(var lb:Int, var ub:Int)
	{
		_random=new Random();
		_lb=lb;
		_ub=ub;
		_Interval=_ub-_lb+1;
	}
	
	//@Override
	public def nextInt():Int 
	{
		var ret:Int=_random.nextInt(_Interval)+_lb;
		setLastInt(ret);
		
		return ret;
	}
	
	//Just implement
	public def gotNextEdge():Boolean{
		return false;
	}

}
