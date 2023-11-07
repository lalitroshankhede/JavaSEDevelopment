package com.Constructor;

public class ConstructorChaining {

	int roll;
	String name;
	String city;

	int age;

	public ConstructorChaining(int roll, String name, String city) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name = name;
		this.city = city;
	}

	public ConstructorChaining(int roll, String name, String city, int age) {
		this(roll, name, city);
		this.age = age;

		// this(rollno,name,course);// Call this() in first statement in constructor otherwise gives C.T.Error


	}

	public void disp() {
		System.out.println("Roll " + roll);
		System.out.println("Name " + name);

		System.out.println("City " + city);
		System.out.println("Age " + age);
	}

	public static void main(String[] args) {

		ConstructorChaining obj = new ConstructorChaining(101, "LalitR", "Nagpur");
		ConstructorChaining obj2 = new ConstructorChaining(102, "Aniket", "Mumbai", 45);

		obj.disp();
		obj2.disp();
	}
}
