package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee 
{
	
	private int eid;

	private String name;
	
	private float salary;
	
	private String address;
	
	//field injection
	//@Autowired
	private Company company;
	

	//constructor injection
	public Employee(@Value("${eid}")int eid,@Value("${name}") String name, @Value("${salary}")float salary,@Value("${address}") String address, Company company) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.company = company;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public Company getCompany() {
		return company;
	}

	//setter injection
	//@Autowired
	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", address=" + address + ", company="
				+ company + "]";
	}

}
