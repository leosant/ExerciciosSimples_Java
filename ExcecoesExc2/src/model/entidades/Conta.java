package model.entidades;

import model.exceptions.ExceptionApp;

public class Conta {
	
	private Integer numConta;
	private String usuario;
	private Double deposito;
	private Double limite;

	public Conta(Integer numConta, String usuario, Double deposito, Double limite) {
		super();
		this.numConta = numConta;
		this.usuario = usuario;
		this.deposito = deposito;
		this.limite = limite;
	}
	
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Double getDeposito() {
		return deposito;
	}
	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void deposito(Double montante) {
		setDeposito((montante+getDeposito()));
		System.out.println("Valor Total: "+getDeposito());
	}
	
	public void saque(Double montante) throws ExceptionApp{
		
		if(getLimite() < montante) {
			throw new ExceptionApp("Limite de saque não autorizado");
		}
		if(getDeposito() < montante) {
			throw new ExceptionApp("Saldo em conta insuficiente!");
		}
			setDeposito(getDeposito()-montante);
			getDeposito();
	}
}
