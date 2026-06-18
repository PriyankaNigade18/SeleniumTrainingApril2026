package com.WebTesting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc001_FirstTest {

	public static void main(String[] args) 
	{
		//ctrl+shift+O:Automatic import
		
		//create driver session with chrome
		
		WebDriver driver=new ChromeDriver();
	
		
		//create driver session edgeBrowser
		WebDriver driver2=new EdgeDriver();
		
		//create driver session with firefoxBroswer
		WebDriver driver3=new FirefoxDriver();
		
		
		//SearchContext sc=new ChromeDriver();
		
		
		

	}

}
