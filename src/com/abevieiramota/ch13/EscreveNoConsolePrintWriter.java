package com.abevieiramota.ch13;

import java.io.PrintWriter;

public class EscreveNoConsolePrintWriter {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, false);
		pw.println("OI");
		pw.println("hehe");
		pw.println("flushando");
		pw.flush();
	}
}
