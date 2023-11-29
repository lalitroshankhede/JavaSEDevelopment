package com.MultithreadingConcepts;

public class UsingThreadClassEx1 extends Thread {

	public void run()
	{
		System.out.println("Thread is running...");
	}
	
	
	public static void main(String[] args) {
		
		UsingThreadClassEx1 obj=new UsingThreadClassEx1();
		obj.start();
	}
}
