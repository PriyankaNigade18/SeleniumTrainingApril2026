package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc043_StaticWebTableAutomation {
  @Test
  public void testStaticTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll the page upto Static table
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  
	  System.out.println("------Number of rows-----");
	  
	  int totalRows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
	  System.out.println("Total number of rows are: "+totalRows);//7
	  
	  System.out.println("------Number of columns-----");
	  //row--->cell--->value
	  
	  int totalCells=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td")).size();
	  System.out.println("Total number of Columns are: "+totalCells);//4
	  
	  System.out.println("------Specific row data-----");
	  
	  List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td"));
	  for(WebElement i:row)
	  {
		  System.out.print(i.getText()+" ");
	  }
	  
	  System.out.println("------Specific Column data-----");

	  List<WebElement> cell=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[2]"));
	  for(WebElement i:cell)
	  {
		  System.out.println(i.getText());
		  
	  }
	  
	  System.out.println("-----Total Book Price------");
	  
	  
	  List<WebElement> allPrice=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
	  
	  int total=0;
	  for(WebElement price:allPrice)
	  {
		  String data=price.getText();
		  //string to int
		  int value=Integer.parseInt(data);
		  total=total+value;		  
	  }
	  
	  
	  System.out.println("Total Books price is: "+total);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
