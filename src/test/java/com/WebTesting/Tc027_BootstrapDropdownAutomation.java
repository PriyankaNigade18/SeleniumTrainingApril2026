package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc027_BootstrapDropdownAutomation {
  @Test
  public void tesNonSelectTagBasedDropDown()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/select-menu");
	  
	  //dropdown ele
	  driver.findElement(By.xpath("(//div/input[contains(@id,'react-select')])[1]")).click();
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div[@role='listbox']//div[@role='option']"));
	  
	  System.out.println("Total options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("A root option"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
  }
}
