package com.abevieiramota.ch13;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TestOverloadFail {
	
	@Test
	public void testOverloadFailP194EffectiveJava() {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
		}
		
		for(int i = 0; i < 3; i++) {
			set.remove(i);
			list.remove(i);
		}
		/*
		 * list -> remove at ix 0 -> -3 ~~> shift ixs
		 * list -> remove at ix 1 -> now it is -1 ~~> shift ixs
		 * list -> remove at ix 2 -> now it is 1 ~~> shift ixs
		 */
		
		Set<Integer> resultadoSet = new HashSet<Integer>();
		resultadoSet.add(-3);
		resultadoSet.add(-2);
		resultadoSet.add(-1);
		List<Integer> resultadoList = new ArrayList<Integer>();
		resultadoList.add(-2);
		resultadoList.add(0);
		resultadoList.add(2);
		assertEquals(resultadoSet, set);
		assertEquals(resultadoList, list);
	}
	
	@Test
	public void testOverloadFailP194EffectiveJava2() {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
		}
		
		for(int i = 0; i < 3; i++) {
			set.remove(i);
			list.remove((Integer) i);
		}
		
		Set<Integer> resultadoSet = new HashSet<Integer>();
		resultadoSet.add(-3);
		resultadoSet.add(-2);
		resultadoSet.add(-1);
		List<Integer> resultadoList = new ArrayList<Integer>();
		resultadoList.add(-3);
		resultadoList.add(-2);
		resultadoList.add(-1);
		assertEquals(resultadoSet, set);
		assertEquals(resultadoList, list);
	}

}
