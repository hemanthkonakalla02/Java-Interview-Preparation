package com.java.standard.edition.methodoverriding;

public class Demo 
{
	public static void main(String[] args) 
	{
		PhysicsTeacher pt = new PhysicsTeacher();
		ChemistryTeacher ct = new ChemistryTeacher();
		School s = new School();
		s.classRoom(pt);
		System.out.println("===================================================");
		s.classRoom(ct);
		
	}

}
