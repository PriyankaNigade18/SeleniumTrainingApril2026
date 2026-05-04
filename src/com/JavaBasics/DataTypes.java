package com.JavaBasics;

public class DataTypes 
{

	public static void main(String[] args) 
	{

		//boolean true/false 1bit memory
		
		boolean status=true;
		System.out.println("Boolean status is: "+status);//true
		status=false;//reassignment
		System.out.println("Updated status is: "+status);//false
		
		boolean newStatus=true;
		System.out.println("new Status is: "+newStatus);//true
		
		System.out.println("----------------------------");
		
		/*
		 * Primitive-->Numeric--->1char  2.Integral
		 * char 
		 * ----------
		 * Type can single character 
		 * char store 2byte memory
		 * 
		 * 1.single alphabet(a-z/A-z)
		 * 2.special character(*,@,#,$,%).etc
		 * 3.unicode/ASCII
		 * A-Z = 65 to 90
		 * a-z = 97 to 122
		 * 0-9 = 48 to 57
		 * 
		 * 
		 */
		
		
		char ch1='A';
		char ch2='#';
		char ch3=100;//here 100 is ascii value of a character d
		char ch4='i';
		System.out.println(ch1);//A
		System.out.println(ch2);//#
		System.out.println(ch3);//d
		System.out.println(ch4);//i
		
		/*
		 * Primitive-->Numeric--->1char  2.Integral--->1.Integer    2.Floating pointData
		 *
		 *Integer
		 *-----------------
		 *any numeric data in java is by default int type
		 *byte(1byte) -128 to 127 
		 *short(2byte) -32768 to 32767
		 *int 4byte
		 *long 8byte
		 */
		
		byte b1=120;
		byte b2=-111;
		byte b3=-128;
		byte b4=127;
		
		
		//byte b3=190;//Type mismatch: cannot convert from int to byte
		
		System.out.println("byte data is: "+b1);//120
		System.out.println("byte data is: "+b2);//-111
		System.out.println("byte data is: "+b3);//-128
		System.out.println("byte data is: "+b4);//127
		
		
		//short(2byte) -32768 to 32767
		short s1=190;
		short s2=31000;
		short s3=-32768;
		short s4=32767;
		
		//short s5=50000;//Type mismatch: cannot convert from int to short
		System.out.println("short data is: "+s1);//190
		System.out.println("short data is: "+s2);//31000
		System.out.println("short data is: "+s3);//-32768
		System.out.println("short data is: "+s4);//32767
		
		//int 4byte
		int i1=50000;
		int i2=79877645;
		
		//int i3=9999999999;//The literal 9999999999 of type int is out of range 
		
		System.out.println("int data is: "+i1);//50000
		System.out.println("int data is: "+i2);//79877645
		
		//long 8byte
		long l1=9999999999L;
		System.out.println("long type of data"+l1 );//9999999999
		
		
		System.out.println("---------------");
		
		/*
		 *  Primitive-->Numeric--->1char  2.Integral--->1.Integer    2.Floating pointData
		 *  
		 *  In java by default any decimal digit number is double type
		 *  
		 *  double 8byte after . we can add 15 to 16 numbers
		 *  float  4byte after . we can add 6 to 8 numbers
		 */
		
		double d1=78.68798798;
		System.out.println("Double number is: "+d1);
		//float f1=67.567;//Type mismatch: cannot convert from double to float
		
		float f1=67.567F;
		System.out.println("Float number is : "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
