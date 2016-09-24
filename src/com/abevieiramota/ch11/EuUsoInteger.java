package com.abevieiramota.ch11;

public class EuUsoInteger implements Runnable {
	private static final int SIZE = 10;
	private GeradorDeInteger meuGerador;
	private Integer[] integersGerados = new Integer[SIZE];
	
	EuUsoInteger(GeradorDeInteger gerador) {
		this.meuGerador = gerador;
	}
	@Override
	public void run() {
		for(int i = 0; i < SIZE; i++) {
			this.meuGerador.increment();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
			this.integersGerados[i] = this.meuGerador.getValor();
		}
	}
	
	public Integer[] getIntegersGerados() {
		return this.integersGerados;
	}

}
