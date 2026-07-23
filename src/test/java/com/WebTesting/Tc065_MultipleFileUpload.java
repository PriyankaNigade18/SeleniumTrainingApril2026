package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc065_MultipleFileUpload {
  @Test
  public void testMultipleFileUpload()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Upload Files']"));
	  
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  //Choose file: multiple file separates using \n
	  driver.findElement(By.id("multipleFilesInput")).sendKeys(System.getProperty("user.dir")+"//Files//sample-upload.txt\n"+System.getProperty("user.dir")+"//Files//Appiumsetup.txt");
	  
	  driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
	  
	  String text=driver.findElement(By.id("multipleFilesStatus")).getText();
	  
	  if(text.contains("Multiple files selected"))
	  {
		  System.out.println("Multiple files selected");
	  }else
	  {
		  System.out.println("Multiple files not selected");
	  }
	  
	  
	  
	  
	  
	  
	  
  }
}
