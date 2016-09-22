package com.abevieiramota.ch11.deadlock;

public class A {
	synchronized void foo(B b) {
		String threadName = Thread.currentThread().getName();
		
		System.out.println(threadName + " entrou em A#foo");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println(threadName + " interrompida");
		}
		
		System.out.println(threadName + " tentando chamar B#last");
		b.last();
	}

	synchronized void last() {
		System.out.println("Dentro de A#last");
	}

}
