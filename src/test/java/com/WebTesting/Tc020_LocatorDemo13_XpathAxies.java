package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc020_LocatorDemo13_XpathAxies {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=jbkjhkj&submit-name=");
		
		
		//get the parent tagname of John
		String ptag=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent tag name of John: "+ptag);//tr
		
		
		//geth the ancestor tagname of John
		String atag=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor relation of John: "+atag);
		
		
		//get the count of all childs from row 4
		int count=driver.findElements(By.xpath("//tbody/tr[4]//child::td")).size();
		System.out.println("Total child for row4 are: "+count);//5
		
		System.out.println("----------------------");
		//get the specific column username
		List<WebElement> allOptions=driver.findElements(By.xpath("//tbody/tr/td[4]"));
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		
		//following: find all the number of rows after john row:2
		
		int totalRows=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("Number of rows after John: "+totalRows);//2
		
		//find the number of <td> after John
		int totalTd=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("Total <td> tags are after John: "+totalTd);//13
		
		
		//Preceding: find total rows before John
		int totalProws=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("Number of rows before John row: "+totalProws);//4
		
		//find the total <td> which are before John
		int totalptd=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
		System.out.println("Number of td before John: "+totalptd);//16
		
		
		//sibling: preceding-sibling of John
		int ps=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();		
		System.out.println("Total preceding siblings of John : "+ps);//1
		
		//following-sibling of John
		int fs=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("Total Following siblings of John: "+fs);//3
		
		
		
		
				

	}

}
