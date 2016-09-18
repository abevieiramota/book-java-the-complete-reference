package com.abevieiramota.ch09;

public interface Theta extends Alpha, Beta {
	// tem que sobrescrever...
	@Override
	default String fala() {
		return "theta";
	}
	default String grita() {
		return "theta";
	}
}
