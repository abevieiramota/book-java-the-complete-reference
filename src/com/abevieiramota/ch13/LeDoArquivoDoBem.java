package com.abevieiramota.ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeDoArquivoDoBem {
	public static void main(String[] args) {
		int i;
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("chora");
			return;
		}

		try {
			do {
				i = fis.read();
				if (i != -1) {
					System.out.println((char) i);
				}
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("chora mais");
		} finally {
			try {
				// não precisa testar != null pois se chegou aqui, o negócio ta setado
				fis.close();
			} catch (IOException e) {
				System.out.println("chola");
			}
		}
	}
}
