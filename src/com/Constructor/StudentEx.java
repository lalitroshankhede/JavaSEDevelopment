package com.Constructor;

public class StudentEx {

	int roll;
	String name;

	public StudentEx() {

		System.out.println("This is Default Constructor");
	}

	public StudentEx(int r,String n)
	{
		roll=r;
		name=n;

		System.out.println("This is Parameterized Constructor");
	}


	public StudentEx(StudentEx ex)
	{
		roll=ex.roll;
		name=ex.name;
		System.out.println("This is Clone Constuctor ");
	}
	public void disp()
	{
		System.out.println("Roll "+roll+" "+"Name "+name);
	}

	public static void main(String[] args) {

		StudentEx obj1=new StudentEx();
		StudentEx obj2=new StudentEx(101,"LalitR");
		StudentEx obj3=new StudentEx(obj2);


		obj1.disp();
		obj2.disp();
		obj3.disp();
	}

}
