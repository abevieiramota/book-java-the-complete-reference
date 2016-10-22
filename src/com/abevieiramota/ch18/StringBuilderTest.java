package com.abevieiramota.ch18;

import org.junit.Test;

public class StringBuilderTest {

	@Test
	public void testNoPreallocation() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000000; i++) {
			sb.append("oi");
		}
	}
	
	@Test
	public void testPreallocation() {
		StringBuilder sb = new StringBuilder(1000000*2);
		for(int i = 0; i < 10000000; i++) {
			sb.append("oi");
		}
	}
}
