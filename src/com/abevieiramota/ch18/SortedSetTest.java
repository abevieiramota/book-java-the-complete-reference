package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

public class SortedSetTest {

	@Test
	public void testSortedSet() {
		SortedSet<String> nomes = new TreeSet<>();
		nomes.add("Abelardo");
		nomes.add("Francisco");
		nomes.add("Bruno");
		nomes.add("Larissa");
		nomes.add("Teosvaldo");
		
		assertEquals(new HashSet<String>(Arrays.asList("Larissa", "Teosvaldo")), nomes.tailSet("Larissa"));
		assertEquals(new HashSet<String>(Arrays.asList("Abelardo", "Bruno", "Francisco")), nomes.headSet("Larissa"));
		assertEquals("Abelardo", nomes.first());
		assertEquals("Teosvaldo", nomes.last());
		assertEquals(new HashSet<String>(Arrays.asList("Bruno", "Francisco", "Larissa")), nomes.subSet("Bruno", "Teosvaldo"));
	}
}
