package com.Array_String;
/*
 * Array
 * ===========
 * Array is collection of similar type of data/object
 * Array is static data structure & In Java implemented as Object
 * Array size is always fixed
 * 
 * Types Of Array
 * =====================
 * 1.Single Dimension Array(1D)
 * 2.Multi Dimension Array(2D)
 * 
 * Property
 * ===========
 * length
 * 
 * Iterations
 * ==============
 * 1.for loop
 * 2.for-each loop
 * 
 * 
 * Ways to declare Array
 * ==========================
 * 1.Using new keyword
 * 2.Using literal
 * 
 * 
 *  
 */
public class SingleDArray {

	public static void main(String[] args)
	{

		//declaration
		int sid[]=new int[5];
		//initilize
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		//sid[3]=104;
		sid[4]=105;
		
		System.out.println("Total elements in array: "+sid.length);
		//single entry
		System.out.println(sid[2]);//103
		System.out.println(sid[4]);//105
		
		//wrong index number
		//System.out.println(sid[9]);//ArrayIndexOutOfBoundsException
		//System.out.println(sid[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println(sid[3]);//0
		System.out.println("done!");
		
		System.out.println("-------------");

		String location[]=new String[3];
		location[0]="Pune";
		location[1]="Mumbai";
		location[2]="Delhi";
		
		System.out.println("Total Locations are: "+location.length);//3
		
		
		
		System.out.println(location[1]);//Mumbai
		
		System.out.println("-------------");
		
		double marks[]=new double[3];
		marks[0]=89.55;
		marks[1]=67.55;
		marks[2]=98.78;
		
		System.out.println("Total students marks are: "+marks.length);
		
		System.out.println("Total Marks: "+(marks[0]+marks[1]+marks[2]));
		
		
		
		System.out.println("------Literal Way----------");
		
		int evenNum[]= {12,20,54,24,78,10};
		System.out.println("Total Elements are: "+evenNum.length);
		
		System.out.println(evenNum[3]);//24
		//System.out.println(evenNum[6]);//ArrayIndexOutOfBoundsException
		
		System.out.println("-------------------");

		//In Real time Real data we store as Object type
		Object studentData[]= {"Sarang","Pune",'M',20,89.77};
		System.out.println(studentData[3]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
