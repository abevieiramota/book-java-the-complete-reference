package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;

import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SortedMapTest {

	@Test
	public void test() {
		 SortedMap<String,String> treeMap = new TreeMap<String, String>();
		 
		 treeMap.put("Juliana", "Mota");
		 treeMap.put("Abelardo", "Mota");
		 treeMap.put("Josino", "Mota");
		 treeMap.put("Xuxa", "Menegel");
		 
		 assertEquals("Abelardo", treeMap.firstKey());
		 assertEquals("Xuxa", treeMap.lastKey());
		 
		 assertEquals("Josino", treeMap.tailMap("Josino").firstKey());
		 assertEquals("Josino", treeMap.headMap("Juliana").lastKey());
		 assertEquals(treeMap.subMap("Abelardo", "Juliana"), treeMap.headMap("Juliana"));
	}
}
