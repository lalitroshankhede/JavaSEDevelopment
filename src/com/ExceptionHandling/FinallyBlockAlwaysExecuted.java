package com.ExceptionHandling;

public class FinallyBlockAlwaysExecuted {

	public static void main(String[] args) {
		

		try
		{
			int num=10/0;
		}
		
		catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
		// System.exit(0); // to exit program directly i.e Note: finally block will not be executed any how
		
		}
		
		finally {
			System.out.println("This is Finally Block ");
		}
	}
}
