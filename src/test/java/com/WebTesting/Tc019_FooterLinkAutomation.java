package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tc019_FooterLinkAutomation {

	public static void main(String[] args) 
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> allOptions=driver.findElements(By.cssSelector("div.djRePY ul.uaSEY>li"));
		System.out.println("Total Footer links are: "+allOptions.size());
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		
		
		
	}

}
