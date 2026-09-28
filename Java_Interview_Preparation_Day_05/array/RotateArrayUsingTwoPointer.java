package com.java.coding.array;

import java.util.Arrays;

public class RotateArrayUsingTwoPointer 
{
	public static void main(String[] args) 
	{
		int arr[]= {43,12,90,54,67,71};
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
		System.out.println("Reverse of an array is :"+Arrays.toString(arr));
		
	}

}
