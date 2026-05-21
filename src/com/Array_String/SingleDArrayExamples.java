package com.Array_String;

public class SingleDArrayExamples {

	public static void main(String[] args)
	{
		//declare an array and identify max number from array
		
		//declare an array and find number is present or not
		
		//sum of array element
		
		int arr1[]= {10,20,30,40,50};
		
		int sum=0;
		for(int i:arr1)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of array elements are: "+sum);
		
		System.out.println("---------------------");
		
		//finding number from Array
		
		int arr2[]= {67,34,89,20,55,18};
		int exp=20;
		
		for(int i:arr2)
		{
			if(i==exp)
			{
				System.out.println("Number found "+i);
				break;
			}
		}
		
		
		System.out.println("---------------------");
		//find max number from array
		
		int arr3[]= {18,29,11,45,66,89,20};
		int max=arr3[0];
		
		for(int i=1;i<arr3.length;i++)
		{
			if(arr3[i]>max)
			{
				max=arr3[i];
			}
		}
		
		System.out.println("Max number is: "+max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
