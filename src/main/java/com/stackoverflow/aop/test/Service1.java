package com.stackoverflow.aop.test;

import org.springframework.stereotype.Component;

@Component
public class Service1 {

    @Retry(1)
    public void serve() throws InterruptedException {
        System.out.println("Hello, I am service1 .... zzzzz");
        Thread.sleep(2000);
    }
}
