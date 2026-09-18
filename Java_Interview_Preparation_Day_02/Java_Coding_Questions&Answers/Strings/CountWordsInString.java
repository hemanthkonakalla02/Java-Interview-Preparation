package com.java.coding.string;

import java.util.Scanner;

public class CountWordsInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a String:");
		String s =sc.nextLine();
		int count=0;
		String[] split = s.split(" ");
		for(int i=0;i<=split.length-1;i++)
		{
			count++;
		}
		
		System.out.println("Count of entered string is:"+count);
		sc.close();
	}

}
