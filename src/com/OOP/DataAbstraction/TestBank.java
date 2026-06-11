package com.OOP.DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{

			//child class ref and child class object
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposite();//inherited abstract method
		h1.withdraw();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method
		
		
		System.out.println("-----------");
		Axis a1=new Axis();
		a1.custData();//individual
		a1.deposite();//inherited abstract method
		a1.withdraw();//inherited abstract method
		a1.rateOfInterest();//inherited abstract method
		
		
		//Parent class ref and Child class object:parentclass method
		RBI r1=new HDFC();
		r1.deposite();//individual
		r1.withdraw();//individual
		r1.rateOfInterest();//individual
		
		System.out.println("-----------");
		RBI r2=new Axis();
		r1.deposite();//individual
		r2.withdraw();//individual
		r2.rateOfInterest();//individual
		
		
		
		
		

	}

}
