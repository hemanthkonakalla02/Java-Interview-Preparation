package com.java.standard.edition.deadlock;

public class ThreadOne extends Thread 
{
	ThreadTwo t2;
	
	@Override
	public void run() 
	{
		try {
			t2.join();   //ThreadOne will wait until ThreadTwo completes its execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is threadone class");
		
	}
}
