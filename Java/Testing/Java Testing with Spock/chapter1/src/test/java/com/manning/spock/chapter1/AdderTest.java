package com.manning.spock.chapter1;

import org.junit.Test;

import static groovy.util.GroovyTestCase.assertEquals;

public class AdderTest {
	
	@Test
	public void simpleTest() {
		Adder adder = new Adder();
		assertEquals("1 + 1 is 2",2,adder.add(1, 1));
	}
	
	@Test
	public void orderTest()	{
		Adder adder = new Adder();
		assertEquals("Order does not matter ",5,adder.add(2, 3));
		assertEquals("Order does not matter ",5,adder.add(3, 2));
	}

}
