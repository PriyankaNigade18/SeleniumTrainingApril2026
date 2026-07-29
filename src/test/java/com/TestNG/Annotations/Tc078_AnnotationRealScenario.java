package com.TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc078_AnnotationRealScenario extends BaseClass {

	@Test(priority = 1)
	public void testSignIn() {
		driver.findElement(By.linkText("Sign In")).click();
	}

	@Test(priority = 2)
	public void testCRMLogin() {
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-id")).click();
	}

	@Test(priority = 3)
	public void signOut() {
		driver.findElement(By.linkText("Sign Out")).click();
	}

}
