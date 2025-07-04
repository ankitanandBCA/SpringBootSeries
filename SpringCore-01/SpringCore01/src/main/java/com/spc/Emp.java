package com.spc;

public class Emp {
	private String name;

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	// Static block
	static {
		System.out.println("class loding ....");
	}

	// Constructor
	public Emp() {
		System.out.println("Constructor method call....");
	}
	
	public void customInit()
	{
		System.out.println("customInit method call....");
	}
	
	public void customeDestory()
	{
		System.out.println("customeDestory method call....");
	}
}
