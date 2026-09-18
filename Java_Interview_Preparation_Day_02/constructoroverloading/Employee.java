package com.java.standard.edition.constructoroverloading;

public class Employee 
{
	private int eid;
	private String ename;
	private float salary;
	private String dept;
	
	//Constructor overloading
	public Employee()
	{
		
	}
	
	public Employee(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	public Employee(int eid,String ename,float salary,String dept)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.dept=dept;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public String getEname()
	{
		return ename;
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
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
