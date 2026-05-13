package com.Methods_Constructor;

//this can be passed as argument in the constructor call.

class Test
{
	//In test class constructor we are passing currenrt class object
	Test(ThisKeywordDemo5  t1)
	{
		t1.amount=2000;
		System.out.println("Amount is updated: "+t1.amount);
	}
	
}

public class ThisKeywordDemo5 
{
	int amount=100;

	ThisKeywordDemo5()
	{
		//call Test class constructor:Object
		Test t1=new Test(this);
		
	}
	public static void main(String[] args)
	{
		ThisKeywordDemo5  t1=new ThisKeywordDemo5 ();


	}

}
