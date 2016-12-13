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
import x10.util.HashMap;
import x10.util.Map;
import java.util.Properties;

import com.yahoo.ycsb.measurements.exporter.MeasurementsExporter;

/**
 * Collects latency measurements, and reports them when requested.
 * 
 * @author cooperb
 *
 */
public class Measurements
{
	private static val MEASUREMENT_TYPE:String = "measurementtype";

	private static val MEASUREMENT_TYPE_DEFAULT:String = "histogram";

	static val singleton:Array[Measurements]=new Array[Measurements](1);
	
	static val measurementproperties:Array[Properties]=new Array[Properties](1);
	
	//public static def setProperties(var props:Properties):void
	public static def setProperties(var props:Properties):void
	{
		measurementproperties(0)=props;
	}

      /**
       * Return the singleton Measurements object.
       */
	//public synchronized static Measurements getMeasurements()
	//public static def getMeasurements():Measurements
	public atomic static def getMeasurements():Measurements
	{
		if (singleton(0)==null)
		{
			singleton(0)=new Measurements(measurementproperties(0));
		}
		return singleton(0);
	}

	var data:HashMap[String,OneMeasurement];
	var histogram:Boolean=true;

	private var _props:Properties;
	
      /**
       * Create a new object with the specified properties.
       */
	public def this(var props:Properties)
	{
		data=new HashMap[String,OneMeasurement]();
		
		_props=props;
		
		if (_props.getProperty(MEASUREMENT_TYPE, MEASUREMENT_TYPE_DEFAULT).compareTo("histogram")==0)
		{
			histogram=true;
		}
		else
		{
			histogram=false;
		}
	}
	
	def constructOneMeasurement(var name:String):OneMeasurement
	{
		if (histogram)
		{
			return new OneMeasurementHistogram(name,_props);
		}
		else
		{
			return new OneMeasurementTimeSeries(name,_props);
		}
	}

      /**
       * Report a single value of a single metric. E.g. for read latency, operation="READ" and latency is the measured value.
       */
	//public synchronized void measure(String operation, Int latency)
	public atomic def measure(var operation:String, var latency:Int):void	
	{
		if (!data.containsKey(operation))
		{
//			synchronized(this)
			atomic
			{
				if (!data.containsKey(operation))
				{
					data.put(operation,constructOneMeasurement(operation));
				}
			}
		}
		try
		{
			data.get(operation).value.measure(latency);
		}
		catch (var e:java.lang.ArrayIndexOutOfBoundsException)
		{
			Console.OUT.println("ERROR: java.lang.ArrayIndexOutOfBoundsException - ignoring and continuing");
			e.printStackTrace();
			//e.printStackTrace(System.out);
		}
	}

      /**
       * Report a return code for a single DB operaiton.
       */
	public def reportReturnCode(var operation:String, var code:Int):void
	{
		if (!data.containsKey(operation))
		{
//			synchronized(this)
			atomic
			{
				if (!data.containsKey(operation))
				{
					data.put(operation,constructOneMeasurement(operation));
				}
			}
		}
		data.get(operation).value.reportReturnCode(code);
	}
	
  /**
   * Export the current measurements to a suitable format.
   * 
   * @param exporter Exporter representing the type of format to write to.
   * @throws IOException Thrown if the export failed.
   */
  public def exportMeasurements(var exporter:MeasurementsExporter) throws java.io.IOException:void
  {
    for (m:Map.Entry[String, OneMeasurement] in data.entries())
    {
    	m.getValue().exportMeasurements(exporter);
    }
  }
	
      /**
       * Return a one line summary of the measurements.
       */
	public def getSummary():String
	{
		var ret:String="";
		for (m:Map.Entry[String, OneMeasurement] in data.entries())
		{
			ret+=m.getValue().getSummary()+" ";
		}
		
		return ret;
	}
}
