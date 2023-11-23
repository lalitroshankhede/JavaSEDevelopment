package com.ExceptionHandling;

//Note: if super class does not declare exception, subclass overriden method does not declare
//checked exception but its declare unchcked exception

class Super2 {
	void msg() {
		System.out.println("Super method");
	}
}

public class ExceptionHandlingwithMethodOverridingEx2 extends Super2 {

	@Override
	void msg() throws ArithmeticException { // here subclass declare Unchecked Exception

		System.out.println("Subclass Method");

	}

	public static void main(String[] args) {

		Super2 obj = new ExceptionHandlingwithMethodOverridingEx2();
		obj.msg();
	}

}
