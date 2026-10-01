package com.java.standard.edition.twodjaggedarray;

import java.util.Scanner;

public class UserDefinedTwoDJaggedArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies:");
		int n1=sc.nextInt();
		
		Employee emp[][] = new Employee[n1][];
		
		System.out.println("FINDING NO OF EMPLOYEES THAT BELONGS TO EACH COMPANY:");
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println("Enter the no of employees that belongs to company :"+i);
			int n2=sc.nextInt();
			emp[i]= new Employee[n2];
		}
		
		//storing the employees details of each company
		for(int i=0;i<=emp.length-1;i++)
		{
			for(int j=0;j<=emp[i].length-1;j++)
			{
				System.out.println("Enter the eid for company:"+i+" and for employee "+j);
				int eid=sc.nextInt();
				System.out.println("Enter the name for company:"+i+" and for employee "+j);
				String name=sc.next();
				System.out.println("Enter the salary for company:"+i+" and for employee "+j);
				float salary=sc.nextFloat();
				System.out.println("Enter the dept for company:"+i+" and for employee "+j);
				String dept=sc.next();
				
				emp[i][j]=new Employee(eid, name, salary, dept);
			}
		}
		
		//fetching the employee details
		
		for(int i=0;i<=emp.length-1;i++)
		{
			for(int j=0;j<=emp[i].length-1;j++)
			{
				System.out.print(emp[i][j]+" ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
