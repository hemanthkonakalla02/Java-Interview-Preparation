package com.java.standard.edition.hierarchicalinheritance;

public class FuelCar extends Vehicle 
{
	int y=200;
	
	public FuelCar()
	{
		System.out.println("This is fuelcar class constructor");
	}
	
	public void run()
	{
		System.out.println("Car is running with fuel");
	}

}
