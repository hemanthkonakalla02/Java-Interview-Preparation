package com.java.standard.edition.lambdaexpressions;

//traditonal way of implementing the interface
public class CalculatorOperations implements Calculator {

	@Override
	public int add(int a,int b) 
	{
		int c=a+b;
		return c;
		
	}

}
