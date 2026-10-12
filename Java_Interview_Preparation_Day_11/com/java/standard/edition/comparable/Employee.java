package com.java.standard.edition.comparable;

public class Employee implements Comparable<Employee> 
{
	private int eid;
	private String name;
	private float salary;
	private String dept;
	
	public Employee(int eid,String name,float salary,String dept)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
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
	
	public int compareTo(Employee e1)
	{
		//return Integer.compare(this.eid, e1.eid);
		return this.name.compareTo(e1.name);
	}

}
