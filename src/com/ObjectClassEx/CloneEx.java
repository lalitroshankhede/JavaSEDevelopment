package com.ObjectClassEx;

class Student1 implements Cloneable
{
	int rollNo;
	String name;



	public Student1(int rollNo,String name) {
		// TODO Auto-generated constructor stub

		this.rollNo=rollNo;
		this.name=name;

	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class CloneEx {

	public static void main(String[] args) {

		try
		{
			Student1 obj1=new Student1(101, "LalitR");
			Student1 obj2=(Student1)obj1.clone();  // clone the object

			System.out.println(obj1.rollNo+" "+obj1.name);
			System.out.println(obj2.rollNo+" "+obj2.name);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
