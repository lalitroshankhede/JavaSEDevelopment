package com.basicprograms;

import java.util.Scanner;

public class SumofFirstEvennoWhileLoop {

	public static void main(String[] args) {

		int num=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter No Size. ");
		num=input.nextInt();
		int i = 1;
		int sum=0;

		while (i<=num) {

			if (i%2==0) {

				sum=sum+i;
			}

			i++;
		}

		System.out.println("Sum of all Even no. is "+sum);

	}

}
