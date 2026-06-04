package com.OOP.Encapsulation;

import com.OOP.Inheritance.AccessModifier2;

//import com.OOP.Inheritance.AccessModifier2;

public class AccessModifierTest2 extends AccessModifier2
{

	public static void main(String[] args) 
	{

		AccessModifier2 a1=new AccessModifier2();
		System.out.println(a1.name);//public
		
		
		//We can access protected data only by subclass/child class object
		AccessModifierTest2 t1=new AccessModifierTest2();
		System.out.println(t1.acno);//protected
		System.out.println(t1.name);

	}

}
