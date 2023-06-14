package com.local.vmc.circular.di.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependencyTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AdditionalConfig.class);
	 //https://www.baeldung.com/circular-dependencies-in-spring
	   CircularDependencyA circularDependencyA = ctx.getBean(CircularDependencyA.class);
	   System.out.println(circularDependencyA.getCircB().getMessage());
}
}
