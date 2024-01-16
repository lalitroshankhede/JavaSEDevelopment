package com.TypeSafeAndUntypeSafeCollection;

import java.util.LinkedList;

public class SearchAndIteratingElements {

	
	public static void main(String[] args) {
		
		
		LinkedList<String> list=new LinkedList<>();
		
		list.add("C");
		list.add("C++");
		list.add("Java");
		list.add("JavaScript");
		list.add(".NET");
		
		
		boolean result=list.contains("C");
		System.out.println("Result: "+ result);
		
		
		//Find the index of the first occurrence of an element in the list
		
		int index=list.indexOf("Java");
		System.out.println("Index of Element is: "+index);
				
				
		
		
		// Iterating Element  
		
		
		for(String fruits:list)
		{
			System.out.println(fruits);
		}
		
	}
}
