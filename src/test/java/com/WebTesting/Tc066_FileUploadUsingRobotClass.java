package com.WebTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc066_FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException, InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //InvalidArgumentException: invalid argument
	  //driver.findElement(By.id("file-upload")).click();
	  
	  WebElement ele=driver.findElement(By.id("file-upload"));
	  
	  Actions act=new Actions(driver);
	  act.click(ele).perform();
	  
	  //Robot class is Java Class
	  Robot rb=new Robot();
	  rb.delay(3000);
	  
	  //copy(clipboard action ctrl+c) file path
	  StringSelection sc=new StringSelection(System.getProperty("user.dir")+"\\Files\\Appiumsetup.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  //paste (ctrl+v)in file window
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  //release
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //press enter key
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(1000);
	  driver.findElement(By.id("file-submit")).click();
	  
	  Thread.sleep(1000);
	  String text=driver.findElement(By.tagName("h3")).getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
  }
}
