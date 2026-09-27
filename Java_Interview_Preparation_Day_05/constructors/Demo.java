package com.java.standard.edition.constructors;

public class Demo 
{
	public static void main(String[] args) 
	{ 
					 
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(15, "HemanthKumarKonakalla", 150000, "SoftwareEngineer");
		
		
		System.out.println(emp1.getName()); //null
		System.out.println(emp1.getEid()); //0
		System.out.println(emp1.getSalary()); //0.0
		System.out.println(emp1.getDept()); //null
		
		System.out.println("==================================================");
		
		System.out.println(emp2.getEid()); //15
		System.out.println(emp2.getName());//HemanthKumarKonakalla
		System.out.println(emp2.getSalary());//150000.0
		System.out.println(emp2.getDept());//SoftwareEngineer
		
		
	}

}
