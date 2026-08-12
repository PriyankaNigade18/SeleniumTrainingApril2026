package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		inventoryPage=loginPage.doLogin("standard_user","secret_sauce");
	}
	
  @Test(priority=1)
  public void validatProductCount() 
  {
	  int count=inventoryPage.getProductsCount();
	  AssertJUnit.assertEquals(count,6);
	  System.out.println("Product count matched!"+count);
	 
  }
  
  
  @Test(priority=2)
  public void validatProductDetails() 
  {
	 inventoryPage.getProductDetails();
	 
  }
  
  
  @Test(priority=3)
  public void validatAddToCartFeature() 
  {
	  inventoryPage.addProductIntoCart("Sauce Labs Bolt T-Shirt");
	 
  }
  
  
}
