package com.Methods_Constructor;

public class MethodTypes
{
	
	public void accept()
	{
		System.out.println("This is instance method");
	}
	
	public static void display()
	{
		System.out.println("This is static method");
		
	}

	public static void main(String[] args)
	{
			
			
			display();
			
			MethodTypes.display();
			
			//instance method Object is required
			MethodTypes m1=new MethodTypes();
			m1.accept();
			//he static method display() from the type MethodTypes should be accessed in a static way
			//m1.display();
			
			
			
			
			

	}

}
