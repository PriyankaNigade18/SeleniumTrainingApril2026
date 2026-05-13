package com.Methods_Constructor;

//this can be used to invoke current class method (implicitly)
public class ThisKeywordDemo2 
{
	public void start()
	{
		System.out.println("Browser started....");
		this.close();
		close();
	}

	
	public void close()
	{
		System.out.println("Browser closed...");
	}
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.start();

	}

}
