package com.java.standard.edition.deadlock;

public class ThreadTwo extends Thread
{
	ThreadOne t1;
	
	@Override
	public void run() 
	{
		try {
			t1.join();  //ThreadTwo will wait until ThreadOne completes its execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is threadtwo class");
		
	}

}
