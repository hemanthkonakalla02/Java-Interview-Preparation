package com.java.standard.edition.uncheckedexception;

public class ArrayIndexOutOfBoundExceptionDemo 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		}
		
		System.out.println("This is the last line of the code");
	}

}
