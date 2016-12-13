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

/**
 * Could not create the specified DB.
 */
public class UnknownDBException extends x10.lang.Exception
{
      /**
	 * 
	 */
	private static val serialVersionUID:Long = 459099842269616836L;

	public def this(var message:String) 
      {
	 	super(message);
      }
      
      public def this()
      {
	 	super();
      }

      /*
      public def this(var message:String, var cause:java.lang.Throwable)
      {
	 	super(message,cause);
      }
      
      public def this(var cause:java.lang.Throwable)
      {
	 	super(cause);
      }
      */
}
