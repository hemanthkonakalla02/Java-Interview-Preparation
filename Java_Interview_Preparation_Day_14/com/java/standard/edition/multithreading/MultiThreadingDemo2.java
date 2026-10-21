package com.java.standard.edition.multithreading;

public class MultiThreadingDemo2 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(); // Thread is created,but not yet started
		
		
		t1.start(); // To start the thread we use start() method which internally calls the run() of Thread class
		
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		Thread t4 = new Thread();
		
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("Active Thread Count is :"+Thread.activeCount());

		
	}

}
