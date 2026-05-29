package com.OOP.Encapsulation;

public class LoginPage 
{
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//Business login
	public void doLogin(String un,String psw)
	{
		System.out.println("Hello "+un);
	}
	
	
	

}
