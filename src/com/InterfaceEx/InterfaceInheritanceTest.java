package com.InterfaceEx;

interface Printable1
{
	void print();  
}

interface Showable1 extends Printable1
{
	void show();
}


public class InterfaceInheritanceTest implements Showable1 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello i am from Printable Interface");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello i am from Showable Interface");
	}

	
	public static void main(String[] args) {
		
		InterfaceInheritanceTest obj=new InterfaceInheritanceTest();
		obj.print();
		obj.show();
	}
}
