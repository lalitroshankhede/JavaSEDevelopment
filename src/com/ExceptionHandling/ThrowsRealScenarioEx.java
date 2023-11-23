package com.ExceptionHandling;

public class ThrowsRealScenarioEx {

	public static int divideNum(int num1 , int num2) throws ArithmeticException
	{
		int div=num1/num2;
		
		return div;
	}
	
	public static void main(String[] args) {
		
		ThrowsRealScenarioEx obj=new ThrowsRealScenarioEx();
		
		try
		{
			System.out.println(obj.divideNum(45, 0));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Number can't divided by 0 ");
		}
		
		System.out.println("Normal flow of code...");
	}
}
