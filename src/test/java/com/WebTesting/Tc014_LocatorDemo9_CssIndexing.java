package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc014_LocatorDemo9_CssIndexing {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//username using cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		
		//password using cssSelector
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		//login
		driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
		
		//get the menu
		driver.findElement(By.cssSelector("i.oxd-userdropdown-icon")).click();
		
		//click on logout
		driver.findElement(By.cssSelector("ul[role='menu']>li:nth-child(4)")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
