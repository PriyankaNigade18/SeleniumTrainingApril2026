package com.OOP.Encapsulation;

/*
 * What is Encapsulation:
 * It is a process where we can bind the data and function together in single unit
 * 
 * What is Purpose:
 * Data hiding/data security
 * 
 * Real time example:
 * capsule,class,object,mobile device,remote....etc
 * 
 * How to achieve in Java
 * --------------------------
 * 1.data should be private
 * 2.method should be public: getters and setters method
 * 
 * While designing page object model we use Encapsulation
 * 
 */

class Employee{
	
	int id=101;
	String name="Pooja";
	
	private int salary=70000;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}



	public void show()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee salary is: "+salary);
	}
	
}




public class EncapsulationDemo {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.show();
		
		//modify salary
		//e1.salary=80000;
		e1.setSalary(80000);
		
		System.out.println("Salary is: "+e1.getSalary());
		e1.show();
		
		

	}

}
