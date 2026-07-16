package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class TC044_DynamicWebTableAutomation {
  @Test
  public void testDynamicTable()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll the page upto Dynamic table
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  //heading
	 List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
	  System.out.println("Total headings are: "+allHeadings.size());
	  
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("-------specific column-----------------");
	  
	  String expCell="Network (Mbps)";
	  int count=0;
	  for(WebElement i:allHeadings)
	  {
		  count++;
		  if(i.getText().contains(expCell))
		  {
			  //position of that column
			  System.out.println("Expected column "+expCell+" found at cell position: "+count);
			  List<WebElement> allCellData=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+count+"]"));
			  
			  for(WebElement cellData:allCellData)
			  {
				  System.out.println(cellData.getText());
			  }
		  }
	  }
	  
	  System.out.println("-------specific row-----------------");
	  
	  List<WebElement> allNames=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td[1]"));
	  
	  String bname="Chrome";
	  int rcount=0;
	  for(WebElement i:allNames)
	  {
		  rcount++;
		  if(i.getText().contains(bname))
		  {
			  System.out.println("Expected browser "+bname+" found at position: "+rcount);
			  List<WebElement> allRowData=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr["+rcount+"]//td"));
			  for(WebElement row:allRowData)
			  {
				  System.out.println(row.getText());
			  }
		  }
	  }
	  
	  System.out.println("------------------UseCases---------------");
	  //CPU load of Chrome process: 4.7%

	  List<WebElement> nameColumn=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td[1]"));
	  
	  for(WebElement i:nameColumn)
	  {
		  if(i.getText().contains("Chrome"))
		  {
			  String actCPULoad=driver.findElement(By.xpath("//table[@id='taskTable']//td[text()='Chrome']//following-sibling::td[contains(text(),'%')]")).getText();
			  
			  String expCPULoad=driver.findElement(By.cssSelector("strong.chrome-cpu")).getText();
			  
			  if(actCPULoad.equals(expCPULoad))
			  {
				  System.out.println("CPU load match: "+actCPULoad);
			  }
			  else
			  {
				  System.out.println("CPU load not matched!");
			  }
			  
		  }
	  }
	  
	  
	  
	  /* Assignment
	   * Memory Size of Firefox process: 30.1 MB

	Network speed of Chrome process: 4.3 Mbps

	Disk space of Firefox process: 0.22 MB/s
	   */
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
}
