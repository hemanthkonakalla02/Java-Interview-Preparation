package com.singleton;

public class Employee 
{
	
	private static volatile Employee emp = null;
	
	//Constructor is private so we cant create the object for Employee
	private Employee()
	{
		
	}
	

	
	//Creating the static method
	public static Employee getEmployee()
	{
		if(emp==null)   //first check (no lock)
		{
			synchronized (Employee.class)   
			{
				if(emp==null)    // second check (with lock)
				{
					emp= new Employee();
				}
				
			}
			
			
		}
		return emp;
	}
	
	

}
