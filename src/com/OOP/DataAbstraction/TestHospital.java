package com.OOP.DataAbstraction;

public class TestHospital {

	public static void main(String[] args) 
	{
		//child class ref and child class object
		
		NobleHs n1=new NobleHs();
		n1.cardioService();//inherited abstract method
		n1.neroService();//inherited abstract method
		n1.physioService();//inherited abstract method
		n1.dentalService();//inherited abstract method
		n1.medicalService();//individual
		n1.covid19Test();

		System.out.println("----------------");
		
		//parent ref and child class object
		
		IMA i1=new NobleHs();
		i1.cardioService();//individual
		i1.physioService();//individual
		i1.covid19Test();
		
		USMA u1=new NobleHs();
		u1.dentalService();//individual
		u1.neroService();//individual
		u1.covid19Test();
		
		//USMA u1=new USMA();//Cannot instantiate the type USMA
		
		//IMA i2=new IMA();//Cannot instantiate the type IMA
		
		
	}

}
