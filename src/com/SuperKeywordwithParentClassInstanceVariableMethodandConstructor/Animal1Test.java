package com.SuperKeywordwithParentClassInstanceVariableMethodandConstructor;

class Animal1
{
	String color="white";
}

class Dog1 extends Animal1
{
	String color ="black";

	public void getVal()
	{

		System.out.println(color); //black
		System.out.println(super.color); //white
	}

}

public class Animal1Test {

	public static void main(String[] args) {

		Dog1 obj=new Dog1();

		obj.getVal();
	}

}
