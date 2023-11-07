package com.methods;

class ClassA
{

	  public void getVal()
	  {
	     System.out.println("This is Class A");
	  }
}

class ClassB extends ClassA
{
	@Override
	public void getVal()
	{
		System.out.println("This is Override Mathod from Class A");
	}

	public void getBVal()
	{
		System.out.println("This is Class B");
	}
}
public class MethodOverrideEx {


	public static void main(String[] args) {

		ClassB obj=new ClassB();
		obj.getVal();
		obj.getBVal();
	}
}
