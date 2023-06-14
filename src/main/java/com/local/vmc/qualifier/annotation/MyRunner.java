package com.local.vmc.qualifier.annotation;

import java.util.Arrays;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class MyRunner {

	//@Autowired
	//@Qualifier("c")
	@Resource(name="b")
	IA worker;

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AdditionalConfig.class);
		
		 System.out.println("---------------------------------------------------");
		 Arrays.asList(ctx.getBeanDefinitionNames()).stream().forEach(System.out::println);
		 System.out.println("---------------------------------------------------");
		//https://stackoverflow.com/questions/12899372/spring-why-do-we-autowire-the-interface-and-not-the-implemented-class
		MyRunner myRunner = ctx.getBean(MyRunner.class);
		myRunner.worker.someFunction();
	}

}
