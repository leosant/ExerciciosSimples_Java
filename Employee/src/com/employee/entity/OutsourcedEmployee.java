package com.employee.entity;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		Double result = 0.00,soma = 0.00;
		soma = getAdditionalCharge()*0.10;
		result += getAdditionalCharge()+soma;
		return super.payment()+result;
	}
}
