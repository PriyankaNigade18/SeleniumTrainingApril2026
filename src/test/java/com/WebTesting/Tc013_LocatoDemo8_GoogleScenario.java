package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc013_LocatoDemo8_GoogleScenario {

	public static void main(String[] args)
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		//enter keyword into search box
		driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
		
		
		//direct parent child locator used with">" sign
//		List<WebElement>allOptions=driver.findElements(By.cssSelector("ul[role='listbox']>li"));
//		System.out.println(allOptions.size());
//		
//		
//		driver.findElement(By.cssSelector("ul[role='listbox']>li:nth-child(7)")).click();
//				
		
		

		List<WebElement> allOptions=driver.findElements(By.cssSelector("div[class='OBMEnb']>ul>li"));
		System.out.println("Total options are: "+allOptions.size());
		
		for(WebElement i: allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("jenkins pipeline"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
	}

}
