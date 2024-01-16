package com.SetAndMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	// 1. Iterate through a HashMap EntrySet using Iterator
	// 2. Iterate through HashMap KeySet using Iterator
	// 3. Iterate HashMap using For-Each Loop
	// 4. Iterating through a HashMap using Lamda Expression
	// 5. Loop through a HashMap using Stream API

	public static void main(String[] args) {

		Map<Integer, String> course = new HashMap<Integer, String>();

		course.put(1, "C");
		course.put(2, "C++");
		course.put(3, "Java");
		course.put(4, "Python");
		course.put(5, "JavaScript");

		// 1. Iterate Using HashMap EntrySet

		Iterator<Entry<Integer, String>> iterator = course.entrySet().iterator();
		while (iterator.hasNext()) {

			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("______________________________");
		// 2. Iterate through HashMap KeySet using Iterator

		Iterator<Integer> iterator2 = course.keySet().iterator();
		while (iterator2.hasNext()) {
			Integer integer = (Integer) iterator2.next();

			System.out.println(integer + " " + course.get(integer));
		}

		System.out.println("______________________________");

		// 3. Iterate HashMap using For-Each Loop

		for (Map.Entry<Integer, String> entry : course.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		System.out.println("______________________________");

		// 4. Iterate using lambda expression
		course.forEach((key, value) -> System.out.println("Course ID: " + key + ", Course Name: " + value));

		System.out.println("______________________________");

		// 5. Iterate using Stream API
		course.entrySet().stream().forEach(
				entry -> System.out.println("Course ID: " + entry.getKey() + ", Course Name: " + entry.getValue()));

	}

}
