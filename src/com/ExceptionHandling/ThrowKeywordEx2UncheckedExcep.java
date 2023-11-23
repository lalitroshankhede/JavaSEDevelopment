package com.ExceptionHandling;


/*Note: The 'throw' keyword can only propagate unchecked exceptions,
 * meaning that checked exceptions cannot be propagate with 'throw'
 * The 'throws' keyword can be used to declare both checked and unchecked exceptions.
 * For checked exceptions the 'throws' keyword must be followed by the specific name of 
 * the exception class.
 * 
 *  If you want to implement checked exception you need to use throws keyword in the method
 *  declaration and spcify with exception class/
 */
public class ThrowKeywordEx2UncheckedExcep {

	static void checkAge(int age) throws ArithmeticException
	{
		if (age<18) {
			
			throw new ArithmeticException("Not Eligible for Vote");
		}
		
		else
		{
			System.out.println("Eligible for Vote ");
		}
	}
	
	public static void main(String[] args) {
		
		checkAge(15);
		
	}
}
