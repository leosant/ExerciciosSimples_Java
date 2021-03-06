package com.employee.entity;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double valuePerHours;
	
	public Employee(String name, Integer hours, Double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}
	
	public Double getValuePerHours() {
		return valuePerHours;
	}
	
	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double payment() {
		Double result = 0.0;
		result += getValuePerHours()*getHours();
		return result;
	}
	
	public String toString() {
		return getName()+" - $"+String.format("%.2f", payment());
	}
}
