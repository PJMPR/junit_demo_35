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
	
	@Test
	public void test_power_operation_in_calculator_class() throws NegativeExponentException{
		
		Calculator calculator = new Calculator();

		int eight = calculator.power(2,3);

		int nine = calculator.power(3,2);

		int one = calculator.power(5, 0);
		int oneTest = calculator.power(545, 0);

		assertEquals("Calculator should properly do power operation",8, eight);
		assertEquals("Calculator should properly do power operation",9, nine);
		assertEquals("5 to power 0 should return 1",1, one);
		assertEquals("5 to power 0 should return 1",1, oneTest);
	}
	
	@Test(expected = NegativeExponentException.class)
	public void test_power_operation_for_negative_exponent() throws NegativeExponentException{
		
		Calculator calculator = new Calculator();
		
		calculator.power(324, -4);
		
	}

}
