package com.CollectionFramework;

import java.util.LinkedList;

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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
