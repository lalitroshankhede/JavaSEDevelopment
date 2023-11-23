package com.ExceptionHandling;

public class ThrowKeywordEx1UncheckedExcep {

	public void validate(int age)
	{
		
		if (age<18) {
			
			throw new ArithmeticException("you are not eligible for voate :(" );
		}
		
		else
		{
			System.out.println("you are eligible for vote :)");
		}
		
	}
	
	public static void main(String[] args) {
		
		ThrowKeywordEx1UncheckedExcep obj=new ThrowKeywordEx1UncheckedExcep();
		obj.validate(15);
		
		System.out.println("Rest of code Executed...");
		
		
	}
}

