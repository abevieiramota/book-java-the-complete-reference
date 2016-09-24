package com.abevieiramota.ch12.enume;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestRaçaEnum {

	@Test(expected = IllegalArgumentException.class)
	public void seValueOfNaoMatchEntaoException() {
		Raça.valueOf("Halfling");
	}

	@Test
	public void ordinalEhConsistente() {
		for (int i = 0; i < Raça.values().length; i++) {
			assertEquals(i, Raça.values()[i].ordinal());
		}
	}
}
