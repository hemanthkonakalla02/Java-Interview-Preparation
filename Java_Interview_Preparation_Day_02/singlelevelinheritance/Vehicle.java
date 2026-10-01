package com.java.standard.edition.singlelevelinheritance;

public class Vehicle 
{
	int x=100;
	private int y=1000; // private members of a class does not participate in inheritance
	
	public Vehicle()
	{
		System.out.println("This is vehicle class constructor");
	}
	
	public void start()
	{
		System.out.println("Vehicle is started");
	}

}
