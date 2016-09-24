package com.abevieiramota.ch12.enume;

public enum Raça {
	Humano(100), Ogre(130), Elfo(250), Capiroto(666);
	
	private int idadeMax;

	Raça(int idadeMax) {
		this.idadeMax = idadeMax;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("Construído " + this.name());
	}
	
	int getIdadeMax() {
		return this.idadeMax;
	}
}
