package com.java.standard.edition.twodimensionalarray;

import java.util.Scanner;

public class UserDefinedTwoDimensionalArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies:");
		int n1=sc.nextInt();
		System.out.println("Enter the no of employees that belongs to each company:");
		int n2=sc.nextInt();
		
		Employee details[][] = new Employee[n1][n2];
		
		for(int i=0;i<=details.length-1;i++)
		{
			for(int j=0;j<=details[i].length-1;j++)
			{
				System.out.println("Enter the eid:");
				int eid=sc.nextInt();
				System.out.println("Enter the ename:");
				String ename=sc.next();
				System.out.println("Enter the salary:");
				float salary=sc.nextFloat();
				System.out.println("Enter the dept:");
				String dept=sc.next();
				
				details[i][j]=new Employee(eid, ename, salary, dept);
			}
		}
		
		System.out.println("Array contents are :");
		for(int i=0;i<=details.length-1;i++)
		{
			for(int j=0;j<=details[i].length-1;j++)
			{
				System.out.print(details[i][j]+" ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
