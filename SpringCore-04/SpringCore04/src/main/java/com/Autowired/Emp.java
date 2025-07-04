package com.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Emp {
	private int id;
	private String Name,role;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		System.out.println("emp object created....");
	}

	public Emp(int id, String name, String role) {
		super();
		this.id = id;
		Name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", Name=" + Name + ", role=" + role + ", address=" + address + "]";
	}


	
	
	

}
