package com.java.standard.edition.encapsulation;

public class Employee 
{
	//Providing the security to the important data of employee using private access modifier
	private int eid;
	private String name;
	private float salary;
	private String dept;
	
	//Non Parameterized Constructor
	public Employee()
	{
		
	}
	
	//Parameterized Constructor
	public Employee(int eid,String name,float salary,String dept)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	
	//Setters
	public void setEid(int eid)
	{
		if(eid>0 && eid!=0)
		{
			this.eid=eid;
		}
		else
		{
			System.out.println("Please enter the valid eid");
		}
		
	}
	
	public void setName(String name)
	{
		if(name.length()>=5)
		{
			this.name=name;
		}
		else
		{
			System.out.println("Please enter the name with atleast 5 characters");
		}
		
	}
	
	public void setSalary(float salary)
	{
		if(salary>0 && salary!=0)
		{
			this.salary=salary;
		}
		else
		{
			System.out.println("Please enter the valid salary greater than zero");
		}
	}
	
	public void setDept(String dept)
	{
		if(dept.length()>=5)
		{
			this.dept=dept;
		}
		else
		{
			System.out.println("Please enter the department with atleast 5 characters");
		}
		
	}
	
	//Getters
	
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

}
