package com.java.standard.edition.commandlinearguments;

public class Employee 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=args.length-1;i++)
		{
			System.out.print(args[i]+" ");
		}
		
	}

}
