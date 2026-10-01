package com.java.standard.edition.immutablestrings;

public class StringThirteen 
{
	public static void main(String[] args) 
	{
		String s1 = "hemanth";
		String s2 = new String("hemanth");
		String s3=s2.intern();
		
		if(s1==s3)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		
		
		if(s1.equals(s3))
		{
			System.out.println("String values are equal");
		}
		else
		{
			System.out.println("String values are not equal");
		}
		
	}

}
