package com.OOP.DataAbstraction;

public class Axis implements RBI
{
	public void custData()
	{
		System.out.println("Axies.....Customer Data()");
	}

	@Override
	public void deposite() {
		System.out.println("Axis.....deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Axis.....withdraw()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Axis.....rate of interest 10%()");
		
	}

}
