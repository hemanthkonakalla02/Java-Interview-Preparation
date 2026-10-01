package com.java.standard.edition.multilevelinheritance;

public class Car extends VehicleOne
{
	int y=200;
	
	public Car()
	{
		System.out.println("This is car class constructor");
	}
	
	
	public void run()
	{
		System.out.println("Car is running smoothly");
	}

}
