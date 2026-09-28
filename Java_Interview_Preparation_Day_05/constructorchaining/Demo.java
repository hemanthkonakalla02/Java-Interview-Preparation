package com.java.standard.edition.constructorchaining;

public class Demo 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(96, "HemanthKumar", "SoftwareDevelopment");
		System.out.println("Id:"+emp.getId());
		System.out.println("Name:"+emp.getName());
		System.out.println("Dept:"+emp.getDept());
		System.out.println("Salary:"+emp.getSalary());
		
	}

}
