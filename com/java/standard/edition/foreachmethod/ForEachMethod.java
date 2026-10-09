package com.java.standard.edition.foreachmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMethod 
{
	
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(54,12,90,5,66,11,0));
		
		//Accessing the elements using traditional for loop
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("============================================");

		//Accessing the elements using foreach loop
		
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("============================================");
		
		
		//Accessing the elements using forEach() method
		
		list.forEach(t -> System.out.print(t+" "));
		
		System.out.println();
		System.out.println("============================================");

		
		Map<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1, "HemanthKumarKonakalla");
		hm.put(2, "Chinni");
		hm.put(3, "Priyanka");
		hm.put(4, "Prasad");
		hm.put(5, "Anand");
		hm.put(6, "Sekhar");
		hm.put(7, "Hanvika");
		
		
		hm.forEach((t, u) -> System.out.print(t+" >>> "+u+" \n "));
		System.out.println();
		
		
	}

}
