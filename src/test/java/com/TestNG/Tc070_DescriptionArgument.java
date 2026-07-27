package com.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc070_DescriptionArgument 
{
  @Test(priority=1,description = "This is chrome Test")
  public void testChrome()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
  
  
  @Test(priority=2,description = "This is edge Test")
  public void testEdge()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
  
  
  @Test(priority=3,description = "This is Firefox Test")
  public void testFirefox()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
}
