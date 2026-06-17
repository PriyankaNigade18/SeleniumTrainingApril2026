package com.ExceptionHandling;

import java.util.Scanner;

public class RunTimeExceptionHandling 
{
	
	int id=1010;
	

	public static void main(String[] args) 
	{
		System.out.println("Program starts.....");
		RunTimeExceptionHandling r1=new RunTimeExceptionHandling();
		r1=null;
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Check your details are missing!");
		}
		
		System.out.println("Program ends.....");
		System.out.println("-------------");
		
		
			
		String s1="100ABC";
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num);
		}catch(Exception e)
		{
			System.out.println("Check your string data whitch is not appropriate");
		}
		
		
		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 0 to 4");
		int index=sc.nextInt();		
		
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Enter valid index number!");
		}
		
		*/
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
			System.out.println("Addition is: "+(num1+num2));
			System.out.println("Subtraction is: "+(num1-num2));
			try {
			System.out.println("Division is: "+(num1/num2));//ArithmeticException
			}catch(Exception i)
			{
				System.out.println("Please select number other than 0"+i.getMessage());
				i.printStackTrace();
			}
			System.out.println("Multiplication is: "+(num1*num2));
			
			
			
			

	}

}
