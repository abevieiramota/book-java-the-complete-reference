package com.abevieiramota.ch03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaPrimitiveTypes {

	@Test
	public void testByte() {

		byte a = 10;
		byte b = 12;

		assertEquals(22, a + b);
	}

	@Test
	public void testOctal() {

		int dez = 012;

		assertEquals(10, dez);
	}

	@Test
	public void testHexa() {

		int dez = 0xA;

		assertEquals(10, dez);
	}

	@Test
	// a partir de jdk 7
	public void testBinary() {

		int dez = 0b1010;

		assertEquals(10, dez);
	}

	@Test
	// a partir de jdk 7
	// Underscores can only be used to separate digits.
	// They cannot come at the beginning or the end of a literal.
	// It is, however, permissible for more than one underscore to be used
	// between two digits.
	public void testUndescores() {

		long numeroGrande = 123_456_____________789;

		assertEquals(123456789, numeroGrande);

	}

	@Test
	public void testCharacterRs() {
		
		char baseMarmota = 500;
		
		int qtdMarmota = 1000;

		for (char i = baseMarmota; i < baseMarmota + qtdMarmota; i++) {

			System.out.println(i);
		}
		
	}

}
