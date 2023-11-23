package com.ExceptionHandling;


// Note: if super class does not declare exception, subclass overriden method does not declare
// checked exception but its declare unchcked exception


import java.io.IOException;

class Super
{
	void msg()
	{
		System.out.println("Super method");
	}
}

public class ExceptionHandlingwithMethodOverridingEx1 extends Super {

	//Trying to Declare Checked Exception 
	
	
	
//   void msg() throws IOException {                        // gives compile time error because dont' allow to declare Checked Exception here
//		// TODO Auto-generated method stub
//		 
//		System.out.println("Test Checked Exception");
//		
//	}
	
	public static void main(String[] args) {
		
		Super obj=new ExceptionHandlingwithMethodOverridingEx1();
		obj.msg();
	}
	
}
