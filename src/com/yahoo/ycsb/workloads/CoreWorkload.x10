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

package com.yahoo.ycsb.workloads;

import java.util.Properties;
import com.yahoo.ycsb.*;
import com.yahoo.ycsb.generator.CounterGenerator;
import com.yahoo.ycsb.generator.DiscreteGenerator;
import com.yahoo.ycsb.generator.Generator;
import com.yahoo.ycsb.generator.IntegerGenerator;
import com.yahoo.ycsb.generator.ScrambledZipfianGenerator;
import com.yahoo.ycsb.generator.SkewedLatestGenerator;
import com.yahoo.ycsb.generator.UniformIntegerGenerator;
import com.yahoo.ycsb.generator.ZipfianGenerator;
import com.yahoo.ycsb.measurements.Measurements;

import x10.util.HashMap;
import x10.util.HashSet;
import x10.util.ArrayList;
import com.yahoo.ycsb.generator.UniformIntegerGenerator;

/**
 * The core benchmark scenario. Represents a set of clients doing simple CRUD operations. The relative 
 * proportion of different kinds of operations, and other properties of the workload, are controlled
 * by parameters specified at runtime.
 * 
 * Properties to control the client:
 * <UL>
 * <LI><b>fieldcount</b>: the number of fields in a record (default: 10)
 * <LI><b>fieldlength</b>: the size of each field (default: 100)
 * <LI><b>readallfields</b>: should reads read all fields (true) or just one (false) (default: true)
 * <LI><b>writeallfields</b>: should updates and read/modify/writes update all fields (true) or just one (false) (default: false)
 * <LI><b>readproportion</b>: what proportion of operations should be reads (default: 0.95)
 * <LI><b>updateproportion</b>: what proportion of operations should be updates (default: 0.05)
 * <LI><b>insertproportion</b>: what proportion of operations should be inserts (default: 0)
 * <LI><b>scanproportion</b>: what proportion of operations should be scans (default: 0)
 * <LI><b>readmodifywriteproportion</b>: what proportion of operations should be read a record, modify it, write it back (default: 0)
 * <LI><b>requestdistribution</b>: what distribution should be used to select the records to operate on - uniform, zipfian or latest (default: uniform)
 * <LI><b>maxscanlength</b>: for scans, what is the maximum number of records to scan (default: 1000)
 * <LI><b>scanlengthdistribution</b>: for scans, what distribution should be used to choose the number of records to scan, for each scan, between 1 and maxscanlength (default: uniform)
 * <LI><b>insertorder</b>: should records be inserted in order by key ("ordered"), or in hashed order ("hashed") (default: hashed)
 * </ul> 
 */
public class CoreWorkload extends Workload
{

	/**
	 * The name of the database table to run queries against.
	 */
	public static val TABLENAME_PROPERTY:String="table";

	/**
	 * The default name of the database table to run queries against.
	 */
	public static val TABLENAME_PROPERTY_DEFAULT:String="usertable";

	public var table:String;


	/**
	 * The name of the property for the number of fields in a record.
	 */
	public static val FIELD_COUNT_PROPERTY:String="fieldcount";
	
	/**
	 * Default number of fields in a record.
	 */
	public static val FIELD_COUNT_PROPERTY_DEFAULT:String="10";

	var fieldcount:Int;

	/**
	 * The name of the property for the length of a field in bytes.
	 */
	public static val FIELD_LENGTH_PROPERTY:String="fieldlength";
	
	/**
	 * The default length of a field in bytes.
	 */
	public static val FIELD_LENGTH_PROPERTY_DEFAULT:String="100";

	var fieldlength:Int;

	/**
	 * The name of the property for deciding whether to read one field (false) or all fields (true) of a record.
	 */
	public static val READ_ALL_FIELDS_PROPERTY:String="readallfields";
	
	/**
	 * The default value for the readallfields property.
	 */
	public static val READ_ALL_FIELDS_PROPERTY_DEFAULT:String="true";

	var readallfields:Boolean;

	/**
	 * The name of the property for deciding whether to write one field (false) or all fields (true) of a record.
	 */
	public static val WRITE_ALL_FIELDS_PROPERTY:String="writeallfields";
	
	/**
	 * The default value for the writeallfields property.
	 */
	public static val WRITE_ALL_FIELDS_PROPERTY_DEFAULT:String="false";

	var writeallfields:Boolean;


