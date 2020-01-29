package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

class CalculatorTest {

	@Test
	void test_add() {
		Calculator calc = new Calculator();
		assertEquals("The output should be the sum of the two arguments", 2, calc.add(1, 1));
	}

}
