package com.shristi.training;

import com.shristi.exceptions.ExceedingNumException;
import com.shristi.exceptions.NegativeValueException;

public class Bank {

	double balance;
	

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public double deposit(int amount) throws NegativeValueException, ExceedingNumException {
		if (amount <0) {
			throw new NegativeValueException("no negative values");
		} 
		if (amount > 10000) {
			throw new ExceedingNumException("Limit out");
		}
		
		return balance+amount;
	}
	public double withdraw(int amount) throws ExceedingNumException, NegativeValueException {
		if (amount <0) {
			throw new NegativeValueException("no negative values");
		}
		if (amount>balance) {
			throw new ExceedingNumException("Out of Limit");
		} 
		if (amount > 10000) {
			throw new ExceedingNumException("not more than 10000");
		}
		return balance-amount;
	}
}
