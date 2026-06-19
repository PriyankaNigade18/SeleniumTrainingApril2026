package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc005_LocatorDemo1_LinkAutomation {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://automationplayground.com/crm/");
		
		//Sign In link: linkText: Full text
		//driver.findElement(By.linkText("Sign In")).click();
		
		//partial match: partialLinkText: partial text
		driver.findElement(By.partialLinkText("In")).click();
		
		
		

	}

}
