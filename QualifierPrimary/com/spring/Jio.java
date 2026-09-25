package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim 
{

	@Override
	public void call() {
		System.out.println("Jio provides unlimited calls for 300 rupees package");
		
	}

}
