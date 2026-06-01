package com.OOP.Polymorphism;

public class AmazonSearch {

	public void search(String pname)
	{
		System.out.println("Product search by name: "+pname);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product search by name: "+pname+" & price: "+price);
	}
	
	
	public void search(String pname,String bname)
	{
		System.out.println("Product search by name: "+pname+" & brand name is : "+bname);
	}
	
	
	public void search(int price,String bname)
	{
		System.out.println("Product search by price: "+price+" & brand name is : "+bname);
	}
	
	public void search(int price)
	{
		System.out.println("Product search by price: "+price);
	}
	
	
	
	

}
