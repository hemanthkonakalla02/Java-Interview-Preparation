package com.java.standard.edition.threedimensionalarray;

import java.util.Scanner;

public class ThreeDimensionalArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of schools:");
		int n1=sc.nextInt();
		System.out.println("Enter the no of branches that belongs to each school:");
		int n2=sc.nextInt();
		System.out.println("Enter the no of students that belongs to each branch of school:");
		int n3=sc.nextInt();
		
		int marks[][][] = new int[n1][n2][n3];
		
		for(int i=0;i<=marks.length-1;i++)
		{
			for(int j=0;j<=marks[i].length-1;j++)
			{
				for(int k=0;k<=marks[i][j].length-1;k++)
				{
					System.out.println("Enter the marks for school "+i+" for branch "+j+" and for student "+k);
					marks[i][j][k]=sc.nextInt();
				}
			}
		}
		
		System.out.println("Array contents are");
		for(int i=0;i<=marks.length-1;i++)
		{
			for(int j=0;j<=marks[i].length-1;j++)
			{
				for(int k=0;k<=marks[i][j].length-1;k++)
				{
					System.out.print(marks[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		
		sc.close();
		
	}

}
