package com.vrtoonjava.banking;

public interface BankingService {

	void pay(Payment payment) throws PaymentException;
	
}
