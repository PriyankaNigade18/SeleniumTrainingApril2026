package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc031_JavascriptExecutorUseCases {
  @Test
  public void testUseCases() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  	driver.get("https://formy-project.herokuapp.com/form");
	  
	  	//to get the title Way1:driver.getTitle()
	  	System.out.println(driver.getTitle());
	  	
	  	//Using JavascriptExecutor interface here convert driver into Js
	  	JavascriptExecutor js=(JavascriptExecutor) driver;
	  	//get teh title
	  	String appTitle=js.executeScript("return document.title").toString();
	  	System.out.println(appTitle);
	  	
	  	
	  	//to refresh webpage
	  	driver.navigate().refresh();
	  	
	  	Thread.sleep(2000);
	  	
	  	//using javascript
	  	js.executeScript("history.go()");
	  	
	  	
	  	//how to enter text into element
	  	WebElement fname=driver.findElement(By.id("first-name"));
	  	js.executeScript("arguments[0].value='Priyanka'",fname);
	  	
	  	
	  	//how to click on element
	  	WebElement button=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	  	js.executeScript("arguments[0].click();",button);
	  
	  
  }
  
  
  
}
