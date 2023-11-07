package com.StringEx;

public class toStringEx {


	int roll;
	String name;


	public toStringEx(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}





	// Now, we Override toString method from Object class to getting values
	@Override
	public String toString() {
		return "toStringEx [roll=" + roll + ", name=" + name + "]";
	}


	public static void main(String[] args) {


		toStringEx obj=new toStringEx(101,"Lalit");
		System.out.println(obj); //Now, it will print actual values

	}

}
