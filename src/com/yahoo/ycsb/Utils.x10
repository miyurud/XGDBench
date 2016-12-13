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

package com.yahoo.ycsb;

import x10.util.Random;

/**
 * Utility functions.
 */
public class Utils
{
	static val random:Random=new Random();
	
      /**
       * Generate a random ASCII string of a given length.
       */
      public static def ASCIIString(var length:Int):String
      {
		 var Interval:Int='~'-' '+1;
		
	        var buf:Array[Byte] = new Array[Byte](length);
	        random.nextBytes(buf);
	        for (i in 0..(length-1)) {
	          if (buf(i) < 0) {
	            buf(i) = Byte.parse("" + ((-buf(i) % Interval) + ' '));
	          } else {
	            buf(i) = Byte.parse("" + ((buf(i) % Interval) + ' '));
	          }
	        }
	        return new String(buf);
      }
      
      /**
       * Hash an Int value.
       */
      public static def hash(var value:Int):Int
      {
	 	return FNVhash32(value);
      }
	
      public static val FNV_offset_basis_32:Int=0x811c9dc5;
      public static val FNV_prime_32:Int=16777619;
      
      /**
       * 32 bit FNV hash. Produces more "random" hashes than (say) String.hashCode().
       * 
       * @param val The value to hash.
       * @return The hash value
       */
      public static def FNVhash32(var value:Int):Int
      {
		 //from http://en.wikipedia.org/wiki/Fowler_Noll_Vo_hash
		 var hashval:Int = FNV_offset_basis_32;
		 
		 for (i in 0..(3))
		 {
		    var octet:Int=value&0x00ff;
		    value=value>>8;
		    
		    hashval = hashval ^ octet;
		    hashval = hashval * FNV_prime_32;
		    //hashval = hashval ^ octet;
		 }
		 return Math.abs(hashval);
      }
      
      public static val FNV_offset_basis_64:Long=0xCBF29CE484222325L;
      public static val FNV_prime_64:Long=1099511628211L;
      
      /**
       * 64 bit FNV hash. Produces more "random" hashes than (say) String.hashCode().
       * 
       * @param val The value to hash.
       * @return The hash value
       */
      public static def FNVhash64(var value:Long):Long
      {
		 //from http://en.wikipedia.org/wiki/Fowler_Noll_Vo_hash
		 var hashval:Long = FNV_offset_basis_64;
		 
		 for (i in 0..7)
		 {
		    var octet:Long=value&0x00ff;
		    value=value>>8;
		    
		    hashval = hashval ^ octet;
		    hashval = hashval * FNV_prime_64;
		    //hashval = hashval ^ octet;
		 }
		 return Math.abs(hashval);
      }
}
