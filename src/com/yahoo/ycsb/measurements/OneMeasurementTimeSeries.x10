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
import java.util.Vector;

import com.yahoo.ycsb.measurements.exporter.MeasurementsExporter;
import x10.util.ArrayList;

class SeriesUnit
{
	/**
	 * @param time
	 * @param average
	 */
	public def this(var time:Long, var average:Double) {
		this.time = time;
		this.average = average;
	}
	public var time:Long;
	public var average:Double; 
}

/**
 * A time series measurement of a metric, such as READ LATENCY.
 */
public class OneMeasurementTimeSeries extends OneMeasurement 
{
	/**
	 * Granularity for time series; measurements will be averaged in chunks of this granularity. Units are milliseconds.
	 */
	public static val GRANULARITY:String="timeseries.granularity";
	
	public static val GRANULARITY_DEFAULT:String="1000";
	
	var _granularity:Int;
	var _measurements:ArrayList[SeriesUnit];
	
	var start:Long=-1;
	var currentunit:Long=-1;
	var count:Int=0;
	var sum:Int=0;
	var operations:Int=0;
	var totallatency:Long=0;
	
	//keep a windowed version of these stats for prInting status
	var windowoperations:Int=0;
	var windowtotallatency:Long=0;
	
	var min:Int=-1;
	var max:Int=-1;

	private var returncodes:HashMap[Int, Array[Int]];
	
	public def this(var name:String, var props:Properties)
	{
		super(name);
		_granularity=Int.parseInt(props.getProperty(GRANULARITY,GRANULARITY_DEFAULT));
		_measurements=new ArrayList[SeriesUnit]();
		returncodes=new HashMap[Int,Array[Int]]();
	}
	
	def checkEndOfUnit(var forceend:Boolean):void
	{
		var now:Long=System.currentTimeMillis();
		
		if (start<0)
		{
			currentunit=0;
			start=now;
		}
		
		var unit:Long=((now-start)/_granularity)*_granularity;
		
		if ( (unit>currentunit) || (forceend) )
		{
			var avg:Double=(sum as Double)/(count as Double);
			_measurements.add(new SeriesUnit(currentunit,avg));
			
			currentunit=unit;
			
			count=0;
			sum=0;
		}
	}
	
	//@Override
	public def measure(var latency:Int):void 
	{
		checkEndOfUnit(false);
		
		count++;
		sum+=latency;
		totallatency+=latency;
		operations++;
		windowoperations++;
		windowtotallatency+=latency;
		
		if (latency>max)
		{
			max=latency;
		}
		
		if ( (latency<min) || (min<0) )
		{
			min=latency;
		}
	}


  //@Override
  public def exportMeasurements(var exporter:MeasurementsExporter) throws java.io.IOException:void
  {
    checkEndOfUnit(true);

    exporter.write(getName(), "Operations", operations);
    exporter.write(getName(), "AverageLatency(ms)", ((totallatency as Double)/(operations as Double)));
    exporter.write(getName(), "MinLatency(ms)", min);
    exporter.write(getName(), "MaxLatency(ms)", max);

    //TODO: 95th and 99th percentile latency

    for (I in returncodes.keySet())
    {
      var value:Array[Int]=returncodes.get(I).value;
      exporter.write(getName(), "Return="+I, value(0));
    }     

    for ( unit in _measurements)
    {
      exporter.write(getName(), (""+unit.time), unit.average);
    }
  }
	
	//@Override
	public def reportReturnCode(var code:Int):void {
		var Icode:Int=code;
		if (!returncodes.containsKey(Icode))
		{
			var value:Array[Int]=new Array[Int](1);
			value(0)=0;
			returncodes.put(Icode,value);
		}
		val i:Array[Int] = returncodes.get(Icode).value;
		val k:Int = i(0);
		i(0) = k + 1;
		//(0)++;
		returncodes.put(Icode, i);

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
