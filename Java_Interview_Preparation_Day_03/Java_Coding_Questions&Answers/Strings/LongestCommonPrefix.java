package com.java.coding.string;

import java.util.Arrays;

public class LongestCommonPrefix 
{
	public static void main(String[] args) 
	{
		String arr[]= {"class","clove","club"}; //cl
		findingLongestCommonPrefix(arr); 
		
	}
	
	public static void findingLongestCommonPrefix(String arr[])
	{
		StringBuilder sb = new StringBuilder();
		
		//sort the array
		Arrays.sort(arr);
		
		//Take the first and last sorted String 
		char first[]=arr[0].toCharArray();
		char last[]=arr[arr.length-1].toCharArray();
		
		for(int i=0;i<=first.length-1;i++)
		{
			if(first[i]!=last[i])
			{
				break;
			}
			
			sb.append(first[i]);
		}
		
		if(sb.length()>0)
		{
			System.out.println("Longest Common Prefix is :"+sb);
		}
		else
		{
			System.out.println("No Longest Common Prefix");
		}
		
	}

}
