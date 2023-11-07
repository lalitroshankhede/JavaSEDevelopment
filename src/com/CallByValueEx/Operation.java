package com.CallByValueEx;

public class Operation {

	 int data=50;


	 void change(int data)
	 {
		 data=data+100;  //change will be in the local variable only
	 }

	 public static void main(String[] args) {
		Operation obj=new Operation();
		System.out.println("Before Change : "+obj.data);
		obj.change(500);
		System.out.println("After Change : "+obj.data);
	}
}
