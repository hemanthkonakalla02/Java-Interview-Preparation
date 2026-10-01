package com.java.standard.edition.statickeyword;

public class Employee 
{
	//static variables
	static int a;
	static int b;
	static int c;
	
	//static block
	
	static
	{
		System.out.println("This is static block");
		a=10;
		b=20;
		c=30;
	}
	
	//static method
	
	public static void display1()
	{
		System.out.println("This is the static method");
		System.out.println("The value stored in static variable a is :"+a);
		System.out.println("The value stored in static variable b is :"+b);
		System.out.println("The value stored in static variable c is :"+c);
	}
	
	//instance variables
	int x;
	int y;
	int z;
	
	//instance block
	{
		System.out.println("This is instance block");
		x=1000;
		y=2000;
		z=3000;
		//Accessing and initiazing new values for static variables
		
		a=6000;
		b=7000;
		c=8000;
	}
	
	//instance method
	public void display2()
	{
		System.out.println("This is the instance method");
		System.out.println("The value stored in static variable a is :"+a);
		System.out.println("The value stored in static variable b is :"+b);
		System.out.println("The value stored in static variable c is :"+c);
		
		System.out.println("The value stored in instance variable x is :"+x);
		System.out.println("The value stored in instance variable y is :"+y);
		System.out.println("The value stored in instance variable z is :"+z);
	}
	
	
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		display1();
		
		emp.display2();
	}
}
