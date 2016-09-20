package com.abevieiramota.ch11;

interface CallMe {
	void call(String msg);
}

class CallMeNotSync implements CallMe {
	public void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Deu ruim");
		}
		System.out.println("]");
	}
}

class CallMeSync implements CallMe {
	public synchronized void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Deu ruim");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {

	private CallMe callme;
	private String msg;

	public Caller(CallMe callme, String msg) {
		this.callme = callme;
		this.msg = msg;
	}

	@Override
	public void run() {
		this.callme.call(this.msg);
	}
}

class CallerSyncBlock implements Runnable {

	private CallMe callme;
	private String msg;

	public CallerSyncBlock(CallMe callme, String msg) {
		this.callme = callme;
		this.msg = msg;
	}

	@Override
	public void run() {
		synchronized (this.callme) {
			this.callme.call(this.msg);
		}
	}
}

public class ExemploRaceCondition {
	public static void main(String[] args) {
		System.out.println("A parada não ta sincronizada!");
		CallMe callNotSync = new CallMeNotSync();
		Caller c1 = new Caller(callNotSync, "Abelardo");
		Caller c2 = new Caller(callNotSync, "Cthulhu");
		Caller c3 = new Caller(callNotSync, "daaaaaawn");
		Thread t1 = new Thread(c1, "t1");
		Thread t2 = new Thread(c2, "t2");
		Thread t3 = new Thread(c3, "t3");
		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("Deu ruim demais!");
		}
		System.out.println("Fim da parada não sincronizada!");
		System.out.println("Que comece a sincronização!");
		CallMe callSync = new CallMeSync();
		c1 = new Caller(callSync, "Abelardo");
		c2 = new Caller(callSync, "Cthulhu");
		c3 = new Caller(callSync, "daaaaaawn");
		t1 = new Thread(c1, "t1");
		t2 = new Thread(c2, "t2");
		t3 = new Thread(c3, "t3");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("Deu ruim demais!");
		}
		System.out.println("Fim da sincronização pesada!");
		System.out.println("Que comece a sincronização por block!!!!!!!!!!!!!!!");
		callNotSync = new CallMeNotSync();
		CallerSyncBlock cs1 = new CallerSyncBlock(callNotSync, "Abelardo");
		CallerSyncBlock cs2 = new CallerSyncBlock(callNotSync, "Cthulhu");
		CallerSyncBlock cs3 = new CallerSyncBlock(callNotSync, "daaaaaawn");
		t1 = new Thread(cs1, "t1");
		t2 = new Thread(cs2, "t2");
		t3 = new Thread(cs3, "t3");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("Deu ruim demais!");
		}
		System.out.println("Fim da sincronização pesada!");
	}
}
