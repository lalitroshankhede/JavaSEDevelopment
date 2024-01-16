package com.SetAndMapConcepts;

import java.util.HashMap;

public class HashMapEx {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> students=new HashMap<>();
		 
		students.put(101,"Aniket");
		students.put(102, "LalitR");
		students.put(103, "Adesh");
		students.put(104, "Ujwal");
		students.put(103, "Adesh");  // duplicates not allowed
		 
		
		System.out.println(students);
	
	
		System.out.println(students.get(104));
	}
	
}
