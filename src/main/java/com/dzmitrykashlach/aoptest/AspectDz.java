package com.dzmitrykashlach.aoptest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDz {

    @Pointcut("@annotation(com.dzmitrykashlach.aoptest.AnnotationDzk)")
    public void annotated() {}

    @Before("annotated()")
    public void printABit() {
        System.out.println("AspectDzk");
    }
}