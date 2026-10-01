package com.java.standard.edition.methodoverriding;

public class School 
{
	public void classRoom(Teacher ref)
	{
		ref.teach();
		ref.doExperiment();
		Teacher.display();
	}

}
