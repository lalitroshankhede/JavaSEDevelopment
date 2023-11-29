package com.MultithreadingConcepts;

public class CanRunThreadTwiceEdx extends Thread {

	
	public void run()
	{
		System.out.println("Running Thread...");
	}
	
	
	public static void main(String[] args) {
		
		CanRunThreadTwiceEdx obj=new CanRunThreadTwiceEdx();
		
		obj.start();
		obj.start();    // You cannot run thread twice it will throw an "IllegalThreadStateException" exception
		
	}
}
