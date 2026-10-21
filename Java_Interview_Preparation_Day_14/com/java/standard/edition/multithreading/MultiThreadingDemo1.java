package com.java.standard.edition.multithreading;

public class MultiThreadingDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("hello,this is multithreading concept");
		System.out.println("Default Thread Name is :"+Thread.currentThread().getName());
		System.out.println("Thread Id is :"+Thread.currentThread().threadId());
		System.out.println("Thread Priority is :"+Thread.currentThread().getPriority());
		System.out.println("Active Thread Count is :"+Thread.activeCount());
	}

}
