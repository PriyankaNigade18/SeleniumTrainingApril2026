package com.CollectionFramework;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet extends HashSet implement Set interface
 * LinkedHashSet has List and Set both features
 * LinkedHahSet maintain order(no indexing)
 * LinkedHashSet store unique elements
 * Underline data structure is DuoblyLinkedList
 * 
 */
public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(300);
		ls.add(400);
		ls.add(500);
		
		System.out.println("Total elements: "+ls.size());
		System.out.println(ls);
		
		System.out.println("Look for 300?: "+ls.contains(300));
		//remove 
		ls.remove(300);
		
		System.out.println(ls);
		
		System.out.println("-----------------");
		
		
		//remove duplicate characters from string
		String data="aabbccddabcd";
		
		System.out.println(data);
		LinkedHashSet<Character> lr=new LinkedHashSet<Character>();
		for(int i=0;i<data.length();i++)
		{
			char ch=data.charAt(i);
			lr.add(ch);
		}
		
		
		System.out.println(lr);
		
		String res="";
		for(Character i:lr)
		{
			res=res+i;
		}
		
		System.out.println("After removing duplicates: "+res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
