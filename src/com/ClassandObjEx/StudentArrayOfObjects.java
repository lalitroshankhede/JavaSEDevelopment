package com.ClassandObjEx;

import java.util.Scanner;

public class StudentArrayOfObjects {

	int roll;
	String name;
	String city;

	Scanner input = new Scanner(System.in);

	public void studData() {
		System.out.println("Enter Student Roll");

		System.out.println("Enter Student Name");
		name = input.nextLine();
		System.out.println("Enter Student City");
		city = input.next();
	}

	public void dispData() {
		System.out.println("Roll " + roll);
		System.out.println("Name " + name);
		System.out.println("City " + city);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Total No. of Students Data you want.");
		int totalStud = input.nextInt();
		System.out.println("Enter Data for " + totalStud + " Students");
		StudentArrayOfObjects studArr[] = new StudentArrayOfObjects[totalStud];

		for (int i = 0; i < studArr.length; i++) {

		      studArr[i]=new StudentArrayOfObjects();
		}

		for (StudentArrayOfObjects element : studArr) {


			element.studData();
		}

		System.out.println("============ Student Records ========= ");

		for (StudentArrayOfObjects element : studArr) {

			element.dispData();
		}
	}

}
