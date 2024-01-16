package com.TypeSafeAndUntypeSafeCollection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseTraversingElementEx {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();

		list.add("Banana");
		list.add("Chikko");
		list.add("Apple"); 
		list.add("Banana"); // duplicate allowed
		list.add("Graps");
		
		System.out.println(list);
		
		
		System.out.println("_________________________________________________________");
		
		
		// Forward Direction
		
		ListIterator<String> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
		 
	}
}

