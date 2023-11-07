package com.Array;

import java.util.Scanner;

public class NumberisPresentorNot {

	public static void main(String[] args) {



		int numArr[]= {56,87,34,67,54,89,65,78};

		Scanner input=new Scanner(System.in);
		System.out.println("Enter any no to be serarch in array");
		int num=input.nextInt();

		for (int i = 0; i < numArr.length; i++) {


			if (numArr[i]==num) {

				System.out.println("No is Present in The Array at "+(i+1)+" position");
			}

		}
	}

}
