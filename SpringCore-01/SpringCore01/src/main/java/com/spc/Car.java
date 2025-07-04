package com.spc;

public class Car {
	
	private String model;
	private double prize;
	
	public Car()
	{
	System.out.println("car constructor...");
	}

	public Car(String model, double prize) {
		//super();
		this.model = model;
		this.prize = prize;
		
		System.out.println("model="+model+   "    "+"prize="+prize);
	}
	
	
}
