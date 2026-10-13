package com.java.standard.edition.streams1;

import java.util.Arrays;
import java.util.function.Function;

public class StreamOnArrays 
{
	public static void main(String[] args) 
	{
		Integer arr[] = {4,2,15,6,9,8};
		Function<Integer, String> fun = new Function<Integer, String>() {
			
			@Override
			public String apply(Integer t) {
				String s="";
				for(int i=0;i<t;i++)
				{
					s+="*";
				}
				return s;
			}
		};
		
		long count = Arrays.stream(arr)
				.filter(i->i%2==0)
				.sorted()
				.map(fun)
				.peek(System.out::println)
				.count();
		System.out.println(count);
		
		
	}

}
