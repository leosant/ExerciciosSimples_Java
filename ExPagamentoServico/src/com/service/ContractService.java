package com.service;

import java.util.Calendar;
import java.util.Date;

import com.modelo.Contrato;
import com.modelo.Parcelamento;

public class ContractService{
	
	private Pagamento pagamento;
	
	public ContractService(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public void processingContract(Contrato contract, int months) {
		double basicQuota = contract.getValorContrato() / months;
		
		for(int i = 1; i <= months; i++) {
			
			double updateQuota = basicQuota + pagamento.interest(basicQuota, i);
			double fullQuota = updateQuota + pagamento.paymentFee(updateQuota);
			Date dueData = addMonths(contract.getDataContrato(), i);
			contract.getParcelamento().add(new Parcelamento(dueData, fullQuota));
			
		}
	}
	
	public Date addMonths(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}

}
