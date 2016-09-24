package com.abevieiramota.ch12.wrappers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestTypeWrappers {

	@Test
	public void testBooleanTypeWrapper() {
		assertEquals(true, Boolean.valueOf("true").booleanValue());
		assertEquals(true, Boolean.valueOf("True").booleanValue());
		assertEquals(true, Boolean.valueOf("TRUE").booleanValue());
		assertEquals(true, Boolean.valueOf("truE").booleanValue());
		assertEquals(false, Boolean.valueOf("True   ").booleanValue());
		assertEquals(false, Boolean.valueOf("false").booleanValue());
		assertEquals(false, Boolean.valueOf("qaulquer coisa").booleanValue());
	}
	
	@Test(expected = NumberFormatException.class)
	public void testIntegerConstructorNonIntegerString() {
		new Integer("olá, sou integer");
	}
	
	@Test
	public void testPrimitivePerformance() {
		for(int i = 0; i < 10000; i++)  {
			int j = i*i;
			System.out.println(j);
		}
	}
	
	@Test
	public void testWrapperPerformance() {
		for(int i = 0; i < 10000; i++)  {
			Integer iWrapped = i;
			Integer j = iWrapped * iWrapped;
			System.out.println(j.intValue());
		}
	}
}
