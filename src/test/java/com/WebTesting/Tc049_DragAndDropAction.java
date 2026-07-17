package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc049_DragAndDropAction {
  @Test
  public void testDragAndDrop()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  //frame automation
	  driver.switchTo().frame(0);
	  
	  WebElement srcEle=driver.findElement(By.id("draggable"));
	  WebElement targetEle=driver.findElement(By.id("droppable"));
	  
	  //mouse operation
	  Actions act=new Actions(driver);
	  //act.clickAndHold(srcEle).moveToElement(targetEle).release().build().perform();
	  act.dragAndDrop(srcEle,targetEle).perform();
	  
	  
	  
	  
	  
	  
  }
}
