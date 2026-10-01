package com.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Primary    //primary should use only on one class
public class Airtel implements Sim 
{

	@Override
	public void call() 
	{
		System.out.println("Airtel provides unlimted calls for 199 rupees package");
		
	}
	
	
	@PostConstruct
	public void provideAirtelTv()
	{
		System.out.println("Airtel provides airtel tv app to its subscribers");
	}

}
