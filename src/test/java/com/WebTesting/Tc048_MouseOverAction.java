package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc048_MouseOverAction {
  @Test
  public void testMouseOver() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.naukri.com/");
	  
	  
	  //mouseover on Jobs
	  WebElement ele=driver.findElement(By.xpath("//span[text()='Jobs']"));
	  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  List<WebElement> allOptions=driver.findElements(By.cssSelector("div.nI-gNb-Jobs>ul.nI-gNb-dropdownMenuGroup>li>a"));
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Remote jobs"))
		  {
			  i.click();
			  break;
			  
		  }
	  }
	  
	  
	  
	  
	  
	  
  }
}
