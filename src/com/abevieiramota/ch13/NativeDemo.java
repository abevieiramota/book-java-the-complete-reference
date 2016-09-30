package com.abevieiramota.ch13;

// Pulei
public class NativeDemo {
	int i;
	public static void main(String[] args) {
		NativeDemo ob = new NativeDemo();
		ob.i = 10;
		System.out.println("Antes do método nativo i = " + ob.i);
		
		ob.test();
		
		System.out.println("Depois do método nativo i = " + ob.i);
	}
	
	public native void test();
	
	static {
		System.loadLibrary("NativeDemo");
	}

}
