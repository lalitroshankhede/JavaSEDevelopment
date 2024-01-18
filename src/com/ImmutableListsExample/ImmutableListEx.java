package com.ImmutableListsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableListEx {

	
	public static void main(String[] args) {
		
		
		 //ArrayList 
		
//		List<String> list=new ArrayList<String>();
//		list.add("Apple"); 
//		list.add("Graps"); 
//		list.add("Banana"); 
//		list.add("Mango"); 
//		list.add("Papaya"); 
//		list.add("Orange"); 
//		
//		
//	   list=	Collections.unmodifiableList(list);
//	   list.add("Lichi");
//	   System.out.println(list);
	   
	   
	   
		
	   // HashSet 
	   
//	   Set<String> list=new HashSet<>();
//		list.add("Apple"); 
//		list.add("Graps"); 
//		list.add("Banana"); 
//		list.add("Mango"); 
//		list.add("Papaya"); 
//		list.add("Orange"); 
//	   
//	   
//		list=Collections.unmodifiableSet(list);
//		list.add("S");
//		System.out.println(list);
		
		Map<Integer, String> list=new HashMap<>();
		list.put(1, "Apple"); 
		list.put(2,"Graps"); 
		list.put(3,"Banana"); 
		list.put(4,"Mango"); 
		list.put(5,"Papaya"); 
		list.put(6,"Orange"); 
	   
	   
		list=Collections.unmodifiableMap(list);
		list.put(7,"S");
		System.out.println(list);
	   
	   
	   
	}
}
