package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class InterviewQuestions {

	public static void main(String[] args) 
	{

		/*
		 * Remove duplicates form list
		 * 1,2,3,4,5,2,3,4,6,7,1
		 * 
		 * List--->Set 
		 * 
		 */
		
//		List<Integer> ls=new ArrayList<Integer>();
//		ls.add(1);
//		ls.add(2);
		
		List<Integer> ls=Arrays.asList(1,2,3,4,5,2,3,4,6,7,1);
		System.out.println(ls);
		
		//to remove duplicates element hust convert list to set
		//1.using constructor 2.addAll()
		
		//constructor
		HashSet<Integer> hs=new HashSet<Integer>(ls);
		System.out.println(hs);
		
		//addAll()
		HashSet<Integer> hs2=new HashSet<Integer>();
		hs2.addAll(ls);
		
		System.out.println(hs2);
		
		
		System.out.println("-----------------");
		
		List<Integer> ls1=Arrays.asList(100,30,10,22,67,90,55,20);
		
		System.out.println(ls1);
		
		//Collections class is predefined class which has static method
		Collections.sort(ls1);
		
		System.out.println(ls1);
		
		System.out.println("Max number: "+Collections.max(ls1));//100
		System.out.println("Min number: "+Collections.min(ls1));//10
		
	
		System.out.println("---------------");
		
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);//[10, 20, 30, 40]
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(0);
		al2.add(0);
		al2.add(0);
		al2.add(0);
		
		Collections.copy(al2,al);
		
		System.out.println(al2);//[10, 20, 30, 40]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
