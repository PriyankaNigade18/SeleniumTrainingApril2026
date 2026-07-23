package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc061_ExplicitWaitUsingWebDriverWaitDemo2 {
  @Test
  public void testDynamicWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  
	  By startBtn=By.xpath("//button[text()='Start']");
	  By heading=By.xpath("(//h4)[2]");
	  
	  
	  
	  driver.findElement(startBtn).click();
	  //wait
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//	  WebElement headingEle=wait.until(ExpectedConditions.visibilityOfElementLocated(heading));
	  
	  WebElement headingEle=ElementUtil.waitForVisibilityOfElement(driver,heading);
	  System.out.println(headingEle.getText());
	  
//	  String text=driver.findElement(heading).getText();
//	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
  }
}
