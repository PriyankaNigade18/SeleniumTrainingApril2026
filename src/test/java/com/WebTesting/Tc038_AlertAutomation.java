package com.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc038_AlertAutomation {
  @Test
  public void testAlert() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  	  
	  driver.findElement(By.name("login")).sendKeys("Priyanka");
	  
	  //click on button
	  driver.findElement(By.name("proceed")).click();
	  
	  //alert will appear
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  //Ok
	  alt1.accept();
	  
	  //password
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
  }
  
}
