package com.abevieiramota.ch10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TryCatchTest {
	
	@SuppressWarnings("serial")
	class ExcecaoDoBem extends Exception {
		public ExcecaoDoBem() {
			System.out.println("ExcecaoDoBem sendo criada!");
		}
	}

	@Test
	public void testFinally() throws ExcecaoDoBem {
		try {
			int a = 0;
			int b = 10;
			int c = b / a;
		} catch(ArithmeticException e) {
			System.out.println("Catch");
			throw new ExcecaoDoBem();
		} finally {
			System.out.println("Finally");
		}
	}
}