	/**
	 * The name of the property for the proportion of transactions that are reads.
	 */
	public static val READ_PROPORTION_PROPERTY:String="readproportion";
	
	/**
	 * The default proportion of transactions that are reads.	
	 */
	public static val READ_PROPORTION_PROPERTY_DEFAULT:String="0.95";

	/**
	 * The name of the property for the proportion of transactions that are updates.
	 */
	public static val UPDATE_PROPORTION_PROPERTY:String="updateproportion";
	
	/**
	 * The default proportion of transactions that are updates.
	 */
	public static val UPDATE_PROPORTION_PROPERTY_DEFAULT:String="0.05";

	/**
	 * The name of the property for the proportion of transactions that are inserts.
	 */
	public static val INSERT_PROPORTION_PROPERTY:String="insertproportion";
	
	/**
	 * The default proportion of transactions that are inserts.
	 */
	public static val INSERT_PROPORTION_PROPERTY_DEFAULT:String="0.0";

	/**
	 * The name of the property for the proportion of transactions that are scans.
	 */
	public static val SCAN_PROPORTION_PROPERTY:String="scanproportion";
	
	/**
	 * The default proportion of transactions that are scans.
	 */
	public static val SCAN_PROPORTION_PROPERTY_DEFAULT:String="0.0";
	
	/**
	 * The name of the property for the proportion of transactions that are traverse operations.
	 */
	public static val TRAVERSE_PROPORTION_PROPERTY:String="traverseproportion";
	
	/**
	 * The default proportion of transactions that are traverse operations.
	 */
	public static val TRAVERSE_PROPORTION_PROPERTY_DEFAULT:String="0.0";
	
	/**
	 * The name of the property for the proportion of transactions that are read-modify-write.
	 */
	public static val READMODIFYWRITE_PROPORTION_PROPERTY:String="readmodifywriteproportion";
	
	/**
	 * The default proportion of transactions that are scans.
	 */
	public static val READMODIFYWRITE_PROPORTION_PROPERTY_DEFAULT:String="0.0";
	
	/**
	 * The name of the property for the the distribution of requests across the keyspace. Options are "uniform", "zipfian" and "latest"
	 */
	public static val REQUEST_DISTRIBUTION_PROPERTY:String="requestdistribution";
	
	/**
	 * The default distribution of requests across the keyspace
	 */
	public static val REQUEST_DISTRIBUTION_PROPERTY_DEFAULT:String="uniform";

	/**
	 * The name of the property for the max scan length (number of records)
	 */
	public static val MAX_SCAN_LENGTH_PROPERTY:String="maxscanlength";
	
	/**
	 * The default max scan length.
	 */
	public static val MAX_SCAN_LENGTH_PROPERTY_DEFAULT:String="1000";
	
	/**
	 * The name of the property for the scan length distribution. Options are "uniform" and "zipfian" (favoring short scans)
	 */
	public static val SCAN_LENGTH_DISTRIBUTION_PROPERTY:String="scanlengthdistribution";
	
	/**
	 * The default max scan length.
	 */
	public static val SCAN_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT:String="uniform";
	
	/**
	 * The name of the property for the traverse length distribution. Options are "uniform" and "zipfian" (favoring short traversals)
	 */
	public static val TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY:String="traverselengthdistribution";
	
	/**
	 * The default max scan length.
	 */
	public static val TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT:String="uniform";
	
	/**
	 * The name of the property for the order to insert records. Options are "ordered" or "hashed"
	 */
	public static val INSERT_ORDER_PROPERTY:String="insertorder";
	
	/**
	 * Default insert order.
	 */
	public static val INSERT_ORDER_PROPERTY_DEFAULT:String="hashed";
	
	//var keysequence:IntegerGenerator;
	var keysequence:CounterGenerator;

	var operationchooser:DiscreteGenerator;

	var keychooser:IntegerGenerator;

	var fieldchooser:Generator;

	var transactioninsertkeysequence:CounterGenerator;
	
	var scanlength:IntegerGenerator;
	
	var traverselength:IntegerGenerator;
	
	var orderedinserts:Boolean;

	var recordcount:Int;
	
