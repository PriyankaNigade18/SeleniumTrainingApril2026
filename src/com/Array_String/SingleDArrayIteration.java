package com.Array_String;

public class SingleDArrayIteration {

	public static void main(String[] args)
	{

		//declaration
		int sid[]=new int[5];
		//initilize
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
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
		
		System.out.println("-------for loop-----------");
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("-------forEach loop-----------");

		for(int i:sid)
		{
			System.out.println(i);
		}
		
		
		System.out.println("-------------");

		String location[]=new String[3];
		location[0]="Pune";
		location[1]="Mumbai";
		location[2]="Delhi";
		
		System.out.println("Total Locations are: "+location.length);//3
		
		
		
		System.out.println(location[1]);//Mumbai
			
		System.out.println("-------for loop-----------");

		for(int i=0;i<location.length;i++)
		{
			System.out.println(location[i]);
		}
		System.out.println("-------forEach loop-----------");

		for(String i:location)
		{
			System.out.println(i);
		}
		System.out.println("-------------");
		
		double marks[]=new double[3];
		marks[0]=89.55;
		marks[1]=67.55;
		marks[2]=98.78;
		
		System.out.println("Total students marks are: "+marks.length);
		
		System.out.println("Total Marks: "+(marks[0]+marks[1]+marks[2]));
		
		System.out.println("-------for loop-----------");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("-------forEach loop-----------");

		for(double i:marks)
		{
			System.out.println(i);
		}
		
		
		System.out.println("------Literal Way----------");
		
		int evenNum[]= {12,20,54,24,78,10};
		System.out.println("Total Elements are: "+evenNum.length);
		
		System.out.println(evenNum[3]);//24
		//System.out.println(evenNum[6]);//ArrayIndexOutOfBoundsException
		
		System.out.println("-------for loop-----------");

		for(int i=0;i<evenNum.length;i++)
		{
			System.out.println(evenNum[i]);
		}
		System.out.println("-------forEach loop-----------");

		for(int i:evenNum)
		{
			System.out.println(i);
		}
		System.out.println("-------------------");

		//In Real time Real data we store as Object type
		/*
		 * Object is super class in java
		 */
		Object studentData[]= {"Sarang","Pune",'M',20,89.77};
		System.out.println(studentData[3]);
		//System.out.println(studentData[9]);//ArrayIndexOutOfBoundsException
		
		System.out.println("-------for loop-----------");
			
		for(int i=0;i<studentData.length;i++)
		{
			System.out.println(studentData[i]);
		}
		System.out.println("-------forEach loop-----------");

		for(Object i:studentData)
		{
			System.out.println(i);
		}
		

	}

}
