package com.java.standard.edition.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo 
{
	public static void main(String[] args) 
	{
		List<Student> student = new ArrayList<Student>();
		
		student.add(new Student(3, "HemanthKumarKonakalla", 78.6f, "SoftwareDevelopment"));
		student.add(new Student(4, "PrasadKonakalla", 65.0f, "AutoCad"));
		student.add(new Student(1, "AnandKumarKonakalla", 80.4f, "Analyst"));
		student.add(new Student(2, "Sekhar", 70.5f, "Architecture"));
		student.add(new Student(5, "PriyankaKonakalla", 79.56f, "SoftwareTesting"));
		student.add(new Student(6, "Hanvika", 65.0f, "CloudEngineer"));
		
		//Collections.sort(student,new IdComparator());
		//Collections.sort(student,new NameComparator());
			
		Collections.sort(student,(s1, s2) -> s1.getName().compareTo(s2.getName()));
		student.forEach(System.out::println);
		
	}

}
