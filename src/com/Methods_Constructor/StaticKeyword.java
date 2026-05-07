package com.Methods_Constructor;

public class StaticKeyword 
{
	static String clgName;
	
	//static block
	static
	{
		System.out.println("static block is calling...");
		clgName="AISSPMS";
		System.out.println("College name is: "+clgName);
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is main() call");

	}

	

}
