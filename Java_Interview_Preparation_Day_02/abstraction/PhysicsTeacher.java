package com.java.standard.edition.abstraction;

public class PhysicsTeacher extends School{

	@Override
	public void teach() 
	{
		System.out.println("PhysicsTeacher teaches physics subject");
		
	}

	@Override
	public void doExperiment() 
	{
		System.out.println("PhysicsTeacher conducts physics experiments");
		
	}

}
