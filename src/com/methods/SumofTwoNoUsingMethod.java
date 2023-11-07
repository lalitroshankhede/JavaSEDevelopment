package com.methods;

import java.util.Scanner;

public class SumofTwoNoUsingMethod {

	public static int sumofTwo(int x, int y)
	{

		int result=x+y;

		return result;
	}


	public int mulofTwo(int x,int y)
	{

		int result=x*y;

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1=input.nextInt();
		System.out.println("Enter 2nd Number");
		int num2=input.nextInt();
		int sum=sumofTwo(num1,num2);
		System.out.println("Sum of Two no. is "+sum);


            // Multiplication of Two no.


		   SumofTwoNoUsingMethod obj=new SumofTwoNoUsingMethod();

				System.out.println("Enter 1st Number");
				int no1=input.nextInt();
				System.out.println("Enter 2nd Number");
				int no2=input.nextInt();

				int mul=obj.mulofTwo(no1,no2);


				System.out.println("Multiplication of Two no. is "+mul);


	}

}
