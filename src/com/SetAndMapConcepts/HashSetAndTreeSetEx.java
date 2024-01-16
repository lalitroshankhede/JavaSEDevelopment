package com.SetAndMapConcepts;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAndTreeSetEx {

	
	public static void main(String[] args) {
		
		HashSet<Double> list=new HashSet<>();
		list.add(50.53);
		list.add(45.12);
		list.add(85.65545211);
		list.add(6583.2245);
		list.add(45.12);  //duplicates not allowed
		
		System.out.println(list);
		
	
		TreeSet<Double> treeSet=new TreeSet<>();
		treeSet.addAll(list);
		System.out.println(treeSet);
		
		
		
	}
}
