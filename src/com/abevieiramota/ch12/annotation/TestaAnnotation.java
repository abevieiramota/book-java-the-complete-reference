package com.abevieiramota.ch12.annotation;

import java.lang.reflect.Method;

public class TestaAnnotation {

	@VoceEstaAnotado("Mas que anotação legal você tem!")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		TestaAnnotation obj = new TestaAnnotation();
		Class<? extends TestaAnnotation> objClazz = obj.getClass();
		Method mainMethod = objClazz.getMethod("main", String[].class);
		if (mainMethod.isAnnotationPresent(VoceEstaAnotado.class)) {
			VoceEstaAnotado anottation = mainMethod.getAnnotation(VoceEstaAnotado.class);
			System.out.println(anottation);
		}
		// WHAT?!
		Class<?> intClazz = int.class;
	}
}
