package com.tecleo.entidades;

import java.util.Date;

public class HorasContrato {
	
	private Date data;
	private Double valorHoras;
	private Integer horas;
	
	public HorasContrato() {
	}
	
	public HorasContrato(Date data, Double valorHoras, Integer horas) {
		this.data = data;
		this.valorHoras = valorHoras;
		this.horas = horas;
	}



	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorHoras() {
		return valorHoras;
	}
	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double valorTotal() {
		return valorHoras * horas;
	}
	
}
