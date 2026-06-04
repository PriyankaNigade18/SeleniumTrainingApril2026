package com.OOP.DataAbstraction;


/*
 * Any class design with abstract keyword is called abstract class
 * Abstract class can have implemented and nonimplemented method
 * Any method design without body is called abstract method and has to define with keyword
 * abstract
 * -Every nonimplemented method can be implement with child class
 * 
 * -As absract class is not fully implemented class and that is reason we 
 * cannot create object for Abstarct class
 * 
 * Abstrcact class used to achive partial abstraction
 *  
 */
public abstract class Page 
{
	
	//fully implemented method
	public void getTitle()
	{
		System.out.println("Application title");
	}
	
	//Method without body: abstract method
	public abstract void getElement();
	
	public static void main(String args[])
	{
		
		//Page p1=new Page();//Cannot instantiate the type Page
		
		
		
		
		
	}
	
	
	

}
