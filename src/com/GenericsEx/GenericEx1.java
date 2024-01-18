package com.GenericsEx;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		list.add("Apple");
	//	list.add(56);    // this statement is not allowed here becoz of u have declared Generic Type of Collections or we can say Type Safe Collection 
		
		
		List anotherList=new ArrayList<>();
		anotherList.add("Apple");
		anotherList.add(58);
		anotherList.add(778.52);
		
		
		System.out.println(list);
		System.out.println(anotherList);
		
		
		
		
		
		
	}
}
