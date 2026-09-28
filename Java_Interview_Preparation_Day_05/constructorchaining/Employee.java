package com.java.standard.edition.constructorchaining;

public class Employee 
{
	private int id;
	private String name;
	private String dept;
	private float salary;
	
	public Employee()
	{
		super(); //if we dont specify super() ,java compiler by default uses it
	}
	
	public Employee(int id)
	{
		this();
		this.id=id;
		name="Hemanth";
		dept="Software";
		salary=75000;
	}
	
	public Employee(int id,String name)
	{
		this(id);
		this.name=name;
		dept="SoftwareDevelopment";
		salary=85000;
	}
	
	
	public Employee(int id,String name,String dept)
	{
		this(id,name);
		this.dept=dept;
		salary=95000;
	}
	
	public Employee(int id,String name,String dept,float salary)
	{
		this(id,name,dept);
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public float getSalary()
	{
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
