package com.SuperKeywordwithParentClassInstanceVariableMethodandConstructor;

class Animal3
{

	Animal3()
	{
		System.out.println("Total 3 Type of Animal 1. Land Animal. 2. Sky Animal 3. Water Animal");
	}

	Animal3(String str)
	{

		System.out.println("The Sky Animal is "+str);
	}
}

class Dog3 extends Animal3
{

	Dog3()
	{
		super("Parrot");
		 //if parent class extend and having constructor it will called first
		System.out.println("Dog is type of Land Animal");
	}


}

public class Animal3Test {

	public static void main(String[] args) {

		Dog3 obj=new Dog3();

	}
}
