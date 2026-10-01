package com.java.standard.edition.singlelevelinheritance;

public class Car extends Vehicle 
{
	int x=200;
	
	//during inheritance constructors will not inherited
	public Car()
	{
		System.out.println("This is Car class constructor");
	}
	
	public void run()
	{
		System.out.println("Car is running smoothly");
	}

}
