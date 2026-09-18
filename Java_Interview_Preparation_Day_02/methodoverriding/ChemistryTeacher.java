package com.java.standard.edition.methodoverriding;

public class ChemistryTeacher extends Teacher
{
	@Override
	public void teach()
	{
		System.out.println("Chemistry teacher teaches the chemistry subject");
	}
	
	@Override
	public void doExperiment()
	{
		System.out.println("Chemistry teacher conducts the experiment in chemistry lab");
	}

}
