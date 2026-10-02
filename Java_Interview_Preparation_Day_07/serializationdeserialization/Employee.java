package com.java.standard.edition.serializationdeserialization;

import java.io.Serializable;

public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int eid;
	private String name;
	private float salary;
	private transient String dept;
	
	public Employee(int eid,String name,float salary,String dept)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	

}
