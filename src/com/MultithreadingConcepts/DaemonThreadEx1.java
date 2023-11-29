package com.MultithreadingConcepts;

public class DaemonThreadEx1 extends Thread {

	public void run() {

		if (Thread.currentThread().isDaemon()) { // check is daemon thread or not.

			System.out.println("daemon thread work");
		}

		else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {

		DaemonThreadEx1 ob1 = new DaemonThreadEx1();
		DaemonThreadEx1 ob2 = new DaemonThreadEx1();
		DaemonThreadEx1 ob3 = new DaemonThreadEx1();

		ob1.setDaemon(true); // now t1 is Daemon Thread

		ob1.start();// starting threads
		ob2.start();
		ob3.start();

	}
}
