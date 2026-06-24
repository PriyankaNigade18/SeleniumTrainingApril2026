package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc012_LocatorDemo7_cssSelectorParentChild {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		
		//get the entire list and print inside console:Parent to direct child 
		List<WebElement> allOptions=driver.findElements(By.cssSelector("div.list-group>a"));
		System.out.println("Total list options are: "+allOptions.size());
		
		for(WebElement i: allOptions)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("--------------------");
		//get the entire list and print inside console:Parent<aside> to indirect child <a>
		
		List<WebElement> allLinks=driver.findElements(By.cssSelector("aside a"));		
		
		System.out.println("Total links are: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
		}
		
		
		System.out.println("--------------------");
		
		//specific webelement form list
		driver.findElement(By.cssSelector("aside a:nth-child(3)")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
