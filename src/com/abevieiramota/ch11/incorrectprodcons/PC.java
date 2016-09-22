package com.abevieiramota.ch11.incorrectprodcons;

public class PC {
	public static void main(String[] args) {
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		Thread prodTrhead = new Thread(p, "Producer");
		Thread consTrhead = new Thread(c, "Consumer");
		prodTrhead.start();
		consTrhead.start();
	}

}
