package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc063_SVGElementAutomation {
  @Test
  public void testSVG()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  List<WebElement> allEle=driver.findElements(By.xpath("//*[name()='svg']"));
	  System.out.println("Total svg elements: "+allEle.size());
	  
	  for(WebElement i:allEle)
	  {
		  i.click();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
