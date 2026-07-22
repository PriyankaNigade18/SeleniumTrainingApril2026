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

public class Tc060_ExplicitWaitUsingWebDriverWaitDemo1 {
  @Test
  public void testExplicitWait() 
  {
	  
	  //Identify Element using By class
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  By email=By.id("input-email");
	  By password=By.id("input-password");
	  By loginButton=By.xpath("//input[@value='Login']");
	  
	  WebElement emailEle=ElementUtil.waitForPresenceOfElement(driver,email);
	  emailEle.sendKeys("test2525@gmail.com");
	  
	  WebElement passwordEle=ElementUtil.waitForVisibilityOfElement(driver,password);
	  passwordEle.sendKeys("test123");
	  
	  WebElement loginEle=ElementUtil.waitForElementClickable(driver,loginButton);
	  loginEle.click();
	  
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for presence of element found by By.id: input-email###
	   * (tried for 5 seconds with 500 milliseconds interval)
	   * interval time it is polling time in selenium
	   * 
	   * default polling time: 0.5sec or 500milliseconds
	   * 
	   */
	  
	  
	  
	  /*
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailEle= wait.until(ExpectedConditions.presenceOfElementLocated(email));
	  emailEle.sendKeys("test@gmail.com");
	  
	  
	  WebElement passwordEle=wait.until(ExpectedConditions.visibilityOfElementLocated(password));
	  passwordEle.sendKeys("test123");
	  
	  
	  WebElement loginButtonEle=wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	  loginButtonEle.click();
	  
	  */
	  
  }
}
