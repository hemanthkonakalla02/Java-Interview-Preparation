package com.java.standard.edition.immutablestrings;

public class StringNine 
{
	public static void main(String[] args) 
	{
		String s1 = "Hemanth";
		String s2 = "Kumar";
		String s3 = s1+s2;
		String s4 = s1+s2;
		
		if(s3==s4)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("String values are equal");
		}
		else
		{
			System.out.println("String values are not equal");
		}
		
	}

}
