package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Tc002_BrowserCommands {

	public static void main(String[] args)
	{
		/*
		 * Scenario: Open Google application and test the title 
		 * 1.title should be Google
		 * 2.CurrentUrl should be https://www.google.com/
		 */
		
		
		//create driver session with Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com/");
		
		//get the current page title
		String appTitle=driver.getTitle();
		
		//validate it: title should be Google
		if(appTitle.equals("Google"))
		{
			System.out.println("Title match....Test Pass");
			System.out.println("Application title is: "+appTitle);
		}else
		{
			System.out.println("Title is not match...Test Fail");
		}
		
		
		//get the actual url of current page:getCurrentUrl()
		String actUrl=driver.getCurrentUrl();
		
		//validate partail url : expecting url should have google
		
		if(actUrl.contains("google"))
		{
			System.out.println("URL matched....Test pass");
			System.out.println(actUrl);
		}else
		{
			System.out.println("URL not matched...Test Fail");
		}
		
		
		
		//get the current page source
		
		System.out.println(driver.getPageSource());
		
		//close the browser
		//driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
