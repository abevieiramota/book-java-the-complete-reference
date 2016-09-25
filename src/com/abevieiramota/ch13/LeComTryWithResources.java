package com.abevieiramota.ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class LeComTryWithResources {
	public static void main(String[] args) {
		byte[] i = new byte[10];
		int qtdReaded;

		try (FileInputStream fin = new FileInputStream("arquivo.txt")) {
			do {
				qtdReaded = fin.read(i);
				if (qtdReaded != -1) {
					System.out.print(new String(Arrays.copyOf(i, qtdReaded), "UTF-8"));
				}
			} while (qtdReaded != -1);
		} catch (FileNotFoundException e) {
			System.out.println("cade o arquivo?");
		} catch (IOException e) {
			System.out.println("esse programa não ta lendo direito");
		}
	}
}
