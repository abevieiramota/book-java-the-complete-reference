package com.abevieiramota.ch18;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeSet;

import org.junit.Test;

public class CollectionTest {

	@Test(expected = NullPointerException.class)
	public void testAddNullToTreeSet() {
		Collection<String> teste = new TreeSet<String>();
		teste.add(null);
	}

	@Test
	public void testAddNullToHashSet() {
		Collection<String> teste = new HashSet<String>();
		assertTrue(teste.add(null));
	}

	@Test
	public void testAddNullTreeSetComparatorPermitsNull() {
		Collection<String> teste = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1 == s2) {
					return 0;
				}
				if(s1 == null) {
					return -1; 
				}
				if(s2 == null) {
					return 1;
				}
				return s1.compareTo(s2);
			}
		});
		teste.add(null);
	}
	
	@Test(expected = NullPointerException.class)
	public void testAddNullTreeSetComparatorDoesntPermitsNull() {
		Collection<String> teste = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				Objects.requireNonNull(s1);
				Objects.requireNonNull(s2);
				return s1.length() - s2.length();
			}
		});
		teste.add(null);
	}
	
	@Test
	// arraylist trabalha com arraycopy
	public void testAddAllInception() {
		Collection<String> nomes = new ArrayList<String>();
		nomes.add("Abelardo");
		nomes.add("Outro nome");
		
		nomes.addAll(nomes);
		
		assertEquals(4, nomes.size());
	}
	
	@Test
	// linkedlist copia os dados p um array
	public void testAddAllInceptionLinkedList() {
		Collection<String> nomes = new LinkedList<String>();
		nomes.add("Abelardo");
		nomes.add("Outro nome");
		
		nomes.addAll(nomes);
		
		assertEquals(4, nomes.size());
	}
	
	@Test
	// linkedlist copia os dados p um array
	public void testAddAllInceptionHashSet() {
		Collection<String> nomes = new HashSet<String>();
		nomes.add("Abelardo");
		nomes.add("Outro nome");
		
		assertFalse(nomes.addAll(nomes));
	}
	
	@Test
	public void testToArray() {
		String[] nomesArr = {"Abelardo", "Outro nome"};
		Collection<String> nomes = new ArrayList<String>();
		for(String nome: nomesArr) {
			nomes.add(nome);
		}
		
		Object[] nomesArr1 = nomes.toArray();
		assertArrayEquals(nomesArr, nomesArr1);
		String[] nomesArr2 = nomes.toArray(new String[1]);
		assertArrayEquals(nomesArr, nomesArr2);
		String[] nomesArr3 = nomes.toArray(new String[10]);
		assertArrayEquals(Arrays.copyOf(nomesArr, 10), nomesArr3);
	}
}
