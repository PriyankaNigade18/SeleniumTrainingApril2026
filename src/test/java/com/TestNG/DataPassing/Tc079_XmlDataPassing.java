package com.TestNG.DataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc079_XmlDataPassing
{
  @Parameters({"un","psw"})
  @Test
  public void testLogin(String usern,String passw) 
  {
	  System.out.println("User Name is: "+usern);
	  System.out.println("Password is: "+passw);
	  
  }
  
}
