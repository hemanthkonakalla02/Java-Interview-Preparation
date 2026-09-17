package com.java.standard.edition.encapsulation;

public class Demo 
{
	public static void main(String[] args) 
	{
		//Employee Object Creation
		Employee emp = new Employee();
		
		emp.setEid(15);
		emp.setName("HemanthKumarKonakalla");
		emp.setSalary(75000);
		emp.setDept("SoftwareDevelopment");
		
		System.out.println("Eid:"+emp.getEid());
		System.out.println("Ename:"+emp.getName());
		System.out.println("Salary:"+emp.getSalary());
		System.out.println("Dept:"+emp.getDept());
		
	}

}
