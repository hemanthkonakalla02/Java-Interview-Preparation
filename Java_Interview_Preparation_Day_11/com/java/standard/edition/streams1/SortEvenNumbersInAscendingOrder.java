package com.java.standard.edition.streams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortEvenNumbersInAscendingOrder 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4,33,17,2,39,43,6));
		
		//SortedOrder
		//list.stream().filter(i->i%2==0).sorted().forEach(System.out::println);
		
		//System.out.println("------------------------");
		
		//ReverseOrder
		//list.stream().filter(i->i%2==0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//System.out.println("------------------------");

		//peek
		//prints even numbers with count
		//long count = list.stream().filter(i->i%2==0).sorted().peek(System.out::println).count();
		//System.out.println("Even Numbers Count is :"+count);
		
		//map
		
		//list.stream().filter(i->i%2==0).map( i ->  i*i).forEach(System.out::println);
		
		long count = list.stream().filter(i->i%2==0).map(t->
		{
			String s="";
			for(int i=0;i<t;i++)
			{
				s+="*";
				
			}
			
			
			return s;
		}).peek(System.out::println).count();
		
		System.out.println(count);
	}

}
