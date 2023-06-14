package com.local.vmc.qualifier.annotation;

import org.springframework.stereotype.Component;

@Component
public class B implements IA {
	public void someFunction() {
		System.out.println("B class someFunction");
	}

	public void someBfunc() {
		// doing b things
	}
}