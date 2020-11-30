package com.cursoTeste.Entidades;

import java.util.ArrayList;

import com.cursoTeste.Enums.*;

public class Curso {
	
	private Disciplina disc;
	private Turno turno;
	private ArrayList<Aluno> al = new ArrayList<>();
	
	public Curso() {
	}
	
	public Curso(Disciplina disc, Turno turno) {
		this.disc = disc;
		this.turno = turno;
	}
	
	
	public ArrayList<Aluno> getAl() {
		return al;
	}

	public void addAluno(Aluno al) {
		this.al.add(al);
	}
	
	public void removeAluno(Aluno al) {
		this.al.remove(al);
	}
	
	public Disciplina getDisc() {
		return disc;
	}
	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public static String matriculandoAluno(Aluno al, Curso cursoNome) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Parabéns "+al.getNome());
		sb.append(" Você acaba de adquirir o curso de "+cursoNome.getDisc());
		sb.append("\n***Matricula realizada com sucesso****\n");
		sb.append("Sua matricula é: "+al.getId());
		sb.append("\n");
		sb.append("No turno "+cursoNome.getTurno());
		
		return sb.toString();
	}
	
}
