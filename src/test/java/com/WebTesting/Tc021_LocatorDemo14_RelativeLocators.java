package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Tc021_LocatorDemo14_RelativeLocators {

	public static void main(String[] args)
	{
		//create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		//enter email id which is above password
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password"))).sendKeys("test@gmial.com");
		
		//enter password which is below emailId
		
		driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id"))).sendKeys("test123");
		
		//click on checkbox which is near to Remember me text
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
		
		//toLeftOf : enter into searchbox which is left of SignIn
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toLeftOf(By.linkText("Sign In"))).sendKeys("CRM");
		
		//toRightOf(): clear the search box which is right side of Customer Service
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toRightOf(By.linkText("Customer Service"))).clear();
		
		
		
		
		
		
		
		
		
		
		
	}

}
