package com.abevieiramota.ch11;

public class MeuRunnable implements Runnable {
	
	private int sleepMillis;

	public MeuRunnable(int sleepMillis) {
		this.sleepMillis = sleepMillis;
	}

	@Override
	public void run() {
		for(int i = 0; i < this.sleepMillis / 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(this.sleepMillis);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " Interrompida");
			}
		}
	}

}
