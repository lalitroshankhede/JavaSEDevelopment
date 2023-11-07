package com.basicprograms;

import java.util.Scanner;

public class CheckUserEnteredValueIntegerorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input=new Scanner(System.in);

		System.out.println("Enter any no.");

	     boolean result=input.hasNextInt();

	     System.out.println("Result is "+result);


	}

}
