package com.stackoverflow.aop.test;

import org.springframework.stereotype.Component;

@Retry
@Component
public class Service2 {

    public void serve2() throws InterruptedException {
        System.out.println("Hello, I am service2 .... zzzzz");
        Thread.sleep(2000);
    }
}
