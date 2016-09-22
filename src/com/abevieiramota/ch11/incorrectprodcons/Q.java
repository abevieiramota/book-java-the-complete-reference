package com.abevieiramota.ch11.incorrectprodcons;

public class Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrompeu aqui!");
			}
		}
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrompeu again!");
			}
		}
		this.n = n;
		valueSet = true;
		notify();
	}

}
