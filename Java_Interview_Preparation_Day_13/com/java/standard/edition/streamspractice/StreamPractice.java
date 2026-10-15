package com.java.standard.edition.streamspractice;

import java.util.Arrays;
import java.util.Optional;


public class StreamPractice 
{
	public static void main(String[] args) 
	{
		
//		long count = Stream.<Integer>builder().add(45).add(12).add(78).add(91).add(9).build().filter(n->n%2==0).peek(System.out::println).count();
//		System.out.println("Count is :"+count);
		
		Integer[] arr = {78,13,9,8,4,2,0,99};
		
//		Optional<Integer> min = Arrays.stream(arr).filter(i->i%2==0).min(Integer::compareTo);
//		System.out.println("Minimum even number in array is :"+min.get());
		
//		Optional<Integer> max=Arrays.stream(arr).filter(i->i%2==0).max(Integer::compareTo);
//		System.out.println("Maximum even number in array is :"+max.get());
		
//		Optional<Integer> first = Arrays.stream(arr).filter(i->i%2==0).findFirst();
//		System.out.println("first even number in an array is :"+first.get());
		
//		Optional<Integer> any = Arrays.stream(arr).filter(i->i%2==0).findAny();
//		System.out.println(any.get());
		
		Optional<Integer> reduce = Arrays.stream(arr).reduce((t1,t2)->t1+t2);
		System.out.println(reduce.get());
		
		
	}

}
