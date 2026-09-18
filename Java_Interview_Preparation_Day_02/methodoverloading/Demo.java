package com.java.standard.edition.methodoverloading;

public class Demo 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		int result=c.add(45, 45);
		System.out.println(result);
		c.add(45.0f,45,45);
		
	}

}
