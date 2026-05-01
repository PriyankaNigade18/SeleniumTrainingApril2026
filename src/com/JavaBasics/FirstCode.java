package com.JavaBasics;

public class FirstCode 
{
			//single line comment in java
			/*
			 * Multiple line comment in Java
			 * print(): this function print the data and control remain on same line
			 * println(): this function print the data and control will come to next line
			 */
	
	
	public static void main(String[] args)
	{
		//static keyword
		MethodIntro.show();
		
		System.out.println("Hello All!");
		System.out.println("Welcome to learn Java");
		System.out.print("Hi");
		System.out.print("Bye");
		System.out.println("Welcome to learn Selenium");
		System.out.println("Bye..");
		
		
		StudentData ss1=new StudentData();
		ss1.id=111;
		ss1.name="Kiran";
		ss1.display();
	}
	
	
	
	
	
}
