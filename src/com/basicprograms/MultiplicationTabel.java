package com.basicprograms;

import java.util.Scanner;

public class MultiplicationTabel {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		System.out.println("Enter any no want print table ");

		int num=input.nextInt();

		for (int i =1; i <=10; i++) {

			System.out.println(num+" * "+i+"\t"+(num*i));
		}

	}

}
