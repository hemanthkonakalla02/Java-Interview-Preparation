package com.java.standard.edition.lambdaexpressions;

public class Demo 
{
	public static void main(String[] args) 
	{
		CalculatorOperations calc = new CalculatorOperations();
		System.out.println(calc.add(10, 40));
		
		//implementing the Calculator interface with Anonymous class
		Calculator cal = new Calculator() {
			
			@Override
			public int add(int a,int b) 
			{
				
				int c=a+b;
				return c;
				
			}
		};
		
		System.out.println(cal.add(75,75));
		
		
		//using lambda expression for implemeting the functional interface
		
		Calculator c1 = (x,y)->{
			
			int c=x+y;
			return c;
		};
		 System.out.println(c1.add(1000,1000));
		
	}

}
