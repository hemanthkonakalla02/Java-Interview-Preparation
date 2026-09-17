package com.java.standard.edition.abstraction;

public class BiologyTeacher extends School
{

	@Override
	public void teach() 
	{
		System.out.println("BiologyTeacher teaches biology subject");
		
	}

	@Override
	public void doExperiment() 
	{
		System.out.println("BiologyTeacher conducts biology experiments");

		
	}

}
