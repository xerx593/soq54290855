package com.stackoverflow.aop.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Retry {

    int DEFAULT_RETRIES = 2;

    int value() default DEFAULT_RETRIES;
}
