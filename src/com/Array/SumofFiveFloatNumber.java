package com.Array;

public class SumofFiveFloatNumber {

	public static void main(String[] args) {


		float numArray[]= {54.67f,76.78f,89.56f,90.45f,76.34f};

		float sum=0;
		for (float element : numArray) {


			sum=sum+element;

		}

		System.out.println("Sum of Five Floating Number is : "+sum);

	}

}
