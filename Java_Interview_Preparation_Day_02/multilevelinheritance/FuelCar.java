package com.java.standard.edition.multilevelinheritance;

public class FuelCar extends Car 
{
	int z=300;
	
	public FuelCar()
	{
		System.out.println("This is fuelcar class constructor");
	}
	
	public void fuel()
	{
		System.out.println("Car is runnig with fuel");
	}

}
