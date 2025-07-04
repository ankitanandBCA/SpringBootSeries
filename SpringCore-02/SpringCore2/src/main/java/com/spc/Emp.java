package com.spc;

import org.springframework.stereotype.Component;

@Component
public class Emp {
	

	// Constructor
	public Emp() {
		System.out.println("emp object created....");
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
