package com.abevieiramota.ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscreveNoArquivo {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fon = null;
		
		try {
			fin = new FileInputStream("arquivo.txt");
			fon = new FileOutputStream("arquivo_out.txt");
			
			do {
				i = fin.read();
				if(i != -1) {
					fon.write(i);
				}
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("deu erro");
		} finally {
			try {
				if(fin != null) {
					fin.close();
				}
			} catch(IOException e) {
				System.out.println("fin, q há contigo?");
			}
			try {
				if(fon != null) {
					fon.close();
				}
			} catch(IOException e) {
				System.out.println("fon, já era mah");
			}
		}
	}

}
