package com.java.standard.edition.threedimensionalarray;

import java.util.Scanner;

public class UserDefinedThreeDimensionalArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the companies:");
		int n1=sc.nextInt();
		System.out.println("Enter the no branches that belongs to each company:");
		int n2=sc.nextInt();
		System.out.println("Enter the no of employees that belongs to each branch of company:");
		int n3=sc.nextInt();
		
		Employee details[][][] = new Employee[n1][n2][n3];
		
		for(int i=0;i<=details.length-1;i++)
		{
			for(int j=0;j<=details[i].length-1;j++)
			{
				for(int k=0;k<=details[i][j].length-1;k++)
				{
					System.out.println("Enter the eid:");
					int eid=sc.nextInt();
					System.out.println("Enter the ename:");
					String name=sc.next();
					System.out.println("Enter the salary:");
					float salary=sc.nextFloat();
					System.out.println("Enter the dept:");
					String dept=sc.next();
					
					details[i][j][k]=new Employee(eid, name, salary, dept);
				}
			}
		}
		
		
		System.out.println("Array contents are");
		
		for(int i=0;i<=details.length-1;i++)
		{
			for(int j=0;j<=details[i].length-1;j++)
			{
				for(int k=0;k<=details[i][j].length-1;k++)
				{
					System.out.print(details[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		
		
		sc.close();
	}

}
