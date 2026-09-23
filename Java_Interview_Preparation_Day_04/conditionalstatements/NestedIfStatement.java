package com.java.standard.edition.conditionalstatements;

import java.util.Scanner;

public class NestedIfStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username:");
		String userName=sc.next();
		System.out.println("Enter the password:");
		String pwd=sc.next();
		if(userName.equals("Hemanth"))
		{
			if(pwd.equals("chinni"))
			{
				System.out.println("Welcome :"+userName);
			}
			else
			{
				System.out.println("Invalid credentials !!!");
			}
		}
		else
		{
			System.out.println("Invalid username");
		}
		
		sc.close();
		
	}

}
