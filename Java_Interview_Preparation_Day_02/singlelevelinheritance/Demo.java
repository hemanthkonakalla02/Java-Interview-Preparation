package com.java.standard.edition.singlelevelinheritance;

public class Demo 
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		System.out.println("The value stored in variable x is :"+c.x);
		//System.out.println("The value stored in variable y is :"+c.y);
		c.start();
		c.run();
		
	}

}
