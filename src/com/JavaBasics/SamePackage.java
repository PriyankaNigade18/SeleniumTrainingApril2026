package com.JavaBasics;

public class SamePackage {

	public static void main(String[] args) 
	{
		//diffrent class from same package com.JavaBasics;
		AccessModifier obj=new AccessModifier();
		System.out.println(obj.id);//default
		System.out.println(obj.name);//public

	}

}
