package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc033_HiddenElementAutomation {
  @Test
  public void testHiddenElement()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.letskodeit.com/practice");
	  
	  //hide button
	  driver.findElement(By.id("hide-textbox")).click();
	  
	  //ele will hidden:ElementNotInteractableException: element not interactable as elemement is hidden
	  //driver.findElement(By.id("displayed-text")).sendKeys("Hello all");
	  
	  WebElement ele=driver.findElement(By.id("displayed-text"));
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  js.executeScript("arguments[0].value='Hello All!'",ele);
	  
	  
	  //disable/enable scenario
	  WebElement inputEle=driver.findElement(By.id("enabled-example-input"));
	  
	  System.out.println("current status for element is enabled? : "+inputEle.isEnabled());//true
	  
	  //make it disable
	  driver.findElement(By.id("disabled-button")).click();
	  
	  System.out.println("current status for element is disabled? : "+inputEle.isEnabled());//false

	  //ElementNotInteractableException: element not interactable
	  //inputEle.sendKeys("Hello");//element is disabled
	  
	  js.executeScript("arguments[0].value='Hello All!'",inputEle);

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
