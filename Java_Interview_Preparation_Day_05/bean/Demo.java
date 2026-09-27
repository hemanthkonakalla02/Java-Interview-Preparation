package com.java.standard.edition.bean;

public class Demo 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.setEid(15);
		emp.setName("HemanthKumarKonakalla");
		emp.setDept("SoftwareDevelopment");
		emp.setSalary(95000);
		
		System.out.println("Eid:"+emp.getEid());
		System.out.println("Name:"+emp.getName());
		System.out.println("Dept:"+emp.getDept());
		System.out.println("Salary:"+emp.getSalary());
		
	}

}
