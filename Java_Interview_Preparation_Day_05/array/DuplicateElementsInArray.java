package com.java.coding.array;

import java.util.HashSet;

public class DuplicateElementsInArray 
{
	public static void main(String[] args) 
	{
		String arr[]= {"Anand","Hemanth","Priyanka","Prasad","Sekhar","anand","hemanth"};
		HashSet<String> hs = new HashSet<String>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String lowerCase = arr[i].toLowerCase();
			if(!hs.contains(lowerCase))
			{
				hs.add(lowerCase);
			}
			else
			{
				System.out.println(lowerCase);
			}
		}
		
		if(hs.size()==arr.length)
		{
			System.out.println("No duplicates found in array");
		}
		
	}

}
