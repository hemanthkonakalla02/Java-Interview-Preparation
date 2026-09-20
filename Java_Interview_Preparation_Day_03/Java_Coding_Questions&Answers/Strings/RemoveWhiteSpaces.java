package com.java.coding.string;

public class RemoveWhiteSpaces 
{
	public static void main(String[] args) 
	{
		String s =" Hemanth Kumar Konakalla is Javadev";
		System.out.println("Before Removing WhiteSpaces:"+s); 
		s=s.replaceAll("\\s", "");
		System.out.println("After Removing WhiteSpaces:"+s);
	}

}
