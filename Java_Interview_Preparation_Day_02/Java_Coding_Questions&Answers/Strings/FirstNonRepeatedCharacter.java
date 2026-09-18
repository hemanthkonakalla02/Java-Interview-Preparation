package com.java.coding.string;

import java.util.Scanner;

public class FirstNonRepeatedCharacter 
{
	public static void main(String[] args)  
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<=charArray.length-1;i++)//1<=3
		{
			int count=0;
			for(int j=0;j<=charArray.length-1;j++)//3<=3
			{
				if(charArray[i]==charArray[j])
				{
					count++;
				}
			}
			
			if(count==1)
			{
				System.out.println("First Non Repeated Character is :"+charArray[i]);
				break;
			}
			
			sc.close();
		}
		
	}

}
