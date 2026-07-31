package com.TestNG.DataPassing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc083_ClassLevel1 {

	  @Test(description = "This is edge Test")
	  public void testEdge()
	  {
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.facebook.com");
		  System.out.println("Title is: "+driver.getTitle());
		  
	  }
}
