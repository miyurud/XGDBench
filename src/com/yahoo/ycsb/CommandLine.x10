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

import x10.util.Set;
import x10.util.Map;
import x10.util.HashMap;
import x10.util.HashSet;
import x10.util.ArrayList;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Vector;

import org.xgdbench.TitanClient;

import com.yahoo.ycsb.workloads.*;

/**
 * A simple command line client to a database, using the appropriate com.yahoo.ycsb.DB implementation.
 */
public class CommandLine
{
      public static val DEFAULT_DB:String="com.yahoo.ycsb.BasicDB";

      public static def usageMessage():void
      {
		 Console.OUT.println("YCSB Command Line Client");
		 Console.OUT.println("Usage: java com.yahoo.ycsb.CommandLine [options]");
		 Console.OUT.println("Options:");
		 Console.OUT.println("  -P filename: Specify a property file");
		 Console.OUT.println("  -p name=value: Specify a property value");
		 Console.OUT.println("  -db classname: Use a specified DB class (can also set the \"db\" property)");
		 Console.OUT.println("  -table tablename: Use the table name instead of the default \""+CoreWorkload.TABLENAME_PROPERTY_DEFAULT+"\"");
		 Console.OUT.println();
      }

      public static def help():void
      {
		 Console.OUT.println("Commands:");
		 Console.OUT.println("  read key [field1 field2 ...] - Read a record");
		 Console.OUT.println("  scan key recordcount [field1 field2 ...] - Scan starting at key");
		 Console.OUT.println("  insert key name1=value1 [name2=value2 ...] - Insert a new record");
		 Console.OUT.println("  update key name1=value1 [name2=value2 ...] - Update a record");
		 Console.OUT.println("  delete key - Delete a record");
		 Console.OUT.println("  table [tablename] - Get or [set] the name of the table");
		 Console.OUT.println("  quit - Quit");
      }
      
