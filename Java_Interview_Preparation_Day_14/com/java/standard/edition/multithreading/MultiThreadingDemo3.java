package com.java.standard.edition.multithreading;

public class MultiThreadingDemo3 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("EmployeeThread");
		e1.start(); //calls the run() of Employee class
		
		Manager m1 = new Manager("ManagerThread");
		m1.start();
		
		
		System.out.println("Active Thread Count is :"+Thread.activeCount());
		
	}

}
