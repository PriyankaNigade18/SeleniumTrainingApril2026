package com.Methods_Constructor;

public class SataticVsInstanceVariable
{
	
	static int count=0;
	
	public SataticVsInstanceVariable()
	{
		count++;
		System.out.println(count);
		
	}

	public static void main(String[] args) 
	{
		SataticVsInstanceVariable s1=new SataticVsInstanceVariable();
		SataticVsInstanceVariable s2=new SataticVsInstanceVariable();
		SataticVsInstanceVariable s3=new SataticVsInstanceVariable();
		SataticVsInstanceVariable s4=new SataticVsInstanceVariable();
		SataticVsInstanceVariable s5=new SataticVsInstanceVariable();
		

	}

}
