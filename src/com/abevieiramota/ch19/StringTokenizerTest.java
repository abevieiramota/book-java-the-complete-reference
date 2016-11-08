package com.abevieiramota.ch19;

import static org.junit.Assert.assertEquals;

import java.util.StringTokenizer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StringTokenizerTest {

	@Test
	public void defaultDelimiters() {
		
		StringTokenizer st = new StringTokenizer("Meu nome é Abelardo");
		assertEquals(4, st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	
	@Test
	public void delimiters() {
		
		StringTokenizer st = new StringTokenizer("Meu nome, é: Abelardo", ",:");
		assertEquals(3, st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	} 
	
	@Test
	public void delimAsToken() {
		
		StringTokenizer st = new StringTokenizer("Meu nome, é: Abelardo", ",:", true);
		assertEquals(5, st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
