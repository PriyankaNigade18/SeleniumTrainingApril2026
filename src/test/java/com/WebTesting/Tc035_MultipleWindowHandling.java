package com.WebTesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc035_MultipleWindowHandling {
  @Test
  public void testMultipleWindows()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  String parentId=driver.getWindowHandle();
	  
	  //click on every link 
	  List<WebElement> allLinks=driver.findElements(By.xpath("//a[@href]"));
	  for(WebElement i:allLinks)
	  {
		  i.click();
	  }
	  
	  Set<String> allWins=driver.getWindowHandles();
	  //set into list(order collection)
	  List<String> allWindows=new ArrayList<String>(allWins);
	  System.out.println("Total windows: "+allWindows.size());//6 windows
	 
	  
	  for(String childId:allWindows)
	  {
		  String title=driver.switchTo().window(childId).getTitle();
		  if(title.contains("YouTube"))
		  {
			  System.out.println("Expected Window Found!");
			  System.out.println("Current URL: "+driver.getCurrentUrl());
			  	break;	  
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
