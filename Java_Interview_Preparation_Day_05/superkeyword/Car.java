package com.java.standard.edition.superkeyword;

public class Car  extends Vehicle
{
	int x=200;
	
	public Car()
	{
		super();
		System.out.println("This is car class constructor");
	}
	
	public void run()
	{
		System.out.println("The value stored in vehicle class variable x is :"+super.x);
		System.out.println("The value stored in car class variable x is :"+this.x);
		super.start();
		System.out.println("Car is running smoothly");
	}

}
