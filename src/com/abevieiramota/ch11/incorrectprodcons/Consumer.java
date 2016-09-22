package com.abevieiramota.ch11.incorrectprodcons;

public class Consumer implements Runnable {
	
	Q q;
	
	Consumer(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Consumiu " + q.get());
		}
	}

}
