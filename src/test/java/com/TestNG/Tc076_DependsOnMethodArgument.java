package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc076_DependsOnMethodArgument 
{
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("User should register....");
	  Assert.assertEquals(true,true);
	  
  }
  
  @Test(priority=2,dependsOnMethods = "registerTest")
  public void loginTest() 
  {
	  System.out.println("User should login....");
	  Assert.assertEquals(false,true);
	  
  }
  
  
  @Test(priority=3,dependsOnMethods = "loginTest")
  public void logoutTest() 
  {
	  System.out.println("User should logout....");
  }
  
}
