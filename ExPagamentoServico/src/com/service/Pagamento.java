package com.service;

public interface Pagamento {

	Double paymentFee(Double amount);
	Double interest(Double amount, int months);
}
