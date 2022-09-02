package com.dzmitrykashlach.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ServiceDzkImpl {

    @AnnotationDzk
    public void method1() {
        System.out.println("method1");
//        method2();
    }

    @AnnotationDzk
    public void method2() {
        System.out.println("method2");
        method1();
    }
}