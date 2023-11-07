package com.InnerClassEx;

public class LocalOuterClass {

	private int data = 30;// instance variable

	void display() {
		int value = 50;// local variable must be final till jdk 1.7 only
		class Local {
			void msg() {
				System.out.println(data); //outer class private data member
				System.out.println(value);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		LocalOuterClass obj = new LocalOuterClass();
		obj.display();
	}
}
