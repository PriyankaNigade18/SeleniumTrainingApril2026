package com.Array_String;

public class StringMethods {

	public static void main(String[] args)
	{

		String s1="Hello All";
		
		//length()
		System.out.println("Total length is: "+s1.length());//9
		System.out.println("----------------");
		//toUpperCase()  toLowerCase()
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println("----------------");
		/*
		 * Equality between string
		 * --------------------------
		 * 1.equals():Look for exact match and it is case sensitive
		 * 2.equalsIgnoreCase():Look for exact match and it is not case sensitive
		 */

		String s2="Welcome to learn Java!";
		String s3="Welcome to learn Java!";
		String s4="Welcome to learn JAVA!";
		System.out.println(s2.equals(s3));//true
		System.out.println(s2.equals(s4));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		System.out.println(s2.equalsIgnoreCase(s4));//true
		
		System.out.println("----------------");
		//Partial String: check for substring is part of actual string:contains()
		
		String s5="Selenium WebDriver is an API for WebUi Testing";
		
		System.out.println("check for API?: "+s5.contains("API"));//true
		System.out.println("Check for TestNG?: "+s5.contains("TestNG"));//false
		
		System.out.println("----------------");
		
		//prefix match:startsWith()
		System.out.println("String starts with S?: "+s5.startsWith("S"));//true
		System.out.println("String starts with Sele?: "+s5.startsWith("Sele"));//true
		System.out.println("String starts with Selenium?: "+s5.startsWith("Selenium"));//true
		System.out.println("String starts with Webdriver?: "+s5.startsWith("Webdriver"));//false
		System.out.println("----------------");
		//suffix match: endsWith()
		System.out.println("String ends with Testing?: "+s5.endsWith("Testing"));//true
		System.out.println("String ends with g?: "+s5.endsWith("g"));//true
		System.out.println("String ends with Testing tool?: "+s5.endsWith("Testing tool"));//false

		System.out.println("----------------");
		
		//charAt(index): returns character available on that index
		
		String s6="Appium is Mobile Automation Tool";
		char ch=s6.charAt(0);
		System.out.println("character at index 0 is: "+ch);//A
		
		//indexOf(character,fromIndex): returns index number of first occurrence character
		System.out.println("index of p?: "+s6.indexOf('p'));//1
		
		System.out.println("index of i?: "+s6.indexOf('i'));//3
		//index of second char p
		System.out.println("index of second char p?: "+s6.indexOf('p',2));//2
		//index of 3rd i
		System.out.println("index of 3rd char i?: "+s6.indexOf('i',8));//13
		
		int firstIndex=s6.indexOf('o');		
		System.out.println(firstIndex);
		
		//index of 2nd o
		System.out.println(s6.indexOf('o',firstIndex+1));
		
		System.out.println("----------------");
		//concat():
		
		String s7="Hello";
		String s8="All";
		System.out.println(s7+" "+s8);
		System.out.println(s7.concat(" "+s8));
		
		System.out.println("----------------");
		
		//trim():To ignore white space from before and after string  use trim()
		String s9="     Welcome  All      ";
		System.out.println(s9);
		System.out.println(s9.trim());
		
		System.out.println("----------------");

		//Substring()
		String s10="PostMan is manual testing tool for API testing,testing";
		System.out.println(s10.indexOf('m'));
		System.out.println(s10.substring(11));//manual testing tool for API
		
		System.out.println(s10.substring(11,30));//manual testing tool
		
		//replace()
		System.out.println(s10.replace('i','*'));
		System.out.println(s10.replace("testing","******"));
		
		System.out.println(s10.replaceAll("testing","#####"));
		
		System.out.println("----------------");

		//isEmpty():Returns true if, and only if, length() is 0.
		
		String s11="";
		System.out.println(s11.length());//0
		System.out.println(s11.isEmpty());//true
		
		//isBlank():Returns true if the string is empty or contains only white space codepoints,otherwise false.
		String s12=" ";
		System.out.println(s12.length());//1
		System.out.println(s12.isBlank());//true
		
		//toCharArray():Converts this string to a new character array.
		String s13="Hello All";
		char arr[]=s13.toCharArray();
		
		for(char i: arr)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------");
		
		//split(regexp):Splits this string around matches of the given regular expression. 
		//regexp:Some Pattern 
		
		String tools="Selenium,Cypres,Appium,Playwright,Postman";
		//index:        0         1    2       3         4
		System.out.println(tools);
		
		String arr1[]=tools.split(",");
		
		for(String i: arr1)
		{
			System.out.println(i);
		}
		
		//playwright
		String latestTool=tools.split(",")[3];
		System.out.println(latestTool);
		
		
		String date="May 2026";
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];
		
		System.out.println(month);
		System.out.println(year);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
