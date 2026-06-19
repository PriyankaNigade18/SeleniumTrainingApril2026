package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc004_IdentifyElement {

	public static void main(String[] args) 
	{
		// create driver session with chrome
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//technique3: Identify element + Perform action
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		
		/*
		//technique2: Identify Element+ validate +perform action
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		
		//validate
		if(searchBox.isDisplayed() && searchBox.isEnabled())
		{
			//action
			searchBox.sendKeys("Java");
		}
		
		
		
		/*
		//technique1: By Locator
		//By is class in selenium which get the locator
		By searchBoxAddress=By.id("APjFqb");
		
		//findelement
		WebElement searchEle=driver.findElement(searchBoxAddress);
		
		//validate webelement
		System.out.println("Is Search box is displayed?: "+searchEle.isDisplayed());
		System.out.println("Is searchbox is enabled?: "+searchEle.isEnabled());
		
		//perform action on weblement
		searchEle.sendKeys("Jenkins");
		*/
		
		
		
		
		
		

	}

}
