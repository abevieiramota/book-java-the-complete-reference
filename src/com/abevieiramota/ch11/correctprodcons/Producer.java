package com.abevieiramota.ch11.correctprodcons;

public class Producer implements Runnable {
	
	Q q;
	
	Producer(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		int i = 0;
		
		while(true) {
			System.out.println("Produziu " + i);
			q.put(i++);
		}
	}

}
