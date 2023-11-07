package com.RealUseofSuperKeyword;

class Person
{
	int id;
	String name;

	public Person(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

}

class Emp extends Person
{
	float salary;

	public Emp(int id,String name,float salary) {
		// TODO Auto-generated constructor stub
		super(id, name); // reusing parent constructor
		this.salary=salary;

	}


	public void disp()
	{
		System.out.println("Id "+id+" "+"Name "+name+" "+"Salary "+salary);
	}
}

public class SuperTest {

	 public static void main(String[] args) {

		 Emp obj=new Emp(101,"Lalit R",100000);
		 obj.disp();
	}

}
