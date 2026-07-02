package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc023_DrodpdownAutomation_SelectBased {
  @Test
  public void testDropdown() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://formy-project.herokuapp.com/form");
	  
	  //dropdown element
	  WebElement dropdownEle=driver.findElement(By.id("select-menu"));
	  
	  System.out.println("Is this dropdown is visible?: "+dropdownEle.isDisplayed());//true
	  
	  //create object of Select class
	  Select sc=new Select(dropdownEle);
	  
	  System.out.println("Is dropdown support multiSelection?: "+sc.isMultiple());//false
	  
	  //select single option
	  
	  sc.selectByVisibleText("10+");
	  
	  Thread.sleep(2000);
	  
	  sc.selectByValue("2");
	  
	  Thread.sleep(2000);
	  
	  sc.selectByIndex(3);
	  
	  //To get all options from dropdown
	  
	  List<WebElement> allOptions=sc.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("0-1"))
		  {
			  //select that option
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
