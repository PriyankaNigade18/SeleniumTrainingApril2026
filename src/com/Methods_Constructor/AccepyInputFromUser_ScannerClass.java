package com.Methods_Constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AccepyInputFromUser_ScannerClass {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		//Scanner Class
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Hello "+name+" your age is: "+age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 
		 
		//techique2: BufferedReader class
		
		System.out.println("Enter your age");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		//string into int
		int age=Integer.parseInt(data);
		System.out.println("Your age is: "+age);
		
		
		/*
		// technique1: System.in.read()
		
		System.out.println("Enter your age");//25
		int age=System.in.read();//'2'=ascii 50
		System.out.println("Your age is: "+age);//50

*/
	}

}