	/**
	 * Initialize the scenario. 
	 * Called once, in the main client thread, before any operations are started.
	 */
	public def init(var p:Properties) throws WorkloadException:void
	{
		table = p.getProperty(TABLENAME_PROPERTY,TABLENAME_PROPERTY_DEFAULT);
		fieldcount=Int.parseInt(p.getProperty(FIELD_COUNT_PROPERTY,FIELD_COUNT_PROPERTY_DEFAULT));
		fieldlength=Int.parseInt(p.getProperty(FIELD_LENGTH_PROPERTY,FIELD_LENGTH_PROPERTY_DEFAULT));
		var readproportion:Double=Double.parseDouble(p.getProperty(READ_PROPORTION_PROPERTY,READ_PROPORTION_PROPERTY_DEFAULT));
		var updateproportion:Double=Double.parseDouble(p.getProperty(UPDATE_PROPORTION_PROPERTY,UPDATE_PROPORTION_PROPERTY_DEFAULT));
		var insertproportion:Double=Double.parseDouble(p.getProperty(INSERT_PROPORTION_PROPERTY,INSERT_PROPORTION_PROPERTY_DEFAULT));
		var scanproportion:Double=Double.parseDouble(p.getProperty(SCAN_PROPORTION_PROPERTY,SCAN_PROPORTION_PROPERTY_DEFAULT));
		var traverseproportion:Double=Double.parseDouble(p.getProperty(TRAVERSE_PROPORTION_PROPERTY,TRAVERSE_PROPORTION_PROPERTY_DEFAULT));
		var readmodifywriteproportion:Double=Double.parseDouble(p.getProperty(READMODIFYWRITE_PROPORTION_PROPERTY,READMODIFYWRITE_PROPORTION_PROPERTY_DEFAULT));
		recordcount=Int.parseInt(p.getProperty(Client.RECORD_COUNT_PROPERTY));
		var requestdistrib:String=p.getProperty(REQUEST_DISTRIBUTION_PROPERTY,REQUEST_DISTRIBUTION_PROPERTY_DEFAULT);
		var maxscanlength:Int=Int.parseInt(p.getProperty(MAX_SCAN_LENGTH_PROPERTY,MAX_SCAN_LENGTH_PROPERTY_DEFAULT));
		var scanlengthdistrib:String=p.getProperty(SCAN_LENGTH_DISTRIBUTION_PROPERTY,SCAN_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT);
		var traverselengthdistrib:String=p.getProperty(TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY,TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT);
		
		var insertstart:Int=Int.parseInt(p.getProperty(INSERT_START_PROPERTY,INSERT_START_PROPERTY_DEFAULT));
		
		readallfields=Boolean.parseBoolean(p.getProperty(READ_ALL_FIELDS_PROPERTY,READ_ALL_FIELDS_PROPERTY_DEFAULT));
		writeallfields=Boolean.parseBoolean(p.getProperty(WRITE_ALL_FIELDS_PROPERTY,WRITE_ALL_FIELDS_PROPERTY_DEFAULT));
		
		if (p.getProperty(INSERT_ORDER_PROPERTY,INSERT_ORDER_PROPERTY_DEFAULT).compareTo("hashed")==0)
		{
			orderedinserts=false;
		}
		else
		{
			orderedinserts=true;
		}

		keysequence=new CounterGenerator(insertstart);
		operationchooser=new DiscreteGenerator();
		if (readproportion>0)
		{
			operationchooser.addValue(readproportion,"READ");
		}

		if (updateproportion>0)
		{
			operationchooser.addValue(updateproportion,"UPDATE");
		}

		if (insertproportion>0)
		{
			operationchooser.addValue(insertproportion,"INSERT");
		}
		
		if (scanproportion>0)
		{
			operationchooser.addValue(scanproportion,"SCAN");
		}
		
		if(traverseproportion>0){
			operationchooser.addValue(traverseproportion, "TRAVERSE");
		}
		
		if (readmodifywriteproportion>0)
		{
			operationchooser.addValue(readmodifywriteproportion,"READMODIFYWRITE");
		}

		transactioninsertkeysequence=new CounterGenerator(recordcount);
		if (requestdistrib.compareTo("uniform")==0)
		{
			keychooser=new UniformIntegerGenerator(0,recordcount-1);
		}
		else if (requestdistrib.compareTo("zipfian")==0)
		{
			//it does this by generating a random "next key" in part by taking the modulus over the number of keys
			//if the number of keys changes, this would shift the modulus, and we don't want that to change which keys are popular
			//so we'll actually construct the scrambled zipfian generator with a keyspace that is larger than exists at the beginning
			//of the test. that is, we'll predict the number of inserts, and tell the scrambled zipfian generator the number of existing keys
			//plus the number of predicted keys as the total keyspace. then, if the generator picks a key that hasn't been inserted yet, will
			//just ignore it and pick another key. this way, the size of the keyspace doesn't change from the perspective of the scrambled zipfian generator
			
			var opcount:Int=Int.parseInt(p.getProperty(Client.OPERATION_COUNT_PROPERTY));
			var expectednewkeys:Int=((opcount as Double)*insertproportion*2.0) as Int; //2 is fudge factor
			
			keychooser=new ScrambledZipfianGenerator(recordcount+expectednewkeys);
		}
		else if (requestdistrib.compareTo("latest")==0)
		{
			keychooser=new SkewedLatestGenerator(transactioninsertkeysequence);
		}
		else
		{
			throw new WorkloadException("Unknown distribution \""+requestdistrib+"\"");
		}

		fieldchooser=new UniformIntegerGenerator(0,fieldcount-1);
		
		if (scanlengthdistrib.compareTo("uniform")==0)
		{
			scanlength=new UniformIntegerGenerator(1,maxscanlength);
		}
		else if (scanlengthdistrib.compareTo("zipfian")==0)
		{
			scanlength=new ZipfianGenerator(1l,maxscanlength as Long);
		}
		else
		{
			throw new WorkloadException("Distribution \""+scanlengthdistrib+"\" not allowed for scan length");
		}
		
		if (traverselengthdistrib.compareTo("uniform")==0)
		{
			traverselength=new UniformIntegerGenerator(1,maxscanlength);
		}
		else if (traverselengthdistrib.compareTo("zipfian")==0)
		{
			traverselength=new ZipfianGenerator(1l,maxscanlength as Long);
		}
		else
		{
			throw new WorkloadException("Distribution \""+scanlengthdistrib+"\" not allowed for traverse length");
		}
	}

