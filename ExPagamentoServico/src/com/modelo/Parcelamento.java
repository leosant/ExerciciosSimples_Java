package com.modelo;

import java.util.Date;

public class Parcelamento {
	
	private Date data;
	private Double valor;
	
	public Parcelamento() {
		
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
