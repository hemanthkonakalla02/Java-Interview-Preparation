package com.java.standard.edition.objectclass;

import java.util.Objects;

public class Employee 
{
	private String name;
	private float salary;
	private String dept;
	
	public Employee(String name, float salary, String dept) {
		super(); 
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
	

}
