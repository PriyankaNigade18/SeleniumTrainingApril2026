package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc009_InterviewQuestion_Naukari {

	public static void main(String[] args) 
	{
		// create driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com");
		
		/*
		 * Scenario:Identify Total links then get the text and href attribute value
		 * search for any link
		 * 
		 */
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links found: "+allLinks.size());
		
		String exp="https://www.naukri.com/fresher-jobs";
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
			try {
			if(i.getDomAttribute("href").contains(exp))
			{
				System.out.println("Search href value found!");
				break;
			}
			}catch(NullPointerException n)
			{
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
