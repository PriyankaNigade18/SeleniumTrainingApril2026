package com.TestNG.PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
	public WebDriver driver;
	public  LoginPage loginPage;
	
	
	@BeforeClass
	public void setup()
	{
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/login.html");
		loginPage=new LoginPage(driver);
	}

}
