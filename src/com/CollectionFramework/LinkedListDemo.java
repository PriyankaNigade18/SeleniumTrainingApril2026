package com.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * LinkedList is class implement List ineterface
 * Underline data structure is Doubly LinkedList
 * Frequent operations are insretion and deletion of element
 * LinkedList is order collection 
 * LinkedList allowed duplication
 * 
 * LinkedList create node struture
 * 
 * Node
 * -----------------------------------------------------
 * address of prev node|element|addressof next node
 * ------------------------------------------------------
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) 
	{

		LinkedList<Integer> ls=new LinkedList<Integer>();
		
		if(ls.isEmpty())
		{
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			ls.add(50);
			ls.add(60);
			ls.add(20);
		}
		
		System.out.println("Is list empty?: "+ls.isEmpty());
		System.out.println("Total Elements are: "+ls.size());
		System.out.println(ls);
		System.out.println("Look for 100?: "+ls.contains(100));//false
		ls.remove(3);
		System.out.println(ls);
		ls.addFirst(100);
		ls.addLast(200);
		ls.add(3,40);
		System.out.println(ls);
		System.out.println("First Object: "+ls.getFirst());
		System.out.println("Last Object: "+ls.getLast());
		
		System.out.println("-----For loop---------");
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		
		System.out.println("-----ForEach loop---------");
		
		
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		System.out.println("-----iterator()---------");
		
		Iterator<Integer> ir=ls.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		System.out.println("-----listIterator()---------");
		
		
		ListIterator<Integer> lr=ls.listIterator();
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		System.out.println("---------");
		
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
