package com.cursoTeste.Views;

import com.cursoTeste.Entidades.Aluno;
import com.cursoTeste.Entidades.Curso;
import com.cursoTeste.Enums.Disciplina;
import com.cursoTeste.Enums.Genero;
import com.cursoTeste.Enums.Turno;

public class Visao {
	
	public static Aluno criandoAluno(int id) {
		
		Aluno al;
		String nome = Leitor.leitorString("Digite nome do aluno: ");
		char gen = Leitor.leitorChar("Digite o genero(M/F): ");
		if(gen == 'm' || gen == 'M') {
			 al = new Aluno(nome, Genero.MASCULINO, id);
		}else {
			al = new Aluno(nome, Genero.FEMNINO, id);
		}
		return al;
	}
	
	public static Curso criandoCurso() {
		
		String nomeCurso = Leitor.leitorString("Qual o curso: ");
		String turno = Leitor.leitorString("Turno: ");
		Curso addCurso = new Curso(Disciplina.valueOf(nomeCurso.toUpperCase()), Turno.valueOf(turno.toUpperCase()));
		return addCurso;
	}
}
