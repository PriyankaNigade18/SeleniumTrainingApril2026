package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc058_DisableNotification {
  @Test
  public void testDisableNotification() 
  {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
			  	  
	  WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.goibibo.com/flights/");
  }
}
