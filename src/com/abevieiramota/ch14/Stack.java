package com.abevieiramota.ch14;

import java.lang.reflect.Array;

public class Stack<T extends AClasse & AInterfaceA & AInterfaceB> {

	private static final int INITIAL_CAPACITY = 10;
	T[] objs;
	int size;

	public Stack(Class<T[]> clazz) {
		this.objs = clazz.cast(Array.newInstance(clazz.getComponentType(), INITIAL_CAPACITY));
		this.size = 0;
	}

	public void add(T t) {
		if (this.objs.length == this.size) {
			throw new IllegalStateException("maxo, a parada lotou!");
		}
		this.objs[size++] = t;

//		another way
//		try {
//			this.objs[size++] = t;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			throw new IllegalStateException("maxo, a parada lotou!");
//		}
	}

	public T remove() {
		if (this.size == 0) {
			throw new IllegalStateException("maxo, tem nada não!");
		}
		return this.objs[--size];
	}
	
	public boolean sameSize(Stack<? super AClasseFoda> otherStack) {
		return this.size == otherStack.size;
	}
	
	public static void main(String[] args) {
		
		Stack<AClasseFoda> stack1 = new Stack<AClasseFoda>(AClasseFoda[].class);
		stack1.add(new AClasseFoda());
		stack1.remove();
		
		Stack<AClasseFoda> stack2 = new Stack<AClasseFoda>(AClasseFoda[].class);
		stack2.add(new AClasseFoda());
		stack2.add(new AClasseFoda());
		stack2.remove();
		stack2.remove();
		
		System.out.println(stack1.sameSize(stack2));
	}
	
	static class AClasseFoda extends AClasse implements AInterfaceA, AInterfaceB { 
	}

}
