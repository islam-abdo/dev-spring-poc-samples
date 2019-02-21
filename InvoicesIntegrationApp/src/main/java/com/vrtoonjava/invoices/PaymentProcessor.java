package com.vrtoonjava.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vrtoonjava.banking.BankingService;
import com.vrtoonjava.banking.Payment;
import com.vrtoonjava.banking.PaymentException;

@Component
public class PaymentProcessor {
	@Autowired
	BankingService bankingService;

	public void processPayment(Payment payment) throws PaymentException {
		bankingService.pay(payment);
	}
}
