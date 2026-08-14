package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Utility.PropertiesUtil;

public class OverviewPageTest extends BaseClass {

	@BeforeClass
	public void pageSetUp()
	{	
	inventoryPage=loginPage.doLogin(PropertiesUtil.getProperties("un"),PropertiesUtil.getProperties("psw"));
	inventoryPage.addProductIntoCart(PropertiesUtil.getProperties("pname2"));
	cartPage=cartPage.launchCartPage();
	checkoutPage=cartPage.launchCheckoutPage();
	checkoutPage.doCheckoutProcess(PropertiesUtil.getProperties("fn"),PropertiesUtil.getProperties("ln"),PropertiesUtil.getProperties("code"));
	}
	
	
	@Test(priority=1)
	public void getPaymentSummaryDetails()
	{
		overviewPage.getPaymentDetails();
	}
	
  @Test(priority=1)
  public void testCheckoutProcess() 
  {
	 String message= overviewPage.completeCheckoutProcess();
	 Assert.assertEquals(message,"Thank you for your order!");
	 System.out.println(message);
  }
}
