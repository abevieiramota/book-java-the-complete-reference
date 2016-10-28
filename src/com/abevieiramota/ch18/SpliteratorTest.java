package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
// mais sobre Spliterator é visto no ch29
public class SpliteratorTest {

	@Test
	public void test() {
		List<String> nomes = Arrays.asList("Abelardo", "Juliana", "Josino", "Cadernaldo");
		
		Spliterator<String> spliteratorMeuDeusQueNomeEstranhoRs = nomes.spliterator();
		
		List<String> nomesConsumidos = new ArrayList<String>();
		boolean avancou = spliteratorMeuDeusQueNomeEstranhoRs.tryAdvance((s) -> nomesConsumidos.add(s));
		
		assertTrue(avancou);
		assertEquals(Arrays.asList("Abelardo"), nomesConsumidos);
		
		assertFalse(spliteratorMeuDeusQueNomeEstranhoRs.hasCharacteristics(Spliterator.CONCURRENT));
	}
}
