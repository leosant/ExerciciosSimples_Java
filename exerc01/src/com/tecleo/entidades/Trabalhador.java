package com.tecleo.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.tecleo.enums.WorkerLevel;

public class Trabalhador {
	//Atributos básicos
	private String nome;
	private WorkerLevel level;
	private Double salarioBase;
	//Atributos Associativos
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(String nome, WorkerLevel level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getsalarioBase() {
		return salarioBase;
	}

	public void setsalarioBase(Double baseSalary) {
		this.salarioBase = baseSalary;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}
	
	public void addContract(HorasContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContract(HorasContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double totalGanho(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HorasContrato horasContrato : contratos) {
			cal.setTime(horasContrato.getData());
			int dataAno = cal.get(Calendar.YEAR);
			int dataMes = 1 + cal.get(Calendar.MONTH);
			if(dataAno == ano && dataMes == mes) {
				soma += horasContrato.valorTotal();
			}
			
		}
		
		return soma;
	}
	
}
