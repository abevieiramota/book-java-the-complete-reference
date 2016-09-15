package com.abevieiramota.ch08;

public final class QuadradoFinal extends Figura {

	@Override
	final String essencia() {
		int j = 0;
		for(int i = 0; i < 100; i++) {
			j += i;
		}
		return "Mas que essência quadrada!" + j;
	}

}
