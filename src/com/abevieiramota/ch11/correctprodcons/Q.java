package com.abevieiramota.ch11.correctprodcons;

public class Q {
	int n;
	
	synchronized int get() {
		return n;
	}
	
	synchronized void put(int n) {
		this.n = n;
	}

}
