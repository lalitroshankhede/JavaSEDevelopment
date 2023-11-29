package com.MultithreadingConcepts;

import java.util.Iterator;

public class ThreadSleepEx extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {

			try {
				sleep(500);
				sleep(-500); // if you give negative value for sleeping time error will be throw as
								// "IllegalArgumentException"
								// and output will be "timeout value is negative"

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}

			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		ThreadSleepEx obj1 = new ThreadSleepEx();
		ThreadSleepEx obj2 = new ThreadSleepEx();

		obj1.start();
		obj2.start();
	}

}
