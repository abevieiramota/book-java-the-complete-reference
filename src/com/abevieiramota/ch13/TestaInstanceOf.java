package com.abevieiramota.ch13;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

class A {
	int i, j;
}

class B {
	int i, j;
}

class C extends A {
	int k;
}

class D extends A {
	int k;
}

@RunWith(JUnit4.class)
public class TestaInstanceOf {

	@Test
	public void testaInstanceOf() {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		System.out.println("a instanceof A " + (a instanceof A));
		System.out.println("b instanceof B " + (b instanceof B));
		System.out.println("c instanceof C " + (c instanceof C));
		System.out.println("c instanceof A " + (c instanceof A));
		System.out.println("a instanceof C " + (a instanceof C));
		
		System.out.println();
		
		A ob = d;
		System.out.println("A(ob) = D");
		System.out.println("ob instanceof D " + (ob instanceof D));
		ob = c;
		System.out.println("A(ob) = C");
		System.out.println("ob instanceof D " + (ob instanceof D));
		System.out.println("ob instanceof A " + (ob instanceof A));
		
		System.out.println("all objects can be cast to Object");
		
		System.out.println("a instanceof object " + (a instanceof Object));
		System.out.println("b instanceof object " + (b instanceof Object));
		System.out.println("c instanceof object " + (c instanceof Object));
		System.out.println("d instanceof object " + (d instanceof Object));
	}
}
