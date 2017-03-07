package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(1, calculator.subtract(4, 3));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(6, calculator.multiply(2, 3));
	}
	
	@Test
	public void divideTest() {
		assertEquals(2, calculator.divide(8, 4));
	}
	
	@Test
	public void isEqualTest() {
		assertTrue(calculator.isEqual(3, 3));
		assertFalse(calculator.isEqual(4, 5));
	}

}
