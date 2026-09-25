package com.java.standard.edition.threedjaggedarray;

import java.util.Scanner;

public class ThreeDJaggedArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of schools:");
		int n1=sc.nextInt();
		
		int marks[][][] = new int[n1][][];
		
		System.out.println("FINDING NO OF BRANCHES THAT BELONGS TO EACH SCHOOL:");
		for(int i=0;i<=marks.length-1;i++)
		{
			System.out.println("Enter the no of branches that belongs to school:"+i);
			int n2=sc.nextInt();
			marks[i]=new int[n2][];
		}
		
		System.out.println("FINDING NO OF STUDENTS THAT BELONGS TO EACH BRANCH OF SCHOOL:");
		for(int i=0;i<=marks.length-1;i++)
		{
			for(int j=0;j<=marks[i].length-1;j++)
			{
				System.out.println("Enter the no of students that belongs to school "+i+" and branch "+j);
				int n3=sc.nextInt();
				marks[i][j]=new int[n3];
			}
		}
		
		
		for(int i=0;i<=marks.length-1;i++)
		{
			for(int j=0;j<=marks[i].length-1;j++)
			{
				for(int k=0;k<=marks[i][j].length-1;k++)
				{
					System.out.println("Enter the marks for school "+i+" for branch "+j+" for student "+k);
					marks[i][j][k]=sc.nextInt();
				}
			}
		}
		
		
		System.out.println("Array Contents are:");
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
