package com.strictfpEx;

public class StrictfpExample {

	public strictfp double performCalculation(double num1, double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		StrictfpExample example = new StrictfpExample();
		double result = example.performCalculation(10.0, 3.0);
		System.out.println("Result: " + result);
	}
}
