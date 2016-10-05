package com.abevieiramota.ch14;

public class MinhaClasseInteger extends MinhaClasseGenerica<Integer> {
	public MinhaClasseInteger(Integer obj) {
		super(obj);
	}

	public static void main(String[] args) {
		MinhaClasseInteger mci = new MinhaClasseInteger(10);
		System.out.println(mci.getObj());
		if(mci instanceof MinhaClasseGenerica<?>) {
			System.out.println("esse mci é MinhaClasseGenerica<?>");
		}
	}

}
