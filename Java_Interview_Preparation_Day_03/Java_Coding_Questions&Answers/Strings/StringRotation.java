package com.java.coding.string;

public class StringRotation 
{
	public static void main(String[] args) 
	{
		String s1="ABCD";
		String s2="CDAB";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("String length is not matching so Strings are not Rotational");
			return;
		}
		
		String s3=s1+s2;//ABCDABCD
		if(s3.indexOf(s2)!=-1)
		{
			System.out.println("Strings are Rotational");
		}
		else
		{
			System.out.println("Strings are not Rotational");
		}
		
	}

}
