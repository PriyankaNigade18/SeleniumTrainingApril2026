package com.OOP.Inheritance;

public class SuperChild extends SuperParent
{
	int cid=111;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("Child Income is : $30000");
	}
	
	SuperChild()
	{
		super();
		System.out.println("Child constructor is calling....");
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
			
		//Object
		SuperChild c1=new SuperChild();
//		System.out.println(c1.pid);
//		c1.parentIncome();
//		System.out.println(c1.cid);
		c1.childIncome();
		

	}

}
