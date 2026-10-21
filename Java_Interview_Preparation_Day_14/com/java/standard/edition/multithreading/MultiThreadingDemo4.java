package com.java.standard.edition.multithreading;

public class MultiThreadingDemo4 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		ManagerOne m1 = new ManagerOne();
		Thread t1 = new Thread(s1,"Student-Thread");
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(m1,"Manager-Thread");
		t2.start();
		
		System.out.println("Active Thread Count :"+Thread.activeCount());
		
		
	}

}
