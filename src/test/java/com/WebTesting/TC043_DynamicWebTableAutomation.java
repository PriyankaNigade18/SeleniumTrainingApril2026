package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class TC043_DynamicWebTableAutomation {
  @Test
  public void testDynamicTable()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll the page upto Dynamic table
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  //heading
	 List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
	  System.out.println("Total headings are: "+allHeadings.size());
	  
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("-------specific column-----------------");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
}
