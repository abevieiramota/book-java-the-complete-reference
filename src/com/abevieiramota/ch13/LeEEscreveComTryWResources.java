package com.abevieiramota.ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LeEEscreveComTryWResources {

	public static void main(String[] args) {
		int i;

		try (FileInputStream fin = new FileInputStream("arquivo.txt");
				FileOutputStream fon = new FileOutputStream("arquivo_out2.txt")) {

			do {
				i = fin.read();
				if (i != -1) {
					fon.write(i);
				}
			} while (i != -1);
		} catch (Exception e) {
			System.out.println(":~");
			for(Throwable supressed: e.getSuppressed()) {
				System.out.println("Fui suprimido");
				System.out.println(supressed);
			}
				
		}

	}

}
