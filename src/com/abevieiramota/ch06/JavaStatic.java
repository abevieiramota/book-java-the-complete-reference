package com.abevieiramota.ch06;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

class TenhoStatics {
	
	private static int a = daUmStatic();
	
	static {
		
		System.out.println("Chamei o bloco static");
	}
	
	private static int daUmStatic() {
		System.out.println("Chamei o método daUmStatic");
		
		return 10;
	}
	
	public static int metodoStatic() {
		
		return 10;
	}
}

@RunWith(JUnit4.class)
public class JavaStatic {

	@Test
	public void testStaticInitialization() {
		new TenhoStatics();
	}
	
	@Test
	public void testCallByClass() {
		
		assertEquals(10, TenhoStatics.metodoStatic());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testCallByObject() {
		
		assertEquals(10, new TenhoStatics().metodoStatic());
	}
}
