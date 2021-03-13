package com.service;

import com.modelo.Contrato;

public class PaypalService implements Pagamento{
	
	public static final double PAYMENT_FELL = 0.02;
	public static final double MONTHLIN_INTEREST = 0.01;

	@Override
	public Double paymentFee(Double amount) {
		return amount  * PAYMENT_FELL;
	}

	@Override
	public Double interest(Double amount, int months) {
		return amount * months * MONTHLIN_INTEREST;
	}
	
	
}
