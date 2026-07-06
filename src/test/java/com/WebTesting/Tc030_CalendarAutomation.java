package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc030_CalendarAutomation {
  @Test
  public void testCalendar()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //open calendar
	  driver.findElement(By.cssSelector("div[class^='dateInputWrapper']")).click();
	  
	  //expected result
	  String day="27";
	  String month="December";
	  String year="2026";
	  
	  //month select
	  while(true)
	  {
	  String data=driver.findElement(By.cssSelector("p[class^='monthYear']")).getText();
//	  System.out.println(data);//July 2026
	  String actMonth=data.split(" ")[0];
	  String actYear=data.split(" ")[1];
	  
//	  System.out.println(actMonth);
//	  System.out.println(actYear);
	  
	  if(actMonth.contains(month) && actYear.contains(year))
	  {
		  System.out.println("Found Expected month and year");
		  break;
	  }
	  else
	  {
		  //click on arrow
		  driver.findElement(By.cssSelector("i[aria-label^='Next month']")).click();
	  }
	  }
	  
	   
	  //date select
	  
	  List<WebElement> allDates=driver.findElements(By.cssSelector("div[class^='date']>span"));
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(day))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
