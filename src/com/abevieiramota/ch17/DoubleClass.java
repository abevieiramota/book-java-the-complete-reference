package com.abevieiramota.ch17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DoubleClass {

	@Test
	public void testConstants() {
		System.out.println("BYTES " + Double.BYTES);
		System.out.println("MAX_EXPONENT " + Double.MAX_EXPONENT);
		System.out.println("MAX_VALUE " + Double.MAX_VALUE);
		System.out.println("MIN_EXPONENT " + Double.MIN_EXPONENT);
		System.out.println("MIN_NORMAL " + Double.MIN_NORMAL);
		System.out.println("MIN_VALUE " + Double.MIN_VALUE);
		System.out.println("NaN " + Double.NaN);
		System.out.println("POSITIVE_INFINITY " + Double.POSITIVE_INFINITY);
		System.out.println("NEGATIVE_INFINITY " + Double.NEGATIVE_INFINITY);
		System.out.println("SIZE " + Double.SIZE);
		System.out.println("TYPE " + Double.TYPE);
	}

	@Test
	public void testInfinity() {
		assertEquals(Double.POSITIVE_INFINITY, new Double(1./0.), 0D);
		assertEquals(Double.POSITIVE_INFINITY, Double.longBitsToDouble(0x7ff0000000000000L), 0D);
	}
	
	@Test
	public void testNan() {
		assertEquals(Double.NaN, new Double(0./0.), 0D);
	}
	
	@Test
	public void decimalLiteralDouble() {
		Object x = 10.2;
		assertEquals(Double.class, x.getClass());
	}
}
