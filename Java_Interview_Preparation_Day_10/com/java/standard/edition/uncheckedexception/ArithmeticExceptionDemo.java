package com.java.standard.edition.uncheckedexception;

public class ArithmeticExceptionDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("division of "+a+" and "+b+" is :"+c);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		
		System.out.println("This is the last line of the program");
		
	}

}
