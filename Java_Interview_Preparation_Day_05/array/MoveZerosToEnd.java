package com.java.coding.array;

public class MoveZerosToEnd 
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
		
		int newArr[] = new int[arr.length];
		
		reArrangeElement(arr,newArr);
		printNewArr(newArr);
	}

	public static void printNewArr(int newArr[])
	{
		System.out.println("Array after moving zeros to end:");
		for(int i=0;i<=newArr.length-1;i++)
		{
			System.out.print(newArr[i]+" ");
		}
		System.out.println();
	}
	public static void reArrangeElement(int arr[],int newArr[])
	{
		int j=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				newArr[j]=arr[i];
				j++;
			}
		}
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==0)
			{
				newArr[j]=arr[i];
				j++;
			}
		}
	}
}
