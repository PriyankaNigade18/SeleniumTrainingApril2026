package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc003_NavigationCommands {

	public static void main(String[] args) throws InterruptedException
	{
		// create a driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//navigate to facebook
		driver.navigate().to("https://www.facebook.com");
		
		//IQ: what is difference between driver.get() and driver.navigate().to()

		//static wait
		Thread.sleep(1000);
		
		//navigate back
		driver.navigate().back();//google
		
		Thread.sleep(1000);
		
		//navigate forward
		driver.navigate().forward();//facebook
		
		Thread.sleep(1000);
		//refresh page
		driver.navigate().refresh();
		
		
		
		
		
	}

}
