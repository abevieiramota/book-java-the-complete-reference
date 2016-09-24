package com.abevieiramota.ch11;

public class TestandoNotAtomicOperation {
	public static void main(String[] args) throws InterruptedException {
		GeradorDeInteger gi = new GeradorDeInteger();
		EuUsoInteger eui1 = new EuUsoInteger(gi);
		EuUsoInteger eui2 = new EuUsoInteger(gi);
		Thread th1 = new Thread(eui1, "th1");
		Thread th2 = new Thread(eui2, "th2");
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		for(Integer i: eui1.getIntegersGerados()) {
			System.out.println(i);
		}
		
		for(Integer i: eui2.getIntegersGerados()) {
			System.out.println(i);
		}
	}
}
