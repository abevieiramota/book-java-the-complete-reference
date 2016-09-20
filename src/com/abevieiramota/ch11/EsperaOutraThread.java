package com.abevieiramota.ch11;

public class EsperaOutraThread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Com join");
		comJoin();
		System.out.println("Com isAlive");
		comIsAlive();
	}

	private static void comJoin() throws InterruptedException {
		MeuRunnable mr = new MeuRunnable(400);
		Thread t = new Thread(mr, "Um runnable");
		System.out.println("Vai começar hein!");
		t.start();
		t.join();
		System.out.println("Terminou!!!!");
	}
	
	private static void comIsAlive() throws InterruptedException {
		MeuRunnable mr = new MeuRunnable(400);
		Thread t = new Thread(mr, "Um runnable");
		System.out.println("Vai começar hein!");
		t.start();
		while(t.isAlive()) {}
		System.out.println("Terminou!!!!");
	}
}
