package com.java.coding.array;

import java.util.Arrays;

public class RotateArrayRightByKPositions 
{
	public static void main(String[] args) 
	{
		int arr[]= {43,89,67,66,1,9,4};
		int k=2;
		k=k%arr.length;
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		System.out.println(Arrays.toString(arr)); //9,4,43,89,67,66,1
		
	}
	
	public static void reverse(int arr[],int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
