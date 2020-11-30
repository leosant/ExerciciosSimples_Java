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
		
		return super.payment()+getAdditionalCharge() * 1.1;
	}
}
