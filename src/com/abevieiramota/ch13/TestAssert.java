package com.abevieiramota.ch13;

// executar com -ea
public class TestAssert {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			assert i < 5 : "maxo, deixa esse i menor que 5";
			System.out.println(i);
		}
	}
}
