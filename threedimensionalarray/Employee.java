package com.java.standard.edition.threedimensionalarray;

public class Employee 
{
	private int eid;
	private String name;
	private float salary;
	private String dept;
	
	public Employee()
	{
		
	}
	
	public Employee(int eid,String name,float salary,String dept)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
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
