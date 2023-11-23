package com.ExceptionHandling;


//Note: If superclass declare an exception, subclass method overridien declare
//the same exception or no exception but cannot declare parent exception.

class Parent2
{
	void msg() throws ArithmeticException
	{
		System.out.println("Parent method");
	}
}
public class ExceptionHandlingwithMethodOverridingEx4 extends Parent2 {
	
//Trying to declare same Exception in Parent class method Exception
	
	@Override
	void msg() throws ArithmeticException {                           
		                                                  
		System.out.println("Child method");
	}
	
	
	public static void main(String[] args) {
		
		Parent2 obj=new ExceptionHandlingwithMethodOverridingEx4();
		obj.msg();
	}

}
