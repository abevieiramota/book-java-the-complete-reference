package com.abevieiramota.ch07;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaNestedClass {

	private int a = 10;
	
	class NestedClass {
		
		public int returnA() {
			
			return a;
		}
	}
	
	@Test
	public void testNestedClass() {
		NestedClass nc = new NestedClass();
		
		assertEquals(this.a, nc.returnA());
	}
	
	@Test
	public void testBlockNestedClass() {
		for (int i = 0; i < 10; i++) { 
			this.a += i;
			class NestedClass {
				public void oi() {
					System.out.println("oi " + a);
				}
			}
			
			NestedClass nc = new NestedClass();
			nc.oi();
		}
	}
}
