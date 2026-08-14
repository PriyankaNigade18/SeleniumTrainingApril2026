package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLab.Utility.ElementUtil;

public class OverviewPage {

	private WebDriver driver;
	
	
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="div.summary_info>div[class $='label']")
	private List<WebElement> paymentSummary;
	
	@FindBy(id="finish")
	private WebElement finishBtn;
	
	@FindBy(css="h2.complete-header")
	private WebElement message;
	
	
	//methods
	
	public OverviewPage getPaymentDetails()
	{
		System.out.println("======Payment Summary======");
		for(WebElement i:paymentSummary)
		{
			System.out.println(i.getText());
		}
		
		return this;
	}
	
	
	public String completeCheckoutProcess()
	{ 
			
		finishBtn.click();
		 return message.getText();
		
	
	}
	
}
