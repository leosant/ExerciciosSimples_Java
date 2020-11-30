package com.cursoTeste.Principal;

import java.util.ArrayList;

import com.cursoTeste.Entidades.*;
import com.cursoTeste.Views.Leitor;
import com.cursoTeste.Views.Visao;

public class Main {
	
	public static void main(String[] args) {
		//Primeiro criei os objetos
		Aluno al;
		Curso curso;
		
		//Segundo a lista para adicionar os objetos e estipular tamanhos de vetor
		ArrayList<Aluno> alList = new ArrayList<>();
		ArrayList<Curso> cursoList = new ArrayList<>();
		
		//Terceiro Vetor para manipular e criar sequencias para vizualizar curso atrelado a aluno
		Curso[] cursos;
		Aluno[] alunos;
		
		char opcao;
		int id = 1;
		
		do {
			al = Visao.criandoAluno(id);
			alList.add(al);
			
			curso = Visao.criandoCurso();
			cursoList.add(curso);
			curso.addAluno(al);
			id++;
			opcao = Leitor.leitorChar("Deseja cadastrar outro aluno(S/N): ");
		}while(opcao == 's' || opcao == 'S');
		
		alunos = new Aluno[alList.size()];
		cursos = new Curso[cursoList.size()];
		
		for(int i = 0; i < alList.size(); i++) {
			alunos[i] = alList.get(i);
			//
			cursos[i] = cursoList.get(i);
		}
		
		for(int j = 0; j < alList.size(); j++) {
			System.out.println(Curso.matriculandoAluno(alunos[j], cursos[j]));
		}
	}

}