package com.abevieiramota.ch08;

public class B extends A {

	private int i;

	public B(int i, int j, int k) {
		super(i, j);
		this.i = k;
	}

	void showk() {

		System.out.println("k: " + this.i);
	}

	int sum() {

		return super.sum() + this.i;
	}

	int iDaSuper() {

		return super.i;
	}
	
	int overrida() {
		return 20;
	}
	
	int overloada(float f) {
		return 20;
	}
}
