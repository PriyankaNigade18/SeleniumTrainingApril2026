package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc041_FrameAutomation {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://selectorshub.com/iframe-scenario/");
	  
	  
	  //frame with indexing
	  //driver.switchTo().frame(0);
	  
	  //frame with id/name
	 // driver.switchTo().frame("pact1");
	  
	  //frame with webelement
	  WebElement frameEle=driver.findElement(By.cssSelector("#pact1"));
	  
	  driver.switchTo().frame(frameEle);	  
	    
	  driver.findElement(By.cssSelector("#inp_val")).sendKeys("Selenium");
	  
	  
	  //second
	  driver.switchTo().frame("pact2");
	  
	  driver.findElement(By.id("jex")).sendKeys("Playwright");
	  
	  
	  //third
	  driver.switchTo().frame("pact3");
	  driver.findElement(By.id("glaf")).sendKeys("Automation Engg");
	 
	 
	  
	  
	  
	  
	  
  }
}
