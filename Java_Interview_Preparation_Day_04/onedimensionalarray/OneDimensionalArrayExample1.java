package com.java.standard.edition.onedimensionalarray;

import java.util.Scanner;

public class OneDimensionalArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students:");
		int n=sc.nextInt();
		
		int marks[] = new int[n];
		
		for(int i=0;i<=marks.length-1;i++)//4<=4
		{
			System.out.println("Enter the marks for student :"+i);
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Array Contents are:");
		for(int i=0;i<=marks.length-1;i++)
		{
			System.out.print(marks[i]+" ");
		}
		
		System.out.println();
		sc.close();
		
	}

}
