package com.Methods_Constructor;

public class CompileTimeParameterPassing 
{
	
	public void add()//0 parameter
	{
		int a=100,b=200;//Local
		System.out.println("Addition is: "+(a+b));
			
	}
	
	public void sub(int a,int b)//2 parameter here a and b are local parameters
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public void info(String msg)//1 parameter here msg is local parameter
	{
		System.out.println(msg);
	}
	
	//return keyword
	public int multiply(int a,int b)//2 parameters
	{
		return a*b;
	}
	
	public boolean getStatus(boolean status)
	{
		return status;
	}
	
	public String getBrowserName(String bname)
	{
		return bname;
	}
	
	public float calculate(int a, float b)
	{
		return a+b;
	
	}
	
	public String getData(String username,String password)
	{
		return "UserName is: "+username+" Password is: "+password;
	}

	public static void main(String[] args)
	{
		/*
		 * Parameter passing help you to design dynamic logic
		 * 
		 * Compile time parameter passing:
		 * ====================================
		 * At the time of calling any method when we pass arguments that is 
		 * called compile time parameter passing
		 * 
		 * Argument Vs Parameter
		 * ----------------------------
		 * Argument is real data
		 * Parameter which is represent variables which store real data
		 * 
		 * 
		 *Purpose of return keyword
		 *-------------------------
		 *whenever we wanted to return any data/output/value from method then we use return keyword
		 *- when we return data from the method then change return type of that method
		 *- when we use return keyword data always return to calling function
		 *- return statement must be last statement of you method
		 *
		 */
		
		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		c1.add();
		
		c1.sub(100,30);
		c1.info("Hello All");
		
		
		int res=c1.multiply(10,10);
		System.out.println("Multiplication is: "+res);
		
		//OR
		
		System.out.println(c1.multiply(20,20));
		
		c1.sub(10,14);
		
		
		float f1=c1.calculate(100,200.11F);
		System.out.println(f1);
		
		System.out.println("Browser name is: "+c1.getBrowserName("chrome"));
		System.out.println("Status is: "+c1.getStatus(true));
		
		System.out.println(c1.getData("Sarang","test123"));

	}

}
