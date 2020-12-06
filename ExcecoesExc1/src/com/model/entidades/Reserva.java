package com.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer numQuarto;
	private Date checkin;
	private Date checkout;
	
	public Reserva(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	public Integer getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}
	public Date getCheckin() {
		return checkin;
	}
	protected void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	protected void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Reserva:"
				+ "\nQuarto: "+getNumQuarto()
				+"\nCheck-in: "+format.format(getCheckin())
				+"\nCheck-out: "+format.format(getCheckout())
				+"\n"+duracao()+" noites";
	}
	
	//Calculo e conversão de milisegundos para dias
	public Long duracao() {
		Long resultadoMili = getCheckout().getTime() - getCheckin().getTime();
		Long resultadoDia = TimeUnit.DAYS.convert(resultadoMili, TimeUnit.MILLISECONDS);
		
		if(resultadoDia < 0) {
			resultadoDia = null;
		}
		return resultadoDia;
	}
	
	public void atulizarDatas(Date checkin, Date checkout) {
		setCheckin(checkin);
		setCheckout(checkout);
	}
}
