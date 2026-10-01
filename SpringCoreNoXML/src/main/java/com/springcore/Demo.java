package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Employee employee = ctx.getBean("employee",Employee.class);
		System.out.println(employee);
		
	}

}
