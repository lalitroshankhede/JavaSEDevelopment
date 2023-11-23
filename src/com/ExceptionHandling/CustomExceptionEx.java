package com.ExceptionHandling;

class InvalidAgeException extends Exception 
{
	public InvalidAgeException (String str)
	{
		super(str);
	}
}

public class CustomExceptionEx {

	static void validAge(int age) throws InvalidAgeException
	{
		if (age<18) {
			
			throw new InvalidAgeException("Age is not valid for vote");
		}
		
		else
		{
			System.out.println("Age is valid for vote");
		}
		
	}
	
	public static void main(String[] args) {
		
		try
		
		{
			validAge(15);
		}
		catch (InvalidAgeException e) {
			// TODO: handle exception
			
			System.out.println("Caught the Exception");
			
			
			System.out.println("Exception Occured "+e  );
		}
		
		System.out.println("Rest of the code executing...");
	}
}
