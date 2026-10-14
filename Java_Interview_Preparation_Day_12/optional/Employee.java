package com.java.standard.edition.optional;

import java.util.Optional;

public class Employee 
{
	private int eid;
	private String name;
	private float salary;
	private String address;
	
	public Employee(int eid, String name, float salary, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Optional<String> getAddress() {
		return  Optional.ofNullable(address);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
