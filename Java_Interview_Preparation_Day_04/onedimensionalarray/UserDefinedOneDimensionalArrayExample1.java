package com.java.standard.edition.onedimensionalarray;

import java.util.Scanner;

public class UserDefinedOneDimensionalArrayExample1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employees:");
		int n=sc.nextInt();
		
		Employee details[] = new Employee[n];
		
		for(int i=0;i<=details.length-1;i++)
		{
			System.out.println("Enter the eid:");
			int eid=sc.nextInt();
			System.out.println("Enter the ename:");
			String ename=sc.next();
			System.out.println("Enter the salary:");
			float salary=sc.nextFloat();
			System.out.println("Enter the dept:");
			String dept=sc.next();
			
			details[i] = new Employee(eid, ename, salary, dept);
		}
		
		System.out.println("Array contents are:");
		for(int i=0;i<=details.length-1;i++)
		{
			System.out.print(details[i]+" ");
		}
		System.out.println();
		sc.close();
	}

}
