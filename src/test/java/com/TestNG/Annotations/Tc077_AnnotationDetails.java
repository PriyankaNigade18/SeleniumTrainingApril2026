package com.TestNG.Annotations;


import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Tc077_AnnotationDetails
{
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("BeforeMethod executes before every test case");
	}
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("AfterMethod executes after every test case");
	}
	
	@BeforeClass
	public void bClass()
	{
		System.out.println("BeforeClass executes before first test case");
	}
	
	@AfterClass
	public void aClass()
	{
		System.out.println("AfterClass executes after last test case");
	}
	
	

	@BeforeTest
	public void btest()
	{
		System.out.println("BeforeTest executes before class");
	}
	
	@AfterTest
	public void atest()
	{
		System.out.println("AfterTest executes after class");
	}
	
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("BeforeSuite executes before test");
	}
	
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("AfterSuite executes after test");
	}
	
	
  @Test(priority=1)
  public void testGoogle() 
  {
	  System.out.println("This is Google test case");
  }
  
  

  @Test(priority=2)
  public void testOpenCart() 
  {
	  System.out.println("This is Open Cart test case");
  }
  
  

  @Test(priority=3)
  public void testCrm() 
  {
	  System.out.println("This is CRM test case");
  }
  
  
  
}
