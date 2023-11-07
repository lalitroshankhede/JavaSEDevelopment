package com.InheritanceEx;

class A {
	public void getA() {
		System.out.println("Hello I am A");
	}

}

class B extends A {
	public void getB() {
		System.out.println("Hello I am B");
	}
}

public class PracticeOnInheritanceEx1 {

	public static void main(String[] args) {

		/*
		 * A obj=new B(); // reference variable of class A to used to refer the
		 * instaintiate of class B object.
		 *
		 * obj.getA(); // obj.getB(); // it will gives C.T error becoz of reference
		 * variable of class A tries to call method getB from B class which as not
		 * accessible
		 *
		 */



		/*
		 * B obj=new A(); //it will gives C.T error becoz tring to created object of
		 * parent class i.e A and assign to the reference variable of class B // there
		 * is no any method of Class B in class A so you cannot assign an object of a
		 * superclass to a reference variable of a subclass without a cast.
		 *
		 * obj.getA(); obj.getB();
		 *
		 */


		/*
		 * B obj=(B)new A(); //it will gives R.T error becoz trying to cast an instance
		 * of class A assign the reference variable of class B
		 *
		 * System.out.println(obj.getA()+" "+obj.getB());
		 *
		 */
	}

}
