package com.abevieiramota.ch12.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(AnotacaoInheritedContainer.class)
public @interface AnotacaoInherited {
}
