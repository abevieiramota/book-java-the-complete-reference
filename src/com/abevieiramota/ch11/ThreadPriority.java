package com.abevieiramota.ch11;

public class ThreadPriority {

	public static void main(String[] args) {
		MinhaThread t1 = new MinhaThread();
		MinhaThread t2 = new MinhaThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
