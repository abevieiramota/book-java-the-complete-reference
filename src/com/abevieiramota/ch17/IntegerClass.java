package com.abevieiramota.ch17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IntegerClass {

	@Test
	public void testParseInt() {
		
		assertEquals(10, Integer.parseInt("10"));
		assertEquals(10, Integer.parseInt("1010", 2));
		assertEquals(10, Integer.parseInt("12", 8));
		assertEquals(20, Integer.parseInt("14", 16));
	}
	
	@Test
	public void testToString() {
		Integer vintao = 20;
		assertEquals("20", vintao.toString());
		assertEquals("10100", Integer.toBinaryString(vintao));
		assertEquals("24", Integer.toOctalString(vintao));
		assertEquals("14", Integer.toHexString(vintao));
	}
}
