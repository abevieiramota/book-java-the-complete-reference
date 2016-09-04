package com.abevieiramota.ch05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaControlStatements {

	@Test
	public void testLabeledBreak() {
		boolean t = true;
		first: {
			second: {
				third: {
					System.out.println("Before the break.");
					if (t)
						break second; // break out of second block
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("This is after second block.");
		}
	}

	@Test
	public void testLabeledContinue() {
		outer: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					continue outer;
				}
				System.out.print(" " + (i * j));
			}
		}
		System.out.println();
	}
}
