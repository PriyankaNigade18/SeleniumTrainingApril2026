package com.TestNG.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//PageClass=Encapsulation=private data +public methods
public class LoginPage 
{	
	private WebDriver driver;
	
	//private locators
	private By emailId=By.id("email-id");
	private By password=By.id("password");
	private By submitBtn=By.id("submit-id");
	
	//constructor:To initialize Object
	public LoginPage(WebDriver driver)//access baseclass driver
	{
		this.driver=driver;
	}
	
	
	//public Action methods
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public void doLogin(String email,String psw)
	{
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(submitBtn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
