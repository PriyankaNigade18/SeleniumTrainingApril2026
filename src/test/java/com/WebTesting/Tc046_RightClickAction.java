package com.WebTesting;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc046_RightClickAction {
  @Test
  public void testRightClickAction() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //mouse operation: Actions class
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  List<WebElement> allOptions=driver.findElements(By.cssSelector("ul.context-menu-list>li>span"));
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Paste"))
		  {
			  i.click();
			  break;
		  }
		  
	  }
	  
	  
	  //alert handle
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
