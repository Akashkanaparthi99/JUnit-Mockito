package com.testcases.studentapp.trial;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.shristi.training.User;

class UserTest {

	User user = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		user = new User();
	}

	@AfterEach
	void tearDown() throws Exception {
		user = null;
	}

	@Test
	void testGreet() {
		
		assertEquals("Hello", user.greet());
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Great day","Have a great day","good day"})
	void testGreet1(String message) {
		assertEquals(message, user.greet());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,100,-900})
	void testGreet2(int num) {
		assertTrue(num<=user.check());
		assertEquals(num, user.check());
	}

}
