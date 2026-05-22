package com.Array_String;



/*
 * String is predefined and an Immutable class
 * String is collection of characters
 * 
 * Ways to declare
 * --------------------
 * 1.Using string literal (Recommended)
 * 2.Using new Keyword
 * 
 * 
 * String constant pool
 * ------------------------
 * - All String literals object will create memory inside SCP
 * - SCP does not allowed duplicate string
 * 
 * Using new keyword any string declare then memory will create inside
 * JVM heap
 * 
 * 
 */
public class StringDemo {

	public static void main(String[] args) 
	{

		//literal
		String s1="Hello";
		
		String s3="Hello";
		
		//using new keyword
		String s2=new String("Hello");
		
		
		/*
		 *  == : verify Object Id
		 *  Method: verify data
		 */
		System.out.println(s1==s2);//false
		
		System.out.println(s1.equals(s2));//true
		
		System.out.println("--------------");
		
		System.out.println(s1==s3);//true
		System.out.println(s1.equals(s3));//true
		


		
		
		
		
		

	}

}
