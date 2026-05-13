package com.Methods_Constructor;

//this can be passed as an argument in the method call.

//this is refer current class object
public class ThisKeywordDemo4 
{
	int productPrice=1000;
	
	public void greet(String name)//string parameter
	{
		System.out.println("Hello "+name);
		
		test(this);
	}

	
	public void test(ThisKeywordDemo4 t1)//test() accept current class object
	{
		t1.productPrice=2000;
		System.out.println("Latest price is: "+productPrice);
	}
	
	public static void main(String[] args)
	{
		ThisKeywordDemo4 t4=new ThisKeywordDemo4 ();
		t4.greet("Jay");
		//t4.test(t4);
		
		
		
		


	}

}
