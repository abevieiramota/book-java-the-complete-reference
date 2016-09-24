package com.abevieiramota.ch12.annotation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestaInheritedAnnotation {

	@Test
	public void testInheritedTemQueVirNaSubclass() {
		assertTrue(B.class.getAnnotations().length > 0);
		assertTrue(B.class.isAnnotationPresent(AnotacaoInheritedContainer.class));
	}
}
