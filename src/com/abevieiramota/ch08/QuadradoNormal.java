package com.abevieiramota.ch08;

public class QuadradoNormal extends Figura {

	@Override
	String essencia() {
		int j = 0;
		for(int i = 0; i < 100; i++) {
			j += i;
		}
		return "Mas que essência quadrada!" + j;
	}

}
