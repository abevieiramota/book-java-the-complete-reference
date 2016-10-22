package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import org.junit.Test;

public class NavigableSetTest {

	@Test
	public void testNavigableSet() {
		TreeSet<String> nomes = new TreeSet<String>();
		nomes.add("Abelardo");
		nomes.add("Francisco");
		nomes.add("Bruno");
		nomes.add("Larissa");
		nomes.add("Teosvaldo");
		
		assertEquals("Bruno", nomes.ceiling("Bernardo")); // >=
		assertEquals("Bruno", nomes.ceiling("Bruno")); // >=
		assertEquals(nomes.last(), nomes.descendingSet().first());
		assertEquals(nomes.first(), nomes.descendingSet().last());
		assertEquals("Larissa", nomes.floor("Lavena")); // <=
		assertEquals("Larissa", nomes.higher("Francisco")); // >
		assertEquals("Larissa", nomes.lower("Teosvaldo")); // <
		assertEquals(new HashSet<String>(Arrays.asList("Bruno", "Francisco")), nomes.subSet("Abelardo", false, "Francisco", true));
		assertEquals(new HashSet<String>(Arrays.asList("Abelardo", "Bruno", "Francisco")), nomes.headSet("Francisco", true));
		int initialSize = nomes.size();
		assertEquals("Abelardo", nomes.pollFirst());
		assertEquals(initialSize - 1, nomes.size());
		assertEquals("Teosvaldo", nomes.pollLast());
		assertEquals(initialSize - 2, nomes.size());
	}
}
