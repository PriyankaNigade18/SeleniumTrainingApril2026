package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	//methods
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public InventoryPage doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginBtn.click();
		//loginpage navigating to inventory
		//navigation return next page object
		return new InventoryPage(driver);
		
	}
	
	
	
	
	
	
	

}
