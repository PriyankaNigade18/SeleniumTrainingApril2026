package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc075_TestNGAssertion {
  @Test
  public void testHardAssertion()
  {
	  String act="Selenium WebDriver is webui automation test";
	  String exp="Selenium WebDriver is webui automation test/tool";
	  
	  //java.lang.AssertionError: String are not equal!
//	  Assert.assertEquals(act,exp,"String are not equal!");
//	  System.out.println("Strings are equal!");
	  
	  //Asserts that a condition is true. If it isn't, an AssertionError is thrown.
//	  Assert.assertTrue(act.contains("tool"),"Test Fail: Expected string is not found!");
//	  System.out.println("Test Pass: as Expected string found in Actual string....");
	  
	  //-ve scenarios
	  //Asserts that a condition is false. If it isn't, an AssertionError is thrown.
	  Assert.assertFalse(act.contains("Testng"),"Test Fail: when condition is true");
	  System.out.println("Test Pass: when condition fails");
	  
	   
//	  if(act.equals(exp))
//	  {
//		  System.out.println("Strings are equal!");
//	  }
//	  else
//	  {
//		  System.out.println("Strings are not equals");
//	  }
//	  
  }
  
  
   @Test
  public void testSoftAssertion()
  {
	   
	   int a=200,b=200;
	   
	   SoftAssert sf=new SoftAssert();
//	   sf.assertEquals(a,b,"Numbers are not equal");
//	   System.out.println("Numbers are equal");

	   sf.assertTrue(a==b,"Numbers are not equal");
	   System.out.println("Numbers are equal");
	   
	   sf.assertAll();
	   
	   
	   
	   
	  
	  
  }
}
