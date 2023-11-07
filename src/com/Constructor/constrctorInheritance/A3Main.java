package com.Constructor.constrctorInheritance;

public class A3Main {


	public static void main(String[] args) {

		B3 obj=new B3();
		System.out.println(obj.getX());  //30
		System.out.println(obj.x);  // 20
		System.out.println(obj.getX()+obj.x); // 50

	}
}
