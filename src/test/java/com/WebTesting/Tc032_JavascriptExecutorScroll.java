package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc032_JavascriptExecutorScroll {
  @Test
  public void testPageScroll() throws InterruptedException
  {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(2000);
	  
	  ElementUtil.scrollDown(driver);
	  Thread.sleep(2000);
	  ElementUtil.scrollUp(driver);
	  
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Clothing')]"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  
	 /* 
	  //scrollDown
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //scroll down
	    
	 // js.executeScript("window.scrollTo(0,5000)");
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  Thread.sleep(2000);
	  //scroll upto the webelement
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best offers on kitchen products from emerging brands')]"));
	    
	  //scroll up
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  
	  
	  */
	  
	  
	  
	  
  }
}
