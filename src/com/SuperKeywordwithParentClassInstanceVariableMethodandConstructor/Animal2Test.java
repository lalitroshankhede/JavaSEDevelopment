package com.SuperKeywordwithParentClassInstanceVariableMethodandConstructor;

class Animal2
{

	public void sound()
	{
		System.out.println("Total 3 Type of Animal 1. Land Animal. 2. Sky Animal 3. Water Animal");
	}
}

class Dog2 extends Animal2
{

	@Override
	public void sound()
	{
		System.out.println("Dog is type of Land Animal");
	}

	public void getVal()
	{
		sound();
		super.sound();
	}
}


public class Animal2Test {


	public static void main(String[] args) {

		Dog2 obj=new Dog2();
		obj.getVal();
	}

}
