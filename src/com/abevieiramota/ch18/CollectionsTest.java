package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CollectionsTest {

	@Test(expected = ClassCastException.class)
	public void checked() {
		class Pessoa {
		}
		class SuperPessoa extends Pessoa {
		}

		List<SuperPessoa> nomes = new ArrayList<SuperPessoa>();
		List<SuperPessoa> checkedNomes = Collections.checkedList(nomes, SuperPessoa.class);

		checkedNomes.add((SuperPessoa) new Pessoa());
	}

	@Test
	public void asLifoQueue() {
		Deque<String> deque = new ArrayDeque<String>(2);
		deque.add("João");
		deque.add("Abelardo");

		assertEquals("João", deque.peek());

		Queue<String> lifo = Collections.asLifoQueue(new ArrayDeque<String>(2));
		lifo.add("João");
		lifo.add("Abelardo");

		assertEquals("Abelardo", lifo.peek());
	}

	@Test
	public void binarySearch() {
		List<Integer> numerosOrdenados = Arrays.asList(1, 3, 4, 10, 25, 30);

		assertEquals(1, Collections.binarySearch(numerosOrdenados, 3));
		assertEquals(numerosOrdenados.size() - 1, Collections.binarySearch(numerosOrdenados, 30));
		assertTrue(Collections.binarySearch(numerosOrdenados, 1992) < 0);
	}

	@Test
	public void disjoint() {
		List<String> nomes1 = Arrays.asList("Abelardo", "Juliana", "Josino");
		List<String> nomes2 = Arrays.asList("Fernando", "Carlos");

		assertTrue(Collections.disjoint(nomes1, nomes2));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void emptyList() {
		List<Object> emptyList = Collections.emptyList();

		emptyList.add("oi");
	}

	@Test
	public void fill() {
		List<Integer> numerosOrdenados = Arrays.asList(1, 3, 4, 10, 25, 30);

		Collections.fill(numerosOrdenados, 100);

		Set<Integer> numeros = new HashSet<>(numerosOrdenados);

		assertEquals(1, numeros.size());
		assertEquals(100, numeros.iterator().next().intValue());
	}

	@Test
	public void frequency() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1);

		assertEquals(3, Collections.frequency(numeros, 1));
	}

	@Test
	public void indexOfSubList() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);

		assertEquals(-1, Collections.indexOfSubList(numeros, Arrays.asList(1, 3, 6)));
		assertEquals(0, Collections.indexOfSubList(numeros, Arrays.asList(1, 3, 4)));
		assertEquals(5, Collections.lastIndexOfSubList(numeros, Arrays.asList(1, 3, 4, 13)));
	}

	@Test
	public void max() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);

		assertEquals(4, Collections.<Integer>max(numeros, (n1, n2) -> Integer.compare(n1 % 10, n2 % 10)).intValue());
	}

	@Test
	public void nCopies() {
		List<String> dezAbelardos = Collections.nCopies(10, "Abelardo");

		assertEquals(10, dezAbelardos.size());

		Set<String> soUmAbelardo = new HashSet<>(dezAbelardos);

		assertEquals(1, soUmAbelardo.size());
		assertEquals("Abelardo", soUmAbelardo.iterator().next());
	}

	@Test
	public void newSetFromMap() {
		Map<String, Boolean> nomeTaValendo = new HashMap<>();
		Set<String> nomesValendo = Collections.newSetFromMap(nomeTaValendo);

		nomesValendo.add("Abelardo");
		nomesValendo.add("Ferdinando");

		assertEquals(2, nomeTaValendo.size());
		assertTrue(nomeTaValendo.get("Abelardo"));
		assertTrue(nomeTaValendo.get("Ferdinando"));

		assertEquals(2, nomesValendo.size());
	}

	@Test
	public void replaceAll() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);

		Collections.replaceAll(numeros, 3, 66);

		assertEquals(66, numeros.get(1).intValue());
	}

	@Test
	public void reverse() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);

		Collections.reverse(numeros);

		assertEquals(Arrays.asList(13, 4, 3, 1, 1, 10, 4, 3, 1), numeros);
	}

	@Test
	public void rotate() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);

		Collections.rotate(numeros, 2);

		assertEquals(Arrays.asList(4, 13, 1, 3, 4, 10, 1, 1, 3), numeros);
		
		Collections.rotate(numeros, -4);
		
		assertEquals(Arrays.asList(4, 10, 1, 1, 3, 4, 13, 1, 3), numeros);
	}
	
	@Test
	public void shuffle() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);
		
		Collections.shuffle(numeros, new Random(100l));
	}
	
	@Test
	public void singleton() {
		Set<Integer> singleton = Collections.singleton(10);
		
		assertEquals(1, singleton.size());
		assertEquals(10, singleton.iterator().next().intValue());
	}
	
	@Test
	public void sort() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);
		
		Comparator<Integer> cmpMod10 = (n1, n2) -> Integer.compare(n1 % 10, n2 % 10);
		Comparator<Integer> cmpMod10LargerFirst = cmpMod10.thenComparing(Comparator.reverseOrder());
		Collections.sort(numeros, cmpMod10LargerFirst);
		
		assertEquals(Arrays.asList(10, 1, 1, 1, 13, 3, 3, 4, 4), numeros);		
	}
	
	@Test
	public void swap() {
		List<Integer> numeros = Arrays.asList(1, 3, 4, 10, 1, 1, 3, 4, 13);
		
		Collections.swap(numeros, 0, numeros.size() - 1);
		
		assertEquals(13, numeros.get(0).intValue());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void unmodifiebleSet() {
		Set<String> nomes = Collections.unmodifiableSet(new HashSet<>());
		
		nomes.add("Abelardo");
	}
}
