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
package com.yahoo.ycsb.measurements.exporter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * Write human readable text. Tries to emulate the previous prInt report method.
 */
public class TextMeasurementsExporter implements MeasurementsExporter
{

  private var bw:BufferedWriter;
  private var summaryFlg:Boolean;

  public def this(var os:OutputStream)
  {
    this.bw = new BufferedWriter(new OutputStreamWriter(os));
  }

  public def this(var os:OutputStream, var summaryFlg:Boolean)
  {
    this.bw = new BufferedWriter(new OutputStreamWriter(os));
    this.summaryFlg = summaryFlg;
  }
  
  public def write(var metric:String, var measurement:String, var i:Int) throws IOException:void
  {
	if(	  	 (measurement.equals("Operations") || 
			  measurement.equals("Throughput(ops/sec)") ||
			  measurement.equals("AverageLatency(ms)") ||
			  measurement.equals("MinLatency(ms)") ||
			  measurement.equals("MaxLatency(ms)") ||
			  measurement.equals("Return=0") ||
			  measurement.equals("Return=-1")) && summaryFlg){
					bw.write("[" + metric + "], " + measurement + ", " + i);
					bw.newLine();
	}
	
	  if(!summaryFlg){
		  bw.write("[" + metric + "], " + measurement + ", " + i);
		  bw.newLine();
	  }
  }

  public def write(var metric:String, var measurement:String, var d:Double) throws IOException:void
  {
	  if(	  (measurement.equals("Operations") || 
			  measurement.equals("Throughput(ops/sec)") ||
			  measurement.equals("AverageLatency(ms)") ||
			  measurement.equals("MinLatency(ms)") ||
			  measurement.equals("MaxLatency(ms)") ||
			  measurement.equals("Return=0") ||
			  measurement.equals("Return=-1"))&& summaryFlg){
		  bw.write("[" + metric + "], " + measurement + ", " + d);
		  bw.newLine();
	  }
	  
	  if(!summaryFlg){
		  bw.write("[" + metric + "], " + measurement + ", " + d);
		  bw.newLine();
	  }
  }

  public def close() throws IOException:void
  {
    this.bw.close();
  }

}
