package com.abevieiramota.ch04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaOperators {

	@Test
	public void testIncrementalAssignment() {

		double a = 1.5;

		for (int i = 0; i < 100000000; i++) {

			a = a * 1.2;
		}

	}

	@Test
	public void testIncrementalAssignmentCompound() {

		double a = 1.5;

		for (int i = 0; i < 100000000; i++) {

			a *= 1.2;
		}
	}

	@Test
	/*
	 * All of the integer types (except char) are signed integers. This means
	 * that they can represent negative values as well as positive ones. Java
	 * uses an encoding known as two’s complement, which means that negative
	 * numbers are represented by inverting (changing 1’s to 0’s and vice versa)
	 * all of the bits in a value, then adding 1 to the result. For example, –42
	 * is represented by inverting all of the bits in 42, or 00101010, which
	 * yields 11010101, then adding 1, which results in 11010110, or –42. To
	 * decode a negative number, first invert all of the bits, then add 1. For
	 * example, –42, or 11010110 inverted, yields 00101001, or 41, so when you
	 * add 1 you get 42.
	 * 
	 */
	public void testInvertingNegative() {

		int a = -42;

		int b = ~a + 1;

		assertEquals(-1 * a, b);
	}

	@Test
	public void testNotPositivoIsNegative() {

		int a = 123;
		int b = ~a;

		assertTrue(b < 0);
	}

	@Test
	public void testBitOperators() {

		short a = 247;
		short b = 234;

		System.out.println("a = " + Integer.toBinaryString(a));
		System.out.println("b = " + Integer.toBinaryString(b));
		System.out.println("~a = " + Integer.toBinaryString(~a));
		System.out.println("a & b = " + Integer.toBinaryString(a & b));
		System.out.println("a | b = " + Integer.toBinaryString(a | b));
		System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
	}

	@Test
	public void testLeftShift() {

		int a = 123;
		int b = a << 2;
		int c = (int) (a * Math.pow(2, 2));

		System.out.println("a = " + a + " bin a = " + Integer.toBinaryString(a));
		System.out.println("b = a << 2 = " + b + " bin b = " + Integer.toBinaryString(b));

		assertEquals(c, b);
	}

	@Test
	/*
	 * Java’s automatic type promotions produce unexpected results when you are
	 * shifting byte and short values. As you know, byte and short values are
	 * promoted to int when an expression is evaluated. Furthermore, the result
	 * of such an expression is also an int. This means that the outcome of a
	 * left shift on a byte or short value will be an int, and the bits shifted
	 * left will not be lost until they shift past bit position 31. Furthermore,
	 * a negative byte or short value will be sign-extended when it is promoted
	 * to int. Thus, the high-order bits will be filled with 1’s. For these
	 * reasons, to perform a left shift on a byte or short implies that you must
	 * discard the high-order bytes of the int result. For example, if you
	 * left-shift a byte value, that value will first be promoted to int and
	 * then shifted. This means that you must discard the top three bytes of the
	 * result if what you want is the result of a shifted byte value. The
	 * easiest way to do this is to simply cast the result back into a byte.
	 */
	public void testByteShift() {

		byte a = 64, b, c;
		int i;

		i = a << 2;
		b = (byte) (a << 2);

		System.out.println("Original value of a: " + a);
		System.out.println("i and b: " + i + " " + b);
		System.out.println("bin a: " + Integer.toBinaryString(a));
		System.out.println("bin i: " + Integer.toBinaryString(i));
	}

	@Test
	public void testByteShift2() {

		int i;
		int num = 0xFFFFFFE;

		for (i = 0; i < 4; i++) {
			num = num << 1;
			System.out.println(Integer.toBinaryString(num) + " " + num);
		}
	}

	@Test
	public void tesByteShift3() {

		int a = 32;
		int b = 35;
		int c = a >> 2;
		int d = a >> 2;

		System.out.println(Integer.toBinaryString(a) + " " + a);
		System.out.println(Integer.toBinaryString(b) + " " + b);
		System.out.println(Integer.toBinaryString(c) + " " + c);
		System.out.println(Integer.toBinaryString(d) + " " + d);
	}

	@Test
	public void testDivisionBy2Shift() {

		long a = 1234412315l;

		for (int i = 0; i < 60000000; i++) {

			long b = (((a + i) >> 2) + i) >> 2;
		}
	}

	@Test
	public void testDivisionBy2Division() {

		long a = 1234412315l;

		for (int i = 0; i < 60000000; i++) {

			long b = (((a + i) / 2) + i) >> 2;
		}
	}

	@Test
	/*
	 * When you are shifting right, the top (leftmost) bits exposed by the right
	 * shift are filled in with the previous contents of the top bit. This is
	 * called sign extension and serves to preserve the sign of negative numbers
	 * when you shift them right.
	 */
	public void testRightShiftNegative() {

		int a = -8;
		int b = a >> 2;

		System.out.println(Integer.toBinaryString(a) + " " + a);
		System.out.println(Integer.toBinaryString(b) + " " + b);
	}

	@Test
	/*
	 * It is interesting to note that if you shift –1 right, the result always
	 * remains –1, since sign extension keeps bringing in more ones in the
	 * high-order bits.
	 * 
	 */
	public void testRightShiftNegativeOne() {

		int a = -1;
		int b = a >> 1;
		int c = a >> 2;
		int d = a >> 4;

		assertEquals(a, b);
		assertEquals(a, c);
		assertEquals(a, d);
	}
}
