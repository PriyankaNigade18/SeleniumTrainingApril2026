package com.TestNG.PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
  @Test(priority=1)
  public void verifyUrl() 
  {
//	  LoginPage lp=new LoginPage(driver);
	  String actUrl=loginPage.getAppUrl();
	  Assert.assertTrue(actUrl.contains("login"));
	  System.out.println("Url matched!..."+actUrl);
	  
	  
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String actTitle=loginPage.getAppTitle();
	  Assert.assertEquals(actTitle,"Customer Service - Login");
	  System.out.println("Title matched...."+actTitle);
  }
  
  
  @Test(priority=3)
  public void validateLogin()
  {
	  loginPage.doLogin("test@gmail.com","test123");
	  //Assertion
	  Assert.assertTrue(loginPage.getAppUrl().contains("customers"));
	  System.out.println("Login completed!");
  }
}
