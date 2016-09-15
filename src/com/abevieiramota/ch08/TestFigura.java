package com.abevieiramota.ch08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestFigura {

	@Test
	public void quadradoNormal() {
		for (int i = 0; i < 10000; i++) {
			Entidade e = new QuadradoNormal();
			System.out.println(e.essencia());
		}
	}

	@Test
	public void quadradoFinal() {
		for (int i = 0; i < 10000; i++) {
			Entidade e = new QuadradoFinal();
			System.out.println(e.essencia());
		}
	}
}
