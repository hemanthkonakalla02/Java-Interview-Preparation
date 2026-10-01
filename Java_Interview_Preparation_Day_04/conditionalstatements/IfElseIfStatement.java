package com.java.standard.edition.conditionalstatements;

import java.util.Scanner;

public class IfElseIfStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks=sc.nextInt();
		if(marks>=95 && marks<=100)
		{
			System.out.println("Outstanding");
		}
		else if(marks>=85 && marks <95)
		{
			System.out.println("A++");
		}
		else if(marks>=75 && marks<85)
		{
			System.out.println("A");
		}
		else if(marks>=65 && marks<75)
		{
			System.out.println("B++");
		}
		else if(marks>=55 && marks<65)
		{
			System.out.println("B");
		}
		else if(marks>=45 && marks<55)
		{
			System.out.println("C++");
		}
		else if(marks>=35 && marks<45)
		{
			System.out.println("C");
		}
		else if(marks<0 || marks >100)
		{
			System.out.println("Please enter the marks between 0-100");
		}
		else
		{
			System.out.println("Unsucessfull Attempt");
		}
		
		sc.close();
		
	}

}
