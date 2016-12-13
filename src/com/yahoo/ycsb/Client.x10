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


import java.text.DecimalFormat;
//import java.util.*;
import x10.util.ArrayList;
import x10.compiler.Native;
import x10.interop.Java;

import java.util.Random;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.xgdbench.util.Conts;

import com.yahoo.ycsb.measurements.Measurements;
import com.yahoo.ycsb.measurements.exporter.MeasurementsExporter;
import com.yahoo.ycsb.measurements.exporter.TextMeasurementsExporter;
import org.xgdbench.workloads.MAGWorkload;


//import org.apache.log4j.BasicConfigurator;

/**
 * A thread to periodically show the status of the experiment, to reassure you that progress is being made.
 * 
 * @author cooperb
 *
 */
class StatusThread extends java.lang.Thread
//class StatusThread
{
	var _threads:ArrayList[java.lang.Thread];
	var _label:String;
	var _standardstatus:boolean;
	
	/**
	 * The Interval for reporting status.
	 */
	public static val sleeptime:Long=10000;

	public def this(var threads:ArrayList[java.lang.Thread], var label:String, var standardstatus:boolean)
	{
		_threads=threads;
		_label=label;
		_standardstatus=standardstatus;
	}

	/**
	 * Run and periodically report status.
	 */
	public def run():void
	{
		var st:Long=System.currentTimeMillis();

		var lasten:Long=st;
		var lasttotalops:Long=0;
		
		var alldone:boolean;

		do 
		{
			alldone=true;

			var totalops:Int=0;

			//terminate this thread when all the worker threads are done
			val len:Int = _threads.size();
			for (i in 0 ..(len-1))
			{
				var t:java.lang.Thread = _threads.get(i) as java.lang.Thread;
				if (t.getState()!=java.lang.Thread.State.TERMINATED)
				{
					alldone=false;
				}

				var ct:__ClientThread= t as __ClientThread;
				totalops+=ct.getOpsDone();
			}

			var en:Long=System.currentTimeMillis();

			var Interval:Long=en-st;
			//double throughput=1000.0*((double)totalops)/((double)Interval);

			var curthroughput:Double=1000.0*(((totalops-lasttotalops)) as Double/((en-lasten) as Double));
			
			lasttotalops=totalops;
			lasten=en;
			
			var d:DecimalFormat = new DecimalFormat("#.##");
			
			if (totalops==0)
			{
				Console.ERR.println(_label+" "+(Interval/1000)+" sec: "+totalops+" operations; "+Measurements.getMeasurements().getSummary());
			}
			else
			{
				Console.ERR.println(_label+" "+(Interval/1000)+" sec: "+totalops+" operations; "+d.format(curthroughput)+" current ops/sec; "+Measurements.getMeasurements().getSummary());
			}

			if (_standardstatus)
			{
			if (totalops==0)
			{
				Console.OUT.println(_label+" "+(Interval/1000)+" sec: "+totalops+" operations; "+Measurements.getMeasurements().getSummary());
			}
			else
			{
				Console.OUT.println(_label+" "+(Interval/1000)+" sec: "+totalops+" operations; "+d.format(curthroughput)+" current ops/sec; "+Measurements.getMeasurements().getSummary());
			}
			}

			 try
			 {
				this.sleep(sleeptime);
			 }
			 catch (var e:java.lang.InterruptedException)
			 {
			 	//do nothing
			 }

		}
		while (!alldone);
	}
}

/**
 * A thread for executing transactions or data inserts to the database.
 * 
 * @author cooperb
 *
 */
class ClientThread extends java.lang.Thread
{
	static val random:Random=new Random();

	var _db:DB;
	var _dotransactions:Boolean;
	var _workload:Workload;
	var _opcount:Int;
	var _target:Double;

	var _opsdone:Int;
	var _threadid:Int;
	var _threadcount:Int;
	var _workloadstate:Any;
	var _props:Properties;


