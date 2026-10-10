package com.java.standard.edition.uncheckedexception;

public class NullPointerExceptionDemo 
{
	public static void main(String[] args) 
	{
		String s1="Hemanth";
		String s2=null;
		try
		{
			System.out.println(s1.length());
			System.out.println(s2.length());
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
		}
		
		System.out.println("This is the last line of the code");
		
	}

}
