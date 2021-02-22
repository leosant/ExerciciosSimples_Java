package com.modelo;

import java.util.Date;

import com.service.Pagamento;

public class Contrato implements Pagamento{
	
	private String nContrato;
	private Date dataContrato;
	private Double valorContrato;
	private int NumParcelamento;
	
	public Contrato(String nContrato, Date dataContrato, Double valorContrato, int NumParcelamento) {
		this.nContrato = nContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
		this.NumParcelamento = NumParcelamento;
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
	
	public int getNumParcelamento() {
		return NumParcelamento;
	}

	public void setNumParcelamento(int numParcelamento) {
		NumParcelamento = numParcelamento;
	}

	@Override
	public Double ServiceParcela() {
		
		return null;
	}
	
	
}
