package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc029_DatePickerAutomation {
  @Test
  public void testDatePicker()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/datepicker");
	  
	  
	  driver.findElement(By.id("datepicker")).sendKeys("08/06/2026");
	  
	  
	  
	  
	  
	  
  }
  
}
