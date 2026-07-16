package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc045_PaginationWebTable {
  @Test
  public void testPeginationTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  //count number of rows and cells at every page 
	  List<WebElement> allPages=driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
	  
	  for(WebElement page:allPages)
	  {
		  System.out.println("Page number: "+page.getText());
		  page.click();
		  int rows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
		  System.out.println("Number of Rows: "+rows);
		  
		  int cells=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr[1]/td")).size();
		  System.out.println("Number of cells: "+cells);
	  }
	  
	  
	  System.out.println("-----------------------");
	  
	  //for page 3 print all products data
	  
	  for(WebElement page:allPages)
	  {
		  if(page.getText().contains("3"))
		  {
			  //open page
			  page.click();
			  List<WebElement> allProductData=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
			  for(WebElement product:allProductData)
			  {
				  System.out.println(product.getText());
			  }
		  }
	  }
	  
	  System.out.println("------------------");
	  
	  //get the page 2 and from product click on Gaming Console
	  
	  for(WebElement page:allPages)
	  {
		  if(page.getText().contains("2"))
		  {
			  //open page
			  page.click();
			  List<WebElement> allProductData=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
			  for(WebElement product:allProductData)
			  {
				  if(product.getText().contains("Gaming Console"))
				  {
					  driver.findElement(By.xpath("//table[@id='productTable']//td[text()='Gaming Console']//following-sibling::td/input")).click();
					  break;
				  }
			  }
			  
		  }
	  }
	  
	  
	  
	  
  }
}
