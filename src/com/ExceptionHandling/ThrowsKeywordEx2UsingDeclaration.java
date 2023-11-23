package com.ExceptionHandling;

import java.io.IOException;

class ThrowKeyword2
{
	void method() throws IOException
	{
		throw new IOException("Device Error");
	}
	
}


public class ThrowsKeywordEx2UsingDeclaration {

public static void main(String[] args) throws IOException // Declare Exception

{
			ThrowKeyword2 obj=new ThrowKeyword2();
			obj.method();
		
		System.out.println("Rest of the Code...");
	}
}

