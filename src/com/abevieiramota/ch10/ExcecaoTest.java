package com.abevieiramota.ch10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ExcecaoTest {

	@Test
	public void testExcecaoToString() {

		MinhaExcecao1 me1 = new MinhaExcecao1();
		MinhaExcecao2 me2 = new MinhaExcecao2(MinhaExcecao1.DESCRICAO);
		me2.initCause(me1);

		assertEquals(MinhaExcecao1.DESCRICAO, me1.toString());
		assertEquals("com.abevieiramota.ch10.MinhaExcecao2: " + MinhaExcecao1.DESCRICAO, me2.toString());
		assertEquals(me1, me2.getCause());
		assertEquals("testExcecaoToString", me1.getStackTrace()[0].getMethodName());
		assertEquals(15, me1.getStackTrace()[0].getLineNumber());
		assertEquals("invoke0", me1.getStackTrace()[1].getMethodName());
		assertEquals("sun.reflect.NativeMethodAccessorImpl", me1.getStackTrace()[1].getClassName());
		me1.printStackTrace(System.out);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testInitCause() {
		Exception ex = new Exception(new Exception());
		ex.initCause(new Exception());
	}
	
	@Test
	public void testMultipleCatch() {
		try {
			if(true == true) {
				throw new NullPointerException();
			} else {
				throw new IllegalArgumentException();
			}
		} catch(NullPointerException | IllegalArgumentException ex) {
			
		}
	}
}
