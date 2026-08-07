package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc087_DataDrivenTestUsingArray
{
//	@DataProvider(name="MyArrayData")
//	public Object[][] testData()
//	{
//		Object[][] data= {{"Admin","admin123"},{"Snehal","snehal123"},{"Kiran","kiran123"}};
//		return data;
//	}
//	
	
	
	
  @Test(dataProvider = "MyArrayData",dataProviderClass = CustomData.class)
  public void testLoginFunctionality(String un,String psw) throws InterruptedException
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
	  
	  //assertion
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Test Fail....Login Fail!");
	  System.out.println("Test Pass...Login Completed!");
	  
	  
	  
	  
	  
  }
}
