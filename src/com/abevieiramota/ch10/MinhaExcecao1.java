package com.abevieiramota.ch10;

@SuppressWarnings("serial")
public class MinhaExcecao1 extends Exception {

	public static final String DESCRICAO = "Sou exceção";

	@Override
	public String toString() {
		return DESCRICAO;
	}
}
