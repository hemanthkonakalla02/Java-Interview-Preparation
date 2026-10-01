package com.java.standard.edition.immutablestrings;

public class StringTwo 
{
	public static void main(String[] args) 
	{
		//s1 and s2 will point to Hemanth,which was in String constant pool
		String s1 = "Hemanth";
		String s2 = "Hemanth";
		
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		
	}

}
