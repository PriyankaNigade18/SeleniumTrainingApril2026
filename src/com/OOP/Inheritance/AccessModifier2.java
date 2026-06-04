package com.OOP.Inheritance;

public class AccessModifier2 
{

	int id=101;
	public String name="Kiran";
	private long phno=6897899980L;
	protected int acno=787878;
	
	public static void main(String[] args)
	{
		//same class	
		AccessModifier2 a1=new AccessModifier2();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
		

	}

}
