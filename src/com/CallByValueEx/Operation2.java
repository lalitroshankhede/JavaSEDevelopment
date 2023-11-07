package com.CallByValueEx;

public class Operation2 {


	 int data=50;

	 void change(Operation2 op)
	 {
		 op.data=op.data+100;   //changes will be in the instance variable
	 }

	 public static void main(String[] args) {
		 Operation2 obj=new Operation2();
		System.out.println("Before Change : "+obj.data);
		obj.change(obj);  //passing object as argument in the method
		System.out.println("After Change : "+obj.data);
	}
}
