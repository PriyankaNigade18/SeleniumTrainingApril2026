package com.Methods_Constructor;

/*
 * What is Constructor
 * --------------------
 * -It is special method whose name is similar like its class name
 * -Constructor is used to initialized Object
 * -Constructor should not have any return type
 * 
 * Types of Constructor
 * ----------------------
 * 1.Default constructor(0 paramaters)
 * 	default constructor always get executed by JVM
 * 
 * 2.Parameterized Constrcutor
 * 	
 * 
 * When constructor get called?
 * -----------------------
 * At the time of Object creation we called defualt constructor
 * 
 *  this keyword
 * --------------
 * this keyword used to refer any current class instance variable or instance method
 * 
 * Automation
 * ================
 * Framework design -->POM page object model-->Constructor
 */
public class ConstructorBasics
{

	//default constructor
	public ConstructorBasics()
	{
		System.out.println("Default constructor is calling....");
	}
	
	
	//parametrized constructor
	public ConstructorBasics(int id,String name)//2 parameters
	{
		System.out.println("Parameterized constructor calling with id: "+id+" name "+name);
	}
	
	
	public static void main(String[] args)
	{

		ConstructorBasics c1=new ConstructorBasics();
		ConstructorBasics c2=new ConstructorBasics(101,"Sarang");
		

		
		
		
		
		
	}

}
