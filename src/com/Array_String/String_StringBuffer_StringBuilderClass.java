package com.Array_String;



/*
 * String 
 * ============
 * -It is an Immutable
 * - non Synchronize means Multiple process at a time class can handle
 * - It is not Threadsafe
 * 
 * StringBuffer(Older)
 * -----------------
 * -It is mutable
 * -It is Threadsafe(Synchronize): at a time only one process
 * 
 * StringBuilder
 * -----------------
 * -It is Mutable
 * -It is not threadsafe/synchrnonize class Multiple process at a time class can handle
 * 
 * 
 *   
 */
public class String_StringBuffer_StringBuilderClass {

	public static void main(String[] args) 
	{

		//Immutable
		String s1="Hello";//SCP
		System.out.println(s1);
		s1=s1+"All";
		System.out.println(s1);
		
		//Mutable
		StringBuilder sb=new StringBuilder("Hello");//Heap
		System.out.println(sb);
		sb.append("All");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		
		//How to reverse any string without method
		
		String act="Java Selenium";
		String res="";
		System.out.println(act);
		
		for(int i=act.length()-1;i>=0;i--)
		{
			//res=res+act.charAt(i); with space
			//without space
			char ch=act.charAt(i);
			if(ch==' ')
			{
				continue;
			}else
			{
				res=res+ch;
			}
			
			
			
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
