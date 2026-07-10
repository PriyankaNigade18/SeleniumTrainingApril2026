package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc040_AuthenticationPopupAutomation {
  @Test
  public void testAuthPopup() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String message=driver.findElement(By.id("content")).getText();
	  System.out.println(message);
	  
	  
	  
  }
}
