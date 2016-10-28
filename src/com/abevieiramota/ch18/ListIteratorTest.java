package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ListIteratorTest {

	@Test
	public void test() {
		List<String> nomes = Arrays.asList("Abelardo", "Juliana", "Josino");

		ListIterator<String> lIter = nomes.listIterator();

		assertFalse(lIter.hasPrevious());
		assertTrue(lIter.hasNext());

		String nome1 = lIter.next();

		assertEquals("Abelardo", nome1);

		String nome2 = lIter.next();

		assertEquals("Juliana", nome2);

		lIter.set("Rosilane");

		assertEquals(Arrays.asList("Abelardo", "Rosilane", "Josino"), nomes);

		Collection<String> nomesRemaining = new HashSet<String>();
		lIter.forEachRemaining((s) -> nomesRemaining.add(s));

		Set<String> expectedRemaining = new HashSet<String>();
		expectedRemaining.add("Josino");
		
		assertEquals(expectedRemaining, nomesRemaining);		
	}
}
