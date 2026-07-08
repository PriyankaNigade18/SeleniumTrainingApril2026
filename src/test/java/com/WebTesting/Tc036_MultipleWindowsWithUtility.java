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

import com.WebTesting.Generic.ElementUtil;

public class Tc036_MultipleWindowsWithUtility {
  @Test
  public void f() throws InterruptedException
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
	  
	  
	  ElementUtil.switchToExepectedWindow(driver,allWindows,"Facebook");
	  
	  Thread.sleep(2000);
	  
	  ElementUtil.switchToExepectedWindow(driver,allWindows,"YouTube");
	  
	  Thread.sleep(2000);
	  
	  ElementUtil.switchToExepectedWindow(driver, allWindows,"LinkedIn");
	  
	  Thread.sleep(2000);
	  
	  ElementUtil.switchToParentWindow(driver,parentId);
	  
	  Thread.sleep(2000);
	  
	  //close only child windows
	  ElementUtil.closeAllChildWindows(driver,allWindows,parentId);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
