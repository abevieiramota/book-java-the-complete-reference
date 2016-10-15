package com.abevieiramota.ch17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MathClass {

	@Test
	public void testMath() {
		System.out.println(Math.E);
		System.out.println(Math.PI);
	}
	
	@Test
	public void testCubeRoot() {
		
		assertEquals(2.0D, Math.cbrt(8.0D), 0.0D);
	}
	
	@Test
	public void testLog1p() {
		
		assertEquals(1.0D, Math.log1p(Math.E - 1), 0.0D);
	}
	
	@Test
	public void testNextAfter() {
		
		assertEquals(1.0D, Math.nextAfter(1.0D, 1.0D), 0.0D);
		assertEquals(Math.nextUp(1.0D), Math.nextAfter(1.0D, 2.0D), 0.0D);
	}
	
	@Test
	public void testRint() {
		
		assertEquals(1.0D, Math.rint(Math.nextUp(1.0D)), 0.0D);
	}
	
	@Test
	public void testRound() {
		// esperava que funcionasse...
		assertEquals(2L, Math.round(Math.nextUp(1.0D)));
	}
	
	@Test
	public void testHypot() {
		
		assertEquals(5.0D, Math.hypot(4.0D, 3.0D), 0.0D);
	}
}
