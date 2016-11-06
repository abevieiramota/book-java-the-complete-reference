package com.abevieiramota.ch18;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArraysTest {

	@Test
	public void asList() {
		int[] numsAsInt = { 1, 2, 3 };
		List<int[]> asList = Arrays.asList(numsAsInt);

		Integer[] nums = { 1, 2, 3 };
		List<Integer> numsAsList = Arrays.asList(nums);

		nums[0] = 555;

		assertEquals(555, numsAsList.get(0).intValue());
	}

	@Test
	public void equals() {
		assertTrue(Arrays.equals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));

	}
	
	@Test
	public void nestedEquals() {
		int[][][] a = {{{1, 2}, {3, 4}}};
		int[][][] b = {{{1, 2}, {3, 4}}};
		int[][][] c = {{{1, 2}, {5, 4}}};
		
		assertTrue(Arrays.deepEquals(a, b));
		assertFalse(Arrays.deepEquals(a, c));
	}
	
	@Test
	public void fill() {
		int [] a = new int[10];
		
		Arrays.fill(a, 55);
		
		assertEquals(55, a[0]);
		assertEquals(55, a[5]);
		assertEquals(55, a[9]);
		
		Arrays.fill(a, 4, 10, 66);
		
		assertEquals(55, a[3]);
		assertEquals(66, a[4]);
		assertEquals(66, a[9]);
	}
	
	@Test
	public void sort() {
		int[] a = {3, 1, 4, 8, 13, 7};
		
		Arrays.sort(a, 2, 6);
		
		assertArrayEquals(new int[] {3, 1, 4, 7, 8, 13}, a);
	}
	
	@Test
	public void parallelPrefix() {
		int[] a = {3, 1, 4, 8, 13, 7};
		
		Arrays.parallelPrefix(a, (x, y) -> x + y);
		
		assertArrayEquals(new int[] {3, 4, 8, 16, 29, 36}, a);
	}
}
