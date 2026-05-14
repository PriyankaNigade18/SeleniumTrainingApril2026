package com.Methods_Constructor;

//this can be used to return the current class instance from the method.

public class BuilderPattern
{
	
	//method into object
	public BuilderPattern startBrowser()
	{
		System.out.println("Start Chrome Browser....");
		return this;
	}
	
	public BuilderPattern openApp()
	{
		System.out.println("open application....");
		return this;
	}

	
	public void stopBrowser()
	{
		System.out.println("Stop Chrome Browser....");
	}


	public static void main(String[] args)
	{
		BuilderPattern b1=new BuilderPattern();
		b1.startBrowser().openApp().stopBrowser();
		
		/*
		 * method chaining/builder pattern 
		 * 
		 * when method returns current class object then method is responsible to call other
		 * method from the same class
		 */
//		b1.startBrowser().openApp().stopBrowser();
//		
//		b1.openApp();
//		b1.stopBrowser();
		// TODO Auto-generated method stub

	}

}
