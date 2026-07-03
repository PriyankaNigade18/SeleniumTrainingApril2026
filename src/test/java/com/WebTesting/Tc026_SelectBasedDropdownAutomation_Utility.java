package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc026_SelectBasedDropdownAutomation_Utility {
  @Test
  public void testDropdown() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  //day
	  WebElement daydd=driver.findElement(By.className("day"));
	  ElementUtil.selectBasedDropdownTest(daydd,"27");
	  
	//month
	  WebElement monthdd=driver.findElement(By.className("month"));
	  ElementUtil.selectBasedDropdownTest(monthdd,"DEC");
	  
	  
	  //year
	  WebElement yearEle=driver.findElement(By.className("year"));
	  ElementUtil.selectBasedDropdownTest(yearEle,"2010");
	  
	  
	  
	  
	  
	  
	  
	  
//	  Select sc=new Select(daydd);
//	  System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
//	  List<WebElement> allOptions=sc.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("27"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
