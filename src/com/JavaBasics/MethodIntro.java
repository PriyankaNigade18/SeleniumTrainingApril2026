package com.JavaBasics;

public class MethodIntro
{
	
	//instance method
	public void accept()
	{
		System.out.println("This is accept() and instance method.....");
	}
	
	//static method
	public static void show()
	{
		System.out.println("This is show() and Static method.....");
	}
	
	

	public static void main(String[] args)
	{
			
		//static
		show();
		MethodIntro.show();
		
		//object
		MethodIntro m1=new MethodIntro();
		m1.accept();
		//The static method show() from the type MethodIntro should be accessed in a static way
		//m1.show();
		
		
		
		
		


	}

}
