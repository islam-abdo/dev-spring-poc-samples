package com.vrtoonjava.banking;

import com.vrtoonjava.invoices.Invoice;

public interface PaymentCreator {

	Payment createPayment(Invoice invoice) throws PaymentException;
	
}
