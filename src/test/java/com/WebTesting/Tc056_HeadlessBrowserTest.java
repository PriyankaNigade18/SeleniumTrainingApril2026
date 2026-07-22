package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc056_HeadlessBrowserTest {
  @Test
  public void testHeadless()
  {
	  			ChromeOptions option=new ChromeOptions();
	  			option.addArguments("--headless");
	  
	  		//Create driver session
			WebDriver driver=new ChromeDriver(option);
			
			System.out.println("Driver session started....");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			System.out.println("Application open...");
			//enter keyword into search box
			driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
			System.out.println("Search with keyword: Jenkins");
			
			
			List<WebElement> allOptions=driver.findElements(By.cssSelector("div[class='OBMEnb']>ul>li"));
			System.out.println("Total options are: "+allOptions.size());
			
			for(WebElement i: allOptions)
			{
				System.out.println(i.getText());
				
			}
			
			
  }
}
