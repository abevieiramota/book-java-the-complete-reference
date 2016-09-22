package com.abevieiramota.ch11.deadlock;

public class B {
	
	synchronized void bar(A a) {
		String threadName = Thread.currentThread().getName();
		
		System.out.println(threadName + " entrou em B#bar");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println(threadName + " interrompida");
		}
		
		System.out.println(threadName + " tentando chamar A#last");
		a.last();
	}

	synchronized void last() {
		System.out.println("Dentro de B#last");
	}

}
