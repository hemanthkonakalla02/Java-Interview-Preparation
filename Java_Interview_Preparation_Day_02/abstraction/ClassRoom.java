package com.java.standard.edition.abstraction;

public class ClassRoom 
{
	public void teacher(School ref)
	{
		ref.teach();
		ref.doExperiment();
		ref.display();
		System.out.println("The value stored in variable x is :"+School.x);
		
	}

}
