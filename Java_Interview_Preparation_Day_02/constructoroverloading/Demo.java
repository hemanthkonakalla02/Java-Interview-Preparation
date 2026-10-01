package com.java.standard.edition.constructoroverloading;

public class Demo 
{
	public static void main() 
	{
		System.out.println("No args");
		
	}
	
	public static void main(int[] args) 
	{
		System.out.println("integer args");
	}
	
	public static void main(String[] args) 
	{
		//Explicitly calling other main methods
		main();
		main(new int[10]);
		
		
		Employee emp = new Employee(15, "HemanthKumarKonakalla", 95000, "SoftwareDevelopment");
		System.out.println("Eid:"+emp.getEid());
		System.out.println("Name:"+emp.getEname());
		System.out.println("Salary:"+emp.getSalary());
		System.out.println("Dept:"+emp.getDept());
		
	}

}
