package com.Methods_Constructor;

public class MethodCallingTechnique 
{
	public void m1()
	{
		System.out.println("M1 is calling.....");
		m2();
	}
	
	public void m2()
	{
		System.out.println("M2 is calling.....");
		m3();
	}
	
	public void m3()
	{
		System.out.println("M3 is calling.....");
	      //m4();//staticmethod we can call everywhere
	      //m1();
	      
	}

	public static void m4()
	{
		System.out.println("Static method....");
		//m3();//inside static method you can not call instance method
	}
	public static void main(String[] args)
	{
		MethodCallingTechnique obj=new MethodCallingTechnique();
		obj.m1();
		



	}

}
