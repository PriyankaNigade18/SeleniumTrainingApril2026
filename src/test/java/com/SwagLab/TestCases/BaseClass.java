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
import com.SwagLab.Utility.PropertiesUtil;

public class BaseClass 
{

	public WebDriver driver;
	public LoginPage loginPage;
	public InventoryPage inventoryPage;
	public  CartPage cartPage;
	public CheckoutPage checkoutPage;
	public OverviewPage overviewPage;
	public PropertiesUtil prop;
	
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
		
		driver.get(PropertiesUtil.getProperties("url"));
		loginPage=new LoginPage(driver);
		inventoryPage=new InventoryPage(driver);
		cartPage=new CartPage(driver);
		checkoutPage=new CheckoutPage(driver);
		overviewPage=new OverviewPage(driver);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
