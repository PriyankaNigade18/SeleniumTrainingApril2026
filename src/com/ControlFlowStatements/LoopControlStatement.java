package com.ControlFlowStatements;

import java.util.Scanner;

/*
 * Loop(number of iterations)
 * =============
 * 1.For
 * ------------
 * -Number of iterations are known to you/fixed
 * 
 * Scenarios:
 * ------------------
 * Calendar/date picker 30/31/28/29
 * dropdown with 40options
 * listbox
 * menu
 * 
 * ------------------------
 * 2.while
 * ------------------
 * - Entry control loop
 * - Number of iterations are unknown/not fixed
 * 
 * Scenarios:
 * -------------------
 * pageload timeout
 * Pagination
 * 
 *  
 * 3.do-while
 * -------------------
 * - exit control loop
 * - For One time iteration where condition might be true or false
 * 
 *  
 */
public class LoopControlStatement {

	public static void main(String[] args)
	{
		// print Hello statement 5 times
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}

		System.out.println("--------------");

		//print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("--------------");
	    //print 10 to 1 number
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------");

		//print all even numbers upto 25
		
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number: "+i);
			}
		}
		
		
		System.out.println("--------------");
		
		//factorial number
		//5!=5*4*3*2*1=120
		
		int res=1;
		for(int i=5;i>=1;i--)
		{
			res=res*i;
		}
		
		System.out.println("Factorial of 5 is: "+res);
		
		
		System.out.println("--------------");

		//sum of 100 natural numbers
		//1+2+3+4+....+100=5050
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("sum of 100 natural numbers: "+sum);
		
		
		System.out.println("--------------");
		//interview question
		//by default for loop condition is always true
//		for(;;)
//		{
//			System.out.println("hi");
//		}
		
		System.out.println("-----While Loop---------");

		//while loop
		
		int i=1;
		while(i<=5)
		{
			System.out.println("Hello");
			i++;
		}
		
		System.out.println("--------------");
		
		
		int j=1;
		
		while(j<=10)
		{
			System.out.println("Welcome...");
			j++;
		}
		
		System.out.println("--------------");
		
		//sum of digits logic num=123 1+2+3=6
		//here digits of number is ot fixed:while
		
		int rem=0,ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			ans=ans+rem;
			
		}
		
		
		System.out.println("Sum of digits of number: "+ans);
		
		
		System.out.println("--------------------");
		
		int rm=0,result=0;
		
		System.out.println("enter number");
		int nm=sc.nextInt();
		
		while(nm>0)
		{
			rm=nm%10;
			nm=nm/10;
			result=result*10+rm;
		}
		
		
		System.out.println("Reverse of number: "+result);
		
		System.out.println("------DoWhile------");
		
		//one time iteration
		
		int k=1;
		
		do
		{
			System.out.println("Hello");
			k++;
			
		}while(k>=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
