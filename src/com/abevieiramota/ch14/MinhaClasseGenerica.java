package com.abevieiramota.ch14;

public class MinhaClasseGenerica<T> {

	T obj;
	
	public MinhaClasseGenerica(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}
}
