package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}
