package org.xgdbench.workloads;

import x10.util.HashMap;
import x10.util.HashSet;
import x10.util.ArrayList;


import java.util.Properties;
import java.util.Random;
import java.util.Vector;

import org.xgdbench.generator.MAGGenerator;
import org.xgdbench.util.Conts;

import com.yahoo.ycsb.Client;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.Utils;
import com.yahoo.ycsb.Workload;
import com.yahoo.ycsb.WorkloadException;
import com.yahoo.ycsb.generator.CounterGenerator;
import com.yahoo.ycsb.generator.DiscreteGenerator;
import com.yahoo.ycsb.generator.Generator;
import com.yahoo.ycsb.generator.IntegerGenerator;
import com.yahoo.ycsb.generator.ScrambledZipfianGenerator;
import com.yahoo.ycsb.generator.SkewedLatestGenerator;
import com.yahoo.ycsb.generator.UniformIntegerGenerator;
import com.yahoo.ycsb.generator.ZipfianGenerator;
import com.yahoo.ycsb.measurements.Measurements;

import org.apache.log4j.Logger;;

public class MAGWorkload  extends Workload{
	private var generator:MAGGenerator;
		
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
	 * The name of the property for the number of fields in a record.
	 */
	public static val RANDOM_SEED_PROPERTY:String="randseed";
	
	public static val RANDOM_SEED_PROPERTY_DEFAULT:String="100";
	
	var randomField:Int;
	
	public static val GENERATOR_THREAD:String = "genthreads";
	
	public static val GENERATOR_THREAD_COUNT:String="12";
	
	var generatorThreadCount:Int;

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
	
	/**
	 * Indicator of whether the worklaod inserts vertices to the graphdb during the transaction phase 
	 */
	
	public static val TRANSACTION_PHASE_INSERTS_DEFAULT:String = "false";
	
	public static val TRANSACTION_PHASE_INSERTS:String="transactioninsert";
	
	var transactionInserts:Boolean;
	
	public static val AFFINITY_MATRIX_DEFAULT:String = "[0.99f, 0.53f, 0.53f, 0.13f]";
	
	public static val AFFINITY_MATRIX:String = "affinitymatrix";
	
	var affinityMatrix:Array[Float] = null;
	
	public static val THETA_THRESHOLD_DEFAULT:String = "0.1";
	
	public static val THETA_THRESHOLD:String = "pthreshold";
	
	var thetaThreshold:Float = 0.1f;
	
	/**
	 * The graph db uri
	 */
	
	public static val DB_URI_DEFAULT:String = null;
	
	public static val DB_URI:String="uri";

    var edgecount:Int;

	var keysequence:CounterGenerator;

	var operationchooser:DiscreteGenerator;

	var keychooser:IntegerGenerator;

	var fieldchooser:Generator;

	var transactioninsertkeysequence:CounterGenerator;
	
	var scanlength:IntegerGenerator;
	
	var traverselength:IntegerGenerator;
	
	var orderedinserts:Boolean;

	var recordcount:Int;
	
	private var randUserChoice:Random;
	
	public def this(){
		randUserChoice = new Random(100);
	}
	