	/**
	 * Do one insert operation. Because it will be called concurrently from multiple client threads, this 
	 * function must be thread safe. However, avoid synchronized, or the threads will block waiting for each 
	 * other, and it will be difficult to reach the target throughput. Ideally, this function would have no side
	 * effects other than DB operations.
	 */
	public def doInsert(var db:DB, var threadstate:Any):Boolean
	{
		var keynum:Int=keysequence.nextInt();
		if (!orderedinserts)
		{
			keynum=Utils.hash(keynum);
		}
		
		var dbkey:String="user"+keynum;
		var values:HashMap[String,String]=new HashMap[String,String]();
		for (i in 0..(fieldcount-1))
		{
			var fieldkey:String="field"+i;
			var data:String=Utils.ASCIIString(fieldlength);
			values.put(fieldkey,data);
		}
		
		if (db.insert(table,dbkey,values) == 0)
			return true;
		else
			return false;
	}

	/**
	 * Do one transaction operation. Because it will be called concurrently from multiple client threads, this 
	 * function must be thread safe. However, avoid synchronized, or the threads will block waiting for each 
	 * other, and it will be difficult to reach the target throughput. Ideally, this function would have no side
	 * effects other than DB operations.
	 */
	public def doTransaction(var db:DB, var threadstate:Any):Boolean
	{
		var op:String=operationchooser.nextString();

		if (op.compareTo("READ")==0)
		{
			doTransactionRead(db);
		}
		else if (op.compareTo("UPDATE")==0)
		{
			doTransactionUpdate(db);
		}
		else if (op.compareTo("INSERT")==0)
		{
			doTransactionInsert(db);
		}
		else if (op.compareTo("SCAN")==0)
		{
			doTransactionScan(db);
		}
		else if (op.compareTo("TRAVERSE")==0)
		{
			doTransactionTraverse(db);
		}
		else
		{
			doTransactionReadModifyWrite(db);
		}
		
		return true;
	}

	public def doTransactionRead(var db:DB):void
	{
		//choose a random key
		var keynum:Int;
		do
		{
			keynum=keychooser.nextInt();
		}
		while (keynum>transactioninsertkeysequence.lastInt());
		
		if (!orderedinserts)
		{
			keynum=Utils.hash(keynum);
		}
		var keyname:String="user"+keynum;

		var fields:HashSet[String]=null;

		if (!readallfields)
		{
			//read a random field  
			var fieldname:String="field"+fieldchooser.nextString();

			fields=new HashSet[String]();
			fields.add(fieldname);
		}

		db.read(table,keyname,fields,new HashMap[String,String]());
	}
	
