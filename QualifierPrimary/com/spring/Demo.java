package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		SimTest simTest1 = ctx.getBean("simTest",SimTest.class);
		SimTest simTest2 = ctx.getBean("simTest",SimTest.class);
		System.out.println(simTest1==simTest2);
	//	simTest1.testSim();
		
	}

}
