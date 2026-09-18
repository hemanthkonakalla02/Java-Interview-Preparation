package com.java.coding.string;

import java.util.Scanner;

public class CountVowelsAndConsonants 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		int vowels=0;
		int consonants=0;
		char[] charArray = s.toCharArray();
		for(int i=0;i<=charArray.length-1;i++)//6<=6
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		
		System.out.println("Vowels in entered String "+s+" is :"+vowels);
		System.out.println("Consonants in entered String "+s+" is :"+consonants);
		sc.close();
		
	}

}
