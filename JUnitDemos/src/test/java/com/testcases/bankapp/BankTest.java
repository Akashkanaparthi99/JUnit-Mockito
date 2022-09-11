package com.testcases.bankapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.exceptions.ExceedingNumException;
import com.shristi.exceptions.NegativeValueException;
import com.shristi.training.Bank;

public class BankTest {

	Bank bank = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		bank = new Bank(55230.00);
	}

	@AfterEach
	void tearDown() throws Exception {
		bank = null;
	}

	@Test
	@DisplayName("Testing Negative deposit")
	void testBankNeg() throws NegativeValueException, ExceedingNumException {
		int amount = -500;
		assertThrows(NegativeValueException.class, ()->bank.deposit(amount));
		
	}
	
	@Test
	@DisplayName("Testing Amount Exceed deposit")
	void testBankExceed() throws NegativeValueException, ExceedingNumException {
		int amount =20000;
		assertThrows(ExceedingNumException.class, ()->bank.deposit(amount));
		
	}
	
	@Test
	@DisplayName("Testing Amount Return")
	void testBankReturnBalance() throws NegativeValueException, ExceedingNumException {
		int amount =1000;
		assertEquals(56230.00,bank.deposit(amount));
		
	}


	@Test
	@DisplayName("Testing Negative withdraw")
	void testBankNegWith() throws NegativeValueException, ExceedingNumException {
		int amount = -500;
		assertThrows(NegativeValueException.class, ()->bank.withdraw(amount));
		
	}
	
	@Test
	@DisplayName("Testing Amount greater deposit")
	void testBankExceedWithdraw() throws NegativeValueException, ExceedingNumException {
		int amount =89965000;
		assertThrows(ExceedingNumException.class, ()->bank.withdraw(amount));
		
	}
	
	@Test
	@DisplayName("Testing Amount Return")
	void testBankReturnWithdraw() throws NegativeValueException, ExceedingNumException {
		int amount =1000;
		assertEquals(54230.00,bank.withdraw(amount));
		
	}
	@Test
	@DisplayName("Testing Amount more than 10000")
	void testBankMorethan() throws NegativeValueException, ExceedingNumException {
		int amount =20000;
		assertThrows(ExceedingNumException.class, ()->bank.withdraw(amount));
		
	}
}
