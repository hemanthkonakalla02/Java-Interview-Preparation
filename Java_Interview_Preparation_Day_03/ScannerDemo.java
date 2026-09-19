package com.java.standard.edition.scanner;

import java.util.Scanner;

public class ScannerDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the marriage status:");
		boolean a =sc.nextBoolean();
		
		System.out.println("Enter the house intial:");
		char b = sc.next().charAt(0);
		
		System.out.println("Enter the marks scored in mathematics:");
		byte c=sc.nextByte();
		
		sc.nextLine();
		System.out.println("Enter the complete address:");
		String address=sc.nextLine();
		
		
		
		System.out.println("Enter the price of mobile:");
		short d=sc.nextShort();
		
		System.out.println("Enter the car price:");
		int e=sc.nextInt();
		
		System.out.println("Enter the mobile number:");
		long f=sc.nextLong();
		
		System.out.println("Enter the percentage scored in ug:");
		float g=sc.nextFloat();
		
		System.out.println("Enter the percentage score in pg:");
		double h =sc.nextDouble();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(address);
		
		
		sc.close();
		
		
	}

}
