package com.abevieiramota.ch08;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestB {

	@Test
	public void test() {

		int i = 10;
		int j = 20;
		int k = 15;
		B b = new B(i, j, k);

		assertEquals(i + j + k, b.sum());
		assertEquals(i, b.iDaSuper());
	}
	
	private class Ovo {
		public Ovo() {
			System.out.println("Ovo");
		}
	}
	
	private class Galinha extends Ovo {
		public Galinha() {
			super();
			System.out.println("Galinha");
		}
	}
	
	private class MasQueHierarquiaFeia extends Galinha {
		public MasQueHierarquiaFeia() {
			super();
			System.out.println("Rs");
		}
	}
	
	@Test
	public void quemVemPrimeiro() {
		new MasQueHierarquiaFeia();
	}
}
