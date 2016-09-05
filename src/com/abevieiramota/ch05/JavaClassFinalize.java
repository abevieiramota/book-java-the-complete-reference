package com.abevieiramota.ch05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaClassFinalize {

	private class EuFinalizo {
	
		protected void finalize() {
			
			System.out.println("Devidamente finalizado! rs");
		}
	}
	
	@Test
	public void testFinalize() {
		
		EuFinalizo ef;
		for(int i = 0; i < 1000000; i++) {
			ef = new EuFinalizo();
		}
		
	}
}
