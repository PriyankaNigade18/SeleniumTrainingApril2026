package com.OOP.Inheritance;

public class Audi extends Car//Heirarchical
{
	
	public void autoGear()
	{
		System.out.println("Audi....autoGear()");
	}

	@Override
	public void price()
	{
		System.out.println("Audi.....50L");
	}
}
