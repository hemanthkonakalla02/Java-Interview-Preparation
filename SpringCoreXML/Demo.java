package com.spring.core.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = ctx.getBean("emp",Employee.class);
		Employee emp2 = ctx.getBean("emp",Employee.class);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1);
	}

}
