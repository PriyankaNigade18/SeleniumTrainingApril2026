package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc072_TimeoutArgument {
  
	
	
	@Test(priority=1,timeOut=8000)
	  public void registerTest() throws InterruptedException 
	  {
		 System.out.println("Test started");
		   Thread.sleep(5000);
		  System.out.println("This is register test completed after 5sec!");
	  }
	  
	  @Test(priority=2,timeOut=3000)
	  public void loginTest() throws InterruptedException 
	  {  System.out.println("Test started");
		  Thread.sleep(4000);
		  System.out.println("This is login testcompleted after 3sec!");
	  }
	  
	  
}
