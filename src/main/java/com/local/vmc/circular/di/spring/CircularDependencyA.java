package com.local.vmc.circular.di.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
public class CircularDependencyA {
	@Autowired
    private CircularDependencyB circB;

	public CircularDependencyB getCircB() {
		return circB;
	}

	public void setCircB(CircularDependencyB circB) {
		this.circB = circB;
	}
 
	 
  /*  @Autowired
    public CircularDependencyA(@Lazy CircularDependencyB circB) {
    	System.out.println("A class");
        this.circB = circB;
    }
    */
    
}
