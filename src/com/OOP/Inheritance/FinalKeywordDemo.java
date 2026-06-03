package com.OOP.Inheritance;


//final class StudentData
class StudentData
{
	
	final int acno=67878909;
	
	public final void balance()
	{
		System.out.println("Current balance: 2000");
	}
	
}




//The type FinalKeywordDemo cannot subclass the final class StudentData
public class FinalKeywordDemo extends StudentData
{
//	@Override//cannot override the final method from StudentData
//	public void balance()
//	{
//		System.out.println("Current balance: 20000");
//	}

	public static void main(String[] args)
	{

			StudentData s1=new StudentData();
			//s1.acno=6666666;//The final field StudentData.acno cannot be assigned
			System.out.println(s1.acno);
			s1.balance();
			
			FinalKeywordDemo f1=new FinalKeywordDemo();
			//f1.acno=8888888;
			System.out.println(f1.acno);
			
			f1.balance();
			
			
			

	}

}
