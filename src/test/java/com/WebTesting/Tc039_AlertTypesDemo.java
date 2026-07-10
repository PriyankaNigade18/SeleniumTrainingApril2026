package com.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc039_AlertTypesDemo {
	@Test
	public void testAlerts() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// alert1: Simple alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		// alert will appear
		Alert alt1 = driver.switchTo().alert();
		System.out.println("Alert 1 text is: " + alt1.getText());
		// ok
		alt1.accept();

		// result
		WebElement result = driver.findElement(By.id("result"));
		System.out.println("Alert 1 result: " + result.getText());

		System.out.println("--------------------");
		// alert2: Confirmation type alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(1000);
		// alert will appear
		Alert alt2 = driver.switchTo().alert();
		System.out.println("Alert 2 text is: " + alt2.getText());
		// cancel
		alt2.dismiss();

		System.out.println("Alert 2 result: " + result.getText());
		
		System.out.println("--------------------");
		//alert3: Prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(1000);
		
		Alert alt3=driver.switchTo().alert();
		System.out.println("Alert 3 text is: "+alt3.getText());
		
		//prompt
		alt3.sendKeys("Hello All");
		
		//Ok
		alt3.accept();
		
		System.out.println("Alert3 result is: "+result.getText());
		
		
		
		
		
		
		

	}
}
