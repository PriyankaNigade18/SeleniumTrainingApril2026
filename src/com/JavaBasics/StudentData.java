package com.JavaBasics;

public class StudentData
{
	
	//data
	int id;
	String name;
	
	
	//function/method
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	
	
	public static void main(String args[])
	{
		/*To access members of class we need Object to create
		 * 
		 * Syntax:
		 * ===========
		 * className referencevariableName=new ClassName()/Constructor
		 * 
		 * Constructor 
		 * ----------------
		 * To initialize object we use constructor
		 * 
		 * new
		 * -------------
		 * Object will create using new keyword
		 * 
		 */
		
		StudentData s1=new StudentData();
				//s1.display();//default data
				s1.id=101;
				s1.name="Jay";
				s1.display();
				
		System.out.println("-----------------");
		StudentData s2=new StudentData();
		//s2.display();//default data
		s2.id=201;
		s2.name="Kiran";
		s2.display();
				
		System.out.println("-----------------");
		StudentData s3=new StudentData();
		s3.id=301;
		s3.name="Tom";
		s3.display();
				
				
				
		
	}

}
