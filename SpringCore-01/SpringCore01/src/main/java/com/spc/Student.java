package com.spc;

import java.util.List;
import java.util.Set;

public class Student {
private String name;
private List<Address> address1;
private Address address;
private Set<Address> address2;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Address> getAddress1() {
	return address1;
}
public void setAddress1(List<Address> address1) {
	this.address1 = address1;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Set<Address> getAddress2() {
	return address2;
}
public void setAddress2(Set<Address> address2) {
	this.address2 = address2;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", address1=" + address1 + ", address=" + address + ", address2=" + address2
			+ ", age=" + age + "]";
}

}
