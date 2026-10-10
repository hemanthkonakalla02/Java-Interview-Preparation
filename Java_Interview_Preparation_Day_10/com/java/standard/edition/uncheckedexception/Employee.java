package com.java.standard.edition.uncheckedexception;

public class Employee 
{
	public static void main(String[] args)
	{
		try
		{
			String skills[]= {"Java","SQL","JDBC","Hibernate","SpringBoot"};
			
			System.out.println(skills[10]);
			
			int salary=100000;
			int bonus=0;
			int c=salary/bonus;
			
			System.out.println(c);
		}
		
		catch(ArrayIndexOutOfBoundsException | ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		System.out.println("This is the last line of the code");
	}
	
	
	
	

}
