package com.spring;

import java.util.*;

public class Employee 
{
	private int eid;
	private String name;
	private float salary;
	private String dept;
//	private List<String> skills;
//	private Set<String> skills;
	private Map<Integer,String> skills;
	
	//Non-parameterised constructor
	public Employee()
	{
		
	}
	
	//parameterised constructor
	public Employee(int eid,String name,float salary,String dept,Map<Integer,String> skills)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		this.skills=skills;
	}
	
	//setters
//	public void setEid(int eid)
//	{
//		this.eid=eid;
//	}
//	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	
//	public void setSalary(float salary)
//	{
//		this.salary=salary;
//	}
//	
//	public void setDept(String dept)
//	{
//		this.dept=dept;
//	}
//	
//	
//	public void setSkills(List<String> skills)
//	{
//		this.skills=skills;
//	}
	
	//getters
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
	
	
	public Map<Integer,String> getSkills()
	{
		return skills;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", skills="
				+ skills + "]";
	}
	
	
}
