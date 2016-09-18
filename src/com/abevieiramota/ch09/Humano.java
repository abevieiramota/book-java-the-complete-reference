package com.abevieiramota.ch09;

public class Humano implements IBichoQueFala {
	public static final String FALA_DO_HUMANO = "Sou formado em X, trabalho com Y, gosto de Z - isso sou eu.";

	@Override
	public String fala() {
		return FALA_DO_HUMANO;
	}
}
