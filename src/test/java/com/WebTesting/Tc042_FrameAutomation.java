package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc042_FrameAutomation {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.name("mytext1")).sendKeys("frame1 is done");
	  
	  //driver has to come back to main document
	  //the main document when a page containsiframes. 
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(1);//NoSuchFrameException: no such frame
	  driver.findElement(By.name("mytext2")).sendKeys("frame2 is done");
	  
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  //frame3
	  driver.switchTo().frame(2);
	  driver.findElement(By.name("mytext3")).sendKeys("frame3 is done!");
	  
	  
	  //frame3--->child frame
	  WebElement ele=driver.findElement(By.tagName("iframe"));
	  driver.switchTo().frame(ele);
	  
	  driver.findElement(By.id("i9")).click();
	  
	  //comeback to parent frame
	  driver.switchTo().parentFrame();
	  
	  //clear the input box
	  driver.findElement(By.name("mytext3")).clear();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
