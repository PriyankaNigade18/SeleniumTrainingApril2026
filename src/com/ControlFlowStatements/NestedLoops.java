package com.ControlFlowStatements;

public class NestedLoops {

	public static void main(String[] args) 
	{

		//print table of 2
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*2);
			
		}
		
		
		System.out.println("-------------");
		//print total 1 to 10 all tables
		
		for(int n=1;n<=10;n++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(i*n +"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------");

		for(int r=1;r<=4;r++)
		{
			
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+"  ");
			}
			System.out.println();
		}
		
		System.out.println("-------------");

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
