package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc073_DisableTestCase
{
	  @Test(priority=1)
	  public void registerTest() 
	  {
		  System.out.println("This is register test!");
	  }
	  
	  @Test(priority=2)
	  public void loginTest() 
	  {
		  System.out.println("This is login test!");
	  }
	  
	  @Test(priority=3)
	  public void searchProductTest() 
	  {
		  System.out.println("This is searchProduct test!");
	  }
	  
	  @Test(priority=4,enabled=false)
	  public void addToCartTest() 
	  {
		  System.out.println("This is addToCart test!");
	  }
}
