package com.cursoTeste.Enums;

public enum Disciplina {
	JAVA("Java"),
	DELPHI("Delphi"),
	C("C");
	
	private String disciplina;
	
	Disciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
}
