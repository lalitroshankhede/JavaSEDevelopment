package com.PolymorphismEx;

class Bike2
{
	int speedlimit=60;
}

class Spendor2 extends Bike2
{
	int speedlimit=100;
}
public class RuntimePolymorphismEx2 {

	public static void main(String[] args) {

		Bike2 obj=new Spendor2();
		System.out.println(obj.speedlimit); //output will be 60 becoz Runtime Polymorphism can't be achieved data members of the class.
	}
}
