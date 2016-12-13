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

import x10.util.ArrayList;
import x10.util.Set;
import x10.util.HashMap;

import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import com.yahoo.ycsb.measurements.Measurements;

/**
 * Wrapper around a "real" DB that measures latencies and counts return codes.
 */
public class DBWrapper extends DB
{
	var _db:DB;
	var _measurements:Measurements;

	public def this(var db:DB)
	{
		_db=db;
		_measurements=Measurements.getMeasurements();
	}

	/**
	 * Set the properties for this DB.
	 */
	public def setProperties(var p:Properties):void
	{
		_db.setProperties(p);
	}

	//Just implement
	public def insertEdge(var table:String, var key:String, var values:HashMap[String,String]):Int{
		var res:Int=_db.insertEdge(table, key, values);
		return res;
	}
	
//	public Int traverse(String stringVertex){
//		Int res=_db.traverse(stringVertex);
//		return res;
//	}
	
	/**
	 * Get the set of properties for this DB.
	 */
	public def getProperties():Properties
	{
		return _db.getProperties();
	}

	/**
	 * Initialize any state for this DB.
	 * Called once per DB instance; there is one DB instance per client thread.
	 */
	public def init() throws DBException : void
	{
		_db.init();
	}

	/**
	 * Cleanup any state for this DB.
	 * Called once per DB instance; there is one DB instance per client thread.
	 */
	public def cleanup() throws DBException : void
	{
		_db.cleanup();
	}

	/**
	 * Read a record from the database. Each field/value pair from the result will be stored in a HashMap.
	 *
	 * @param table The name of the table
	 * @param key The record key of the record to read.
	 * @param fields The list of fields to read, or null for all of them
	 * @param result A HashMap of field/value pairs for the result
	 * @return Zero on success, a non-zero error code on error
	 */
	public def read(var table:String, var key:String, var fields:Set[String], var result:HashMap[String,String]):Int
	{
		var st:Long=System.currentTimeMillis();
		var res:Int=_db.read(table,key,fields,result);
		var en:Long=System.currentTimeMillis();
		_measurements.measure("READ",(en-st) as Int);
		_measurements.reportReturnCode("READ",res);
		return res;
	}

	/**
	 * Perform a range scan for a set of records in the database. Each field/value pair from the result will be stored in a HashMap.
	 *
	 * @param table The name of the table
	 * @param startkey The record key of the first record to read.
	 * @param recordcount The number of records to read
	 * @param fields The list of fields to read, or null for all of them
	 * @param result A Vector of HashMaps, where each HashMap is a set field/value pairs for one record
	 * @return Zero on success, a non-zero error code on error
	 */
	public def scan(var table:String, var startkey:String, var recordcount:Int, var fields:Set[String], var result:ArrayList[HashMap[String,String]]):Int
	{
		var st:Long=System.currentTimeMillis();
		var res:Int=_db.scan(table,startkey,recordcount,fields,result);
		var en:Long=System.currentTimeMillis();
		_measurements.measure("SCAN",(en-st) as Int);
		_measurements.reportReturnCode("SCAN",res);
		return res;
	}
	
	/**
	 * Update a record in the database. Any field/value pairs in the specified values HashMap will be written Into the record with the specified
	 * record key, overwriting any existing values with the same field name.
	 *
	 * @param table The name of the table
	 * @param key The record key of the record to write.
	 * @param values A HashMap of field/value pairs to update in the record
	 * @return Zero on success, a non-zero error code on error
	 */
	public def update(var table:String, var key:String, var values:HashMap[String,String]):Int
	{
		var st:Long=System.currentTimeMillis();
		var res:Int=_db.update(table,key,values);
		var en:Long=System.currentTimeMillis();
		_measurements.measure("UPDATE",(en-st) as Int);
		_measurements.reportReturnCode("UPDATE",res);
		return res;
	}

	/**
	 * Insert a record in the database. Any field/value pairs in the specified values HashMap will be written Into the record with the specified
	 * record key.
	 *
	 * @param table The name of the table
	 * @param key The record key of the record to insert.
	 * @param values A HashMap of field/value pairs to insert in the record
	 * @return Zero on success, a non-zero error code on error
	 */
	public def insert(var table:String, var key:String, var values:HashMap[String,String]):Int
	{
		var st:Long=System.currentTimeMillis();
		var res:Int=_db.insert(table,key,values);
		var en:Long=System.currentTimeMillis();		
		
		_measurements.measure("INSERT",(en-st) as Int);
		_measurements.reportReturnCode("INSERT",res);
		return res;
	}

	/**
	 * Delete a record from the database. 
	 *
	 * @param table The name of the table
	 * @param key The record key of the record to delete.
	 * @return Zero on success, a non-zero error code on error
	 */
	public def delete(var table:String, var key:String):Int
	{
		var st:Long=System.currentTimeMillis();
		var res:Int=_db.delete(table,key);
		var en:Long=System.currentTimeMillis();
		_measurements.measure("DELETE",(en-st) as Int);
		_measurements.reportReturnCode("DELETE",res);
		return res;
	}

	//@Override
	public def traverse(var startkey:String, var recordcount:Int, var result:ArrayList[String]):Int {
		var st:Long=System.currentTimeMillis();
		var res:Int=_db.traverse(startkey, recordcount, result);
		var en:Long=System.currentTimeMillis();
		_measurements.measure("TRAVERSE",(en-st) as Int);
		_measurements.reportReturnCode("TRAVERSE",res);
		return 0;
	}
}
