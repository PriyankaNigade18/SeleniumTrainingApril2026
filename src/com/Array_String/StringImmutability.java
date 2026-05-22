package com.Array_String;

public class StringImmutability {

	public static void main(String[] args)
	{

		//String is immutable so declare value we cannot modify
		
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1==s2);//Objectid-true
		
		s1=s1+"All";//here new object will create
		
		System.out.println(s1==s2);
		
		System.out.println("---------------");
		
		String name="Jay Nigade";
		name="Jay";
		
		System.out.println(name);
		
		

	}

}