	public def doTransactionReadModifyWrite(var db:DB):void
	{
		//choose a random key
		var keynum:Int;
		do
		{
			keynum=keychooser.nextInt();
		}
		while (keynum>transactioninsertkeysequence.lastInt());
		
		if (!orderedinserts)
		{
			keynum=Utils.hash(keynum);
		}
		var keyname:String="user"+keynum;

		var fields:HashSet[String]=null;

		if (!readallfields)
		{
			//read a random field  
			var fieldname:String="field"+fieldchooser.nextString();

			fields=new HashSet[String]();
			fields.add(fieldname);
		}
		
		var values:HashMap[String,String]=new HashMap[String,String]();

		if (writeallfields)
		{
		   //new data for all the fields
		   for (i in 0..(fieldcount-1))
		   {
		      var fieldname:String="field"+i;
		      var data:String=Utils.ASCIIString(fieldlength);		   
		      values.put(fieldname,data);
		   }
		}
		else
		{
		   //update a random field
		   var fieldname:String="field"+fieldchooser.nextString();
		   var data:String=Utils.ASCIIString(fieldlength);		   
		   values.put(fieldname,data);
		}

		//do the transaction
		
		var st:Long=System.currentTimeMillis();

		db.read(table,keyname,fields,new HashMap[String,String]());
		
		db.update(table,keyname,values);

		var en:Long=System.currentTimeMillis();
		
		Measurements.getMeasurements().measure("READ-MODIFY-WRITE", (en-st) as Int);
	}
	
	public def doTransactionScan(var db:DB):void
	{
		//choose a random key
		var keynum:Int;
		do
		{
			keynum=keychooser.nextInt();
		}
		while (keynum>transactioninsertkeysequence.lastInt());

		if (!orderedinserts)
		{
			keynum=Utils.hash(keynum);
		}
		
		var startkeyname:String="user"+keynum;
		
		//choose a random scan length
		var len:Int=scanlength.nextInt();

		var fields:HashSet[String]=null;

		if (!readallfields)
		{
			//read a random field  
			var fieldname:String="field"+fieldchooser.nextString();

			fields=new HashSet[String]();
			fields.add(fieldname);
		}

		db.scan(table,startkeyname,len,fields,new ArrayList[HashMap[String,String]]());
	}
	
	public def doTransactionTraverse(var db:DB):void
	{
		//choose a random key
		var keynum:Int;
		do
		{
			keynum=keychooser.nextInt();
		}
		while (keynum>transactioninsertkeysequence.lastInt());
		
		var startkeyname:String=""+keynum;
		
		var len:Int= 2;
		
		db.traverse(startkeyname,len,new ArrayList[String]());
	}

	public def doTransactionUpdate(var db:DB):void
	{
		//choose a random key
		var keynum:Int;
		do
		{
			keynum=keychooser.nextInt();
		}
		while (keynum>transactioninsertkeysequence.lastInt());

		if (!orderedinserts)
		{
			keynum=Utils.hash(keynum);
		}
		var keyname:String="user"+keynum;

		var values:HashMap[String,String]=new HashMap[String,String]();

		if (writeallfields)
		{
		   //new data for all the fields
		   for (i in 0..(fieldcount-1))
		   {
		      var fieldname:String="field"+i;
		      var data:String=Utils.ASCIIString(fieldlength);		   
		      values.put(fieldname,data);
		   }
		}
		else
		{
		   //update a random field
		   var fieldname:String="field"+fieldchooser.nextString();
		   var data:String=Utils.ASCIIString(fieldlength);		   
		   values.put(fieldname,data);
		}

		db.update(table,keyname,values);
	}

	public def doTransactionInsert(var db:DB):void
	{
		//choose the next key
		var keynum:Int=transactioninsertkeysequence.nextInt();
		if (!orderedinserts)
		{
			keynum=Utils.hash(keynum);
		}
		var dbkey:String="user"+keynum;
		
		var values:HashMap[String,String]=new HashMap[String,String]();
		for (i in 0..(fieldcount-1))
		{
			var fieldkey:String="field"+i;
			var data:String=Utils.ASCIIString(fieldlength);
			values.put(fieldkey,data);
		}
		db.insert(table,dbkey,values);
	}

	//@Override
	public def doInsertEdge(var db:DB, var threadstate:Any):Boolean {
		// TODO Auto-generated method stub
		return false;
	}

	//@Override
	public def hasEdges():Boolean {
		// TODO Auto-generated method stub
		return false;
	}
	
	//Just overrride
	public def releaseEdges(var db:DB):void{
		
	}
}
