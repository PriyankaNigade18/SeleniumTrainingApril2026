package com.ControlFlowStatements;

//single true condition
public class SimpleIf {

	public static void main(String[] args)
	{

		System.out.println("Program started.....");
		
		int year=2027;
		
		if(year == 2026)
		{
			System.out.println("Current year!");
		}
		
		System.out.println("Program ends.....");
		
		
		
		//Automation: validate url must have https protocol
		
		//String is class and for validation we can use String class methods
		/*
		 * To test equality between strings
		 * --------------------------------------
		 * 1.equals():exact match with content but it is case sensitive
		 * 2.equalsIgnoreCase(): is not case sensitive
		 * 
		 * To test partial string/substring match
		 * -------------------------------------
		 *  contains('partial string')
		 */
		
		String url="https://www.google.com";
		
		String s1="Hello All";
		String s2="Hello All";
		String s3="hello all";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
		System.out.println(url.contains("https"));//true
		
		if(url.contains("https") && !(url.equals(null)))
		{
			System.out.println("Launch application.....");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
