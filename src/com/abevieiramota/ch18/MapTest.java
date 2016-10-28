package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MapTest {

	private Map<Object, Object> mapDefault;

	@Before
	public void before() {
		mapDefault = new HashMap<Object, Object>();
		mapDefault.put("Abelardo", 10);
		mapDefault.put("Juliana", "Mota");
		mapDefault.put(123, "Reais");
	}

	@Test
	@Ignore // aloca memória viu
	public void test() {
		Map<Object, Object> map = new HashMap<Object, Object>();

		for (long i = 0; i < Integer.MAX_VALUE + 10l; i++) {
			map.put(i, i);
		}

		assertEquals(Integer.MAX_VALUE, map.size());
	}

	@Test
	public void entrySet() {
		for (Entry<Object, Object> entry : this.mapDefault.entrySet()) {
			System.out.println("entrySet -> " + entry.getKey() + " : " + entry.getValue());
		}
	}

	@Test
	public void clear() {
		this.mapDefault.clear();

		assertTrue(this.mapDefault.isEmpty());
	}

	@Test
	public void compute() {
		this.mapDefault.compute("Juliana", (k, s) -> s instanceof String ? "Olá ".concat((String) s) : null);

		assertEquals("Olá Mota", this.mapDefault.get("Juliana"));
	}

	@Test
	public void getOrDefault() {
		assumeTrue(this.mapDefault.containsKey("Odraleba"));

		assertEquals("Default", this.mapDefault.getOrDefault("Odraleba", "Default"));
	}

	@Test
	public void forEach() {

		this.mapDefault.forEach((k, v) -> System.out.println("forEach -> " + k + " : " + v));
	}

	@Test
	public void merge() {

		this.mapDefault.merge("Juliana", "Haha", (old, niw) -> ((String) old).toUpperCase());

		assertEquals("MOTA", this.mapDefault.get("Juliana"));

		assertEquals("hehe", this.mapDefault.merge("Nao estou no map", "hehe", (k, v) -> v));
	}

	@Test
	public void put() {

		assertEquals("Mota", this.mapDefault.put("Juliana", "Vieira"));
	}

	@Test
	public void putAll() {
		Map<String, String> nomes = new HashMap<String, String>();
		nomes.put("Juliana", "Vieira");
		nomes.put("Oi", "tudo bem?");

		this.mapDefault.putAll(nomes);

		assertEquals("Vieira", this.mapDefault.get("Juliana"));
		assertEquals("tudo bem?", this.mapDefault.get("Oi"));
	}

	@Test
	public void putIfAbsent() {
		Object old = this.mapDefault.putIfAbsent("Juliana", "Vieira");
		assertEquals("Mota", old);
		assertEquals("Mota", this.mapDefault.get("Juliana"));
	}
	
	@Test
	public void replace() {
		this.mapDefault.replace("ahusasuusuh", "akska");
		
		assertFalse(this.mapDefault.containsKey("ahusasuusuh"));
	}
	
	@Test
	public void replaceAll() {
		this.mapDefault.replaceAll((k, v) -> (k instanceof String) ? "string" : "nString");
		assertEquals("string", this.mapDefault.get("Abelardo"));
		assertEquals("nString", this.mapDefault.get(123));
	}
}
