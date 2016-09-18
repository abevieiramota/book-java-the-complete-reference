package com.abevieiramota.ch09;

public class TenhoUmaInterface {
	public interface NestedIF {
		boolean mandaTrue();
	}
}

class ImplementoNestedIF implements TenhoUmaInterface.NestedIF {
	@Override
	public boolean mandaTrue() {
		return true;
	}
}

class Main {
	public static void main(String[] args) {
		TenhoUmaInterface.NestedIF i = new ImplementoNestedIF();
		System.out.println(i.mandaTrue());
	}
}