package com.spring.manualdependencyinjection;

public class Employee 
{
	private int eid;
	private String name;
	private float salary;
	private String dept;
	private Address address;
	
	public Employee()
	{
		
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", address="
				+ address + "]";
	}
	
//	public Employee(int eid,String name,float salary,String dept,Address address)
//	{
//		this.eid=eid;
//		this.name=name;
//		this.salary=salary;
//		this.dept=dept;
//		this.address=address;
//	}
	

	
	

}
