package com.MultithreadingConcepts;

public class ThreadPriorityEx1 extends Thread {

	
	public void run()
	{
		// the print statement  
		System.out.println("Inside the run() method");  
	}
	
	public static void main(String[] args) {
		
		ThreadPriorityEx1 th1 = new ThreadPriorityEx1();  
		ThreadPriorityEx1 th2 = new ThreadPriorityEx1();  
		ThreadPriorityEx1 th3 = new ThreadPriorityEx1();  
		
		// We did not mention the priority of the thread.  
		// Therefore, the priorities of the thread is 5, the default value  
		
		
		// 1st Thread  
		// Displaying the priority of the thread  
		// using the getPriority() method  
		System.out.println("Default Priority of the thread th1 is : " + th1.getPriority());  
		
		
		// 2nd Thread   
		// Display the priority of the thread  
		System.out.println("Default Priority of the thread th2 is : " + th2.getPriority());  
		
		
		
		// 3rd Thread   
		// // Display the priority of the thread  
		System.out.println("Default Priority of the thread th3 is : " + th2.getPriority());  
		  
		
		
		// Setting the Priotity to Thread 
		
		th1.setPriority(6);  
		th2.setPriority(3);  
		th3.setPriority(9);  
		  
		
	
		
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
		  
	  
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
		  
	 
		System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
		
		
		
		
		
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		
		// setting main thread Priority 
		 
		System.out.println("Default Priority of the main thread is : " + Thread.currentThread().getPriority());  
		
		Thread.currentThread().setPriority(10);
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
		
	}
}
