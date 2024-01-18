package com.ComparableAndComparatorInterfaceEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableInterEx1 implements Comparable<ComparableInterEx1> {

	int roll;
	String name;
	int age;

	public ComparableInterEx1(int roll, String name, int age) {
		// TODO Auto-generated constructor stub

		this.roll = roll;
		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(ComparableInterEx1 o) {

		if (age == o.age)

			return 0;
		else if (age > o.age)
			return 1;
		else
			return -1;

	}

	public static void main(String[] args) {
		ArrayList<ComparableInterEx1> list = new ArrayList<ComparableInterEx1>();
		list.add(new ComparableInterEx1(101, "Vijay", 23));
		list.add(new ComparableInterEx1(105, "Ajay", 34));
		list.add(new ComparableInterEx1(103, "Rahul", 23));

		Collections.sort(list);

		for (ComparableInterEx1 names : list) {
			System.out.println(names.roll + " " + names.name + " " + names.age);

		}

	}

}
