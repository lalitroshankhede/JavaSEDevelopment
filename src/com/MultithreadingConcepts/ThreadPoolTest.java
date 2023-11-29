package com.MultithreadingConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolEx1 implements Runnable {
	private String message;

	public ThreadPoolEx1(String s) {
		this.message = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage(); // call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name
	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadPoolTest {

	public static void main(String[] args) {

		ExecutorService exService = Executors.newFixedThreadPool(5); // creating a pool of 5 threads

		for (int i = 0; i < 10; i++) {
			Runnable worker = new ThreadPoolEx1("" + i);
			exService.execute(worker);// calling execute method of ExecutorService
		}

		exService.shutdown();

		while (!exService.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}
