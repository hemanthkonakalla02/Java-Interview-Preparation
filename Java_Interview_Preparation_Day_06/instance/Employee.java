package com.java.standard.edition.instance;

public class Employee 
{
	//instance variables
	private int eid;
	private String name;
	private float salary;
	private String dept;
	
	//instance block
	{
		eid=101;
		name="HemanthKumarKonakalla";
		salary=95000;
		dept="SoftwareEngineer";
	}
	
	//instance method
	public void display()
	{
		System.out.println("Eid:"+eid);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Dept:"+dept);
	}
	
	
	

}
