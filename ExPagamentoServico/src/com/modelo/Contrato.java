package com.modelo;

import java.util.Date;

import com.service.Pagamento;

public class Contrato{
	
	private String nContrato;
	private Date dataContrato;
	private Double valorContrato;
	
	public Contrato(String nContrato, Date dataContrato, Double valorContrato) {
		this.nContrato = nContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
	}
	
	public String getnContrato() {
		return nContrato;
	}
	public void setnContrato(String nContrato) {
		this.nContrato = nContrato;
	}
	public Date getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}
	public Double getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}	
}
