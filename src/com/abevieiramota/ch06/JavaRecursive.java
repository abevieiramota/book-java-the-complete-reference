package com.abevieiramota.ch06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaRecursive {
	
	int factorialRecursive(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return n * factorialRecursive(n-1);
	}
	
	int factorialIterative(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	@Test
	public void testIterativeFactorial() {
		for(int i = 0; i < 10000; i++)
		System.out.println(factorialIterative(12));
	}

	@Test
	public void testRecursiveFactorial() {
		for(int i = 0; i < 10000; i++)
		System.out.println(factorialRecursive(12));
	}
}
