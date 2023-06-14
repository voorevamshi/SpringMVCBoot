package com.local.vmc.qualifier.annotation;

import org.springframework.stereotype.Component;

@Component
public class C implements IA {
	public void someFunction() {
		System.out.println("C class someFunction");
	}

	public void someBfunc() {
		// doing b things
	}
}