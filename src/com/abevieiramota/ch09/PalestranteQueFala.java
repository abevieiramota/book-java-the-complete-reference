package com.abevieiramota.ch09;

public class PalestranteQueFala implements IPalestranteQueFala {
	public static String FALA = "oi";

	@Override
	public String fala() {
		return FALA;
	}
}
