package com.java.coding.string;

import java.util.Scanner;

public class FirstRepeatedCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next().toLowerCase();
		
		char[] charArray = s.toCharArray();
		boolean found=false;
		
		for(int i=0;i<=charArray.length-1;i++)//6<=6
		{
			for(int j=0;j<i;j++)//0<6
			{
				if(charArray[i]==charArray[j])
				{
					System.out.println("first repeated character is :"+charArray[i]);
					found=true;
					break;
				}
			}
			
			
			if(found)
			{
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("No first repeater character");
		}
		
		sc.close();
		
	}

}
