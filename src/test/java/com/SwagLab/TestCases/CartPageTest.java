package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		loginPage.doLogin("standard_user","secret_sauce");
		
	}
  @Test(priority=1)
  public void verifyCartPageLaunch() 
  {
	  cartPage.launchCartPage();
	  AssertJUnit.assertTrue(loginPage.getPageUrl().contains("cart"));
	  System.out.println("Cart page open!");
  }
}
