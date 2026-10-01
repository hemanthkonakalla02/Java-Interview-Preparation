package com.java.standard.edition.twodjaggedarray;

import java.util.Scanner;

public class TwoDJaggedArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of schools:");
		int n1=sc.nextInt();
		
		int marks[][] = new int[n1][];
		
		System.out.println("FINDING NO OF STUDENTS THAT BELONGS TO EACH SCHOOL:");
		for(int i=0;i<=marks.length-1;i++)//2<=2
		{
			System.out.println("Enter the no of students that belongs to school :"+i);
			int n2=sc.nextInt();
			marks[i]=new int[n2];
		}
		
		//storing the marks of each student
		for(int i=0;i<=marks.length-1;i++)//2<=2
		{
			for(int j=0;j<=marks[i].length-1;j++)//2<=2
			{
				System.out.println("Enter the marks for school "+i+" for student "+j);
				marks[i][j]=sc.nextInt();
			}
		}
		
		
		
		//fetching the array contents
		
		System.out.println("Array Contents are:");
		for(int i=0;i<=marks.length-1;i++)
		{
			for(int j=0;j<=marks[i].length-1;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	

}
