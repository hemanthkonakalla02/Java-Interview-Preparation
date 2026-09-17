package com.java.standard.edition.abstraction;

public abstract class School 
{
	public static final int x=1000;
	
	//abstract methods
	public abstract void teach();
	public abstract void doExperiment();

	//concrete method
	public void display()
	{
		System.out.println("This is concrete method of school class");
	}
}
