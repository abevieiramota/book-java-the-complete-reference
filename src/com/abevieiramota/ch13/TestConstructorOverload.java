package com.abevieiramota.ch13;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

class Z {
	int j;
	int i;

	public Z(int i, int j) {
		for (int k = i + 1; k < j + 2; k++) {
			i++;
		}
		j += i * 2;
		for (int k = i + 1; k < j + 2; k++) {
			i++;
		}
		j += i * 2;
		this.i = i;
		this.j = j;
	}

	public Z(int i) {
		this(i, i);
	}

	public Z() {
		this(0);
	}
}

class W {
	int j;
	int i;

	public W(int i, int j) {
		for (int k = i + 1; k < j + 2; k++) {
			i++;
		}
		j += i * 2;
		for (int k = i + 1; k < j + 2; k++) {
			i++;
		}
		j += i * 2;
		this.i = i;
		this.j = j;
	}

	public W(int i) {
		int tempJ = i;
		for (int k = i + 1; k < tempJ + 2; k++) {
			i++;
		}
		tempJ += i * 2;
		for (int k = i + 1; k < tempJ + 2; k++) {
			i++;
		}
		tempJ += i * 2;
		this.i = i;
		this.j = tempJ;
	}

	public W() {
		int tempI = 0;
		int tempJ = 0;
		for (int k = tempI + 1; k < tempJ + 2; k++) {
			tempI++;
		}
		tempJ += tempI * 2;
		for (int k = tempI + 1; k < tempJ + 2; k++) {
			tempI++;
		}
		tempJ += tempI * 2;
		this.i = tempI;
		this.j = tempJ;
	}
}

@RunWith(JUnit4.class)
public class TestConstructorOverload {

	@Test
	public void testZ() {
		for (long i = 0; i < 1000000000; i++) {
			Z z = new Z();
		}
	}

	@Test
	public void testW() {
		for (long i = 0; i < 1000000000; i++) {
			W w = new W();
		}
	}

}