      public static def main(var args:Array[String]):void
      {
	 var argindex:Int=0;

	 var props:Properties=new Properties();
	 var fileprops:Properties=new Properties();
	 var table:String=CoreWorkload.TABLENAME_PROPERTY_DEFAULT;

	 while ( (argindex<args.size) && (args(argindex).startsWith("-")) )
	 {
	    if ( (args(argindex).indexOf("-help")!=-1) ||
		 (args(argindex).indexOf("--help")!=-1) ||
		 (args(argindex).indexOf("-?")!=-1) ||
		 (args(argindex).indexOf("--?")!=-1) )
	    {
	       usageMessage();
	       return;
	    }

	    if (args(argindex).indexOf("-db")!=-1)
	    {
	       argindex++;
	       if (argindex>=args.size)
	       {
			  usageMessage();
			  return;
	       }
	       props.setProperty("db",args(argindex));
	       argindex++;
	    }
	    else if (args(argindex).indexOf("-P")!=-1)
	    {
	       argindex++;
	       if (argindex>=args.size)
	       {
		  	usageMessage();
		  	return;
	       }
	       var propfile:String=args(argindex);
	       argindex++;
	       
	       var myfileprops:Properties=new Properties();
	       try
	       {
		  		myfileprops.load(new java.io.FileInputStream(propfile));
	       }
	       catch (var e:java.io.IOException)
	       {
		  Console.OUT.println(e.getMessage());
		  return;
	       }
	       
	       var e:java.util.Enumeration=myfileprops.propertyNames();
	       while ( e.hasMoreElements() )
	       {
		  	var prop:String=e.nextElement() as String;
		  
		  	fileprops.setProperty(prop,myfileprops.getProperty(prop));
	       }
	       
	    }
	    else if (args(argindex).indexOf("-p")!=-1)
	    {
	       argindex++;
	       if (argindex>=args.size)
	       {
			  usageMessage();
			  return;
	       }
	       var eq:Int=args(argindex).indexOf('=');
	       if (eq<0)
	       {
		  	usageMessage();
		  	return;
	       }
			   
	       var name:String=args(argindex).substring(0,eq);
	       var value:String=args(argindex).substring(eq+1);
	       props.put(name,value);
	       //Console.OUT.println("["+name+"]=["+value+"]");
	       argindex++;
	    }
	    else if (args(argindex).indexOf("-table")!=-1)
	    {
	       argindex++;
	       if (argindex>=args.size)
	       {
			  usageMessage();
			  return;
	       }
	       table=args(argindex);
	       argindex++;
	    }  
	    else
	    {
	       Console.OUT.println("Unknown option "+args(argindex));
	       usageMessage();
	       return;
	    }

	    if (argindex>=args.size)
	    {
	       break;
	    }
	 }

	 if (argindex!=args.size)
	 {
	    usageMessage();
	    return;
	 }

	 var e:Enumeration=props.propertyNames();
	 while ( e.hasMoreElements() )
	 {
	    var prop:String=e.nextElement() as String;
	    
	    fileprops.setProperty(prop,props.getProperty(prop));
	 }
	 
	 props=fileprops;

	 Console.OUT.println("YCSB Command Line client");
	 Console.OUT.println("Type \"help\" for command line help");
	 Console.OUT.println("Start with \"-help\" for usage info");

	 //create a DB
	 var dbname:String=props.getProperty("db",DEFAULT_DB);

	 //var classLoader:java.lang.ClassLoader = null;CommandLine.class.getClassLoader();
	 var classLoader:java.lang.ClassLoader = null;

	 var db:DB=null;

	 //+Miyuru : Here we assume that we are dealing with Titan. This assumption is made only for the moment.
	 
	 /*
	 try 
	 {
	    var dbclass:java.lang.Class = classLoader.loadClass(dbname);
	    db=dbclass.newInstance() as DB;
	 }
	 catch (var ex:java.lang.ClassNotFoundException) 
	 {  
		 ex.printStackTrace();
		 //e.printStackTrace(System.out);
		 //System.exit(0);
		 return;
	 }catch (var ec:java.lang.IllegalAccessException) 
	 {  
		 ec.printStackTrace();
		 //e.printStackTrace(System.out);
		 //System.exit(0);
		 return;
	 }catch (var eb:java.lang.InstantiationException) 
	 {  
		 eb.printStackTrace();
		 //e.printStackTrace(System.out);
		 //System.exit(0);
		 return;
	 }
	 
	  */
	 
	 db = new TitanClient();
	 
	 db.setProperties(props);
	 try
	 {
		 Console.OUT.println("--------------6");
	    db.init();
	    Console.OUT.println("--------------8");
	 }
	 catch (var et:DBException)
	 {
		Console.OUT.println("--------------9");
	    et.printStackTrace();
	    return;
	 }

	 Console.OUT.println("Connected.");
	 
	 //main loop
	 //var br:x10.io.InputStreamReader = new x10.io.InputStreamReader(Console.IN);

	 while (true)
	 {
	    //get user input
	    Console.OUT.print("> ");
	    
	    var input:String=null;
	    
        input=Console.IN.readLine();


	    if (input.compareTo("")==0) 
	    {
	       continue;
	    }

	    if (input.compareTo("help")==0) 
	    {
	       help();
	       continue;
	    }

	    if (input.compareTo("quit")==0)
	    {
	       break;
	    }
	    
	    var tokens:Array[String]=input.split(" ");
	    
	    var st:Long=System.currentTimeMillis();
	    //handle commands
	    if (tokens(0).compareTo("table")==0)
	    {
	       if (tokens.size==1)
	       {
		  	Console.OUT.println("Using table \""+table+"\"");
	       }
	       else if (tokens.size==2)
	       {
		  	table=tokens(1);
		  	Console.OUT.println("Using table \""+table+"\"");
	       }
	       else
	       {
		  	Console.OUT.println("Error: syntax is \"table tablename\"");
	       }
	    }
	    else if (tokens(0).compareTo("read")==0)
	    {
	       if (tokens.size==1)
	       {
		  	Console.OUT.println("Error: syntax is \"read keyname [field1 field2 ...]\"");
	       }
	       else 
	       {
	    	  var fields:Set[String]=null;

			  if (tokens.size>2)
			  {
			     fields=new HashSet[String]();
			     
			     for (i in 2..(tokens.size-1))
			     {
					fields.add(tokens(i));
			     }
			  }
		  
			  var result:HashMap[String,String]=new HashMap[String,String]();
			  var ret:Int=db.read(table,tokens(1),fields,result);
			  Console.OUT.println("Return code: "+ret);
			  
			  var it:Iterator[Map.Entry[String, String]] = result.entries().iterator() as Iterator[Map.Entry[String, String]];
			  while(it.hasNext())
			  {
				  var pairs:Map.Entry[String, String] = it.next() as Map.Entry[String, String];
				  Console.OUT.println(pairs.getKey()+"="+pairs.getValue());
			  }
	       }		  
	    }
	    else if (tokens(0).compareTo("scan")==0)
	    {
	       if (tokens.size<3)
	       {
		   		Console.OUT.println("Error: syntax is \"scan keyname scanlength [field1 field2 ...]\"");
	       }
	       else 
	       {
			  	var fields:Set[String]=null;
	
			    if (tokens.size>3)
			    {
			     fields=new HashSet[String]();
			     
			     for ( i in (3..(tokens.size-1)))
			     {
					fields.add(tokens(i));
			     }
			    }
		  
				  var results:ArrayList[HashMap[String,String]]=new ArrayList[HashMap[String,String]]();
				  var ret:Int=db.scan(table,tokens(1),Int.parseInt(tokens(2)),fields,results);
				  Console.OUT.println("Return code: "+ret);
				  var record:Int=0;
				  
				  if (results.size()==0)
				  {
				     Console.OUT.println("0 records");
				  }
				  else
				  {
				     Console.OUT.println("--------------------------------");
				  }
				  
				  for (val result:HashMap[String,String] in results){
					  var it:Iterator[Map.Entry[String, String]] = result.entries().iterator() as Iterator[Map.Entry[String, String]];
					  
					  while(it.hasNext()){
						  var pairs:Map.Entry[String, String] = it.next() as Map.Entry[String, String];
						  Console.OUT.println(pairs.getKey()+"="+pairs.getValue());
					  }
				  }
	    	}
	    }
	    else if (tokens(0).compareTo("update")==0)
	    {
	       if (tokens.size<3)
	       {
		  	Console.OUT.println("Error: syntax is \"update keyname name1=value1 [name2=value2 ...]\"");
	       }
	       else 
	       {
			  var values:HashMap[String,String]=new HashMap[String,String]();
	
			  for (i in 2..(tokens.size-1))
			  {
			     var nv:Array[String]=tokens(i).split("=");
			     values.put(nv(0),nv(1));
			  }
	
			  var ret:Int=db.update(table,tokens(1),values);
			  Console.OUT.println("Return code: "+ret);
	       }		  
	    }
	    else if (tokens(0).compareTo("insert")==0)
	    {
	       if (tokens.size<3)
	       {
		  	Console.OUT.println("Error: syntax is \"insert keyname name1=value1 [name2=value2 ...]\"");
	       }
	       else 
	       {
		  var values:HashMap[String,String]=new HashMap[String,String]();

		  for (i in 2..(tokens.size-1))
		  {
		     var nv:Array[String]=tokens(i).split("=");
		     values.put(nv(0),nv(1));
		  }

		  var ret:Int=db.insert(table,tokens(1),values);
		  Console.OUT.println("Return code: "+ret);
	       }		  
	    }
	    else if (tokens(0).compareTo("delete")==0)
	    {
	       if (tokens.size!=2)
	       {
		  	Console.OUT.println("Error: syntax is \"delete keyname\"");
	       }
	       else 
	       {
		  	var ret:Int=db.delete(table,tokens(1));
		  	Console.OUT.println("Return code: "+ret);
	       }		  
	    }
	    else
	    {
	       Console.OUT.println("Error: unknown command \""+tokens(0)+"\"");
	    }
	    
	    Console.OUT.println((System.currentTimeMillis()-st)+" ms");
	    
	 }
      }
      
}
