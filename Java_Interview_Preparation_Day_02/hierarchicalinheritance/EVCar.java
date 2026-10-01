package com.java.standard.edition.hierarchicalinheritance;

public class EVCar extends Vehicle 
{
	int z=300;
	
	public EVCar()
	{
		System.out.println("This is EVCar class constructor");
	}
	
	public void run()
	{
		System.out.println("Ev car is running with battery charge");
	}

}
