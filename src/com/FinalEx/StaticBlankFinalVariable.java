package com.FinalEx;


class Bike1
{
	final static int speed;

	static
	{
		speed=80;
	}
}



public class StaticBlankFinalVariable {

	public static void main(String[] args) {

		Bike1 obj=new Bike1();
		System.out.println(Bike1.speed);
	}

}
