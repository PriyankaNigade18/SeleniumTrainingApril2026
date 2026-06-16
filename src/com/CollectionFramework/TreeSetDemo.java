package com.CollectionFramework;

import java.util.TreeSet;

/*
 * TreeSet is class implement sortedset which extends Set interface
 * Underline data structure is Search Tree
 * TreeSet always return sorted set 
 */
public class TreeSetDemo {

	public static void main(String[] args)
	{

		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(3);
		tr.add(8);
		tr.add(10);
		tr.add(2);
		tr.add(9);
		tr.add(7);
		tr.add(5);
		tr.add(1);
		
		System.out.println(tr);
		System.out.println("Total elements: "+tr.size());
		System.out.println("Search for20?: "+tr.contains(20));

		//descending
		System.out.println(tr.descendingSet());
		System.out.println("headset: less than "+tr.headSet(9));
		System.out.println("tailset: greater and equal to"+tr.tailSet(7));
		System.out.println("Subset: "+tr.subSet(3,9));
		
		System.out.println("---------------");

		for(Integer i:tr)
		{
			System.out.println(i);
		}
		System.out.println("---------------");

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Neha");
		ts.add("Amit");
		ts.add("Jay");
		ts.add("Madhu");
		
		System.out.println(ts);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
