package com.ControlFlowStatements;

public class LadderIf {

	public static void main(String[] args)
	{
		// Ladder if is for multiple condition test
		
		//check numbers are greter or equals
		int num1=300,num2=300,num3=300;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+ " is greater than "+num2+" & "+num3);
			
		}else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+ " is greater than "+num1+" & "+num3);
			

		}else if(num1==num2 && num2==num3)
		{
			System.out.println("All numbers are equal");
		}
		else
		{
			System.out.println(num3+" is greater than "+num1+" & "+num2);
		}

	}

}
