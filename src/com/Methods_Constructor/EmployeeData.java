package com.Methods_Constructor;

//this keyword always refer current class object
//1.this can be used to refer current class instance variable.


public class EmployeeData 
{
	int id;
	String name;
	
	EmployeeData(int id,String name)//local variable name
	{
		//local data assign to instance variable
//		id=id;
//		name=name;
		this.id=id;
		this.name=name;
		
	}
	
	public void show()
	{
		System.out.println("Employee id is: "+this.id);
		System.out.println("Employee name is: "+this.name);
	}

	public static void main(String[] args) 
	{
		 EmployeeData e1=new  EmployeeData(101,"Poonam");
		 e1.show();


	}

}
