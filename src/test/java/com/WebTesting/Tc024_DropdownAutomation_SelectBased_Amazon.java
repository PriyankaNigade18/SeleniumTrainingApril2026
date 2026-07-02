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

public class Tc024_DropdownAutomation_SelectBased_Amazon {
  @Test
  public void testdDropdown()
  {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("https://www.amazon.in/");
	   
	   //find the dropdown element
	   WebElement dropDownEle=driver.findElement(By.id("searchDropdownBox"));
	   
	   //<select>
	   Select sc=new Select(dropDownEle);
	   System.out.println("Is dropdown is visible in DOM/it not hided inside DOM: "+dropDownEle.isDisplayed());
	   
	   //sc.selectByVisibleText("Books");//You may not select an option in invisible select:UnsupportedOperationException
	   
	   sc.selectByValue("search-alias=apparel");
	   
	   sc.selectByIndex(3);
	   
	   //get the all options
	   List<WebElement> allOptions=sc.getOptions();
	   
	   System.out.println("Total options are: "+allOptions.size());
	   
	   for(WebElement i:allOptions)
	   {
		   System.out.println(i.getText());
		   if(i.getText().contains("Prime Video"))
		   {
			   i.click();
			   break;
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
  }
}
