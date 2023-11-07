package com.CBSEPercetnageCal;

import java.util.Scanner;

public class CBSEResult {

	public static void main(String[] args) {

		System.out.println("Enter No. of Subject To Calculate Marks ");
		Scanner input = new Scanner(System.in);

		int totalSub = input.nextInt();

		String arr[] = { "English", "Maths", "Science", "History", "Geography" };

		int marks[] = new int[totalSub];

		for (int i = 0; i < arr.length; i++) {

			System.out.print("Enter marks for " + arr[i] + "\t");

			marks[i] = input.nextInt();

		}

		System.out.println("============== Subjects with Marks =========");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " Marks is : " + marks[i]);

		}

		int totalMarks = 0;

		for (int i = 0; i < arr.length; i++) {

			totalMarks = totalMarks + marks[i];

		}


		float percentage = (float) (totalMarks / 500.0) * 100;

		System.out.println("Total Percentage is : " + percentage);


		if (percentage>=90) {

			System.out.println("Merit");
		}
		else if (percentage>70 &&  percentage<90) {

			System.out.println("Distinction");
		}

		else if (percentage>60 && percentage<70) {

			System.out.println("First Class");
		}
		else if (percentage>50 && percentage<60) {

			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
