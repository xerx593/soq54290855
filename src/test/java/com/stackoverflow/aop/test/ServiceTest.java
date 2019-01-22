package com.stackoverflow.aop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServiceTest {

    @Autowired
    private Service1 service1;

    @Test
    public void shouldApplyCustomAnnotation1() throws InterruptedException {
        service1.serve();
    } 
    @Autowired
    private Service2 service2;

    @Test
    public void shouldApplyCustomAnnotation2() throws InterruptedException {
        service2.serve2();
    }
}
