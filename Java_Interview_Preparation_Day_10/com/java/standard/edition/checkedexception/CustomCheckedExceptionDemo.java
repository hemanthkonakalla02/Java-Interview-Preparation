package com.java.standard.edition.checkedexception;

public class CustomCheckedExceptionDemo 
{
	static void validateAge(int age) throws CustomCheckedException
	{
		if(age>=18)
		{
			System.out.println("Major,he can vote");
		}
		else
		{
			throw new CustomCheckedException("Minor,he is not eligible to vote");
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			validateAge(3);
			
		} 
		
		catch (CustomCheckedException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
		System.out.println("This is the last line of the code");
	}

}
