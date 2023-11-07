package com.ClassandObjEx;

import java.util.Scanner;

public class StudentEx {

	int roll;
	String name;
	String city;

	Scanner input=new Scanner(System.in);


	public void getData()
	{
		System.out.println("Enter Student Roll");
		roll=Integer.parseInt(input.nextLine());
		System.out.println("Enter Student Name");
		name=input.nextLine();
		System.out.println("Enter Student City");
		city=input.next();
	}

	public void dispData()
	{
		System.out.println("Roll "+roll);
		System.out.println("Name "+name);
		System.out.println("City "+city);
	}


	public static void main(String[] args) {

		StudentEx stud1=new StudentEx();
		stud1.getData();
		stud1.dispData();

	}

}
