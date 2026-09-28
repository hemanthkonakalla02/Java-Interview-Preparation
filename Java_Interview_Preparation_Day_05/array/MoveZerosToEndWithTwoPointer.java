package com.java.coding.array;

import java.util.Arrays;

public class MoveZerosToEndWithTwoPointer 
{
	public static void main(String[] args) 
	{
		int arr[]= {0,3,0,12,0,45,67};
		System.out.println("Array before moving zeros to end:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Array after moving zeros to end");
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	public static void moveZeros(int arr[])
	{
		int left=0;//4
		
		for(int right=0;right<=arr.length-1;right++)//6<=6
		{
			if(arr[right]!=0)
			{
				int temp=arr[left];//0
				arr[left]=arr[right];//67
				arr[right]=temp;//0
				left++;
			}
			
		}
		
		
	}

}
