package com.FinalEx;

class Bike
{
	final int speed;

//	public void get()
//	{
//		speed=100;
//	}
	  // you cannot initialize blank final variable in method it can only initialize in only in Constructor

	Bike()
	{
		speed=1000;
	}

}

public class BlackFinalVariable {

	public static void main(String[] args) {
		Bike obj=new Bike();

		System.out.println(obj.speed);
	}



}
