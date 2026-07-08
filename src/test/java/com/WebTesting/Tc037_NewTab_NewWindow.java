package com.WebTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.ElementUtil;

public class Tc037_NewTab_NewWindow {
  @Test
  public void testTabWindow()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
	  //new tab --->facebook
	 WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  
	  //newWindow ---->amazon
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  //to collect all windows
	  Set<String> allWins=driver.getWindowHandles();
	  List<String> allWindows=new ArrayList<String>(allWins);
	  System.out.println("Total windows: "+allWindows.size());
	  
	  ElementUtil.switchToExepectedWindow(driver,allWindows,"Google");
	  
	  
	  
	  
  }
}
