package com.java.standard.edition.transferstatements;

public class BreakDemo 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
			if(i==3)
			{
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("This is last line of the code");
		
	}

}
