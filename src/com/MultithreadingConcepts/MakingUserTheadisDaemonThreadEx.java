package com.MultithreadingConcepts;

// Note: If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.

public class MakingUserTheadisDaemonThreadEx extends Thread {

	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Daemon: " + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		MakingUserTheadisDaemonThreadEx t1 = new MakingUserTheadisDaemonThreadEx();
		MakingUserTheadisDaemonThreadEx t2 = new MakingUserTheadisDaemonThreadEx();
		t1.start();
		t1.setDaemon(true);// will throw exception here
		t2.start();
	}

}
