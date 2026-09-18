package com.java.coding.string;

import java.util.Scanner;

public class CountUpperCaseAndLowerCaseLetters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		int upperCount=0;
		int lowerCount=0;
		char[] charArray = s.toCharArray();
		for(int i=0;i<=charArray.length-1;i++)//7<=7
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				upperCount++;
			}
			else
			{
				lowerCount++;
			}
		}
		
		System.out.println("UpperCase Letters in Entered String is:"+upperCount);
		System.out.println("LowerCase Letters in Entered String is:"+lowerCount);
		sc.close();
		
	}

}
