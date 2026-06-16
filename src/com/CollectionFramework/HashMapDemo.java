package com.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap is class implements Map interface
 * Underline data structure is HashTable
 * This is not order collection 
 * <Key,value> entries we can have in map
 */
public class HashMapDemo {

	public static void main(String[] args)
	{

		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("VimanNagar",411045);
		map.put("Lohegaon",411047);
		map.put("Kharadi",411014);
		map.put("Wadgaosheri",411014);
		
		System.out.println(map);
		
		System.out.println("Total entries: "+map.size());
		
		//search
		System.out.println("Look for key Kharadi?: "+map.containsKey("Kharadi"));
		System.out.println("Look for value 411045?: "+map.containsValue(411045));
		
		
		//get the value based on key: get(Key): value
		System.out.println("get value for key VimanNagar: "+map.get("VimanNagar"));
		
		
		System.out.println("------------Map Iteration-------------");
		
		//Entry interface
		
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			System.out.println(i);
		}
		
		
		System.out.println("---------------");
		
		//key iteration
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			System.out.println(i.getKey());
		}
		
		System.out.println("---------------");
		//value iteration
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			System.out.println(i.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
