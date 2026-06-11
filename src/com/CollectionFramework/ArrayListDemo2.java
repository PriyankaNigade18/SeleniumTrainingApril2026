package com.CollectionFramework;

import java.util.ArrayList;

/*-ArrayList is Dynamic Data structure
 * -ArrayList is class implememts List interface
 * -Underline data structure is Dynamic Array
 * -ArrayList frequent operation is data retrievel
 * -ArrayList is non-Synchronize class(At a time it can perform multiple process)
 * -ArrayList is ordered collection based on indexing
 * -ArrayList allowed duplication
 * -ArrayList default capacity is 10 virtual segment
 * 
 * Methods
 * -------------
 * size(),add(),remove(),clear(),contains(),isEmpty()
 * 
 * Iteration techniques
 * -----------------------
 * 1. simple for loop
 * 2. for each loop
 * 3. iterator()
 * 4. ListIterator(): for list interface
 * 
 * 
 */
public class ArrayListDemo2 {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("at the begining Is List empty?: "+al.isEmpty());//true
		
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		System.out.println("after inserting elements, Is List empty?: "+al.isEmpty());//false
		System.out.println(al);
		System.out.println("Total elements in list?: "+al.size());
		
		//search for an element
		System.out.println("look for element 30?: "+al.contains(30));//true
		System.out.println("look for element 100?: "+al.contains(100));//false

		//retrive the element
		System.out.println("get the 4th element from list?: "+al.get(3));//30
		
		//remove the element:index
		al.remove(2);//remove the element whoes index number is 2
		
		System.out.println(al);
		
		//insert new element at 2number index
		al.add(2,22);
		System.out.println(al);
		
		//find the index of object
		System.out.println("index of 22?: "+al.indexOf(22));//2
		
		//get the sublist from current list:fromIndex, inclusive, and toIndex, exclusive
		System.out.println(al.subList(1,5));//1 to 4 [20, 22, 30, 40]
		
		System.out.println("-----");
		
		//ArayList--->convert into array
		Object[] arr=al.toArray();
		
		for(Object i:arr)
		{
			System.out.println(i);
		}
		
		
		/*
		//clear the list
		al.clear();
		System.out.println(al);//[]
		System.out.println(al.size());//0
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
