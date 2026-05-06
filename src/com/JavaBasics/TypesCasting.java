package com.JavaBasics;

public class TypesCasting {
/*
 * Type casting is conversion of one type of data into another type
 * 1.Primitive to primitive
 * 
 * Wrapper class
 * 2.Primitive to Object
 * 3.Object to Primitive
 * 
 * Primitive to Primitive 
 * 1.Implicit casting: Automatic conversion taken care by JVM
 * 		small size===>largesize
 * 		byte-->short-->int--->long-->float-->double
 * 
 * 2.Explicit casting: Manual Conversion with Casting opertor(datatype)
 * 		large size===>small size
 * 		double-->float-->long--->int-->short--->byte
 */
	public static void main(String[] args)
	{
		//Primitive to primitive:implicit
		
		int x=100;//4byte
		long l1=x;//8byte
		System.out.println("int to long conversion: "+l1);//100
		
		char ch='A';//2byte
		int y=ch;//4byte
		System.out.println("char to int conversion: "+y);//ascii 65
		
		
		int i=89;//4byte
		float f1=i;//4byte
		System.out.println("int to float conversion: "+f1);//89.0
		
		long l2=896544L;//8byte
		float f2=l2;//4byte
		System.out.println("long to float conversion: "+f2);//896544.0
		
		System.out.println("--------------------");
		
		//explicit 
		
		double d1=89.756757;
		System.out.println("double data is: "+d1);
		int n=(int) d1;
		System.out.println("double to int conversion: "+n);//89
		
			
		int p=122;//4byte
		char ch2=(char) p;//2byte
		System.out.println("int to char conversion: "+ch2);//z
		
		long l3=798798090565L;
		int e=(int)l3;
		System.out.println("long to int conversion: "+e);// -65826491
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	

}
