package com.methods;

import java.util.Scanner;

public class RecursionEx {


	// Count no from 0 to 10 using Recursion
/*	int count=0;
	public void callItself()
	{
		System.out.println("Serial No. "+count);

		while (count<10) {

			count ++;
			callItself();
		}
	}

	*/


	// Calculate Factorial no. using Recursion



	public static int getFact(int num)
	{
		if (num==0||num==1) {

			return 1;
		}
		else
		{
			return num*getFact(num-1);

		}

	}


	public static void main(String[] args) {

		RecursionEx obj=new RecursionEx();
		 // obj.callItself();

		  Scanner input=new Scanner(System.in);
		  System.out.println("Enter any no.");
		  int number=input.nextInt();

		 int val=getFact(number);

		 System.out.println(val);
	}

}
