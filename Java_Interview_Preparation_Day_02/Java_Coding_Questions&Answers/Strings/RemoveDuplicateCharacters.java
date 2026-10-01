package com.java.coding.string;

import java.util.Scanner;

public class RemoveDuplicateCharacters 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		char[] charArray = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=charArray.length-1;i++)//9<=11
		{
			if(sb.indexOf(String.valueOf(s.charAt(i)))==-1)
			{
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println("String after removing duplicate characters:"+sb);
		sc.close();
	}

}
