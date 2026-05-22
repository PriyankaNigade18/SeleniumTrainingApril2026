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
		
		System.out.println("------Nested For loop------");
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("------Nested ForEach loop------");
		
		for(int i[]:arr)//i=[100,200,300]
		{
			for(int j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("------Literal Way For Array-----------");
		
		int number[][]= {{10,20},{30,40},{50,60},{70,80}};
		System.out.println("Number of Rows: "+number.length);//4
		System.out.println("Number of Columns: "+number[0].length);//2
		System.out.println(number[2][1]);
		
		for(int r=0;r<number.length;r++)
		{
			for(int c=0;c<number[r].length;c++)
			{
				System.out.print(number[r][c]+"  ");
			}
			System.out.println();//next row/line
		}
		
		System.out.println("---------------");
		
		
		for(int i[]:number)
		{
			for(int j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
