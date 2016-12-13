package com.yahoo.ycsb;

import java.util.Properties;
import java.util.Random;

import org.apache.log4j.Logger;
import org.xgdbench.util.Conts;

/**
 * A thread for executing transactions or data inserts to the database.
 * 
 * @author cooperb
 *
 */
public class __ClientThread extends java.lang.Thread
{
	static val random:Random=new Random();

	var _db:DB;
	var _operationType:Int;
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
	public def this(var db:DB, var operationType:Int, var workload:Workload, var threadid:Int, var threadcount:Int, var props:Properties, var opcount:Int, var targetperthreadperms:double)
	{
		//TODO: consider removing threadcount and threadid
		_db=db;
		_operationType=operationType;
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
		Console.OUT.println("Now running thread");
		try
		{
			_workloadstate=_workload.initThread(_props,_threadid,_threadcount);
		}
		catch (e:WorkloadException)
		{
			e.printStackTrace();
			//e.printStackTrace(System.out);
			return;
		}
		
		Console.OUT.println("got the workload");

		//spread the thread operations out so they don't all hit the DB at the same time
		// try
		// {
		   //GH issue 4 - throws exception if _target>1 because random.nextInt argument must be >0
		   //and the sleep() doesn't make sense for granularities < 1 ms anyway
		   if ( (_target>0) && (_target<=1.0) ) 
		   {
		      System.sleep(random.nextInt((1.0/_target) as Int));
		   }
		// }
		// catch (var e:InterruptedException)
		// {
		//    //do nothing
		// }
		
		   Console.OUT.println("woke up from sleep");
		   
		try
		{
			var st:Long= -1;
			Console.OUT.println("OP type : " + _operationType);
			switch (_operationType)
			{
				case OperationTypes.DO_TRANSACTIONS:
					st=System.currentTimeMillis();

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
								// try
								// {
									System.sleep(1);
								// }
								// catch (var e:InterruptedException)
								// {
								// 	//do nothing
								// }
	
							}
						}
					}
					break;
				case OperationTypes.DO_VERTEX_INSERTS:
					Console.OUT.println("Its vertex inserts. opcount is : " + _opcount);
					st=System.currentTimeMillis();
	
					while ( (_opcount==0) || (_opsdone<_opcount) )
					{
						Console.OUT.println("calling do insert : "+_opsdone);
						if (!_workload.doInsert(_db,_workloadstate))
						{
							Console.OUT.println("Now breaking");
							break;
						}
						
						Console.OUT.println("Done insert");
	
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
								// catch (var e:InterruptedException)
								// {
								// 	//do nothing
								// }
							}
						}
						Console.OUT.println("Done sleep");
					}
					break;
				case OperationTypes.DO_EDGE_INSERTS:
					st=System.currentTimeMillis();
					Console.OUT.println("Its edge inserts. opcount is : " + _opcount);

					while ( (_opcount==0) || (_opsdone<_opcount) )
					{
						Console.OUT.println("calling do insert edge : "+_opsdone);
						if (!_workload.doInsertEdge(_db, null)) //Need not to pass a thread state here
						{
							break;
						}
						
						Console.OUT.println("Done insert");

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
								// catch (var e:InterruptedException)
								// {
								// 	//do nothing
								// }
							}
						}
					}
					break;
				}//End of the switch statement
			}
			catch (var e:Exception)
			{
				e.printStackTrace();
				//e.printStackTrace(System.out);
				//System.exit(0);
				return;
			}
			
			Console.OUT.println("Done execution");

			try
			{
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