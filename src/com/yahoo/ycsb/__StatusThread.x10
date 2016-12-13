package com.yahoo.ycsb;

import x10.util.ArrayList;

import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Random;
import java.util.Vector;

import com.yahoo.ycsb.measurements.Measurements;

/**
 * A thread to periodically show the status of the experiment, to reassure you that progress is being made.
 * 
 * @author cooperb
 *
 */
public class __StatusThread extends java.lang.Thread
{
	var _threads:ArrayList[java.lang.Thread];
	var _label:String;
	var _standardstatus:Boolean;
	
	/**
	 * The Interval for reporting status.
	 */
	public static val sleeptime:Long=10000;

	public def this(var threads:ArrayList[java.lang.Thread], var label:String, var standardstatus:Boolean)
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
		
		var alldone:Boolean;

		do 
		{
			alldone=true;

			var totalops:Int=0;

			//terminate this thread when all the worker threads are done
			var t:java.lang.Thread = null;
			val len:Int = _threads.size();
			for (i in 0..(len - 1))
			{
				t = _threads.get(i) as java.lang.Thread;
				if (t.getState()!=java.lang.Thread.State.TERMINATED)
				{
					alldone=false;
				}

				var ct:__ClientThread=t as __ClientThread;
				totalops+=ct.getOpsDone();
			}

			var en:Long=System.currentTimeMillis();

			var Interval:Long=en-st;
			//double throughput=1000.0*((double)totalops)/((double)Interval);

			var curthroughput:Double=1000.0*(((totalops-lasttotalops) as Double)/((en-lasten) as Double));
			
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

