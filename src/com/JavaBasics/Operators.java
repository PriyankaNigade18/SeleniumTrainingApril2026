package com.JavaBasics;

public class Operators {

	public static void main(String[] args)
	{
		// Arithmetic operators +,-,*,/,%
		
		System.out.println("===== Arithmetic operator======");
		
		int a=10,b=5;
		System.out.println(a+b);//15
		System.out.println("Addition is: "+a+b);//Addition is: 105
		System.out.println("Addition is: "+(a+b));//Addition is: 15
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		//System.out.println(90/0);//ArithmeticException: / by zero
		
		System.out.println("======Unary operator===========");
		
		/*
		 * 1.Increment            2.Decrement
		 * -----------------------------------------
		 * Post increment          1.PostDecrement
		 * 
		 * a++= a=a+1				a--  =a=a-1
		 * Pre Increment			2.PreDecrement
		 * ++a  a=a+1               --a  a=a-1								
		 */
		
		//preincrement
		int c=100;
		System.out.println(c);//100
		System.out.println(++c);//101
		
		
		//postincrement
		int d=200;
		System.out.println(d);//200
		System.out.println(d++);//200
		System.out.println(d);//201
		
		int i=90;
		int j=i++;//value will assign first and then increment
		
		System.out.println(i);//91
		System.out.println(j);//90
		
		int u=168;
		int v=u++;
		System.out.println(u);//169
		System.out.println(v);//168
		
		int t=100;
		int l=++t;//value will increment first and then assign
		System.out.println(t);//101
		System.out.println(l);//101
		
		
		int r=78;
		int s=r--;
		System.out.println(r);//77
		System.out.println(s);//78
		
		int p=69;
		int q=--p;
		System.out.println(p);//68
		System.out.println(q);//68
		
		System.out.println("======Relational operator===========");
		/*
		 * >,>=,<,<=,==,!=: return Boolean (true /false)
		 * 
		 * Test Data
		 * ================
		 * i=91 j=90 p=q=68 r=77 s=78 t=l=101
		 */
		
		System.out.println("less than <: "+(i<t));//true
		System.out.println("less than and equal to <=: "+(p<=q));//true
		System.out.println(j<q);//false
		System.out.println(s<=i);//true
		
		System.out.println("greaterthan >: "+(t>j));//true
		System.out.println("greater thar and equal >="+(s>=p));//true
		System.out.println(t>=l);//true
		System.out.println(i>=l);//false
		
		//==
		System.out.println("Comparison operator ==: "+(p==r));//false
		System.out.println(p==q);//true
		
		//!= not equal to
		System.out.println("not equal to !=: "+(p!=r));//true
		System.out.println(p!=q);//false
		
		
		System.out.println("======Logical operator===========");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
