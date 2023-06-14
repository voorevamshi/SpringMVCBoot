package com.local.vmc.circular.di.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {
	@Autowired
	private CircularDependencyA circA;
	
	private String message = "Hi!";

    
 
   
	public CircularDependencyA getCircA() {
		return circA;
	}




	public void setCircA(CircularDependencyA circA) {
		this.circA = circA;
	}




	/*@Autowired
	public CircularDependencyB(CircularDependencyA circA) {
		System.out.println("B class");
		this.circA = circA;
	}*/
	 public String getMessage() {
	        return message;
	    }
}
