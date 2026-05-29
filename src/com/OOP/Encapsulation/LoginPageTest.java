package com.OOP.Encapsulation;

public class LoginPageTest {

	public static void main(String[] args)
	{

		LoginPage user1=new LoginPage();
		user1.setUserName("Sarang");
		user1.setPassword("test123");
		user1.doLogin(user1.getUserName(),user1.getPassword());
		
		System.out.println("--------------");
		LoginPage user2=new LoginPage();
		user2.setUserName("Akhil");
		user2.setPassword("test123");
		user2.doLogin(user2.getUserName(),user2.getPassword());
		

	}

}
