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
import java.lang.Throwable;

/**
 * Something bad happened while Interacting with the database.
 */
public class DBException extends Exception
{
      /**
	 * 
	 */
	private static val serialVersionUID:Long = 6646883591588721475L;

	public def this(var message:String) 
      {
	 	super(message);
      }
      
      public def this()
      {
	 	super();
      }

     //  public def this(var message:String, var cause:Throwable)
     //  {
	    // super(message,cause);
     //  }
      
     //  public def this(var cause:Throwable)
     //  {
	    // super(cause);
     //  }      
}
