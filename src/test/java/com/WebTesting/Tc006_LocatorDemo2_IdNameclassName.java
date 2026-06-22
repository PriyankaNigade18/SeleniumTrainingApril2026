package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc006_LocatorDemo2_IdNameclassName {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://automationplayground.com/crm/");
		
		//Maximize current browser
		driver.manage().window().maximize();

		//sign in
		driver.findElement(By.linkText("Sign In")).click();
		
		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox
		driver.findElement(By.id("remember")).click();
		
		//button InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		
		driver.findElement(By.className("btn-primary")).click();
		
		//signout
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
