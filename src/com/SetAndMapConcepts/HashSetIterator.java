package com.SetAndMapConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterator {

	public static void main(String[] args) {

		// Different ways to Iterator HashSet elements

		// 1. Enhanced for Loop
		// 2. Basic loop with iterator
		// 3. While loop with iterator
		// 4. JDK8 forEach() method with lamda
		// 5. JDK 8 streaming + forEach() + lamda expressions

		Set<String> list = new HashSet<>();

		list.add("Java");
		list.add("C++");
		list.add("C");
		list.add("JavaScript");
		list.add(".NET");

		// 1. Enhanced for loop

		for (String course : list) {
			System.out.println(course);
		}

		// 2. Basic loop with iterator

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		// 3. While Loop Iterator
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 4. JDK 8 forEach() method with lamda

		list.forEach(item -> System.out.println(item));

		// 5 JDK 8 with forEach() method with stream

		list.stream().forEach(item -> System.out.println(item));

	}
}
