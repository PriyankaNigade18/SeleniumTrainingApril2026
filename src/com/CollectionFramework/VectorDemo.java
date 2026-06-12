package com.CollectionFramework;

import java.util.Vector;

/*
 * Vector is Class implement List interface
 * Vector underline data strcuture is Dynamic Array
 * Vector is Synchronize class 
 * Vector performance is slow
 * 
 */
public class VectorDemo {

	public static void main(String[] args)
	{

		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is vector is empty?: "+v1.isEmpty());//true
		v1.add(111);
		v1.add(222);
		v1.add(333);
		v1.add(444);
		v1.add(null);
		
		
		System.out.println("Total elements: "+v1.size());
		System.out.println(v1);
		
		v1.remove(4);
		System.out.println(v1);
		
		v1.add(4,888);
		System.out.println(v1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
