package com.JavaBasics;

public class AccessModifier {

	//data
	int id=101;//default
	public String name="Sarang";
	private long phno=9809806569L;
	
	
	
	public static void main(String[] args)
	{
		//within a same class
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);

	}

}
