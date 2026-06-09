package com.OOP.DataAbstraction;

//Multiple inheritance
public class NobleHs implements IMA,USMA
{

	
	public void medicalService()
	{
		System.out.println("NobleHs......medical service()");
	}

	@Override
	public void cardioService() {
	

		System.out.println("NobleHs......cardio service()");

	}

	@Override
	public void physioService() {

		System.out.println("NobleHs......Physio service()");

		
	}

	@Override
	public void neroService() {
		System.out.println("NobleHs.....Neroservice()");
		
	}

	@Override
	public void dentalService() {
		System.out.println("NobleHs......Dental service()");
		
	}

	@Override
	public void covid19Test() {

		System.out.println("NobleHs......Covid19Test()");
		
	}
}
