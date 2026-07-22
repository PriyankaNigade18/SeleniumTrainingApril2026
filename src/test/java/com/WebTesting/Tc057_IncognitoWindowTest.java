package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc057_IncognitoWindowTest {
  @Test
  public void testForIncognitoBrowserWindow() 
  {
	  
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--incognito");
	    
	  
	  WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.facebook.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
}
