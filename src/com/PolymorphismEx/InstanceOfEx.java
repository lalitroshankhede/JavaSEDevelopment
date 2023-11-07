package com.PolymorphismEx;


class Animal4
{}

class Dog4 extends Animal4
{}

public class InstanceOfEx {

	public static void main(String[] args) {

		Dog4 obj=new Dog4();
		System.out.println(obj instanceof Dog4);   //true
		System.out.println(obj instanceof Animal4);  //true becoz instance of Dog4 is also instance of Animal Parent Class.


		Dog4 d=null;
		System.out.println(d instanceof Dog4);  //false
	}
}
