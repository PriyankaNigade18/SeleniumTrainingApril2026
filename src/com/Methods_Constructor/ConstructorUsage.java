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
public class ConstructorUsage 
{
	int id;
	String name;
	
	ConstructorUsage()
	{
		System.out.println("Default constructor is calling....");
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
	
	ConstructorUsage(int i,String n)
	{
		//local data(i,n) initalized to instance data(id,name)
		id=i;
		name=n;
	}
	
	public void display()
	{
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
	
	
	public static void main(String[] args) 
	{
		ConstructorUsage c1=new ConstructorUsage();
		
		ConstructorUsage c2=new ConstructorUsage(101,"Pooja");
		c2.display();
		
		
		ConstructorUsage c3=new ConstructorUsage(102,"Amit");
		c3.display();
		

	}

}
