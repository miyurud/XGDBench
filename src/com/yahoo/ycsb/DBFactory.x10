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

import java.util.Properties;

import org.xgdbench.TitanClient;

/**
 * Creates a DB layer by dynamically classloading the specified DB class.
 */
public class DBFactory
{
      //@SuppressWarnings("unchecked")
	public static def newDB(var dbname:String, var properties:Properties) throws UnknownDBException:DB
      {
	 //var classLoader:java.lang.ClassLoader = DBFactory.class.getClassLoader();
		var classLoader:java.lang.ClassLoader = null;

	 var ret:DB=null;

	 //+Miyuru : For the moment we initialize with TitanClient
	 ret = new TitanClient();
	 /*
	 try 
	 {
	    var dbclass:java.lang.Class = classLoader.loadClass(dbname);
	    //Console.OUT.println("dbclass.getName() = " + dbclass.getName());
	    
	    ret=dbclass.newInstance() as DB;
	 }
	 catch (var ex:java.lang.ClassNotFoundException) 
	 {  
		 ex.printStackTrace();
		 //e.printStackTrace(System.out);
		 //System.exit(0);
	 }
	 catch (var ec:java.lang.IllegalAccessException) 
	 {  
		 ec.printStackTrace();
		 //e.printStackTrace(System.out);
		 //System.exit(0);
	 }catch (var eb:java.lang.InstantiationException) 
	 {  
		 eb.printStackTrace();
		 //e.printStackTrace(System.out);
		 //System.exit(0);
	 }
	 */
	 ret.setProperties(properties);

	 return new DBWrapper(ret);
    }
      
}
