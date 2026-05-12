package com.Methods_Constructor;

import java.util.Scanner;

public class RuntimeParameterPassing 
{
	
	public void addition(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void subtraction(int a,int b)
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	//return 
	public int multiplication(int a,int b)
	{
		return a*b;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		sc.close();
		
	RuntimeParameterPassing  r1=new RuntimeParameterPassing();
	r1.addition(num1,num2);
	r1.subtraction(num1,num2);
	
	
	
		int res=r1.multiplication(num1,num2);
		System.out.println("Multiplication is: "+res);
		
		
		
		

	}

}
