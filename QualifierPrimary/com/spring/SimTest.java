package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // by default spring follows singleton design pattern,if we want to change then we
					// use scope annotation and set it to prototype ,so it will create multiple beans
public class SimTest
{
	@Autowired
	@Qualifier("jio")  //if we use both primary and qualifier annotation ,qualifier will have highest
					  // precedence
	
	Sim sim;
	public void testSim()
	{
		sim.call();
	}

}
