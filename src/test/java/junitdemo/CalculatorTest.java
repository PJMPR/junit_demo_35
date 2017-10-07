package junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_addition_in_calculator_class() {

		Calculator calculator = new Calculator();
		
		int five = calculator.add(2,3);
		int seven = calculator.add(3, 4);

		assertEquals("Calculator should properly add two numbers",five, 5);
		assertEquals("Calculator should properly add two numbers",seven, 7);
		
	}

}
