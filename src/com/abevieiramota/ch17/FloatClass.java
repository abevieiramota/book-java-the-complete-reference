package com.abevieiramota.ch17;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FloatClass {

	@Test
	public void testConstants() {
		System.out.println("BYTES " + Float.BYTES);
		System.out.println("MAX_EXPONENT " + Float.MAX_EXPONENT);
		System.out.println("MAX_VALUE " + Float.MAX_VALUE);
		System.out.println("MIN_EXPONENT " + Float.MIN_EXPONENT);
		System.out.println("MIN_NORMAL " + Float.MIN_NORMAL);
		System.out.println("MIN_VALUE " + Float.MIN_VALUE);
		System.out.println("NaN " + Float.NaN);
		System.out.println("POSITIVE_INFINITY " + Float.POSITIVE_INFINITY);
		System.out.println("NEGATIVE_INFINITY " + Float.NEGATIVE_INFINITY);
		System.out.println("SIZE " + Float.SIZE);
		System.out.println("TYPE " + Float.TYPE);
	}
}
