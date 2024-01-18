package com.TypeSafeAndUntypeSafeCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Apple"); 
		list.add("Graps"); 
		list.add("Banana"); 
		list.add("Mango"); 
		list.add("Papaya"); 
		list.add("Orange");
		
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		
		while (itr.hasNext())
		{
			String fruits=itr.next();
			
			if (fruits.equals("Mango")) {
				
				itr.remove();
			}
		}
		
		System.out.println(list);
	}
}
