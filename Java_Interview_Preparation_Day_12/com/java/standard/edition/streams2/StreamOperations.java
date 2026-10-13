package com.java.standard.edition.streams2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations
{
	public static void main(String[] args) 
	{
		//IntStream.of(6,9,10,12,4,1,2,8).forEach(System.out::println);
		//IntStream.range(0, 100).filter(i->i%2==0).forEach(System.out::println);
		//IntStream.rangeClosed(0,100).filter(i->i%2==0).forEach(System.out::println);
		//IntStream.iterate(1, n->n+3).limit(10).forEach(System.out::println);
		//IntStream.of(6,9,10,12,4,1,2,8).limit(10).forEach(System.out::println);
		//IntStream.iterate(1, n->n<=30,n->n+3).skip(2).forEach(System.out::println);
		//IntStream.iterate(1, n->n<=30,n->n+3).limit(5).skip(3).forEach(System.out::println);
//		long count = IntStream.generate(()->new Random().nextInt(100)).limit(100).distinct().peek(System.out::println).count();
//		System.out.println("Count:"+count);
		
//		long count = IntStream.generate(()->new Random().nextInt(100)).limit(100).filter(i->i%2==0).distinct().count();
//		System.out.println(count);
		
//		IntStream is1 = IntStream.of(6,9,10,12,4,1,2,8);
//		IntStream is2 = IntStream.of(10,21,90,100,110);
//   	IntStream.concat(is1, is2).forEach(System.out::println);
//		int [] arr=IntStream.concat(is1, is2).toArray();
//		System.out.println(Arrays.toString(arr));
		
//		Stream.of("Hemanth",02,11,1996,"Kumar","Konakalla").forEach(System.out::println);
		
//		String s="Hi Hemanth \nHow are you \nHow is your interview Preparation going";
//		//s.lines().forEach(System.out::println);
//		s.lines().map(s1->s1.length()).forEach(System.out::println);
		
//		String s="Hemanth Kumar Konakalla";
//		Arrays.stream(s.split(" ")).forEach(System.out::println);
		
		String s="Hemanth Kumar Konakalla";
		//s.chars().forEach(System.out::println);
		//s.chars().mapToObj(i->(char)i).forEach(System.out::println);
		s.chars().mapToObj(i->(char)i).filter(res->"aeiou".indexOf(res)<0).forEach(System.out::println);
		
	}

}
