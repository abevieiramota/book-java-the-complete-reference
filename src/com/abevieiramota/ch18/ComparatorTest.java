package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ComparatorTest {

	@Test
	public void reverseDeReserseEhIgual() {
		Comparator<String> cmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		};

		Comparator<String> cmpReversedReversed = cmp.reversed().reversed();

		assertEquals(cmp, cmpReversedReversed);
	}

	@Test
	public void reverseOrder() {
		Set<String> nomes = new TreeSet<>(Comparator.reverseOrder());
		nomes.add("Abelardo");
		nomes.add("Xenaldo");

		assertEquals("Xenaldo", nomes.iterator().next());
	}

	@Test
	public void nullsFirstNullsLast() {
		Comparator<String> cmp = Comparator.naturalOrder();

		assertTrue(Comparator.nullsFirst(cmp).compare(null, "Abelardo") < 0);
		assertTrue(null, Comparator.nullsLast(cmp).compare(null, "Abelardo") > 0);
	}

	@Test
	public void thenComparing() {
		class ComparatorPorChar implements Comparator<String> {
			private int pos;
			public ComparatorPorChar(int pos) {
				this.pos = pos;
			}
			@Override
			public int compare(String o1, String o2) {
				return Character.compare(o1.charAt(this.pos), o2.charAt(this.pos));
			}
		}
		
		Comparator<String> cmpFirstChar = new ComparatorPorChar(0);
		Comparator<String> cmpThirdChar = new ComparatorPorChar(2);
		
		assertTrue(cmpFirstChar.compare("Abelardo", "Adriano") == 0);
		assertTrue(cmpThirdChar.compare("Abelardo", "Adriano") < 0);
		assertTrue(cmpFirstChar.thenComparing(cmpThirdChar).compare("Abelardo", "Adriano") < 0);
	}
	
	@Test
	public void comparing() {
		class Pessoa {
			int idade;
			long cash;
		}
		
		Pessoa p1 = new Pessoa();
		p1.idade = 10;
		p1.cash = 1000000l;
		
		Pessoa p2 = new Pessoa();
		p2.idade = 65;
		p2.cash = 12345l;
		
		assertTrue(Comparator.<Pessoa>comparingInt((p) -> p.idade).compare(p1, p2) < 0);
		assertTrue(Comparator.<Pessoa>comparingLong((p) -> p.cash).compare(p1, p2) > 0);
	}
}
