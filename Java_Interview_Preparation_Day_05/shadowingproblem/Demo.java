package com.java.standard.edition.shadowingproblem;

public class Demo 
{
	public static void main(String[] args) 
	{
		Student s = new Student(15, "HemanthKumarKonakalla", "Narayana", 65.0f);
		System.out.println("Id:"+s.getId());
		System.out.println("Name:"+s.getName());
		System.out.println("School:"+s.getSchoolName());
		System.out.println("Marks:"+s.getMarks());
		
	}

}
