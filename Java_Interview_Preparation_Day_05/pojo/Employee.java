package com.java.standard.edition.pojo;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int eid;
	private String name;
	private float salary;
	private String dept;
	
	public Employee()
	{
		
	}

	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public String getDept()
	{
		return dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
