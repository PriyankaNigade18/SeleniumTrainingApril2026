package com.OOP.DataAbstraction;


/*
 * Interface:
 * -----------------
 * It is special class where all the methods are abstract and public , data declared
 * in interafce is by deafult static and final
 * 
 * 100% abstraction is possible
 * 
 * We cannot create object of interaface as Interface is not fully implemented class
 * 
 * We need child class which will implement all methods
 * of interface and child we can access and override methods of interface
 * 
 * 
 * 
 */
public interface RBI
{

	int x=100;
	
	void deposite();
	void withdraw();
	void rateOfInterest();
	
	
	
	
}
