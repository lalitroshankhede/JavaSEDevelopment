package com.ExceptionHandling;


// Note: By Default Unchecked exceptions are forwarded in calling chin (Propgated).


public class ExceptionPropgationEx1 {

	void m()
	{
		int data=50/0;
	}
	
	void n()
	{
		m();
	}
	
	void p()
	{
		try
		{
			n();
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
		}
	}
	
	
	public static void main(String[] args) {
		
		ExceptionPropgationEx1 obj=new ExceptionPropgationEx1();
		obj.p();
		System.out.println("Normal Program flow...");
	}
	
}
