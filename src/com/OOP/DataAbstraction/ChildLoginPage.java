package com.OOP.DataAbstraction;

public class ChildLoginPage extends Page
{
	
	@Override
	public void getElement() {
		System.out.println("LoginPage....getElement()");
		
	}
	
	public void launchPage()
	{
		System.out.println("Launch application page...");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Scenario1:Parent class ref and parent class object:Invalid");
		
		//Page p1=new Page();
		
		System.out.println("Scenario2:Child class ref and Child class object:valid");
		
		ChildLoginPage cp=new ChildLoginPage();
				
		cp.getTitle();//inherited 
		cp.getElement();//inherited abstract method
		cp.launchPage();//individual method of child
		
		
		System.out.println("Scenario3: Parent class ref and Child class object:valid");
		
		Page p1=new ChildLoginPage();
		p1.getTitle();//individual
		p1.getElement();//inherited abstract method
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		


	}


}
