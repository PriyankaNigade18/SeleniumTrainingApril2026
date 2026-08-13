package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Utility.PropertiesUtil;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		inventoryPage=loginPage.doLogin(PropertiesUtil.getProperties("un"),PropertiesUtil.getProperties("psw"));
		inventoryPage.addProductIntoCart(PropertiesUtil.getProperties("pname2"));
		
	}
	
  @Test(priority=1)
  public void verifyCartPageLaunch() 
  {
	  cartPage.launchCartPage();
	  AssertJUnit.assertTrue(loginPage.getPageUrl().contains("cart"));
	  System.out.println("Cart page open!");
  }
  
  
  @Test(priority=2)
  public void verifyCartProduct()
  {
	  String pname=cartPage.getCartProductDetails();
	  Assert.assertEquals(pname,"Sauce Labs Fleece Jacket");
	  System.out.println("Product added into cart!");
  }
  
  
  @Test(priority=3) 
  public void validateProductRemove()
  {
	  cartPage.doRemoveProduct();
	  System.out.println("Product removed!");
  }
  
  @Test(priority=4)
  public void validateContinueShopping()
  {
	  inventoryPage=cartPage.doContinueShopping();
	  inventoryPage.addProductIntoCart(PropertiesUtil.getProperties("pname1"));
	 cartPage=cartPage.launchCartPage();
	  
  }
  
  
  @Test(priority=5)
  public void validateLauchOfCheckout()
  {
	  checkoutPage=cartPage.launchCheckoutPage();
	  Assert.assertTrue(checkoutPage.getTextOfHeader().contains("Checkout"));
	  System.out.println("Header: "+checkoutPage.getTextOfHeader());
	  
  }
  
  
  
  
  
  
}
