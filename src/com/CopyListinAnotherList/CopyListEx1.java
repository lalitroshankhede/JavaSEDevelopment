package com.CopyListinAnotherList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyListEx1 {

	public static void main(String[] args) {
		
		// Copy a List into Another List 
		//1. Using Constructor
		//2. Using addAll() method
	    //3. Using Collections.copy() method
		//4. Using Java 8
		//5. Using Java 10
		
		
		List<String> list=new ArrayList<String>();
		list.add("Apple"); 
		list.add("Graps"); 
		list.add("Banana"); 
		list.add("Mango"); 
		list.add("Papaya"); 
		list.add("Orange"); 
		
		
		System.out.println(list);
		System.out.println("______________________________");
		List<String> copyList=new ArrayList<>(list);
		System.out.println(copyList);
		
		
		System.out.println("______________________________");
		
		// 2. Copy Using addAll() method
		
		
		List<String> list2=new ArrayList<String>();
		list2.addAll(list);
		
		System.out.println(list2);
 		
		System.out.println("______________________________");
		
		// 3. Copy using Colletions.copy() method
		
		List<String> list3=new ArrayList<String>(list.size());
		
		list3.add("a");
		list3.add("b");
		list3.add("c");
		list3.add("d");
		
		
		Collections.copy(list, list3);
		
		System.out.println(list3);
		
		
	}
	
	
	 
	 

}
