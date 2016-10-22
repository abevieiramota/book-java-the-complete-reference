package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void testReplaceAll() {
		List<String> palavras = Arrays.asList("oi", "abelardo");
		
		palavras.replaceAll(s -> s.toUpperCase());
		
		assertEquals(Arrays.asList("OI", "ABELARDO"), palavras);
	}
}
