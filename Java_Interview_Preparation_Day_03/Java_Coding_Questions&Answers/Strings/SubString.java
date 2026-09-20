package com.java.coding.string;

import java.util.Scanner;

public class SubString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		
		for(int i=0;i<=s.length()-1;i++)//3<=3
		{
			for(int j=i+1;j<=s.length();j++)//4<=4
			{
				System.out.println(s.substring(i,j));
			}
		}
		
		sc.close();
	}

}
