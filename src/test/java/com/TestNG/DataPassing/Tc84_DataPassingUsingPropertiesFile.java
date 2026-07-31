package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Tc84_DataPassingUsingPropertiesFile 
{
  @Test
  public void readFileData() throws IOException
  {   /*to get current project path
	  
	  1.System.getProperty("user.dir")
	  2. ./
	  
	  */
	  //set the file path :File class
	  File f1=new File(System.getProperty("user.dir")+"//TestData//config.properties");
	  
	  //read data as stream: FileInputStream class
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //create object of Properties class
	  Properties prop=new Properties();
	  
	  //load the file load(filestream)
	  prop.load(fs);
	  
	  //read contents of file: getProperty("key")
	  System.out.println("Browser name is: "+prop.getProperty("browserName"));
	  System.out.println("Browser version is: "+prop.getProperty("browserVersion"));

	  System.out.println("Platform is: "+prop.getProperty("platform"));
	  
	  
	  
	  
  }
}
