package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NavigableMapTest {

	@Test
	public void test() {
		 NavigableMap<String,String> treeMap = new TreeMap<String, String>();
		 
		 treeMap.put("Juliana", "Mota");
		 treeMap.put("Abelardo", "Mota");
		 treeMap.put("Josino", "Mota");
		 treeMap.put("Xuxa", "Mota");
		 
		 assertEquals("Abelardo", treeMap.firstEntry().getKey());
		 assertEquals("Abelardo", treeMap.pollFirstEntry().getKey());
		 assertEquals("Josino", treeMap.firstEntry().getKey());
		 assertEquals("Josino", treeMap.higherEntry("Jacinta").getKey());
		 assertEquals("Josino", treeMap.floorEntry("Julian").getKey());
		 
		 assertTrue(Entry.<String, String>comparingByValue().compare(treeMap.firstEntry(), treeMap.lastEntry()) == 0);
	}
}
