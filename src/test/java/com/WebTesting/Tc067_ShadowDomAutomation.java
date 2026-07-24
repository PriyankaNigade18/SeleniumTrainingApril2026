package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc067_ShadowDomAutomation {
  @Test
  public void testShadowDomElement()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='ShadowDOM']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  //Logic: rule is use here only cssSelector
	  //maindocument--->shadow host--->shadow root--->shadow element
	  
	  WebElement shadowHost1=driver.findElement(By.cssSelector("#shadow_host"));
	  
	  //getShadowRoot()
	  SearchContext root1=shadowHost1.getShadowRoot();
	  String text1=root1.findElement(By.cssSelector("#shadow_content")).getText();
	  System.out.println("Shadow dom element text1 is: "+text1);
	  
	  //to get laptops-->root2-->host2-->root2-->element
	  
	  WebElement shadowHost2=root1.findElement(By.cssSelector("#nested_shadow_host"));
	  
	  SearchContext root2=shadowHost2.getShadowRoot();
	  
	  String text2=root2.findElement(By.cssSelector("#nested_shadow_content")).getText();
	  
	  System.out.println("Shadow dom element text2 is: "+text2);
	  
	  
	  //root1--->Blog link
	  //root1.findElement(By.linkText("Blog")).click();
	  WebElement link=root1.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']"));
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();",link);
	  
	  //back to main page
	  driver.navigate().back();
	  
	  
	  //root1--->inputbox
	  root1.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
