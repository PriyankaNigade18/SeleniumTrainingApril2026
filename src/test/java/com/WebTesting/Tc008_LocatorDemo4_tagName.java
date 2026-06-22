package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc008_LocatorDemo4_tagName {

	public static void main(String[] args)
	{
		// create driversession
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of input boxes
		List<WebElement> inputBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total number of input boxes are: "+inputBoxes.size());//3
		
		//Number of images
		int totalImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Total Images are: "+totalImages);//3
		
		//number of Links 
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());//5
		
		//scenario: for every link get the text of link and get the value of href attribute
		
		for(WebElement i: allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
			
//			if(i.getDomAttribute("href").contains("https://www.youtube.com/c/OrangeHRMInc"))
//			{
//				System.out.println("Link found");
//				break;
//			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
