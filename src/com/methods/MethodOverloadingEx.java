package com.methods;

import java.util.Scanner;

public class MethodOverloadingEx {


	public void sumofTwo(int x)
	{
		System.out.println("Single Value "+x);
	}

	public void sumofTwo(int x, int y)
	{
		System.out.println("Sum of Two "+(x+y));
	}

	public void sumofTwo(int x, int y, int z)
	{
		System.out.println("Sum of Three "+(x+y+z));

	}

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);

		System.out.println("Enter No.1");
		int num1=input.nextInt();

		System.out.println("Enter No.2");
		int num2=input.nextInt();

		System.out.println("Enter No.3");
		int num3=input.nextInt();


		MethodOverloadingEx obj=new MethodOverloadingEx();
		obj.sumofTwo(num1);

		obj.sumofTwo(num1, num2);

		obj.sumofTwo(num1, num2, num3);
	}

}
