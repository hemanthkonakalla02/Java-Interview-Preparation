package com.java.standard.edition.hierarchicalinheritance;

public class Demo 
{
	public static void main(String[] args) 
	{
		FuelCar fc = new FuelCar();
		
		fc.start();
		fc.run();
		System.out.println("The value stored in variable x is :"+fc.x);
		System.out.println("The value stored in variable y is :"+fc.y);
		System.out.println("================================================");
		EVCar ev = new EVCar();
		ev.start();
		ev.run();
		System.out.println("The value stored in variable x is :"+ev.x);
		System.out.println("The value stored in variable z is :"+ev.z);
		
	}

}
