package com.yahoo.ycsb.java;

public class Client_Java{
	public Class getWorkloadClass(String classToLoad){
		Class result = null;
		
		try 
		{
			ClassLoader classLoader = Client_Java.class.getClassLoader();
			result = classLoader.loadClass(classToLoad);
		}
		catch (java.lang.ClassNotFoundException ex) 
		{  
			ex.printStackTrace();
			//e.printStackTrace(System.out);
			//System.exit(0);
			return null;
		}
		
		return result; 
	}
}


