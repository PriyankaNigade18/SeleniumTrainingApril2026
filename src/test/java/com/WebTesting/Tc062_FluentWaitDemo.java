package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Tc062_FluentWaitDemo {
  @Test
  public void fluentWaitTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  
	  By startBtn=By.xpath("//button[text()='Start']");
	  By heading=By.xpath("(//h4)[2]");
	  
	  
	  
	  driver.findElement(startBtn).click();
	  
	  //fluent wait
	  FluentWait<WebDriver> wait=new FluentWait<>(driver)
			  .withTimeout(Duration.ofSeconds(5))
			  .pollingEvery(Duration.ofSeconds(2))
			  .ignoring(ElementNotInteractableException.class);
	  WebElement headingEle=wait.until(ExpectedConditions.visibilityOfElementLocated(heading));
	  System.out.println(headingEle.getText());
	  
	  
	  
	  
	  
	  
	  
  }
}
