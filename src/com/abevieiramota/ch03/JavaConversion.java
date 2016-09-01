package com.abevieiramota.ch03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaConversion {

	@Test
	public void testConversionIntToFloat() {

		int a = 10;
		float b = a;

		System.out.println(b);
	}

	@Test
	/*
	 * If the integer’s value is larger than the range of a byte, it will be
	 * reduced modulo (the remainder of an integer division by the) byte’s
	 * range.
	 * 
	 */
	public void testConversionIntToByte() {

		int a = 12345678;
		byte b = (byte) a;

		System.out.println("Valor original: " + a + " Valor pós cast: " + b);
	}

	@Test
	/*
	 * when a floating-point value is assigned to an integer type, the
	 * fractional component is lost
	 */
	public void testConversionFloatToInt() {

		float a = 10.2f;
		int b = (int) a;

		System.out.println("Valor original: " + a + " Valor pós cast: " + b);
	}

	@Test
	public void testAutomaticPromotion() {

		byte a = 127, b = 123;

		for (int i = 0; i < 1500000; i++) {

			int c = a * b;
			System.out.println(c);
		}
	}

	@Test
	public void testWithoutAutomaticPromotion() {
		
		int a = 127, b = 123;

		for (int i = 0; i < 1500000; i++) {

			int c = a * b;
			System.out.println(c);
		}

	}
}
