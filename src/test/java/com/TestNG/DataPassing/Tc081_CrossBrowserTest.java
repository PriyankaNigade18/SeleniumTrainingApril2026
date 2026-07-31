package com.TestNG.DataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc081_CrossBrowserTest
{
	 WebDriver driver;
	 
	@Parameters({"bname"}) 
  @Test
  public void testBrowser(String bname) 
  {
	  
	  switch(bname.toLowerCase().trim())
	  {
	  case "chrome":
		  driver=new ChromeDriver();
		  break;
		  
	  case "edge":
		   driver=new EdgeDriver();
		  break;
		  
		  
	  case "firefox":
		   driver=new FirefoxDriver();
		  break;
	  }
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
	    
  }
}
