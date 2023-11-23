package com.ExceptionHandling;


// Note: If superclass declare an exception, subclass method overridien declare
// the same exception or no exception but cannot declare parent exception.


class Parent1
{
	void msg() throws ArithmeticException
	{
		System.out.println("Parent method");
	}
}
public class ExceptionHandlingwithMethodOverridingEx3 extends Parent1 {

	//Trying to declare another Exception except like Parent class Exception
	
//	@Override
//	void msg() throws Exception {                          // it will gives Complie time error because of it required to 
//		                                                  // declare same exception which is present in Parent Class method 
//		System.out.println("Child method");
//	}
	
	
	public static void main(String[] args) {
		
		Parent1 obj=new ExceptionHandlingwithMethodOverridingEx3();
		obj.msg();
	}
	
}
