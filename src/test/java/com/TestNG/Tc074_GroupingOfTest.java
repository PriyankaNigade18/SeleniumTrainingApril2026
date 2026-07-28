package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc074_GroupingOfTest 
{
	 @Test(priority=1,groups = "SmokeTest")
	  public void registerTest() 
	  {
		  System.out.println("This is register test!");
	  }
	  
	  @Test(priority=2,groups = "SmokeTest")
	  public void loginTest() 
	  {
		  System.out.println("This is login test!");
	  }
	  
	  @Test(priority=3,groups = "RegressionTest")
	  public void searchProductTest() 
	  {
		  System.out.println("This is searchProduct test!");
	  }
	  
	  @Test(priority=4,groups = "RegressionTest")
	  public void addToCartTest() 
	  {
		  System.out.println("This is addToCart test!");
	  }
}
