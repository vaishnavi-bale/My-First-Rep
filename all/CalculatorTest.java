package com.cts.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	@Before
	public void init() {
		cal =new Calculator();
		System.out.println("calculator object created");
	}
	
	@After
	public void destroy() {
		cal=null;
		System.out.println("calculator object destroyed");
	}

	
	@Test
	public void addTest() {
		assertEquals(5, cal.add(2,3));
	}
	
	@Test
	public void subTest() {
		assertEquals(2, cal.sub(5,3));
	}

}
