package com.ExceptionHandling;

import java.io.IOException;


class ThrowKeyword
{
	void method() throws IOException
	{
		throw new IOException("Device Error");
	}
	
}
public class ThrowsKeywordEx1UsingTryCatch {

	public static void main(String[] args) {
		
		try {
			ThrowKeyword obj=new ThrowKeyword();
			obj.method();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception Handled");
			
			
		}
		
		System.out.println("Rest of the Code...");
	}
	
}
