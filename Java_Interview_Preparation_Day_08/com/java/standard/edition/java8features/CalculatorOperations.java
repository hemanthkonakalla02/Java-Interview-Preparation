package com.java.standard.edition.java8features;

public class CalculatorOperations implements Calculator
{

	@Override
	public void add() 
	{
		int a=10;
		int b=2;
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
		
	}
	
	@Override
	public void sub()
	{
		int a=100;
		int b=50;
		int c=a-b;
		System.out.println("substraction of "+a+" and "+b+" is :"+c);
	}
	

}
