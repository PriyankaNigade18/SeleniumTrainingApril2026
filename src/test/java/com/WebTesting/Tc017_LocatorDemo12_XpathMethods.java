package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc017_LocatorDemo12_XpathMethods {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		
		//click on Sell:xpath with text()
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		
		//click on Cart:xpath with normalize-space()
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		String text1=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println(text1);
		
		//search for watch:xpath with contains()
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("watch",Keys.ENTER);
		
		//clear the search text and  search for bags:xpath with starts-with()
		WebElement searchEle= driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
	
		//clear the text
		searchEle.clear();
		
		//search for bags
		searchEle.sendKeys("bag",Keys.ENTER);
		
		
		
		
		
		
		

	}

}
