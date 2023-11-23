package com.ExceptionHandling;

import java.io.IOException;

//Note : By Default Checked exceptions are NOT forwarded in calling chin (Propgated).
public class ExceptionPropgationEx2 {

	void m()
	{
  //	throw new java.io.IOException("Device Error"); //checked exception gives compiler error 
		
		//Because of Exception Propagation allows only Unchecked Exception in forwarded calling chain   
	}
	
	void n()
	{
		m();
	}
	
	void p()
	{
		try {
			
			n();
			
		} catch (Exception e) {
			// TODO: handle exception
		
 System.out.println("Exception Handled");		}
		
	}
	
	public static void main(String[] args) {
		
		ExceptionPropgationEx2 obj=new ExceptionPropgationEx2();
		obj.p();
		
		System.out.println("Normal Flow");
	}
}
