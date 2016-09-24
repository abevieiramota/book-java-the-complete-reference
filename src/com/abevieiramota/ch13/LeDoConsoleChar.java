package com.abevieiramota.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeDoConsoleChar {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digita aí e se quiser saí mand q");
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}
}
