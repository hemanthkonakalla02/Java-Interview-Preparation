package com.java.standard.edition.abstraction;

public class Demo 
{
	public static void main(String[] args) 
	{
		PhysicsTeacher pt = new PhysicsTeacher();
		BiologyTeacher bt = new BiologyTeacher();
		ClassRoom cr = new ClassRoom();
		cr.teacher(pt);
		System.out.println("=====================================================");
		cr.teacher(bt);
		
		
	}

}
