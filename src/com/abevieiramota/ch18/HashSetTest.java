package com.abevieiramota.ch18;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {

	@Test
	public void addShouldReturnFalseIfElementExists() {
		Collection<String> nomes = new HashSet<String>();
		
		String meuNome = "Abelardo";
		assertTrue(nomes.add(meuNome));
		assertFalse(nomes.add(meuNome));
	}
	
}
