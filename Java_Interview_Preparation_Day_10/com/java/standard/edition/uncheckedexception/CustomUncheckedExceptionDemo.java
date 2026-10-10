package com.java.standard.edition.uncheckedexception;

public class CustomUncheckedExceptionDemo 
{
	static void validateAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Major,eligible to vote");
		}
		else
		{
			throw new CustomUncheckedException("Minor,not eligible to vote");
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			validateAge(3);
		}
		catch(CustomUncheckedException ce)
		{
			ce.printStackTrace();
		}
		
		System.out.println("This is the last line of the code");
		
	}

}
