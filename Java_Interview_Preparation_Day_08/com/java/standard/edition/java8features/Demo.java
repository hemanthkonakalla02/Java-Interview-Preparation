package com.java.standard.edition.java8features;

public class Demo 
{
	public static void main(String[] args) 
	{
//		CalculatorOperations c = new CalculatorOperations();
//		c.add();
//		c.sub();
//		Calculator.mul();
		
		//Anonymous inner class
		Calculator calc = new Calculator() {
			
			@Override
			public void add() 
			{
				int a=10;
				int b=10;
				int c=a+b;
				System.out.println("Addition of "+a+" and "+b+" is :"+c);
				
			}
		};
		
		calc.add();
		
	}

}
