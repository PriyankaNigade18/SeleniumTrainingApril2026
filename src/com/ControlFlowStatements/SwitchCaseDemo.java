package com.ControlFlowStatements;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{

		//traffic signal
		String color="Red";
		
		switch (color)
		{
		case "Green":
			System.out.println("Go");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Red":
			System.out.println("Stop");
			break;

		default:
			System.out.println("Error!");
			
		}
		

		System.out.println("-------------------");
		
		String bname="EDGE";
		
		switch (bname.toLowerCase())
		{
		case "chrome":
			System.out.println("Test case is executing on Chrome!");
			break;
		case "edge":
			System.out.println("Test case is executing on Edge!");
			break;
		case "firefox":
			System.out.println("Test case is executing on Firefox!");
			break;
			
		default:
			System.out.println("Wrong Browser!");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
