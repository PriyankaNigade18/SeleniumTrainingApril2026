package com.OOP.Inheritance;



/*
 * What is Run time polymorphism
 * -----------------------------------
 * It is also khnow as Method Overriding
 * 
 * -For Method overriding classes must be in a Is-a relation(Inheritance)
 * -Method can be overrided when same name method is declare in parent class
 * and in child class with same signature, 
 * then child class always override parent class method
 * 
 * 
 * 
 */
public class Child extends Parent
{
	@Override
	public void color()
	{
		System.out.println("Yellow");
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		//Parent class ref and Parent class Object
		Parent p1=new Parent();
		p1.color();//Blue
		
		
		//Child class ref and child class object
		Child c1=new Child();
		c1.color();//yellow
		
		//Parent class ref and Child class Object
		Parent p2=new Child();
		p2.color();//yellow
		
		
		
		
		
		
		
		
		
	}

}
