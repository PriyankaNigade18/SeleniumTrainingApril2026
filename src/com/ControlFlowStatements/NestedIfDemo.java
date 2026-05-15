package com.ControlFlowStatements;

public class NestedIfDemo {

	public static void main(String[] args) 
	{
		/*
		 * marks>=90====>A
		 * marks>=95====>A++
		 * otherwise ====>B
		 * 
		 */
		
		int marks=99;
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}
		
		
		System.out.println("----------------");
		
		/*
		 * 40 to 60----->B
		 * 61 to 80----->A
		 * 81 to 100---->A++
		 */
		int score=97;
		
		if(score>=40)
		{
			System.out.println("Pass!");
			
			if(score>=40 && score<=60)
			{
				System.out.println("B");
			}else if(score>=61 && score<=80)
			{
				System.out.println("A");
			}else if(score>=81 && score<=100)
			{
				System.out.println("A++");
			}
		}
		else
		{
			System.out.println("Fail!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
