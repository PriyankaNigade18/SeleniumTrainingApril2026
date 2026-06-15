package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet is class implements Set interface
 * HashSet underline data structure is HashTable
 * 
 * HashTable maintains data as per hashing mechanism
 * Where based on hash function key,code and index generate and then iternally
 * based on index it store object into table
 * 
 * HashSet is not order collection
 * HashSet will not allowed duplicate object
 * 
 * Hashset default capacity is 16 virtuals sengments
 * 
 * 
 * 
 */
public class HashSetDemo {

	public static void main(String[] args)
	{
		
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Is Set is empty?: "+hs.isEmpty());
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		
		System.out.println(hs);//[null, 50, 20, 40, 10, 30]
		System.out.println("After adding element, Is set empty?: "+hs.isEmpty());
		System.out.println("Total elements: "+hs.size());
		
		System.out.println("Look for 50?: "+hs.contains(50));//true
		System.out.println("Loook for 100?: "+hs.contains(100));//false
		
		hs.remove(null);
		System.out.println(hs);//[50, 20, 40, 10, 30]
		
		//in set no index based storage
		
		System.out.println("--------For each loop------");
		
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("--------iterator()------");
		
		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
