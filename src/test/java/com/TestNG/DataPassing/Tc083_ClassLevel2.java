package com.TestNG.DataPassing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc083_ClassLevel2 {

	  @Test(description = "This is chrome Test")
	  public void testChrome()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  System.out.println("Title is: "+driver.getTitle());
		  
	  }
}
