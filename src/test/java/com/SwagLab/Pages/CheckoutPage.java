package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Checkout: Your Information']")
	WebElement checkoutHeader;
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	public String getTextOfHeader()
	{
		return checkoutHeader.getText();
	}
	
	
	
	public OverviewPage doCheckoutProcess(String fn,String ln,String pc)
	{
			fname.sendKeys(fn);
			lname.sendKeys(ln);
			postalCode.sendKeys(pc);
			System.out.println("User details fill up for User: "+fn);
			continueBtn.click();
			//navigation to overview page
			return new OverviewPage(driver);
		
	}
}
