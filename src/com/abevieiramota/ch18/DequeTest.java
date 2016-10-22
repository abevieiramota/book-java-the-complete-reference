package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

public class DequeTest {

	@Test
	public void testDeque() {
		Deque<String> nomes = new LinkedList<>();
		nomes.offer("Abelardo");
		nomes.offer("Odraleba");
		nomes.offer("Chisconildo");
		
		assertEquals("Abelardo", nomes.getFirst());
		assertEquals("Chisconildo", nomes.getLast());
		
		nomes.addFirst("Abdael");
		nomes.addLast("Terosinoveslido");
		
		assertEquals("Abdael", nomes.getFirst());
		assertEquals("Terosinoveslido", nomes.getLast());
		
		assertTrue(nomes.offerFirst("_oi_"));
		
		assertEquals("_oi_", nomes.peekFirst());
		assertEquals("_oi_", nomes.getFirst());
		
		assertEquals("_oi_", nomes.pollFirst());
		assertEquals("Abdael", nomes.peekFirst());
		
	}
}
