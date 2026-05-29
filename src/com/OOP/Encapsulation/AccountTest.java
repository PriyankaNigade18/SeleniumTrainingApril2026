package com.OOP.Encapsulation;

public class AccountTest {

	public static void main(String[] args) 
	{
		
		UserAccount u1=new UserAccount();
		u1.setAmount(1000);

		System.out.println("Total Balance: "+u1.getAmount());
		
		System.out.println("----------");
		
		
		UserAccount u2=new UserAccount();
		u2.setAmount(800);
		System.out.println("Total Balance: "+u2.getAmount());

	}

}
