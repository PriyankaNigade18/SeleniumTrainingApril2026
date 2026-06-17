package com.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args)
	{

		/*
		 * Finally block used to execute special code which will run with or without exception
		 * Server close
		 * DB server process close
		 */
		
		System.out.println("Program starts....");
		try {
		System.out.println(9/0);
		}
		catch(Exception e) {
			System.out.println("Please provide other number than 0");
		}
		
		finally
		{
			System.out.println("Finally block is executing...");
		}
		
		System.out.println("Program ends");
		
	}

}