	/**
	 * Constructor.
	 * 
	 * @param db the DB implementation to use
	 * @param dotransactions true to do transactions, false to insert data
	 * @param workload the workload to use
	 * @param threadid the id of this thread 
	 * @param threadcount the total number of threads 
	 * @param props the properties defining the experiment
	 * @param opcount the number of operations (transactions or inserts) to do
	 * @param targetperthreadperms target number of operations per thread per ms
	 */
	public def this(var db:DB, var dotransactions:Boolean, var workload:Workload, var threadid:Int, var threadcount:Int, var props:Properties, var opcount:Int, var targetperthreadperms:Double)
	{
		//TODO: consider removing threadcount and threadid
		_db=db;
		_dotransactions=dotransactions;
		_workload=workload;
		_opcount=opcount;
		_opsdone=0;
		_target=targetperthreadperms;
		_threadid=threadid;
		_threadcount=threadcount;
		_props=props;
		//Console.OUT.println("Interval = "+Interval);
	}

	public def getOpsDone():Int
	{
		return _opsdone;
	}

	public def run():void
	{
		try
		{
			Console.OUT.println("--------------4");
			_db.init();
		}
		catch (var e:DBException)
		{
			e.printStackTrace();
			//e.printStackTrace(System.out);
			return;
		}
		Console.OUT.println("--------------5");

		try
		{
			_workloadstate=_workload.initThread(_props,_threadid,_threadcount);
		}
		catch (var e:WorkloadException)
		{
			e.printStackTrace();
			//e.printStackTrace(System.out);
			return;
		}
		Console.OUT.println("--------------18");
		//spread the thread operations out so they don't all hit the DB at the same time
		   //GH issue 4 - throws exception if _target>1 because random.nextInt argument must be >0
		   //and the sleep() doesn't make sense for granularities < 1 ms anyway
		   if ( (_target>0) && (_target<=1.0) ) 
		   {
			   try
			   {
		      		this.sleep(random.nextInt((1.0/_target) as Int));
		   	   }
		   		catch (var e:java.lang.InterruptedException)
		   		{
			   		//do nothing
		   		}
		   }

		
		try
		{
			if (_dotransactions)
			{
				var st:Long=System.currentTimeMillis();

				while ( (_opcount==0) || (_opsdone<_opcount) )
				{

					if (!_workload.doTransaction(_db,_workloadstate))
					{
						break;
					}

					_opsdone++;

					//throttle the operations
					if (_target>0)
					{
						//this is more accurate than other throttling approaches we have tried,
						//like sleeping for (1/target throughput)-operation latency,
						//because it smooths timing inaccuracies (from sleep() taking an Int, 
						//current time in millis) over many operations
						while (System.currentTimeMillis()-st<(_opsdone as Double)/_target)
						{
							 try
							 {
								this.sleep(1);
							 }
							 catch (var e:java.lang.InterruptedException)
							 {
							 	//do nothing
							 }

						}
					}
				}
			}
			else
			{
				var st:Long=System.currentTimeMillis();

				while ( (_opcount==0) || (_opsdone<_opcount) )
				{

					if (!_workload.doInsert(_db,_workloadstate))
					{
						break;
					}

					_opsdone++;

					//throttle the operations
					if (_target>0)
					{
						//this is more accurate than other throttling approaches we have tried,
						//like sleeping for (1/target throughput)-operation latency,
						//because it smooths timing inaccuracies (from sleep() taking an Int, 
						//current time in millis) over many operations
						while (System.currentTimeMillis()-st<(_opsdone as Double)/_target)
						{
							// try 
							// {
								System.sleep(1);
							// }
							// catch (InterruptedException e)
							// {
							// 	//do nothing
							// }
						}
					}
				}
			}
		}
		catch (var e:Exception)
		{
			e.printStackTrace();
			//e.printStackTrace(System.out);
			//System.exit(0);
			return;
		}

		try
		{
			Console.OUT.println("Cleaning up...............................AAAA");
			while(_workload.hasEdges()){
				_workload.doInsertEdge(_db,_workloadstate);
			}
			_db.cleanup();
		}
		catch (var e:DBException)
		{
			e.printStackTrace();
			//e.printStackTrace(System.out);
			return;
		}
	}
}

/**
 * Main class for executing YCSB.
 */
public class Client
{
	static val t:Array[__ClientThread] = new Array[__ClientThread](1);
		
	public static val OPERATION_COUNT_PROPERTY:String="operationcount";

	public static val RECORD_COUNT_PROPERTY:String="recordcount";

	public static val WORKLOAD_PROPERTY:String="workload";
	
