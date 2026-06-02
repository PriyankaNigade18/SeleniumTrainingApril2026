package com.OOP.Inheritance;

/*
 * What is Inheritance
 * -----------------------
 * Accessing properties of one class into another class is called Inheritance
 * -It is Is-A relataion 
 * where we can provide relation between two classes with extends Keyword
 * 
 * 
 * Purpose?
 * ------------------
 * - To avoid duplication in code
 * - To reuse methods
 * - To achieve run time polymorphism
 * 
 * 
 * Real time example
 * ----------------------
 * Real Parent-chid relation
 *  
 * Types
 * ============
 * 1.Single level
 * 2.Multi level
 * 3.Hierachical 
 * 
 * We can not implement using extends keyword (here interface required)
 * 4.Multiple 
 * 5.Hybrid
 * 
 * Parent class can access only parent properties
 * Child class can access parent + child Properties
 * 
 * 
 */


class A
{
	public void m1()
	{
		System.out.println("m1() is calling....");
	}
}

class B extends A//here A is parent and B is child: Single level Inheritance
{
	public void m2()
	{
		System.out.println("m2() is calling....");
	}
}

class C extends B//B is parent and C is child and : Multilevel Inheritance
{
	public void m3()
	{
		System.out.println("m3() is calling....");
	}

}

class D extends A//A is parent and D is child:Heirchical Inheritance
{
	public void m4()
	{
		System.out.println("m3() is calling....");
	}
}



public class InheritanceDemo
{
	
	public static void main(String args[])
	{
		System.out.println("Scenario1: Parent class ref and Parent class object: Parent");
		
//		A a1=new A();
//		a1.m1();//individual
//		
		
		//Multilevel C--->B---->A
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();//individual
		
		//Heirchical D--->A<----B
		
		A a1=new A();
		a1.m1();//individual
		
		
		
		System.out.println("--------------------");
		
		System.out.println("Scenario2: Child class ref and Child class object: Parent+Child");
		
		B b1=new B();
		b1.m1();//inherited
		b1.m2();//individual
		
		//Multilevel C(child)--->B---->A
//		C c1=new C();
//		c1.m1();//inherited
//		c1.m2();//inherited
//		c1.m3();//individual
		
		//Heirchical D--->A<----B
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		
		System.out.println("--------------------");
		
		System.out.println("Scenario3: Parent class ref and Child class object: Parent");
		
//		A a2=new B();
//		a2.m1();
		
		//Multilevel C(child)--->B(Parent)---->A
		
//		B b2=new C();
//		b2.m1();//inherited
//		b2.m2();//individual
		
		
		//Heirchical D--->A<----B
	
		A a2=new D();
		a2.m1();//individual
		
		
		
		System.out.println("--------------------");
		
		System.out.println("Scenario4: Child class ref and parent class object: Invalid");
		
		//B b2=new A();
		
		
		
		
		
		
		
	}
	
	
	
	

}
