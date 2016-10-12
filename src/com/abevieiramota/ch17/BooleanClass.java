package com.abevieiramota.ch17;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BooleanClass {

	@Test
	public void testBoolean() {
		System.out.println(new Boolean("TruE"));
		System.out.println(Boolean.TRUE.compareTo(Boolean.FALSE));
	}
}
