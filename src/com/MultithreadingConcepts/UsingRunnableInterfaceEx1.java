package com.MultithreadingConcepts;

public class UsingRunnableInterfaceEx1 implements Runnable{

	@Override
	public void run() {
	 
		System.out.println("Now Thread is running....");
		
	}
	
	
	public static void main(String[] args) {
		
		UsingRunnableInterfaceEx1 obj=new UsingRunnableInterfaceEx1();
		
		Thread thread=new Thread(obj);  // Imp note:  you need to use Thread class object for start the thread 
		thread.start();   
	}

	
}
