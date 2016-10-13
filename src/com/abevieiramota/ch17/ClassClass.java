package com.abevieiramota.ch17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ClassClass {
	
	@Test
	public void test() throws ClassNotFoundException {
		assertEquals(BooleanClass.class, Class.forName("com.abevieiramota.ch17.BooleanClass"));
	}
	
	@Test(expected = InstantiationException.class)
	public void testNewInstance() throws InstantiationException, IllegalAccessException {
		SouAbstract.class.newInstance();
	}
}
