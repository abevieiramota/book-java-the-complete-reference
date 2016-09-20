package com.abevieiramota.ch11;

public class MarmotaComThread {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			MeuRunnable mr = new MeuRunnable(i*100);
			Thread tmr = new Thread(mr, "sleep millis = "+i);
			tmr.start();
		}
	}

}