	/**
	 * Initialize the scenario. 
	 * Called once, in the main client thread, before any operations are started.
	 */
	public def init(var p:Properties) throws WorkloadException:void	
	{
		table = p.getProperty(TABLENAME_PROPERTY,TABLENAME_PROPERTY_DEFAULT);
		fieldcount=Int.parseInt(p.getProperty(FIELD_COUNT_PROPERTY,FIELD_COUNT_PROPERTY_DEFAULT));
		randomField=Int.parseInt(p.getProperty(RANDOM_SEED_PROPERTY,RANDOM_SEED_PROPERTY_DEFAULT));
		fieldlength=Int.parseInt(p.getProperty(FIELD_LENGTH_PROPERTY,FIELD_LENGTH_PROPERTY_DEFAULT));
		generatorThreadCount=Int.parseInt(p.getProperty(GENERATOR_THREAD,GENERATOR_THREAD_COUNT));
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
		
		transactionInserts=Boolean.parseBoolean(p.getProperty(TRANSACTION_PHASE_INSERTS,TRANSACTION_PHASE_INSERTS_DEFAULT));
		
		var URL:String = p.getProperty(DB_URI, DB_URI_DEFAULT);
		
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

		fieldchooser=new UniformIntegerGenerator(1,fieldcount);
		
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
		
		//System.out.println("fieldcount : " + fieldcount + " recordcount : " + recordcount);
		
		//System.out.println("Workload does transact inserts ? " + (transactionInserts ? "Yes":"No"));
		//System.out.println("DB URL is : " + URL);
				
		
		var aff:String = p.getProperty(AFFINITY_MATRIX, AFFINITY_MATRIX_DEFAULT);
		//[0.99f, 0.53f, 0.53f, 0.13f]
		aff = aff.substring(1, (aff.length() - 1));
		var iterm:Array[String] = aff.split(","); 
		var param:Array[Float] = new Array[Float](iterm.size);
		
		for( i in 0..(param.size-1)){
			param(i) = Float.parseFloat(iterm(i).trim());
		}
		
		var thetaThreash:String = p.getProperty(THETA_THRESHOLD, THETA_THRESHOLD_DEFAULT);
		
		thetaThreshold = Float.parseFloat(thetaThreash);
		
		generator = new MAGGenerator(fieldcount, recordcount, param, thetaThreshold, randomField, generatorThreadCount);
		recordcount = ((generator.getEntityCount()) as Int);
		edgecount = ((generator.getEdgeCount()) as Int);
	}

	//@Override
	public def doInsert(var db:DB, var threadstate:Any) : Boolean {		
		var nodeRelationshipStr:String = null;
		Console.OUT.println("AAAAAAAAAAAA");
		
		//synchronized(this){
		//atomic{
			nodeRelationshipStr = generator.nextString();
		//}
		
		Console.OUT.println("BBBBB : " + nodeRelationshipStr);
		
		if (nodeRelationshipStr.equals("")){
			return false;
		}
		
		Console.OUT.println("CCCC");
		
		var retval:Int = db.insert(nodeRelationshipStr,null,null);
		
		Console.OUT.println("dddd");
		
		if ((retval == 0)||(retval == -1))
			return true;
		else
			return false;
	}

