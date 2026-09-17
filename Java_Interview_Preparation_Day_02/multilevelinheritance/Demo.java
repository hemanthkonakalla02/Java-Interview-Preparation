package com.java.standard.edition.multilevelinheritance;

public class Demo 
{
	public static void main(String[] args) 
	{
		FuelCar fc = new FuelCar();
		System.out.println("The value stored in variable x is :"+fc.x);
		System.out.println("The value stored in variabel y is :"+fc.y);
		System.out.println("The value stored in varaible z is :"+fc.z);
		fc.start();
		fc.run();
		fc.fuel();
		
	}

}
