package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc016_LocatorDemo11_XpathOperators_Indexing {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		
		//firstname: xpath with and operator
		driver.findElement(By.xpath("//input[@name='firstname' and @class='form-control']")).sendKeys("Leena");
		
		//lastname: xpath with or operator
		driver.findElement(By.xpath("//input[@name='lastname' or @class='form-contro']")).sendKeys("Patil");
		
		//Random data
		
		String email="leena"+System.currentTimeMillis()+"@gmail.com";
		
		
		//email: xpath with indexing
		driver.findElement(By.xpath(" (//input[@class='form-control'])[3]")).sendKeys(email);
		
		//telephone: xpath with position()
		driver.findElement(By.xpath(" (//input[@class='form-control'])[position()=4]")).sendKeys("7687987987");
		
		//password:idenxing
		driver.findElement(By.xpath(" (//input[@class='form-control'])[5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath(" (//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		
		//radio button 
		/*
		 * Check that is radio button is selected 
		 * if radio button is not selected then select it
		 */
		
		WebElement radioButton=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		System.out.println("Is yes radio button is selected?: "+radioButton.isSelected());
		
		if(!radioButton.isSelected())//if radio button is not selected then select it
		{
			//select it
			radioButton.click();
			
			
			
		}
		
		System.out.println("Is yes radio button is selected?: "+radioButton.isSelected());
		
		
		//chechbox click
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		
		//continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//success message
		String msg=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		
		
		System.out.println(msg);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
