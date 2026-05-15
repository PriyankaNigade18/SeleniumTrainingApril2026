package com.ControlFlowStatements;

import java.util.Scanner;

public class LadderIfDemo2 {

	public static void main(String[] args)
	{

		//browser scenario
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on Chrome!");
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on Edge!");
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on Firefox!");

		}
		else
		{
			System.out.println("Wrong Browser!");
		}

	}

}
