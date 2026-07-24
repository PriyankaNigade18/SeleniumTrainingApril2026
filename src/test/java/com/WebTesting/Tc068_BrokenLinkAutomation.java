package com.WebTesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc068_BrokenLinkAutomation {
  @Test
  public void testLink() 
   {
	  
	  WebDriver driver=new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  //get all links & then validate
	  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	  System.out.println("Total links on page: "+allLinks.size());
	  
	  
	  int validLink=0;
	  int brokenLink=0;
	  
	  //check link is having href attribite? because iof href not available then we will skip that link
	  for(WebElement i:allLinks)
	  {
		  String hrefValue=i.getDomAttribute("href");
		  
		  
		  if(hrefValue==null || hrefValue.isEmpty())
		  {
			  //skip
			  continue;
		  }
		  
		  //valid link send request to server
		  
		  //href convert into url to send server
	
			URL url;
			try {
				url = new URI(hrefValue).toURL();
				//server connection
				HttpURLConnection httpUrl=(HttpURLConnection)url.openConnection();
				httpUrl.connect();
				
				//response
				int statusCode=httpUrl.getResponseCode();
				
				if(statusCode>=400)
				{
					System.out.println("=====Broken link====");
					brokenLink++;
				}else
				{
					System.out.println("======Valid link======");
					validLink++;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			
			  
	  }
	  
	  System.out.println("Total Broken links are: "+brokenLink);
	  
	  
	  
	   
	  
  }
}
