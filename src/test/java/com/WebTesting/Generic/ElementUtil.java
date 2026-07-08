package com.WebTesting.Generic;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil 
{

	public static void selectBasedDropdownTest(WebElement ele,String value)
	{
		Select sc=new Select(ele);
		  System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
		  List<WebElement> allOptions=sc.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
	
	//Javascript Executor Scroll
	
	public static void scrollDown(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public static void scrollUp(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void scrollUptoElement(WebDriver driver,WebElement ele)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",ele);
		  
	}
	
	//windowHandling
	
	public static void switchToExepectedWindow(WebDriver driver,List<String> allWindows,String title)
	{
		for(String childId:allWindows)
		  {
			  String apptitle=driver.switchTo().window(childId).getTitle();
			  if(apptitle.contains(title))
			  {
				  System.out.println("Expected Window Found!");
				  System.out.println("Current URL: "+driver.getCurrentUrl());
				  	break;	  
			  }
		  }
	}
	
	
	public static void switchToParentWindow(WebDriver driver,String parentId)
	{
		driver.switchTo().window(parentId);
	}
	
	public static void closeAllChildWindows(WebDriver driver,List<String> allWindows,String parentId)
	{
		for(String childId:allWindows)
		  {
			if(!parentId.equals(childId))
			{
				driver.switchTo().window(childId).close();
			}
			  
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
