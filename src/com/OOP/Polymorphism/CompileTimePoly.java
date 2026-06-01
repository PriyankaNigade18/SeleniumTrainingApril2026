package com.OOP.Polymorphism;

/*
 * What is Polymorphism
 * ------------------------
 * One thing in many form we can reuse that is polymorphism
 * 
 * Purpose
 * -------------
 * Polymorphism help to reuasibility of methods
 * 
 * What we can reuse in Java
 * --------------------------
 * 1.Methods
 * 2.Constructor
 * 
 * Constructor overloding is possible but not overriding
 * Main() overloading is possible but technically we never used 
 * 
 * Types of Polymorphism
 * ------------------------
 * 1.Compile time
 * 2.Run time
 * 
 * What is compile time polymorphism
 * -----------------------------------
 * It is also known as Method Overloading
 * 
 * Method can be overloaded only when method has same name with different signature and
 * defined in same class
 * 
 * What is different signature
 * ---------------------------
 * 1.Number of parameters
 * 2.different types of parameters
 * 3.different order of parameters
 * 
 * 
 * What is Run time polymorphism
 * -----------------------------------
 * It is also khnow as Method Overriding
 * 
 * -For Method overriding classes must be in a Is-a relation(Inheritance)
 * -Method can be overrided when same name method is declare in parent class
 * and in child class with same signature, then child class always override parent class method
 * 
 * How to achieve in Java polymorphism
 * --------------------------------------
 * Using method overloading and overriding
 * 
 * 
 * 
 */

public class CompileTimePoly
{
	//Number of parameters
	
	public void add()//0 parameter
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
		
	}
	
	public void add(int a,int b)//2 parameters
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a,int b,int c)//3 parameters
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	
	//different types of parameter
	
	public void add(double a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));	
	}

	//Differnt order of parameters
	public void add(int a,double b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//Constructor overloading
	
	CompileTimePoly()
	{
		System.out.println("default constructor");
	}
	
	CompileTimePoly(String msg)
	{
		System.out.println("Parameterized constructor: "+msg);
	}
	
	
	CompileTimePoly(int id)
	{
		System.out.println("Parameterized constructor: "+id);
	}
	
	public static void main(String[] args)
	{
		
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100,200.111);
		c1.add(200,900);
		c1.add(10, 20, 40);
		c1.add(222.22,90);
		
		
		CompileTimePoly c2=new CompileTimePoly("Hello all");
		
		
		

	}

}
