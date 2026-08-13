package com.SwagLab.TestCases;

import org.testng.annotations.Test;

import com.SwagLab.Utility.PropertiesUtil;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
	@Test(priority=1)
	public void verifyUrl()
	{
		String actUrl=loginPage.getPageUrl();
		AssertJUnit.assertEquals(actUrl,"https://www.saucedemo.com/");
		System.out.println("Url matched!"+actUrl);
		
		
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
		String actTitle=loginPage.getPageTitle();
		AssertJUnit.assertEquals(actTitle,"Swag Labs");
		System.out.println("Title matched! "+actTitle);
		
	}
	
	
  @Test(priority=3)
  public void validateLogin() 
  {
	  loginPage.doLogin(PropertiesUtil.getProperties("un"),PropertiesUtil.getProperties("psw"));
	  AssertJUnit.assertTrue(loginPage.getPageUrl().contains("inventory"));
  }
}
