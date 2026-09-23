package com.java.standard.edition.comments;

/**
 * @author hemanth kumar konakalla
 * This is the Employee class
 */

//Employee class  --> single line comment


/*
 * Employee class --> Multiline comment
 */
public class Employee 
{
	/**
	 * Instance variables of Employee class
	 */
	String name;
	int id;
	float salary;
	
	
	/**
	 * 
	 * @param name
	 * @param id
	 * @param salary
	 * 
	 * This is parameterised constructor
	 */
	public Employee(String name,int id,float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	
	
	/**
	 * This is instance method of Employee class
	 */
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Salary:"+salary);
		
	}

}
