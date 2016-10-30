package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LinkedHashMapTest {

	@Test
	public void testAccessOrder() {
		Map<String, String> mapNaOrdemDeAcesso = new LinkedHashMap<String, String>(4, .75f, true);
		mapNaOrdemDeAcesso.put("1", "Abelardo");
		mapNaOrdemDeAcesso.put("2", "Juliana");
		mapNaOrdemDeAcesso.put("3", "Josino");
		mapNaOrdemDeAcesso.put("4", "c7s");
		
		mapNaOrdemDeAcesso.get("3");
		mapNaOrdemDeAcesso.get("2");
		mapNaOrdemDeAcesso.get("1");
		
		// primeiro mais antigo?
		Iterator<Entry<String, String>> mapIter = mapNaOrdemDeAcesso.entrySet().iterator();
		assertEquals("4", mapIter.next().getKey());
		assertEquals("3", mapIter.next().getKey());
		assertEquals("2", mapIter.next().getKey());
		assertEquals("1", mapIter.next().getKey());
	}
	
	@Test
	public void testInsertionOrder() {
		Map<String, String> mapNaOrdemDeInsert = new LinkedHashMap<String, String>(4, .75f, false);
		mapNaOrdemDeInsert.put("1", "Abelardo");
		mapNaOrdemDeInsert.put("2", "Juliana");
		mapNaOrdemDeInsert.put("3", "Josino");
		mapNaOrdemDeInsert.put("4", "c7s");
		
		mapNaOrdemDeInsert.get("3");
		mapNaOrdemDeInsert.get("2");
		mapNaOrdemDeInsert.get("1");
		
		// primeiro mais antigo?
		Iterator<Entry<String, String>> mapIter = mapNaOrdemDeInsert.entrySet().iterator();
		assertEquals("1", mapIter.next().getKey());
		assertEquals("2", mapIter.next().getKey());
		assertEquals("3", mapIter.next().getKey());
		assertEquals("4", mapIter.next().getKey());
	}
}
