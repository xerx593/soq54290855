package com.stackoverflow.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

    @Around("@within(retry)")
    public Object typeAspect(ProceedingJoinPoint joinPoint, Retry retry) throws Throwable {
        Object proceed = commonAspect(joinPoint, retry);
        return proceed;
    }

    @Around("@annotation(retry)")
    public Object methodAspect(ProceedingJoinPoint joinPoint, Retry retry) throws Throwable {
        Object proceed = commonAspect(joinPoint, retry);
        return proceed;
    }

    private Object commonAspect(ProceedingJoinPoint joinPoint, Retry retry) throws Throwable {
        final long start = System.currentTimeMillis();
        final Object proceed = joinPoint.proceed();
        final long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        System.out.println("Retry is :" + (retry == null ? "null" : retry.value()));
        return proceed;
    }

}
