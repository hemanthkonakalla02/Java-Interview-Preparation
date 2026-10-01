package com.java.standard.edition.threedjaggedarray;

import java.util.Scanner;

public class UserDefinedThreeDJaggedArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies:");
		int n1=sc.nextInt();
		
		Employee details[][][] = new Employee[n1][][];
		
		System.out.println("FINDING NO OF BRANCHES THAT BELONGS TO EACH COMPNAY:");
		for(int i=0;i<=details.length-1;i++)
		{
			System.out.println("Enter the no of branches that belongs to company:"+i);
			int n2=sc.nextInt();
			details[i]=new Employee[n2][];
		}
		
		System.out.println("FINDING NO OF EMPLOYEES THAT BELONGS TO EACH BRANCH OF COMPANY:");
		for(int i=0;i<=details.length-1;i++)
		{
			for(int j=0;j<=details[i].length-1;j++)
			{
				System.out.println("Enter the no of employees that belongs to company "+i+" and for branch "+j);
				int n3=sc.nextInt();
				details[i][j]= new Employee[n3];
			}
		}
		
		
		//storing the employee details
		for(int i=0;i<=details.length-1;i++)
		{
			for(int j=0;j<=details[i].length-1;j++)
			{
				for(int k=0;k<=details[i][j].length-1;k++)
				{
					System.out.println("Enter the employee id for company "+i+" for branch "+j+" and employee "+k);
					int eid=sc.nextInt();
					System.out.println("Enter the employee name for company "+i+" and for branch "+j+" and employee "+k);
					String name=sc.next();
					System.out.println("Enter the employee salary for company "+i+" and for branch "+j+" and employee "+k);
					float salary=sc.nextFloat();
					System.out.println("Enter the employee department for company "+i+" and for branch "+j+" and employee "+k);
					String dept=sc.next();
					
					details[i][j][k]=new Employee(eid, name, salary, dept);					
				}
			}
		}
		
		
		System.out.println("Array Contents are");
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
