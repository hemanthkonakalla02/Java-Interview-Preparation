package com.java.standard.edition.immutablestrings;

public class StringEight 
{
	public static void main(String[] args) 
	{
		String s1 = "hemanth"+"kumar";
		String s2 = "hemanth"+"kumar";
		
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("String values are equal");
		}
		else
		{
			System.out.println("String values are not equal");
		}
		
	}

}
