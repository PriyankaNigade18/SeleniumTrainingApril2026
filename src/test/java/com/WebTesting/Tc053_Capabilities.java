package com.WebTesting;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc053_Capabilities {
  @Test
  public void testAllCapabilities() 
  {
	  
	 ChromeDriver driver=new ChromeDriver();
	 
	 Capabilities cap=driver.getCapabilities(); 
	 System.out.println("Platform name: "+cap.getPlatformName());
	 System.out.println("Browser name: "+cap.getBrowserName());
	 
	 System.out.println("BroserVersion: "+cap.getBrowserVersion());
	 
	 //all properties
	 
	  Map<String,Object> prop=cap.asMap();
	  System.out.println("Total Capabilities:"+ prop.size());
	  System.out.println(prop);
	  
	  /*
	   * {acceptInsecureCerts=false,
	   *  browserName=chrome, 
	   *  browserVersion=150.0.7871.129, 
	   *  chrome={chromedriverVersion=150.0.7871.124 (9261fd0a595ac4964ea84e6bd4a025c1173a2ffa-refs/branch-heads/7871@{#3359}), userDataDir=C:\Users\piyun\AppData\Local\Temp\scoped_dir23000_1948499186}, fedcm:accounts=true, goog:chromeOptions={debuggerAddress=localhost:54190}, goog:processID=23344, networkConnectionEnabled=false, pageLoadStrategy=normal, platformName=windows, proxy=Proxy(), se:cdp=ws://localhost:54190/devtools/browser/b77c5028-48ee-4c43-80f0-15c0deda34d7, se:cdpVersion=150.0.7871.129, setWindowRect=true, 
	   *  strictFileInteractability=false, 
	   *  timeouts={implicit=0, pageLoad=300000, script=30000}, 
	   *  unhandledPromptBehavior=dismiss and notify, 
	   *  webauthn:extension:credBlob=true,
	   *   webauthn:extension:largeBlob=true, webauthn:extension:minPinLength=true, 
	   *   webauthn:extension:prf=true, 
	   *   webauthn:virtualAuthenticators=true}

	   */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
