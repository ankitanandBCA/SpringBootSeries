package com.spc;

public class Employee {
	private Address address;
	
	private String name;
	private int age;
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	  public Employee(){
		  System.out.println("empolyee constructor....");
		  
	  }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
