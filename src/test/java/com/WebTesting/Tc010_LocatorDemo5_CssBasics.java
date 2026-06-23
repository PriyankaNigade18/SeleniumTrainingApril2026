package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc010_LocatorDemo5_CssBasics {

	public static void main(String[] args)
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email:tagname with id
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("test2525@gmail.com");
		
		
		//password:tagname with attribute
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");
		
			
		//login button:tagname with className
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		

		//login with tagname with id or attribute or className
		driver.findElement(By.cssSelector("input[type='submit'].btn.btn-primary")).click();
		
	}

}
