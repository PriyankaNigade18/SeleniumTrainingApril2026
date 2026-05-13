package com.Methods_Constructor;

//this() can be used to invoke current class constructor.
//this() always be the first line of constructor

public class ThisKeywordDemo3 
{

	ThisKeywordDemo3 ()
	{
		//this(true);
		System.out.println("Default constructor is calling....");
		//this(true);//Constructor call must be the first statement in a constructor
	}
	
	ThisKeywordDemo3 (boolean status)
	{
		this();
		System.out.println("Parameterized constructor is calling....with status: "+status);
	}
	
	public static void main(String[] args) 
	{
		//ThisKeywordDemo3 t1=new ThisKeywordDemo3();
		
		ThisKeywordDemo3 t2=new ThisKeywordDemo3(true);


	}

}
