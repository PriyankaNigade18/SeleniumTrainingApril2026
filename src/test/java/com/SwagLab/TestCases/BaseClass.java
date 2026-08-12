package com.SwagLab.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.SwagLab.Pages.*;

public class BaseClass 
{

	public WebDriver driver;
	public LoginPage loginPage;
	public InventoryPage inventoryPage;
	public  CartPage cartPage;
	
	@Parameters({"bname"})
	@BeforeClass
	public void setUp(String bname)
	{
		//driver=new EdgeDriver();
		switch(bname)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default:
			driver=new EdgeDriver();break;
		
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		loginPage=new LoginPage(driver);
		inventoryPage=new InventoryPage(driver);
		cartPage=new CartPage(driver);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
