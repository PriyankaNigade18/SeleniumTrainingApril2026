package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
public class ArrayListDemo3 {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al);
		
		System.out.println("-----For loop------");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println("-----ForEach loop------");
		
		
		for(Integer i: al)
		{
			System.out.println(i);
		}
		
		System.out.println("-----iterator()------");
/*
 * hasNext():Returns true if the iteration has more elements.
 * next():Returns true if the iteration has more elements.
 */
		Iterator<Integer> ir=al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("-----listIterator()------");
		
		ListIterator<Integer> lr=al.listIterator();
		
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		
		System.out.println("----------");
		
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
