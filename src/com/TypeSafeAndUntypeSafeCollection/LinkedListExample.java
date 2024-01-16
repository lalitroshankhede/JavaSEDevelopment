package com.TypeSafeAndUntypeSafeCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		LinkedList<String> fruits=new LinkedList<>();
		
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Graps");
		
		System.out.println("List are : "+fruits);
		
		//adding element in specified position
		fruits.add(2,"Watermelon");
		
		System.out.println("List are : "+fruits);
		
		//adding element in the beginning for the list
		
		fruits.addFirst("Papaya");
		
		
		// adding element in the ending of the list
		
		fruits.addLast("Chikku");

		System.out.println("List are : "+fruits);
		
	
		
		
		// Getting Element from the Linked List
		
		
		
		// Getting element from specified position
		System.out.println(fruits.get(3));
		
		
		// Getting first element from the list
		
		System.out.println(fruits.getFirst());
		
		
		// Getting last element from the list
		
		System.out.println(fruits.getLast());
		
		System.out.println("_____________________________");
		
	
		Iterator<String> iterator=fruits.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			System.out.println(string);
		}
		 
		
		
		System.out.println("_______________________");
		
		//  Remove Elements from the Linked List
		
		
		// remove first element from linked list
		
		
		  fruits.removeFirst();
		  
		  System.out.println(fruits);
		
		
		  //remove last element from linked list
		  
		  
		  fruits.removeLast();
		  
		  System.out.println(fruits);
		
		  
		  //remove element from specified position
		  
		  fruits.remove(3);
		  
		  System.out.println(fruits);
		
		  
		  // clear all element from the list 
		
		  fruits.clear();
		  System.out.println(fruits);
	}
}
