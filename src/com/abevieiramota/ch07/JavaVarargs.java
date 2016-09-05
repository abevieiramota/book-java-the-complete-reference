package com.abevieiramota.ch07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaVarargs {

	private int[] criaArray(int i) {
		int[] v = new int[2];
		v[0] = i;
		v[1] = 10;

		return v;
	}

	private int[] criaArray(int... v) {

		return v;
	}
	
	/*
	 * cria ambiguidade!
	 */
//	private boolean[] criaArray(boolean... v) {
//		
//		return v;
//	}

	private int[] criaArray(float a, int... v) {

		return v;
	}

	private int[] criaArray(short a, int... v) {

		return v;
	}

	@Test
	public void testVarargsLength() {
		int[] array = criaArray(1, 2, 3, 4, 5, 6);

		assertEquals(6, array.length);
	}

	@Test
	public void testVarargsLengthEmpty() {
		int[] array = criaArray();

		assertEquals(0, array.length);
	}

	@Test
	public void testVarargsComOutrosParams() {

		int[] array = criaArray(1f, 2, 3, 4, 5, 6);

		assertEquals(5, array.length);
	}

	@Test
	public void testVarargsComOutrosParams2() {
		short i = 1;
		int[] array = criaArray(i, 2, 3, 4, 5, 6);

		assertEquals(5, array.length);
	}

	@Test
	public void testVarargsComOutrosParams3() {
		int[] array = criaArray(1); // resolve por quantidade de params -> se 1,
									// chama o não varargs

		assertEquals(2, array.length);
	}
	
}
