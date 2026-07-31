package com.WebTesting.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil
{
	
	public static String getProperties(String fileName,String key)
	{
		 //set the file path :File class
		  File f1=new File(System.getProperty("user.dir")+"//TestData//"+fileName+".properties");
		  
		//create object of Properties class
		  Properties prop=new Properties();
		  
		  //read data as stream: FileInputStream class
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			 //load the file load(filestream)
			  prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return prop.getProperty(key);
		  
		 	
	}

}
