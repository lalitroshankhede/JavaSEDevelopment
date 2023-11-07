package com.InterfaceEx;

interface Printable {
	void print();
}

interface Showable {
	void print();
}

class MultipleInheritanceEx implements Printable, Showable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}


}

public class MultipleInheritanceTest {

	public static void main(String[] args) {

		MultipleInheritanceEx obj = new MultipleInheritanceEx();
		obj.print();
	 
	}
}
