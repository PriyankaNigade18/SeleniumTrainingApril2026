package com.WebTesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc034_WindowHandling {
  @Test
  public void testWindowHandling()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //parent window
	  
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  //click link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //window:childWindow
	   
	  Set<String> allWindowsId=driver.getWindowHandles();
	  System.out.println(allWindowsId);
	  System.out.println("Total Windows Open: "+allWindowsId.size());//2
	  
	  //child window
	  for(String childId:allWindowsId)
	  {
		  //when ids are not equal then switch
		  if(!parentId.equals(childId))
		  {
			  //driver switch to child id
			  driver.switchTo().window(childId);
			  driver.findElement(By.xpath("//button[text()='Contact Sales']")).click();
			  
			  //driver.close();//current active window it will close
			  
			  //driver.quit();//close all open windows open by selenium
			  
		  }
	  }
	  
	  //come back to parentWindow
	  driver.switchTo().window(parentId);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
