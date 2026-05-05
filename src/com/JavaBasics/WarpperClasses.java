package com.JavaBasics;

public class WarpperClasses {

	public static void main(String[] args)
	{
		/*
		 * Wrapper class
		 * =================
		 * wrapper class used to convert primitive data into Object
		 * We can use to convert string object into primitive
		 * to store all primitive data as object(Collection framework)
		 *  
		 * data type        Wrapperclasses
		 * int				Integer
		 * byte				Byte
		 * boolean			Boolean
		 * char				Character
		 * short			Short
		 * float 			Float
		 * double			Double
		 * long				Long
		 * 
		 */
		
		
		//primitive data to object
		
		int num=100;
		Integer i1=Integer.valueOf(num);
		System.out.println(i1);
		
		boolean status=true;
		Boolean obj=Boolean.valueOf(status);
		System.out.println(obj);
		
		//Object to primitive:intValue()
		
		Integer i2=768798;
		int num2=i2.intValue();
		System.out.println(num2);
		
		
		/*In Automation we works with String
		 * Scenario: 
		 * bill="Total amount is 5000";
		 * 
		 * "5000"===>5000
		 * test amount 5000 it is less than 10000
		 */
		
		//String conversion
		//NumberFormatException - if the string does not contain a parsable integer.
		String s1="100";//parsable
		System.out.println(s1+1000);//1001000
		//string to int
		int num1=Integer.parseInt(s1);
		System.out.println(num1+1000);//1100
		
		
		String s2="200ABC";//nonparsable
//		int data=Integer.parseInt(s2);//NumberFormatException 
//		System.out.println(data+100);//300
		
		//string to boolean
		String s3="true";
		boolean newStatus=Boolean.parseBoolean(s3);
		System.out.println(newStatus);
		
		
		String s4="677.7867";
		System.out.println(s4+11.11);//677.786711.11
		double d1=Double.parseDouble(s4);
		System.out.println(d1+11.11);//688.8967
		
		
		//string to character conversion
		
		
		
		
		
		/*In Automation we works with String
		 * Scenario: 
		 * bill="Total amount is 5000";
		 * 
		 * "5000"===>5000
		 * test amount 5000 it is less than 10000
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
