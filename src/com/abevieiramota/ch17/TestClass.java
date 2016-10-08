package com.abevieiramota.ch17;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestClass {

	@Test
	public void genericString() {
		System.out.println(ArrayList.class.toGenericString());
	}
}