	//@Override
	public def doInsertEdge(var db:DB, var threadstate:Any) : Boolean {
		var edgeRelationshipStr:String = null;

		//synchronized(this){
		//atomic{
			edgeRelationshipStr = generator.nextEdgeString();
		//}
				
		if (db.insertEdge(edgeRelationshipStr,null,null) == 0){
			return true;
		}else{
			return false;
		}
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
			//System.out.println("op : " + op);
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
	
//	private String makeTimeStamp(){
//		return "" + System.currentTimeMillis();
//	}
	
	private def getRandomChoice():Int{
		return randUserChoice.nextBoolean()?1:0;
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
		
		//Disabled non-ordered inserts 
//		if (!orderedinserts)
//		{
//			keynum=Utils.hash(keynum);
//		}
		
		
		//System.out.println("Key is : " + keynum);
		
		var keyname:String=""+keynum;

		var fields:HashSet[String]=null;

		if (!readallfields)
		{
			//read a random field  
			var fieldname:String="attrib"+fieldchooser.nextString();

			//System.out.println("field : " + fieldname);
			
			fields=new HashSet[String]();
			fields.add(fieldname);
		}else{
			fields=new HashSet[String]();
		   for (i in 1..(fieldcount-1))
		   {
		      fields.add("attrib"+i);
		   }
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
		
//		if (!orderedinserts)
//		{
//			keynum=Utils.hash(keynum);
//		}
		
		var keyname:String=""+keynum;

		var fields:HashSet[String]=null;

		if (!readallfields)
		{
			//read a random field  
			var fieldname:String="attrib"+fieldchooser.nextString();

			//System.out.println("field : " + fieldname);
			
			fields=new HashSet[String]();
			fields.add(fieldname);
		}else{
			fields=new HashSet[String]();
		   for ( i in 1..(fieldcount-1))
		   {
		      fields.add("attrib"+i);
		   }
		}

		//db.read(table,keyname,fields,new HashMap<String,String>());
				
		//		String keyname=""+keynum;
		//
		//		HashSet<String> fields=null;
		//
		//		if (!readallfields)
		//		{
		//			//read a random field  
		//			String fieldname="field"+fieldchooser.nextString();
		//
		//			fields=new HashSet<String>();
		//			fields.add(fieldname);
		//		}
		
		var values:HashMap[String,String]=new HashMap[String,String]();

		if (writeallfields)
		{
		   //new data for all the fields
		   for ( i in 1..(fieldcount-1))
		   {
		      var fieldname:String="attrib"+i;
		      var data:String="" + getRandomChoice();		   
		      values.put(fieldname,data);
		   }
		}
		else
		{
		   //update a random field
		   var fieldname:String="attrib"+fieldchooser.nextString();
		   var data:String="" + getRandomChoice();			   
		   values.put(fieldname,data);
		}
		
//		if (writeallfields)
//		{
//		   //new data for all the fields
//		   for (int i=0; i<fieldcount; i++)
//		   {
//		      String fieldname="field"+i;
//		      String data=Utils.ASCIIString(fieldlength);		   
//		      values.put(fieldname,data);
//		   }
//		}
//		else
//		{
//		   //update a random field
//		   String fieldname="field"+fieldchooser.nextString();
//		   String data=Utils.ASCIIString(fieldlength);		   
//		   values.put(fieldname,data);
//		}

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

//		if (!orderedinserts)
//		{
//			keynum=Utils.hash(keynum);
//		}
		
		var startkeyname:String=""+keynum;
		
		var len:Int= -1;

		var fields:HashSet[String]=null;
		
/*		//choose a random scan length
		int len=scanlength.nextInt();

		HashSet<String> fields=null;

		if (!readallfields)
		{
			//read a random field  
			String fieldname="field"+fieldchooser.nextString();

			fields=new HashSet<String>();
			fields.add(fieldname);
		}*/

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
		//System.out.println("doTransactionUpdate");
		//choose a random key
		var keynum:Int;
		
		do
		{
			keynum=keychooser.nextInt();
		}
		while (keynum>transactioninsertkeysequence.lastInt());

		var keyname:String=""+keynum;

		var values:HashMap[String,String]=new HashMap[String,String]();

		/*
		if (writeallfields)
		{
		   //new data for all the fields
		   for (int i=1; i<=fieldcount; i++)
		   {
		      String fieldname="attrib"+i;
		      String data="" + getRandomChoice();		   
		      values.put(fieldname,data);
		   }
		}
		else
		{
		   //update a random field
		   String fieldname="attrib"+fieldchooser.nextString();
		   String data="" + getRandomChoice();			   
		   values.put(fieldname,data);
		}
*/

		//We just send an empty values set.
		db.update(table,keyname,values);//keyname is the person name
	}

	public def doTransactionInsert(var db:DB):void
	{

		//choose the next key
//		int keynum=transactioninsertkeysequence.nextInt();
//		if (!orderedinserts)
//		{
//			keynum=Utils.hash(keynum);
//		}
//		String dbkey="user"+keynum;
//		
//		HashMap<String,String> values=new HashMap<String,String>();
//		for (int i=0; i<fieldcount; i++)
//		{
//			String fieldkey="field"+i;
//			String data=Utils.ASCIIString(fieldlength);
//			values.put(fieldkey,data);
//		}
				
		var nodeRelationshipStr:String = "transact-insert";
		
		db.insert(nodeRelationshipStr,null,null);
	}
	
	public def hasEdges():Boolean{
		return generator.gotNextEdge();
	}

	public def releaseEdges(var db:DB):void{
		var counter:Int = 0;
		while(this.hasEdges()){
			doInsertEdge(db, null);
			counter++;
		}
		
		if(counter == 0){
			//System.out.println("No edges released.");
			Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("No edges released.");
		}
	}
	
	//@Override
	public def getEdgeCount():int{
		return edgecount;
	}
}
