package com.java.standard.edition.pojo;

public class Demo 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.setEid(15);
		emp.setName("HemanthKumarKonakalla");
		emp.setDept("SoftwareDevelopment");
		emp.setSalary(15000);
		
		System.out.println("Eid:"+emp.getEid());
		System.out.println("Name:"+emp.getName());
		System.out.println("Salary:"+emp.getSalary());
		System.out.println("Dept:"+emp.getDept());
		
	}

}
