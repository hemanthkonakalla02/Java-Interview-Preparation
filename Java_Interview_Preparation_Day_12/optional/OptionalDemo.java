package com.java.standard.edition.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo 
{
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(3, "HemanthKumarKonakalla", 95000, "Hyderabad"));
		list.add(new Employee(5, "PrasadKonakalla", 95000, null));
		list.add(new Employee(2, "Sekhar", 60000, ""));
		list.add(new Employee(1, "AnandKumarKonakalla", 105000, "Hyderabad"));
		list.add(new Employee(6, "Hanvika", 25000, "Hyderabad"));
		list.add(new Employee(4, "PriyankaKonakalla", 45000, "Hyderabad"));
		
		Employee emp = list.get(1);
		Optional<String> address = emp.getAddress();
		
//		if(address.isPresent())
//			System.out.println(address.get().length());
//		else
//			System.out.println("NA");
		
		address.ifPresentOrElse(n->n.length(), ()->System.out.println("NA"));
		
		System.out.println(emp.getName().toUpperCase());
		System.out.println(emp.getSalary());
		
		
	}

}