	/**
	 * Indicates how many inserts to do, if less than recordcount. Useful for partitioning
	 * the load among multiple servers, if the client is the bottleneck. Additionally, workloads
	 * should support the "insertstart" property, which tells them which record to start at.
	 */
	public static val INSERT_COUNT_PROPERTY:String="insertcount";

	public static def usageMessage():void
	{
		Console.OUT.println("Usage: java com.yahoo.ycsb.Client [options]");
		Console.OUT.println("Options:");
		Console.OUT.println("  -threads n: execute using n threads (default: 1) - can also be specified as the \n" +
				"              \"threadcount\" property using -p");
		Console.OUT.println("  -target n: attempt to do n operations per second (default: unlimited) - can also\n" +
				"             be specified as the \"target\" property using -p");
		Console.OUT.println("  -load:  run the loading phase of the workload");
		Console.OUT.println("  -t:  run the transactions phase of the workload (default)");
		Console.OUT.println("  -db dbname: specify the name of the DB to use (default: com.yahoo.ycsb.BasicDB) - \n" +
				"              can also be specified as the \"db\" property using -p");
		Console.OUT.println("  -P propertyfile: load properties from the given file. Multiple files can");
		Console.OUT.println("                   be specified, and will be processed in the order specified");
		Console.OUT.println("  -p name=value:  specify a property to be passed to the DB and workloads;");
		Console.OUT.println("                  multiple properties can be specified, and override any");
		Console.OUT.println("                  values in the propertyfile");
		Console.OUT.println("  -s:  show status during run (default: no status)");
		Console.OUT.println("  -l label:  use label for status (e.g. to label one experiment out of a whole batch)");
		Console.OUT.println("");
		Console.OUT.println("Required properties:");
		Console.OUT.println("  "+WORKLOAD_PROPERTY+": the name of the workload class to use (e.g. com.yahoo.ycsb.workloads.CoreWorkload)");
		Console.OUT.println("");
		Console.OUT.println("To run the transaction phase from multiple servers, start a separate client on each.");
		Console.OUT.println("To run the load phase from multiple servers, start a separate client on each; additionally,");
		Console.OUT.println("use the \"insertcount\" and \"insertstart\" properties to divide up the records to be inserted");
	}

	public static def checkRequiredProperties(var props:Properties):Boolean
	{
		if (props.getProperty(WORKLOAD_PROPERTY)==null)
		{
			Console.OUT.println("Missing property: "+WORKLOAD_PROPERTY);
			return false;
		}

		return true;
	}


	/**
	 * Exports the measurements to either sysout or a file using the exporter
	 * loaded from conf.
	 * @throws IOException Either failed to write to output stream or failed to close it.
	 */
	private static def exportMeasurements(var props:Properties, var opcount:Int, var runtime:Long, var summaryFlg:Boolean) throws java.io.IOException :void
	{
		var exporter:MeasurementsExporter = null;
		try
		{
			// if no destination file is provided the results will be written to stdout
			var out:java.io.OutputStream;
			var exportFile:String = props.getProperty("exportfile");
			if (exportFile == null)
			{
				out = java.lang.System.out;
			} else
			{
				out = new java.io.FileOutputStream(exportFile);
			}

			// if no exporter is provided the default text one will be used
			var exporterStr:String = "" + props.getProperty(("exporter" as java.lang.String), ("com.yahoo.ycsb.measurements.exporter.TextMeasurementsExporter" as java.lang.String));
			
			try
			{
				//exporter = Class.forName(exporterStr).getConstructor(OutputStream.class, boolean.class).newInstance(out, summaryFlg) as MeasurementsExporter;
				//need to implement
				
				//+Miyuru : This is for the time being
				exporter = new TextMeasurementsExporter(out, summaryFlg);
			} catch (var e:Exception)
			{
				Console.ERR.println("Could not find exporter " + exporterStr + ", will use default text reporter.");
				e.printStackTrace();
				exporter = new TextMeasurementsExporter(out, summaryFlg);
			}

			exporter.write("OVERALL", "RunTime(ms)", runtime);
			var throughput:Double = 1000.0 * (opcount as Double) / (runtime as Double);
			exporter.write("OVERALL", "Throughput(ops/sec)", throughput);

			Measurements.getMeasurements().exportMeasurements(exporter);
		} finally
		{
			if (exporter != null)
			{
				exporter.close();
			}
		}
	}
	
// 	public static def call_main(Object args){
// 		String[] arg = (String[])args;
// 		Console.OUT.println(arg.length);
// 		
// //		for(Int i = 0; i < arg.length; i++ ){
// //			Console.OUT.println(arg[i]);
// //		}
// 		
// 		main(arg);
// 		
// 	}
	
