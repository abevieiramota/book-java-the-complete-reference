package com.abevieiramota.ch03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaArray {

	@Test
	public void testCriarArray() {

		int meuArray[] = new int[10];
		int[] meuSegundoArray;
		int a[], b; // apenas a é array
		int[] c, d; // c e d são arrays
	}

	@Test
	public void testDefaultArrayNumeric() {

		byte bArr[] = new byte[1];
		char cArr[] = new char[1];
		short sArr[] = new short[1];
		int iArr[] = new int[1];
		long lArr[] = new long[1];
		float fArr[] = new float[1];
		double dArr[] = new double[1];

		assertEquals(0, bArr[0]);
		assertEquals(0, cArr[0]);
		assertEquals(0, sArr[0]);
		assertEquals(0, iArr[0]);
		assertEquals(0, lArr[0]);
		assertEquals(0f, fArr[0], 0.0000001f);
		assertEquals(0d, dArr[0], 0.0000001d);
	}

	@Test
	public void testDefaultBool() {

		boolean bArr[] = new boolean[1];

		assertFalse(bArr[0]);
	}

	@Test
	public void testDefaultReference() {

		String[] sArr = new String[1];

		assertNull(sArr[0]);
	}

	@Test
	public void testArrayInitialization() {

		int[] i2Arr = new int[] { 1, 2, 3, 4, 5 };
		// oh my god, n preciso desse new int[]!
		int[] iArr = { 10, 12, 13, 99 };
	}

	@Test
	public void testMultiDimArrays() {

		// n precisa ser quadradão rs
		// só pode fazer isso em initializer!
		int[][] oArrayzao = { { 1, 2, 3 }, { 3, 4, 5, 6 } };

		System.out.println(oArrayzao.length);
		System.out.println(oArrayzao[0].length);
		System.out.println(oArrayzao[1].length);
	}

	@Test
	public void testInitializingMultiDimArrays() {

		/*
		 * When you allocate memory for a multidimensional array, you need only
		 * specify the memory for the first (leftmost) dimension.
		 */
		int[][] oArrayzao = new int[2][];

		oArrayzao[0] = new int[10];
		oArrayzao[1] = new int[3];
	}
}
