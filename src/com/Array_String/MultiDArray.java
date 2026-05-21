package com.Array_String;

public class MultiDArray {

	public static void main(String[] args)
	{


		int arr[][]=new int[2][3];
		arr[0][0]=100;
		arr[0][1]=200;
		arr[0][2]=300;
		
		arr[1][0]=400;
		arr[1][1]=500;
		arr[1][2]=600;
		
		System.out.println("Number of rows: "+arr.length);//2
		System.out.println("Number of columns: "+arr[0].length);
		
		System.out.println(arr[0][2]);//300
		//System.out.println(arr[1][3]);//ArrayIndexOutOfBoundsException

	}

}
