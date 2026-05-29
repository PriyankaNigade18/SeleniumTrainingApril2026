package com.OOP.Encapsulation;

public class UserAccount 
{
	
	private int amount;

	
public void setAmount(int amount) 
{
	if(amount>=1000)
	{
		this.amount = amount;
		System.out.println("Account is activated as valid amount");
	}
	else
	{
		System.out.println("Account is deactivated as not sufficient Balance");
		this.amount=amount;
	}
		
}
	
	
	public int getAmount() {
		return amount;
	}
	

}
