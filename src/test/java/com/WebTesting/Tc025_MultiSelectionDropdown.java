package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc025_MultiSelectionDropdown {
  @Test
  public void testMultiSelectDropdown() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demoqa.com/select-menu");
	  
	  //select
	  WebElement dropdownEle=driver.findElement(By.id("cars"));
	  
	  Select sc=new Select(dropdownEle);
	  
	  System.out.println("Is dropdown support multiselection?: "+sc.isMultiple());
	  System.out.println("Is dropdown visible?: "+dropdownEle.isDisplayed());
	  
	  /*
	  //select multiple options
	  sc.selectByVisibleText("Opel");
	  sc.selectByValue("audi");
	  sc.selectByIndex(0);
	  */
	  
	  
	  List<WebElement> allOptions=sc.getOptions();
	  
	  for(WebElement i:allOptions)
	  {
	  	if((i.getText().contains("Opel"))||(i.getText().contains("Audi")))
		  {
			  i.click();
			  
		  }
	  }
	  
	  
	 
	    
	  
	  
	  
	  
  }
}
