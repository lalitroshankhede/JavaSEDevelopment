package com.basicprograms;

import java.util.Scanner;

public class ConvertKilometertoMiles {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Enter Kilometers");

		int kilometer=input.nextInt();

		float miles=(float) (0.6213711922 * kilometer);


		System.out.println("Total Miles is : "+miles);

	}
}
