package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc054_StartMaximizeBrowser {
  @Test
  public void testMaximizeCapability() 
  {
	  
	  //start session in maximize mode
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("start-maximized");
	  
	  
	  
	  WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.google.com");
	  
	  
	  
	  
  }
  
  
}
