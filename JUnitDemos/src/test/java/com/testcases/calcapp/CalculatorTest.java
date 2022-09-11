package com.testcases.calcapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shristi.training.Calculator;

public class CalculatorTest {

	Calculator calc = null;
	@BeforeAll
	public static void init() {
		System.out.println("runs before all the test cases");
	}
	
	@BeforeEach
	public void setup() {
		calc = new Calculator();
		System.out.println("runs before each testcase");
	}
	
	@Test
	public void testAdd() {
		// call the method to be tested
		int actualResult = calc.add(20,30);
		assertEquals(50, actualResult,"The result should be 40");// 40 is the expected result
	}
	
	@Test
	public void testProduct() {
		assertEquals(80, calc.product(8, 10),"the product should be 80");
	}
	
	@Test
	public void testDifference() {
		assertEquals(50, calc.difference(60, 10),"the difference should be 50");
	}
	
	@Test
	public void testGreetUser() {
		assertEquals("Welcome ash", calc.greetUser("ASH"));
	}
	
	@AfterAll 
	public static void cleanp() {
		System.out.println("runs after all the testcases");
	}
	
	@AfterAll
	public static void cleanup() {
		System.out.println("runs after all the testcases");
	}
}
