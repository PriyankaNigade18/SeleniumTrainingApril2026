package com.JavaBasics;

public class VariablesDemo
{
	static String clgName="AISSPMS";
	
	//instance
	int id=101;
	String name="Smita";

	public void show()
	{
		int marks=90;// local variable
		System.out.println("College name is: "+clgName);
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
		System.out.println("marks from show(): "+marks);
		
	}
	
		
	public static void main(String[] args)
	{
		System.out.println("College name is: "+clgName);
		int marks=100;
		System.out.println(marks);
		
		//object
		VariablesDemo v1=new VariablesDemo();
		v1.show();
		System.out.println(v1.id);
		System.out.println(v1.name);
	}

}
