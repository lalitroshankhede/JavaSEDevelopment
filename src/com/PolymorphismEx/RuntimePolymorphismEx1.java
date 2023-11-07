package com.PolymorphismEx;

class Bike1
{
	public void getSpeed()
	{
		System.out.println("Bike Running");
	}
}

class Spendor extends Bike1
{
	@Override
	public void getSpeed()
	{
		System.out.println("Spendor is Running with 60KM");

	}
}


public class RuntimePolymorphismEx1 {

	public static void main(String[] args) {

		Bike1 obj=new Spendor();
		obj.getSpeed();
	}
}
