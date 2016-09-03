package com.abevieiramota.ch04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.EnumSet;

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

	@Test
	public void testUnsignedRightShift() {

		int a = -1;
		int b = a >>> 24;
		int c = a >> 24;

		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		assertEquals(255, b);
		assertEquals(a, c);
	}

	@Test
	public void testCompoundBinaryOperator() {

		int a = 1234;
		a |= 23;

		System.out.println(a);
	}

	@Test
	public void testEnumMasking() {

		int a = 1;
		int b = 2;
		int c = 4;
		int d = 8;

		int f = 12;

		int e = a | b | c;

		assertTrue((e & a) == a);
		assertTrue((e & b) == b);
		assertTrue((e & c) == c);
		assertFalse((e & d) == d);
		assertFalse((e & f) == f);
	}

	private static int TO_UPPER = 1;
	private static int TRIM = 2;
	private static int REMOVE_FIRST_LETTER = 4;
	private static int ALL = 7;

	// notar que não há ordem
	private String doChange(String str, int flags) {

		String result = str;

		if ((flags & TO_UPPER) == TO_UPPER) {
			result = result.toUpperCase();
		}

		if ((flags & TRIM) == TRIM) {
			result = result.trim();
		}

		if ((flags & REMOVE_FIRST_LETTER) == REMOVE_FIRST_LETTER) {
			result = result.substring(1);
		}

		return result;
	}

	@Test
	public void testFlagMasking() {

		String original = "Ola gente ";

		assertEquals("OLA GENTE ", doChange(original, TO_UPPER));
		assertEquals("Ola gente", doChange(original, TRIM));
		assertEquals("la gente ", doChange(original, REMOVE_FIRST_LETTER));
		assertEquals("LA GENTE ", doChange(original, REMOVE_FIRST_LETTER | TO_UPPER));
		assertEquals("LA GENTE", doChange(original, ALL));
	}

	/**
	 * http://eddmann.com/posts/using-bit-flags-and-enumsets-in-java/
	 *
	 */
	public enum Flag {

		TO_UPPER, TRIM, REMOVE_FIRST_LETTER, ALL;
		
		public static final EnumSet<Flag> ALL_OPTS = EnumSet.allOf(Flag.class);
	}
	
	private String doChange2(String str, EnumSet<Flag> flags) {

		String result = str;

		if (flags.contains(Flag.TO_UPPER)) {
			result = result.toUpperCase();
		}

		if (flags.contains(Flag.TRIM)) {
			result = result.trim();
		}

		if (flags.contains(Flag.REMOVE_FIRST_LETTER)) {
			result = result.substring(1);
		}

		return result;
	}
	
	@Test
	public void testFlagMasking2() {

		String original = "Ola gente ";

		assertEquals("OLA GENTE ", doChange2(original, EnumSet.of(Flag.TO_UPPER)));
		assertEquals("Ola gente", doChange2(original, EnumSet.of(Flag.TRIM)));
		assertEquals("la gente ", doChange2(original, EnumSet.of(Flag.REMOVE_FIRST_LETTER)));
		assertEquals("LA GENTE ", doChange2(original, EnumSet.of(Flag.TO_UPPER, Flag.REMOVE_FIRST_LETTER)));
		assertEquals("LA GENTE", doChange2(original, Flag.ALL_OPTS));
	}
	
	@Test
	public void testBooleanAnd() {
		
		int a = 0;
		assertTrue(true | ++a == 1);
		assertEquals(1, a);
		// short circuit
		a = 0;
		assertTrue(true || ++a == 1);
		assertEquals(0, a);
	}
	
	@Test
	public void testChainAssignment() {
		
		int a, b, c;
		int dez = 10;
		a = b = c = dez;
		
		assertEquals(dez, a);
		assertEquals(dez, b);
		assertEquals(dez, c);
	}

}
