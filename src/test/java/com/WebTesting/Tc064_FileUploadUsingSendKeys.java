package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc064_FileUploadUsingSendKeys {
  @Test
  public void testFileUpload() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose file
	  driver.findElement(By.id("file-upload")).sendKeys(System.getProperty("user.dir")+"//Files//sample-upload.txt");
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  String status=driver.findElement(By.tagName("h3")).getText();
	  System.out.println(status);
	  
  }
}
