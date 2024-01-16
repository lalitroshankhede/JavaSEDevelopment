package com.TypeSafeAndUntypeSafeCollection;

import java.util.*;

public class CollectionEx1 {

	public static void main(String[] args) {

		// Type Safe Collection

		LinkedList<String> list = new LinkedList<>();

		list.add("Banana");
		list.add("Chikko");
		list.add("Apple"); 
		list.add("Banana"); // duplicate allowed
		list.add("Graps");

		System.out.println(list);
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));

		System.out.println("======================");

		// Untype Safe Collection

//		ArrayList arrayList = new ArrayList();
//		arrayList.add("Lalit R");
//		arrayList.add(15.25);
//
//		arrayList.add("Lalit R"); // duplicate Allowed
//		arrayList.add(25);
//
//		System.out.println(arrayList);
//		System.out.println(arrayList.get(2));
		
		
		list.remove(1);
		System.out.println(list);
		System.out.println("SIZE "+list.size());
		System.out.println(list.contains("Apple"));
		System.out.println(list.isEmpty());
		
		
		// Different Types to Print Collection List
		
		
		//1. For-Loop
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println("___________________________________");
		
		//2. For-Each Loop
		
		for(String fruits:list)
		{
			System.out.println(fruits);
		}
		
		
		System.out.println("___________________________________");
		
		
		//3. Iterator For Loop
		
		for(Iterator iterator=list.iterator(); iterator.hasNext();)
		{
			String fruits=(String) iterator.next();
			System.out.println(fruits);
		}
		
		System.out.println("___________________________________");
		
		//4.  Iteratro While Loop
		
		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		System.out.println("___________________________________");
		
		//5. Java8 Stream + Lamda expression
		
		list.stream().forEach(fruits->System.out.println(list));
		
		System.out.println("___________________________________");
 
		//6. Java8 forEach + Lamda
		
		list.forEach(fruits->System.out.println(list));
		
		
		
		
		//   Backword Travese Element using ListInterator Interface 
		
		
		// Note: we have to use hasPrvious() and previous() method for Reverse Traversing elements
		
		ListIterator<String> listIterator=list.listIterator();
		while (listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
