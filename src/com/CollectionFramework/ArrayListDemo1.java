package com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

/*-ArrayList is Dynamic Data structure
 * -ArrayList is class implememts List interface
 * -Underline data structure is Dynamic Array
 * -ArrayList frequent operation is data retrievel
 * -ArrayList is non-Synchronize class(At a time it can perform multiple process)
 * -ArrayList is ordered collection based on indexing
 * -ArrayList allowed duplication
 * -ArrayList default capacity is 10 virtual segment
 * 
 */
public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
	
		//parent ref and child class object
		List l1=new ArrayList();
		
		//child class ref acnd child class object
		//non generic declaraction 1.no type safety
		ArrayList al=new ArrayList();
		al.add(100);
		al.add('M');
		al.add(67.88);
		al.add(true);
		
		System.out.println(al);
		
		System.out.println("-----------------------");
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		//Generic-->type safety
		
		ArrayList<Integer> ls=new ArrayList<Integer>();//by default 10 segment
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(400);
		ls.add(200);
		ls.add(500);
		System.out.println(ls);
		
		System.out.println("Total Elements are: "+ls.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