	//@SuppressWarnings("unchecked")
	public static def main(var args:Array[String]):void
	{
		var dbname:String;
		var props:Properties=new Properties();
		var fileprops:Properties=new Properties();
		var dotransactions:Boolean=true;
		var threadcount:Int=1;
		var target:Int=0;
		var status:Boolean=false;
		var summaryFlg:Boolean=false;
		var label:String="";

		//parse arguments
		var argindex:Int=0;

		if (args.size==0)
		{
			usageMessage();
			return;
		}

		while (args(argindex).startsWith("-"))
		{
			if (args(argindex).indexOf("-threads")!=-1)
			{
				argindex++;
				if (argindex>=args.size)
				{
					usageMessage();
					return;
				}
				var tcount:Int=Int.parseInt(args(argindex));
				props.setProperty("threadcount", tcount+"");
				
				Console.OUT.println("Using " + tcount + " threads.");
				
				argindex++;
			}
			else if (args(argindex).indexOf("-target")!=-1)
			{
				argindex++;
				if (argindex>=args.size)
				{
					usageMessage();
					return;
				}
				var ttarget:Int=Int.parseInt(args(argindex));
				props.setProperty("target", ttarget+"");
				argindex++;
			}
			else if (args(argindex).indexOf("-load")!=-1)
			{
				dotransactions=false;
				argindex++;
			}
			else if (args(argindex).indexOf("-t")!=-1)
			{
				dotransactions=true;
				argindex++;
			}
			else if (args(argindex).indexOf("-s")!=-1)
			{
				status=true;
				argindex++;
			}
			else if (args(argindex).indexOf("-summary")!=-1)
			{
				summaryFlg = true;
				argindex++;
			}
			else if (args(argindex).indexOf("-db")!=-1)
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
			else if (args(argindex).indexOf("-l")!=-1)
			{
				argindex++;
				if (argindex>=args.size)
				{
					usageMessage();
					return;
				}
				label=args(argindex);
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

				//Issue #5 - remove call to stringPropertyNames to make compilable under Java 1.5
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
			else
			{
				Console.OUT.println("Unknown option "+args(argindex));
				usageMessage();
				return;
			}

			if (argindex>=args.	size)
			{
				break;
			}
		}

		if (argindex!=args.size)
		{
			usageMessage();
			return;
		}

		//set up logging
		//BasicConfigurator.configure();

		//overwrite file properties with properties from the command line

		//Issue #5 - remove call to stringPropertyNames to make compilable under Java 1.5
		var e:java.util.Enumeration=props.propertyNames();
		
		while (e.hasMoreElements() )
		{
		   var prop:String = e.nextElement() as String;
		   
		   fileprops.setProperty(prop,props.getProperty(prop));
		}

		props=fileprops;

		if (!checkRequiredProperties(props))
		{
			return;
		}

		//get number of threads, target and db
		threadcount=Int.parseInt(props.getProperty("threadcount","1"));
		dbname=props.getProperty("db","com.yahoo.ycsb.BasicDB");
		target=Int.parseInt(props.getProperty("target","0"));
		
		//compute the target throughput
		var targetperthreadperms:Double=-1;
		
		if (target>0)
		{
			var targetperthread:Double=(target as Double)/(threadcount as Double);
			targetperthreadperms=targetperthread/1000.0;
		}	 

		Console.OUT.println("XGDBench Client 3.0");
		Console.OUT.println("Command line:");
		for (i in 0..(args.size-1))
		{
			Console.OUT.println(" "+args(i));
		}
		Console.OUT.println();
		Console.ERR.println("Loading workload...");
		
		//show a warning message that creating the workload is taking a while
		//but only do so if it is taking Longer than 2 seconds 
		//(showing the message right away if the setup wasn't taking very Long was confusing people)
		
		var warningthread:java.lang.Thread=new java.lang.Thread() 
		{
			public def run():void
			{
				try
				{
					this.sleep(2000);
				}
				catch (var e:java.lang.InterruptedException)
				{
					return;
				}
				Console.ERR.println(" (might take a few minutes for large data sets)");
			}
		};

		
		warningthread.start();
		
		//set up measurements
		Measurements.setProperties(props);
		Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("Graph generation started at : " + new java.sql.Timestamp(new java.util.Date().getTime()).toString());
		
		//load the workload
		//var classLoader:ClassLoader = Client_Java.class.getClassLoader();
		//var classLoader:java.lang.ClassLoader = Client.class.getClassLoader(); //need to implement the correct code.

		var workload:Workload=null;


		/*

		+Miyuru: The following code should be the ideal case for detection the workload dynamically. However, for the time being we use only one workload. 
		//var workloadclass:java.lang.Class = classLoader.loadClass(props.getProperty(WORKLOAD_PROPERTY));
		var workloadclass:java.lang.Class = Client.getWorkloadClass(props.getProperty(WORKLOAD_PROPERTY));

		try{
			workload=workloadclass.newInstance() as Workload;
		}catch(var ie:java.lang.IllegalAccessException){
			ie.printStackTrace();
		}catch(var je:java.lang.InstantiationException){
			je.printStackTrace();
		}
		 * */
		
		workload = new MAGWorkload();

		try
		{
			workload.init(props);
		}
		catch (var ep:WorkloadException)
		{
			ep.printStackTrace();
			//e.printStackTrace(System.out);
			//System.exit(0);
			return;
		}
		
		warningthread.interrupt();

		//run the workload
		Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("Done Graph generation at : " + new java.sql.Timestamp(new java.util.Date().getTime()).toString());

		/*------------ Create the db client ---------------------------------*/
		
		var db:DB=null;
		try
		{
			db=DBFactory.newDB(dbname,props);
			try {
				db.init();
				Console.OUT.println("--------------16");
			} catch (var ep:DBException) {
				// TODO Auto-generated catch block
				ep.printStackTrace();
			}
			Console.OUT.println("--------------17");
		}
		catch (var eu:UnknownDBException)
		{
			Console.OUT.println("Unknown DB "+dbname);
			//System.exit(0);
			return;
		}
		
		
		/*------------- Start vertex insertion ------------------------------*/

		var opcount:Int;
		
		Console.OUT.println("--------------20");
		
		if (dotransactions)
		{
			opcount=Int.parseInt(props.getProperty(OPERATION_COUNT_PROPERTY,"0"));
		}
		else
		{
			if (props.containsKey(INSERT_COUNT_PROPERTY))
			{
				opcount=Int.parseInt(props.getProperty(INSERT_COUNT_PROPERTY,"0"));
			}
			else
			{
				opcount=Int.parseInt(props.getProperty(RECORD_COUNT_PROPERTY,"0"));
			}
		}

		Console.OUT.println("--------------21");
		var threads:ArrayList[java.lang.Thread]=new ArrayList[java.lang.Thread]();

//		DB db=null;
//		try
//		{
//			db=DBFactory.newDB(dbname,props);
//			try {
//				db.init();
//			} catch (DBException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		catch (UnknownDBException e)
//		{
//			Console.OUT.println("Unknown DB "+dbname);
//			System.exit(0);
//		}
		
		for (threadid in 0..(threadcount-1))
		{
			var t:java.lang.Thread=null;
			
			if(dotransactions){
				t=new __ClientThread(db,OperationTypes.DO_TRANSACTIONS,workload,threadid,threadcount,props,(opcount/threadcount)+1,targetperthreadperms); //At this poInt we insert an additional 1 for opcount/threadcount) because we need to make sure we get all the vertices inserted.
			}else{
				t=new __ClientThread(db,OperationTypes.DO_VERTEX_INSERTS,workload,threadid,threadcount,props,(opcount/threadcount)+1,targetperthreadperms); //At this poInt we insert an additional 1 for opcount/threadcount) because we need to make sure we get all the vertices inserted.
			}

			threads.add(t);
		}

		Console.OUT.println("--------------22");
		
		var statusthread:__StatusThread=null;

		if (status)
		{
			var standardstatus:Boolean=false;
			if (props.getProperty("measurementtype","").compareTo("timeseries")==0) 
			{
				standardstatus=true;
			}	
			statusthread=new __StatusThread(threads,label,standardstatus);
			statusthread.start();
		}
		
		Console.OUT.println("--------------23");

		var st:Long=System.currentTimeMillis();

		val len:Int = threads.size();
		//var t:__ClientThread = null;
		
		Console.OUT.println("--------------23-1");
		
		finish for (i in 0 .. (len -1))
		{	
			async{
				Console.OUT.println("--------------thread-" + i);
				//t = threads.get(i) as java.lang.Thread;
				t(0) = threads.get(i) as __ClientThread;
				t(0).run();
				Console.OUT.println("--------------thread-" + i+" started.");
			}
		}
		
		Console.OUT.println("--------------23--2");
/*
		for (i in 0 .. (len -1))
		{
			try
			{
				Console.OUT.println("--------------getting thread-" + i);
				t(0) = threads.get(i) as __ClientThread;
				Console.OUT.println("--------------Got thread-" + i);
				t(0).join();
				Console.OUT.println("--------------Join thread-" + i);
			}
			catch (var ecc:java.lang.InterruptedException)
			{
			}
		}
		 * 
		 */
		Console.OUT.println("--------------24");
		var en:Long=System.currentTimeMillis();

		if (status)
		{
			statusthread.interrupt();
		}
	
		Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("Done vertex loading at : " + new java.sql.Timestamp(new java.util.Date().getTime()).toString());
		/*------------------------------
		 
		 From here onwards we do edge insertion.
		 
		 *------------------------------ 
		 */

		//To do in future
		
		//__ClientThreadEdgeRelease and __ClientThread can be mearged by replacing dotransactions boolean flag by an Int with values 0 = insert, 1=transact, 2=edgeinsert
		
		Console.OUT.println("--------------25");
		
		//This must be only done during the data loading phase.
		if (!dotransactions){
			try
			{		
				Console.OUT.println("Releasing edges");
				//DB db=null;
//				try
//				{
//					db=DBFactory.newDB(dbname,props);
//					db.init();
//				}
//				catch (UnknownDBException e)
//				{
//					Console.OUT.println("Unknown DB "+dbname);
//					System.exit(0);
//				} catch (DBException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				threads=new ArrayList[java.lang.Thread]();
				var opcount2:Int = workload.getEdgeCount();
				
				for (threadid in 0..(threadcount-1))
				{
					var t2:java.lang.Thread=new __ClientThread(db,OperationTypes.DO_EDGE_INSERTS,workload,threadid,threadcount,props,(opcount2/threadcount)+1,targetperthreadperms);

					threads.add(t2);
				}

				if (status)
				{
					var standardstatus:Boolean=false;
					if (props.getProperty("measurementtype","").compareTo("timeseries")==0) 
					{
						standardstatus=true;
					}	
					statusthread=new __StatusThread(threads,label,standardstatus);
					statusthread.run();
				}

				var st2:Long=System.currentTimeMillis();

				finish for (i in 0 .. (len -1))
				{	
					async{
						Console.OUT.println("--------------egde thread-" + i);
						//t = threads.get(i) as java.lang.Thread;
						t(0) = threads.get(i) as __ClientThread;
						t(0).run();
						Console.OUT.println("--------------edge thread-" + i+" started.");
					}
				}
				
				/*
				for (Thread t : threads)
				{
					t.start();
				}

				for (Thread t : threads)
				{
					try
					{
						t.join();
					}
					catch (InterruptedException e)
					{
					}
				}*/
				
				//workload.releaseEdges(db);
				Logger.getLogger(Conts.XGDBENCH_LOGGER_NAME).info("Done inserting edges at : " + new java.sql.Timestamp(new java.util.Date().getTime()).toString());
				workload.cleanup();
			}
			catch (var ev:WorkloadException)
			{
				ev.printStackTrace();
				//e.printStackTrace(System.out);
				//System.exit(0);
				return;
			}
		}
		
		try
		{			
			exportMeasurements(props, opcount, en - st, summaryFlg);
		} catch (var ed:java.io.IOException)
		{
			Console.ERR.println("Could not export measurements, error: " + ed.getMessage());
			ed.printStackTrace();
			//System.exit(-1);
			return;
		}
		
		Console.OUT.println("--------------40");
		
		return;
	}
	
	//@Native("java", "com.yahoo.ycsb.java.Client_Java.getWorkloadClass(#1)")
	//static native def getWorkloadClass(var classToLoad:String):java.lang.Class;
}
