package com.java.coding.array;

import java.util.Arrays;

public class RotateArrayLeftByKPositions 
{
	public static void main(String[] args) 
	{
		int arr[]= {43,89,67,66,1,9,4};
		int k=2;
		k=k%arr.length;//7
		
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr)); //67,66,1,9,4,43,89
		
		
	}
	
		     //[67, 43, 4, 9, 1, 66, 89]        1        5
	public static void reverse(int arr[],int start,int end)
	{
		while(start<end)//1<5
		{
			int temp=arr[start];//43
			arr[start]=arr[end];//67 will be in 0th index
			arr[end]=temp;//89 will be stored in 6th index position
			start++;
			end--;
		}
	}

}
