package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc011_LocatorDemo6_CssSymbol {

	/*
	 *  1. * : contains()
	 *  2. ^: startswith('prefix value')
	 *  3. $: endsWith('suffix value')
	 */
	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//search box: search for watch in search box using *contains()
		driver.findElement(By.cssSelector("input[id*='searchtext']")).sendKeys("watch",Keys.ENTER);
		
		//search box: clear the search text: clear() using ^ startsWith()
		driver.findElement(By.cssSelector("input[id^='two']")).clear();
		
		//search box: search for bags using $ endsWith()
		driver.findElement(By.cssSelector("input[id$='box']")).sendKeys("bags",Keys.ENTER);
		
		
		
		
		
		
		
		
		

	}

}
