package com.InterfaceEx;

interface DefaultEx {
	void draw();

	default void msg() {
		System.out.println("This is Default Method calling from Interface");
	}
}

class Rectangle implements DefaultEx {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class DefaultMethodInterfaceEx {

	public static void main(String[] args) {

		DefaultEx obj = new Rectangle();
		obj.draw();
		obj.msg();
	}
}
