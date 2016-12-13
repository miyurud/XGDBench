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

package com.yahoo.ycsb.measurements;

import java.io.IOException;
import java.text.DecimalFormat;
import x10.util.HashMap;
import java.util.Properties;

import com.yahoo.ycsb.measurements.exporter.MeasurementsExporter;


/**
 * Take measurements and maIntain a histogram of a given metric, such as READ LATENCY.
 * 
 * @author cooperb
 *
 */
public class OneMeasurementHistogram extends OneMeasurement
{
	public static val BUCKETS:String="histogram.buckets";
	public static val BUCKETS_DEFAULT:String="1000";

	var _buckets:Int;
	var histogram:Array[Int];
	var histogramoverflow:Int;
	var operations:Int;
	var totallatency:Long;
	
	//keep a windowed version of these stats for prInting status
	var windowoperations:Int;
	var windowtotallatency:Long;
	
	var min:Int;
	var max:Int;
	var returncodes:HashMap[Int,Array[Int]];

	public def this(var name:String, var props:Properties)
	{
		super(name);
		_buckets=Int.parseInt(props.getProperty(BUCKETS, BUCKETS_DEFAULT));
		histogram=new Array[Int](_buckets);
		histogramoverflow=0;
		operations=0;
		totallatency=0;
		windowoperations=0;
		windowtotallatency=0;
		min=-1;
		max=-1;
		returncodes=new HashMap[Int,Array[Int]]();
	}

	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.OneMeasurement#reportReturnCode(Int)
	 */
	//public synchronized void reportReturnCode(Int code)
	public atomic def reportReturnCode(var code:Int):void
	{
		var Icode:Int=code;
		if (!returncodes.containsKey(Icode))
		{
			var value:Array[Int]=new Array[Int](1);
			value(0)=0;
			returncodes.put(Icode,value);
		}
		//returncodes.get(Icode);
		//val a:Array[Int] = (returncodes.get(Icode).value);
		//(0)++
		
		val i:Array[Int] = returncodes.get(Icode).value;
		val k:Int = i(0);
		i(0) = k + 1;
		//(0)++;
		returncodes.put(Icode, i);
	}


	/* (non-Javadoc)
	 * @see com.yahoo.ycsb.OneMeasurement#measure(Int)
	 */
	//public synchronized void measure(Int latency)
	public atomic def measure(var latency:Int):void
	{
		if (latency>=_buckets)
		{
			histogramoverflow++;
		}
		else
		{
			//histogram(latency)++;
			val i:Int = histogram(latency);
			histogram(latency) = i + 1;
		}
		operations++;
		totallatency+=latency;
		windowoperations++;
		windowtotallatency+=latency;

		if ( (min<0) || (latency<min) )
		{
			min=latency;
		}

		if ( (max<0) || (latency>max) )
		{
			max=latency;
		}
	}


  //@Override
  public def exportMeasurements(var exporter:MeasurementsExporter) throws IOException:void
  {
    exporter.write(getName(), "Operations", operations);
    exporter.write(getName(), "AverageLatency(ms)", ((totallatency as Double)/(operations as Double)));
    exporter.write(getName(), "MinLatency(ms)", min);
    exporter.write(getName(), "MaxLatency(ms)", max);
    
    var opcounter:Int=0;
    var done95th:Boolean=false;
    
    for ( i in 0..(_buckets-1))
    {
      opcounter+=histogram(i);
      if ( (!done95th) && ((opcounter as Double)/(operations as Double)>=0.95) )
      {
        exporter.write(getName(), "95thPercentileLatency(ms)", i);
        done95th=true;
      }
      if ((opcounter as Double)/(operations as Double)>=0.99)
      {
        exporter.write(getName(), "99thPercentileLatency(ms)", i);
        break;
      }
    }

    for (I in returncodes.keySet())
    {
      var value:Array[Int]=returncodes.get(I).value;
      exporter.write(getName(), "Return="+I, value(0));
    }     

    for ( i in 0..(_buckets-1))
    {
      exporter.write(getName(), ("" + i), histogram(i));
    }
    exporter.write(getName(), ">"+_buckets, histogramoverflow);
  }

	//@Override
	public def getSummary():String {
		if (windowoperations==0)
		{
			return "";
		}
		var d:DecimalFormat = new DecimalFormat("#.##");
		var report:Double=(windowtotallatency as Double)/(windowoperations as Double);
		windowtotallatency=0;
		windowoperations=0;
		return "["+getName()+" AverageLatency(ms)="+d.format(report)+"]";
	}

}
