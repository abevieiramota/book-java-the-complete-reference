package com.abevieiramota.ch11;

public class ChamaThread {

	public static void main(String[] args) {
		MinhaThread mt = new MinhaThread();
		mt.start();
		MeuRunnable mr = new MeuRunnable(300);
		Thread tmr = new Thread(mr, "runnable do mal");
		tmr.start();
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " Interrompida");
			}
		}
	}

}
