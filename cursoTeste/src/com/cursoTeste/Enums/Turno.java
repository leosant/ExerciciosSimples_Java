package com.cursoTeste.Enums;

public enum Turno {
	MATUTINO("Matutino"),
	VESPERTINO("Vespertino"),
	NOTURNO("Noturno");
	
	private String turno;

	Turno(String turno) {
		this.turno = turno;
	}
	
	public String getTurno() {
		return turno;
	}
}
