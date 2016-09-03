package com.abevieiramota.ch05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaBranching {

	@Test
	public void testNestedIfElse() {
		int a = 10;
		boolean oi = false;

		if (!oi)
			a += 1;
		if (oi)
			a += 10;
		else
			a += 5;

		assertEquals(16, a);
	}

	@Test
	public void testStringSwitch() {
		String nome = "Abelardo";

		switch (nome) {

		case "João":

			System.out.println("João hehe");
			break;
		case "Abelardo":

			System.out.println("Abelardo!");
			break;
		default:
			System.out.println(":(");
		}
	}

	@Test
	public void testSwitchCaseOrdemCool() {
		int j = 0;

		for (long i = 0; i < 1000000000; i++) {

			switch (j) {

			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			}
		}
	}

	@Test
	public void testSwitchCaseOrdemPaia() {
		int j = 0;

		for (long i = 0; i < 1000000000; i++) {

			switch (j) {

			case 9:
				break;
			case 8:
				break;
			case 7:
				break;
			case 6:
				break;
			case 5:
				break;
			case 4:
				break;
			case 3:
				break;
			case 2:
				break;
			case 1:
				break;
			case 0:
				break;
			}
		}
	}

	@Test
	public void testSwitchStringPerf() {
		String j = "0";

		for (long i = 0; i < 1000000000; i++) {

			switch (j) {

			case "9":
				break;
			case "8":
				break;
			case "7":
				break;
			case "6":
				break;
			case "5":
				break;
			case "4":
				break;
			case "3":
				break;
			case "2":
				break;
			case "1":
				break;
			case "0":
				break;
			}
		}
	}

	@Test
	public void testNestedIfStringPerf() {
		String j = "0";

		for (long i = 0; i < 1000000000; i++) {

			if ("9".equals(j)) {

			} else if ("8".equals(j)) {

			} else if ("7".equals(j)) {

			} else if ("6".equals(j)) {

			} else if ("5".equals(j)) {

			} else if ("4".equals(j)) {

			} else if ("3".equals(j)) {

			} else if ("2".equals(j)) {

			} else if ("1".equals(j)) {

			} else if ("0".equals(j)) {

			}
		}
	}

	@Test
	public void testEmptyWhile() {

		int a = 100;
		int b = 50;

		while (--a > b++)
			;

		assertEquals(74, a);
		assertEquals(76, b);
	}

	@Test
	public void testForLoopVariableScope() {

		{
			int j = 13;
		}

		for (int j = 0; j < 10;)
			;

		int j = 10;
	}

	@Test
	public void testForLoopMultipleVariables() {

		for (int a = 10, b = 5; a > b; b++)
			;
	}

	@Test
	public void testForLoopVariations() {

		int x;
		
		x = 0;
		for (;;) {

			x++;
			if (x > 1000)
				break;
		}
		
		for(x = 0; x <= 1000; x++);
	}
	
}
