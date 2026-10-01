package com.java.standard.edition.methodoverriding;

public class PhysicsTeacher extends Teacher 
{
	@Override
	public void teach()
	{
		System.out.println("Physics teacher teaches the physics subject");
	}
	
	@Override
	public void doExperiment()
	{
		System.out.println("Physics teacher conducts the experiment in physics lab");
	}
	
	//Method hiding
	public static void display()
	{
		System.out.println("This is static method of physics teacher class");
	}

}
