package com.InnerClassEx;

interface OuterInterface {
	void show();

	interface InnerInterface {

		void msg();
	}
}

class OuterClass implements OuterInterface {
	@Override
	public void show() {
		System.out.println("Hello from OuterInterface method");
	}
}

public class NestedInterfaceEx implements OuterInterface.InnerInterface {

	@Override
	public void msg() {

		System.out.println("Hello nested interface");

	}

	public static void main(String[] args) {
		OuterClass outerObj = new OuterClass();
		outerObj.show(); // Calling OuterInterface method

		OuterInterface.InnerInterface obj = new NestedInterfaceEx();
		obj.msg(); // calling inner interface method

	}

}
