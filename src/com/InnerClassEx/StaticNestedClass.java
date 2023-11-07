package com.InnerClassEx;

public class StaticNestedClass {  //you can't create static Outerclass

	  static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
		obj.msg();
	}
}
