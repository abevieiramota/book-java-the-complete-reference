package com.abevieiramota.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeDoConsoleString {
	public static void main(String[] args) throws IOException {
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digita aí e se quiser saí mand q");
		do {
			s = br.readLine();
			System.out.println(s);
		} while (!"q".equals(s));
	}
}
