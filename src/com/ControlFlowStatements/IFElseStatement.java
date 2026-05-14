package com.ControlFlowStatements;

import java.util.Scanner;

public class IFElseStatement {

	public static void main(String[] args) 
	{

		//to import the package: ctrl+shift+O
		//true/false
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}else
		{
			System.out.println("Invalid age!");
		}

		
		
		
		System.out.println("-----------------------");
		
		//test number is even or odd
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}else
		{
			System.out.println(num+" is odd number");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
