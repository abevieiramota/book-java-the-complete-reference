package com.abevieiramota.ch03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaScope {

	@Test
	public void testScopeScope() {

		{
			int x = 10;

			System.out.println("Primeiro x " + x);
		}

		{
			int x = 20;

			System.out.println("Segundo x " + x);
		}
	}
	
	@Test
	public void testForLoopVariableScopeOutside() {
		
		long y;
		
		for(long i = 0; i < 10000000; i++) {
			
			y = i;
			System.out.println(y);
		}
	}
	
	@Test
	public void testForLoopVariableScopeInside() {
		
		for(long i = 0; i < 10000000; i++) {
			
			long y = i;
			System.out.println(y);
		}
	}

}
