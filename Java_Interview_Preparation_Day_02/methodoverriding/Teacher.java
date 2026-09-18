package com.java.standard.edition.methodoverriding;

public class Teacher 
{
	int x=1000;
	
	public void teach()
	{
		System.out.println("Teacher teaches the subject");
	}
	
	
	public void doExperiment()
	{
		System.out.println("Teacher conducts the experiments in lab");
	}
	
	public static void display()
	{
		System.out.println("This is static method of teacher class");
	}

}
