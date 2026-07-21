package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc051_ToolTipAutomation {
  @Test
  public void testToolTip() 
  {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://jqueryui.com/tooltip/");
	  
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.cssSelector("input#age"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  
	  
	  String text=driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
	  
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
