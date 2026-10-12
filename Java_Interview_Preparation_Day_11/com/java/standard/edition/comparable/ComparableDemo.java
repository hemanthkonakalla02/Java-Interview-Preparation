package com.java.standard.edition.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo 
{
	public static void main(String[] args) 
	{
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee(3, "HemanthKumarKonakalla", 95000, "SoftwareDevelopment"));
		employee.add(new Employee(4, "PrasadKonakalla", 25000, "AutoCad"));
		employee.add(new Employee(1, "AnandKumarKonakalla", 105000, "Analyst"));
		employee.add(new Employee(2, "Sekhar", 60000, "Architecture"));
		employee.add(new Employee(5, "PriyankaKonakalla", 35000, "SoftwareTesting"));
		employee.add(new Employee(6, "Hanvika", 25000, "CloudEngineer"));
		
		Collections.sort(employee);
		employee.forEach(System.out::println);
		
	}

}
