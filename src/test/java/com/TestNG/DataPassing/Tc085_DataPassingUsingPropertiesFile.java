package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.PropertiesUtil;

public class Tc085_DataPassingUsingPropertiesFile {
  @Test
  public void testPropertiesData()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(PropertiesUtil.getProperties("config","url"));
	  
	  driver.findElement(By.name("username")).sendKeys(PropertiesUtil.getProperties("config","un"));
	  driver.findElement(By.name("password")).sendKeys(PropertiesUtil.getProperties("config","psw"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}
