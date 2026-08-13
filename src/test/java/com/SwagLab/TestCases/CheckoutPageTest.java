package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Utility.PropertiesUtil;

public class CheckoutPageTest  extends BaseClass
{
	@BeforeClass
	public void pageSetup()
	{

		inventoryPage=loginPage.doLogin(PropertiesUtil.getProperties("un"),PropertiesUtil.getProperties("psw"));
		inventoryPage.addProductIntoCart(PropertiesUtil.getProperties("pname2"));
		cartPage=cartPage.launchCartPage();
		checkoutPage=cartPage.launchCheckoutPage();
	}
	
	
	
  @Test
  public void validateCheckout()
  {
	  
	  overviewPage=checkoutPage.doCheckoutProcess(PropertiesUtil.getProperties("fn"),PropertiesUtil.getProperties("ln"),PropertiesUtil.getProperties("code"));
	  String actUrl=loginPage.getPageUrl();
	  Assert.assertEquals(actUrl,"https://www.saucedemo.com/checkout-step-two.html");
	  System.out.println("Checkout process completed!");
  }
}
