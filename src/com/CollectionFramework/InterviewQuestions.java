package com.CollectionFramework;

import java.util.Arrays;
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
		//1.using constructor 2.allAll()
		
		//constructor
		HashSet<Integer> hs=new HashSet<Integer>(ls);
		System.out.println(hs);
		
		//addAll()
		HashSet<Integer> hs2=new HashSet<Integer>();
		hs2.addAll(ls);
		
		System.out.println(hs2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
